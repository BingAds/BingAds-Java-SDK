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
import com.microsoft.bingads.v11.bulk.AdApiError;
import com.microsoft.bingads.v11.bulk.AdApiFaultDetail_Exception;
import com.microsoft.bingads.v11.bulk.ApiFaultDetail_Exception;
import com.microsoft.bingads.v11.bulk.BatchError;
import com.microsoft.bingads.v11.bulk.OperationError;
import com.microsoft.bingads.v11.campaignmanagement.*;

public class BulkProductPartitionUpdateBid extends BulkExampleBase {
	        
    public static void main(String[] args) {
		
		BulkEntityIterable downloadEntities = null;
				
		try {
			AuthorizationData authorizationData = new AuthorizationData();
			authorizationData.setDeveloperToken(DeveloperToken);
			authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
			authorizationData.setCustomerId(CustomerId);
			authorizationData.setAccountId(AccountId);
						            				
			BulkService = new BulkServiceManager(authorizationData, API_ENVIRONMENT);
			BulkService.setStatusPollIntervalInMilliseconds(5000);

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
			File bulkFilePath = BulkService.downloadFileAsync(downloadParameters, null, null).get();
			outputStatusMessage("Downloaded all product partitions across all ad groups in the account.\n"); 
			Reader = new BulkFileReader(bulkFilePath, ResultFileType.FULL_DOWNLOAD, FileType);
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
			
		} catch (BulkDownloadCouldNotBeCompletedException ee) {
			outputStatusMessage(String.format("BulkDownloadCouldNotBeCompletedException: %s\nMessage: %s\n\n", ee.getMessage()));
		} catch (BulkUploadCouldNotBeCompletedException ee) {
			outputStatusMessage(String.format("BulkUploadCouldNotBeCompletedException: %s\nMessage: %s\n\n", ee.getMessage()));
		} catch (OAuthTokenRequestException ee) {
			outputStatusMessage(String.format("OAuthTokenRequestException: %s\nMessage: %s\n\n", ee.getMessage()));
		} catch (BulkOperationInProgressException ee) {
			outputStatusMessage(String.format("BulkOperationInProgressException: %s\nMessage: %s\n\n", ee.getMessage()));
		} catch (ExecutionException ee) {
			Throwable cause = ee.getCause();
			if (cause instanceof AdApiFaultDetail_Exception) {
				AdApiFaultDetail_Exception ex = (AdApiFaultDetail_Exception)cause;
				outputStatusMessage("The operation failed with the following faults:\n");
				
				for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
				{
					outputStatusMessage("AdApiError\n");
					outputStatusMessage(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", 
							error.getCode(), error.getErrorCode(), error.getMessage()));
				}
			} else if (cause instanceof ApiFaultDetail_Exception) {
				ApiFaultDetail_Exception ex = (ApiFaultDetail_Exception)cause;
				outputStatusMessage("The operation failed with the following faults:\n");
				
				for (BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
				{
					outputStatusMessage(String.format("BatchError at Index: %d\n", error.getIndex()));
					outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
				}
				
				for (OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
				{
					outputStatusMessage("OperationError\n");
					outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
				}
			} else {
				ee.printStackTrace();	
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		} finally {
			if (downloadEntities != null){
				try {
					downloadEntities.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	
		System.exit(0);
	}
}
