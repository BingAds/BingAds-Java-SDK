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

public class BulkPauseAdGroups extends BulkExampleBaseV10 {
	
    static AuthorizationData authorizationData;
    static BulkServiceManager BulkService; 
    static BulkFileWriter Writer;  
    static BulkFileReader Reader;  
     
    final static long campaignIdKey = -123; 
    final static long adGroupIdKey = -1234; 
        
    public static void main(String[] args) {
		
		BulkEntityIterable bulkEntities = null;
				
		try {
			authorizationData = new AuthorizationData();
			authorizationData.setDeveloperToken(DeveloperToken);
			authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
			authorizationData.setCustomerId(CustomerId);
			authorizationData.setAccountId(AccountId);
						            				
			// Take advantage of the BulkServiceManager class to efficiently manage ads and keywords for all campaigns in an account. 
			// The client library provides classes to accelerate productivity for downloading and uploading entities. 
			// For example the UploadEntitiesAsync method of the BulkServiceManager class submits your upload request to the bulk service, 
			// polls the service until the upload completed, downloads the result file to a temporary directory, and exposes BulkEntity-derived objects  
			// that contain close representations of the corresponding Campaign Management data objects and value sets.
			    
			BulkService = new BulkServiceManager(authorizationData);
			
			// Poll for downloads at reasonable intervals. You know your data better than anyone. 
			// If you download an account that is well less than one million keywords, consider polling 
			// at 15 to 20 second intervals. If the account contains about one million keywords, consider polling 
			// at one minute intervals after waiting five minutes. For accounts with about four million keywords, 
			// consider polling at one minute intervals after waiting 10 minutes. 
			
			BulkService.setStatusPollIntervalInMilliseconds(5000);
						
			// Complete a full download of all ad groups in the account. 
			 
			List<BulkDownloadEntity> downloadEntities = new ArrayList<BulkDownloadEntity>();
			downloadEntities.add(BulkDownloadEntity.AD_GROUPS);
			
			DownloadParameters downloadParameters = new DownloadParameters();
			downloadParameters.setEntities(downloadEntities);
			downloadParameters.setFileType(DownloadFileType.CSV);
			
			outputStatusMessage("Starting DownloadEntitiesAsync . . .\n"); 
			bulkEntities = BulkService.downloadEntitiesAsync(downloadParameters, null, null).get();
			
			List<BulkEntity> entities = new ArrayList<BulkEntity>();
			
			outputStatusMessage("Printing the results of DownloadEntitiesAsync . . .\n"); 
			for (BulkEntity entity : bulkEntities) {
				if (entity instanceof BulkAdGroup 
						&& ((BulkAdGroup)entity).getAdGroup().getStatus() == AdGroupStatus.ACTIVE) {
					outputBulkAdGroups(Arrays.asList((BulkAdGroup) entity) );
					((BulkAdGroup)entity).getAdGroup().setStatus(AdGroupStatus.PAUSED);
					entities.add(entity);
				}
			}
			bulkEntities.close();
			
			if (!entities.isEmpty()){
				outputStatusMessage("Changed local status of all Active ad groups to Paused. Ready for upload.\n"); 
				
                outputStatusMessage("Starting Upload . . .\n"); 
				
		    	Reader = uploadEntities(entities);

		        // Write the upload output

		        bulkEntities = Reader.getEntities();

				outputStatusMessage("Printing the results of Upload . . .\n");
				for (BulkEntity entity : bulkEntities) {
					if (entity instanceof BulkAdGroup) {
						outputBulkAdGroups(Arrays.asList((BulkAdGroup) entity) );
					}
				}
				bulkEntities.close();
			}
			else{
				outputStatusMessage("All ad groups are already Paused. \n"); 
			}
			
			outputStatusMessage("Program execution completed\n"); 
			
		} catch (ExecutionException ee) {
			Throwable cause = ee.getCause();
			if (cause instanceof AdApiFaultDetail_Exception) {
				AdApiFaultDetail_Exception ex = (AdApiFaultDetail_Exception)cause;
				System.out.println("The operation failed with the following faults:\n");
				
				for (AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
				{
					System.out.printf("AdApiError\n");
					System.out.printf("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage());
				}
			} else if (cause instanceof ApiFaultDetail_Exception) {
				ApiFaultDetail_Exception ex = (ApiFaultDetail_Exception)cause;
				System.out.println("The operation failed with the following faults:\n");
				
				for (BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
				{
					System.out.printf("BatchError at Index: %d\n", error.getIndex());
					System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
				}
				
				for (OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
				{
					System.out.printf("OperationError\n");
					System.out.printf("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage());
				}
			} else {
				ee.printStackTrace();	
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		} finally {
			if (bulkEntities != null){
				try {
					bulkEntities.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	
		System.exit(0);
	}
    
    /// Writes the specified entities to a local file and uploads the file. We could have uploaded directly
    /// without writing to file. This example writes to file as an exercise so that you can view the structure 
    /// of the bulk records being uploaded as needed. 
    
    static BulkFileReader uploadEntities(List<BulkEntity> uploadEntities) throws IOException, ExecutionException, InterruptedException {
    	Writer = new BulkFileWriter(new File(FileDirectory + UploadFileName));

    	for(BulkEntity entity : uploadEntities){
    		Writer.writeEntity(entity);
    	}
        
        Writer.close();

        FileUploadParameters fileUploadParameters = new FileUploadParameters();
        fileUploadParameters.setResultFileDirectory(new File(FileDirectory));
        fileUploadParameters.setResultFileName(ResultFileName);
        fileUploadParameters.setUploadFilePath(new File(FileDirectory + UploadFileName));
        fileUploadParameters.setResponseMode(ResponseMode.ERRORS_AND_RESULTS);
        fileUploadParameters.setOverwriteResultFile(true);
        
        File bulkFilePath =
            BulkService.uploadFileAsync(fileUploadParameters, null, null).get();
        return new BulkFileReader(bulkFilePath, ResultFileType.UPLOAD, FileType);
    }
}