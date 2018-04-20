package com.microsoft.bingads.examples.v11;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.microsoft.bingads.v11.bulk.entities.*;
import com.microsoft.bingads.v11.bulk.*;
import com.microsoft.bingads.v11.campaignmanagement.*;

public class BulkProductPartitionUpdateBid extends BulkExampleBase {
	        
    public static void main(String[] args) {
		
        BulkEntityIterable downloadEntities = null;

        try {
            
            authorizationData = getAuthorizationData(null,null);

            BulkServiceManager = new BulkServiceManager(authorizationData, API_ENVIRONMENT);
            BulkServiceManager.setStatusPollIntervalInMilliseconds(5000);

            ArrayOfDownloadEntity entities = new ArrayOfDownloadEntity();
            entities.getDownloadEntities().add(DownloadEntity.AD_GROUP_PRODUCT_PARTITIONS);

            DownloadParameters downloadParameters = new DownloadParameters();
            downloadParameters.setDownloadEntities(entities);
            downloadParameters.setFileType(BulkDownloadFileType.CSV);
            downloadParameters.setResultFileDirectory(new File(FileDirectory));
            downloadParameters.setResultFileName(DownloadFileName);
            downloadParameters.setOverwriteResultFile(true);
            downloadParameters.setLastSyncTimeInUTC(null);

            // Download all product partitions across all ad groups in the account.
            File bulkFilePath = BulkServiceManager.downloadFileAsync(downloadParameters, null, null).get();
            outputStatusMessage("Downloaded all product partitions across all ad groups in the account.\n"); 
            Reader = new BulkFileReader(bulkFilePath, ResultFileType.FULL_DOWNLOAD, BulkDownloadFileType);
            downloadEntities = Reader.getEntities();

            List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();

            // Within the downloaded records, find all product partition leaf nodes that have bids.
            for (BulkEntity entity : downloadEntities) 
            {
                if (entity instanceof BulkAdGroupProductPartition &&
                            ((BulkAdGroupProductPartition)entity).getAdGroupCriterion() instanceof BiddableAdGroupCriterion &&
                            ((ProductPartition)(((BulkAdGroupProductPartition)entity).getAdGroupCriterion().getCriterion())).getPartitionType() == ProductPartitionType.UNIT) {
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
