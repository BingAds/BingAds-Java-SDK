package com.microsoft.bingads.examples.v10;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v10.bulk.entities.*;
import com.microsoft.bingads.v10.bulk.*;
import com.microsoft.bingads.v10.bulk.AdApiError;
import com.microsoft.bingads.v10.bulk.AdApiFaultDetail_Exception;
import com.microsoft.bingads.v10.bulk.ApiFaultDetail_Exception;
import com.microsoft.bingads.v10.bulk.BatchError;
import com.microsoft.bingads.v10.bulk.OperationError;
import com.microsoft.bingads.v10.campaignmanagement.*;

public class BulkPauseAdGroups extends BulkExampleBase {
	
    /*
	private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;
    */
        
    public static void main(String[] args) {
		
		BulkEntityIterable downloadEntities = null;
				
		try {
			AuthorizationData authorizationData = new AuthorizationData();
			authorizationData.setDeveloperToken(DeveloperToken);
			authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
			authorizationData.setCustomerId(CustomerId);
			authorizationData.setAccountId(AccountId);
						            				
			BulkService = new BulkServiceManager(authorizationData);
			BulkService.setStatusPollIntervalInMilliseconds(5000);
						
			// Complete a full download of all ad groups in the account. 
			 
			List<BulkDownloadEntity> entities = new ArrayList<BulkDownloadEntity>();
			entities.add(BulkDownloadEntity.AD_GROUPS);
			
			DownloadParameters downloadParameters = new DownloadParameters();
			downloadParameters.setEntities(entities);
			downloadParameters.setFileType(DownloadFileType.CSV);
			
			// Download all ad groups in the account.
			File bulkFilePath = BulkService.downloadFileAsync(downloadParameters, null, null).get();
			outputStatusMessage("Downloaded all ad groups in the account.\n"); 
			Reader = new BulkFileReader(bulkFilePath, ResultFileType.FULL_DOWNLOAD, FileType);
		    downloadEntities = Reader.getEntities();
				        
			List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();
			
			for (BulkEntity entity : downloadEntities) {
				if (entity instanceof BulkAdGroup 
						&& ((BulkAdGroup)entity).getAdGroup().getStatus() == AdGroupStatus.ACTIVE) {
					outputBulkAdGroups(Arrays.asList((BulkAdGroup) entity) );
					((BulkAdGroup)entity).getAdGroup().setStatus(AdGroupStatus.PAUSED);
					uploadEntities.add(entity);
				}
			}
			downloadEntities.close();
			Reader.close();
			
			if (!uploadEntities.isEmpty()){
				outputStatusMessage("Changed local status of all Active ad groups to Paused. Ready for upload.\n"); 
				
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
			else{
				outputStatusMessage("All ad groups are already Paused. \n"); 
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