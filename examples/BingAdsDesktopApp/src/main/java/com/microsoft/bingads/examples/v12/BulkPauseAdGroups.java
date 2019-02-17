package com.microsoft.bingads.examples.v12;

import com.microsoft.bingads.v12.bulk.entities.*;
import com.microsoft.bingads.v12.bulk.*;
import com.microsoft.bingads.v12.bulk.ArrayOfDownloadEntity;
import com.microsoft.bingads.v12.campaignmanagement.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkPauseAdGroups extends BulkExampleBase {
	 
    public static void main(String[] args) {
		
        BulkEntityIterable downloadEntities = null;

        try {
            
            authorizationData = getAuthorizationData();

            BulkServiceManager = new BulkServiceManager(
                    authorizationData, 
                    API_ENVIRONMENT);
            
            BulkServiceManager.setStatusPollIntervalInMilliseconds(5000);

            // Complete a full download of all ad groups in the account. 

            ArrayOfDownloadEntity entities = new ArrayOfDownloadEntity();
            entities.getDownloadEntities().add(DownloadEntity.AD_GROUPS);

            DownloadParameters downloadParameters = new DownloadParameters();
            downloadParameters.setDownloadEntities(entities);
            downloadParameters.setFileType(DownloadFileType.CSV);

            // Download all ad groups in the account.
            File bulkFilePath = BulkServiceManager.downloadFileAsync(
                    downloadParameters, 
                    null, 
                    null).get();
            
            outputStatusMessage("-----\nDownloaded all ad groups in the account."); 
            
            Reader = new BulkFileReader(
                    bulkFilePath, 
                    ResultFileType.FULL_DOWNLOAD, 
                    BulkDownloadFileType);
            
            downloadEntities = Reader.getEntities();

            List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();

            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkAdGroup && ((BulkAdGroup)entity).getAdGroup().getStatus() == AdGroupStatus.ACTIVE) {
                    outputBulkAdGroups(Arrays.asList((BulkAdGroup) entity) );
                    ((BulkAdGroup)entity).getAdGroup().setStatus(AdGroupStatus.PAUSED);
                    uploadEntities.add(entity);
                }
            }
            downloadEntities.close();
            Reader.close();

            if (!uploadEntities.isEmpty()){
                outputStatusMessage("-----\nChanged local status of all Active ad groups to Paused. Uploading..."); 

                Reader = writeEntitiesAndUploadFile(uploadEntities);
                downloadEntities = Reader.getEntities();
                for (BulkEntity entity : downloadEntities) {
                    if (entity instanceof BulkAdGroup) {
                        outputBulkAdGroups(Arrays.asList((BulkAdGroup) entity) );
                    }
                }
                downloadEntities.close();
                Reader.close();
            }
            else {
                outputStatusMessage("-----\nAll ad groups are already Paused."); 
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
