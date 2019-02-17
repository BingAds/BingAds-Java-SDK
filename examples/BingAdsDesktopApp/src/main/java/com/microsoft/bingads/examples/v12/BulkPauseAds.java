package com.microsoft.bingads.examples.v12;

import com.microsoft.bingads.v12.bulk.entities.*;
import com.microsoft.bingads.v12.bulk.*;
import com.microsoft.bingads.v12.campaignmanagement.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkPauseAds extends BulkExampleBase {
	
    public static void main(String[] args) {
		
        BulkEntityIterable downloadEntities = null;

        try {
            authorizationData = getAuthorizationData();

            BulkServiceManager = new BulkServiceManager(
                    authorizationData, 
                    API_ENVIRONMENT);
            
            BulkServiceManager.setStatusPollIntervalInMilliseconds(5000);

            // Complete a full download of all ads in the account. 

            ArrayOfDownloadEntity entities = new ArrayOfDownloadEntity();
            entities.getDownloadEntities().add(DownloadEntity.ADS);

            DownloadParameters downloadParameters = new DownloadParameters();
            downloadParameters.setDownloadEntities(entities);
            downloadParameters.setFileType(DownloadFileType.CSV);

            // Download all ads in the account.
            File bulkFilePath = BulkServiceManager.downloadFileAsync(
                    downloadParameters, 
                    null, 
                    null).get();
            
            outputStatusMessage("-----\nDownloaded all ads in the account."); 
            
            Reader = new BulkFileReader(
                    bulkFilePath, 
                    ResultFileType.FULL_DOWNLOAD, 
                    BulkDownloadFileType);
            
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
            outputStatusMessage("-----\nChanged local status of all Active text ads to Paused. Uploading..."); 

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
                outputStatusMessage("-----\nAll text ads are already Paused."); 
            }
        }
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        } 
        finally {
            if (downloadEntities != null){
                try {
                    downloadEntities.close();
                } 
                catch (IOException ex) {
                    outputStatusMessage(ex.getMessage());
                }
            }
        }
    }
}
