package com.microsoft.bingads.examples.v11;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v11.bulk.entities.*;
import com.microsoft.bingads.v11.bulk.*;
import com.microsoft.bingads.v11.campaignmanagement.*;

public class BulkPauseAds extends BulkExampleBase {
	
    public static void main(String[] args) {
		
        BulkEntityIterable downloadEntities = null;

        try {
            AuthorizationData authorizationData = new AuthorizationData();
            authorizationData.setDeveloperToken(DeveloperToken);
            authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
            authorizationData.setCustomerId(CustomerId);
            authorizationData.setAccountId(AccountId);

            BulkServiceManager = new BulkServiceManager(authorizationData, API_ENVIRONMENT);
            BulkServiceManager.setStatusPollIntervalInMilliseconds(5000);

            // Complete a full download of all ads in the account. 

            ArrayOfDownloadEntity entities = new ArrayOfDownloadEntity();
            entities.getDownloadEntities().add(DownloadEntity.ADS);

            DownloadParameters downloadParameters = new DownloadParameters();
            downloadParameters.setDownloadEntities(entities);
            downloadParameters.setFileType(DownloadFileType.CSV);

            // Download all ads in the account.
            File bulkFilePath = BulkServiceManager.downloadFileAsync(downloadParameters, null, null).get();
            outputStatusMessage("Downloaded all ads in the account.\n"); 
            Reader = new BulkFileReader(bulkFilePath, ResultFileType.FULL_DOWNLOAD, FileType);
            downloadEntities = Reader.getEntities();

            List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkExpandedTextAd && ((BulkExpandedTextAd)entity).getAd().getStatus() == AdStatus.ACTIVE) {
                    outputBulkExpandedTextAds(Arrays.asList((BulkExpandedTextAd) entity) );

                    // Update the ad status to paused.
                    ((BulkExpandedTextAd)entity).getAd().setStatus(AdStatus.PAUSED);

                    uploadEntities.add(entity);
                }
            }
            downloadEntities.close();
            Reader.close(); 

            if (!uploadEntities.isEmpty()){
            outputStatusMessage("Changed local status of all Active text ads to Paused. Ready for upload.\n"); 

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();
            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkExpandedTextAd) {
                    outputBulkExpandedTextAds(Arrays.asList((BulkExpandedTextAd) entity) );
                }
            }
            downloadEntities.close();
            Reader.close();
            }
            else{
                outputStatusMessage("All text ads are already Paused. \n"); 
            }

            outputStatusMessage("Program execution completed\n"); 

        }
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        } 
        finally {
            if (downloadEntities != null){
                try {
                    downloadEntities.close();
                } 
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

        System.exit(0);
    }		
}
