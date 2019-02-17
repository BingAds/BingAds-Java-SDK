package com.microsoft.bingads.examples.v12;

import com.microsoft.bingads.v12.bulk.entities.*;
import com.microsoft.bingads.v12.bulk.*;
import com.microsoft.bingads.v12.campaignmanagement.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkProductPartitionUpdateBid extends BulkExampleBase {
	        
    public static void main(String[] args) {
		
        BulkEntityIterable downloadEntities = null;

        try {
            
            authorizationData = getAuthorizationData();

            BulkServiceManager = new BulkServiceManager(
                    authorizationData, 
                    API_ENVIRONMENT);
            
            BulkServiceManager.setStatusPollIntervalInMilliseconds(5000);

            ArrayOfDownloadEntity entities = new ArrayOfDownloadEntity();
            entities.getDownloadEntities().add(DownloadEntity.AD_GROUP_PRODUCT_PARTITIONS);

            DownloadParameters downloadParameters = new DownloadParameters();
            downloadParameters.setDownloadEntities(entities);
            downloadParameters.setFileType(DownloadFileType.CSV);
            downloadParameters.setResultFileDirectory(new File(FileDirectory));
            downloadParameters.setResultFileName(DownloadFileName);
            downloadParameters.setOverwriteResultFile(true);
            downloadParameters.setLastSyncTimeInUTC(null);

            // Download all product partitions across all ad groups in the account.
            
            outputStatusMessage("-----\nDownloading all product partitions across all ad groups in the account..."); 
            
            File bulkFilePath = BulkServiceManager.downloadFileAsync(
                    downloadParameters, 
                    null, 
                    null).get(); 
            
            Reader = new BulkFileReader(
                    bulkFilePath, 
                    ResultFileType.FULL_DOWNLOAD, 
                    BulkDownloadFileType);
            
            downloadEntities = Reader.getEntities();

            List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();

            // Within the downloaded records, find all product partition leaf nodes that have bids.
            
            for (BulkEntity entity : downloadEntities) 
            {
                if (entity instanceof BulkAdGroupProductPartition &&
                    ((BulkAdGroupProductPartition)entity).getAdGroupCriterion() instanceof BiddableAdGroupCriterion &&
                    ((ProductPartition)(((BulkAdGroupProductPartition)entity).getAdGroupCriterion().getCriterion())).getPartitionType() == ProductPartitionType.UNIT) 
                {
                    AdGroupCriterion adGroupCriterion = ((BulkAdGroupProductPartition)entity).getAdGroupCriterion();
                    // Increase all bids by some predetermined amount or percentage. 
                    // Implement your own logic to update bids by varying amounts.
                    double updatedBid = ((FixedBid)((BiddableAdGroupCriterion)adGroupCriterion).getCriterionBid()).getAmount() + 0.01;
                    ((FixedBid)((BiddableAdGroupCriterion)adGroupCriterion).getCriterionBid()).setAmount(updatedBid);;
                    uploadEntities.add(entity);
                }
            }
            downloadEntities.close();
            Reader.close(); 

            if (!uploadEntities.isEmpty())
            {
                outputStatusMessage("Changed local bid of all product partitions. Starting upload.\n"); 

                Reader = writeEntitiesAndUploadFile(uploadEntities);
                downloadEntities = Reader.getEntities();
                for (BulkEntity entity : downloadEntities) 
                {
                    if (entity instanceof BulkAdGroupProductPartition) 
                    {
                        outputBulkAdGroupProductPartitions(Arrays.asList((BulkAdGroupProductPartition) entity) );
                    }
                }
                downloadEntities.close();
                Reader.close();
            }
            else
            {
                outputStatusMessage("No product partitions in account. \n"); 
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
