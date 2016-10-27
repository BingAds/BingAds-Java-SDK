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

public class BulkPauseAds extends BulkExampleBase {
	
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
						            				
			BulkService = new BulkServiceManager(authorizationData, API_ENVIRONMENT);
			BulkService.setStatusPollIntervalInMilliseconds(5000);
						
			// Complete a full download of all ads in the account. 
			 
			List<BulkDownloadEntity> entities = new ArrayList<BulkDownloadEntity>();
			entities.add(BulkDownloadEntity.ADS);
			
			DownloadParameters downloadParameters = new DownloadParameters();
			downloadParameters.setEntities(entities);
			downloadParameters.setFileType(DownloadFileType.CSV);
			
			// Download all ads in the account.
			File bulkFilePath = BulkService.downloadFileAsync(downloadParameters, null, null).get();
			outputStatusMessage("Downloaded all ads in the account.\n"); 
			Reader = new BulkFileReader(bulkFilePath, ResultFileType.FULL_DOWNLOAD, FileType);
                        downloadEntities = Reader.getEntities();
			
			List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();
			
			for (BulkEntity entity : downloadEntities) {
                            if (entity instanceof BulkTextAd && ((BulkTextAd)entity).getAd().getStatus() == AdStatus.ACTIVE) {
                                outputBulkTextAds(Arrays.asList((BulkTextAd) entity) );

                                // Update the ad status to paused.
                                ((BulkTextAd)entity).getAd().setStatus(AdStatus.PAUSED);

                                // In this example we do not want to modify DestinationUrl so we set it to null.
                                // We don't round-trip the existing value because if DestinationUrl 
                                // is already empty, the value is deserialized as "". If you attempt to round-trip the object
                                // with DestinationUrl set to "", and if FinalUrls are not set, then the service will throw an error.
                                ((BulkTextAd)entity).getAd().setDestinationUrl(null);

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
                            if (entity instanceof BulkTextAd) {
                                outputBulkTextAds(Arrays.asList((BulkTextAd) entity) );
                            }
                        }
                        downloadEntities.close();
                        Reader.close();
			}
			else{
                            outputStatusMessage("All text ads are already Paused. \n"); 
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
	
	static void outputBulkTextAds(Iterable<BulkTextAd> bulkEntities){
		for (BulkTextAd entity : bulkEntities){
			outputStatusMessage("BulkTextAd: \n");
			outputStatusMessage(String.format("TextAd DisplayUrl: %s\nTextAd Id: %s\nTextAd Status: %s\n", 
					entity.getAd().getDisplayUrl(),
					entity.getAd().getId(),
					entity.getAd().getStatus()));
			
			if(entity.hasErrors()){
				outputErrors(entity.getErrors());
			}
		}
	}
	
	static void outputErrors(Iterable<BulkError> errors){
		for (BulkError error : errors){
			outputStatusMessage(String.format("Error: %s", error.getError()));
			outputStatusMessage(String.format("Number: %s\n", error.getNumber()));
			if(error.getEditorialReasonCode() != null){
				outputStatusMessage(String.format("EditorialTerm: %s\n", error.getEditorialTerm()));
				outputStatusMessage(String.format("EditorialReasonCode: %s\n", error.getEditorialReasonCode()));
				outputStatusMessage(String.format("EditorialLocation: %s\n", error.getEditorialLocation()));
				outputStatusMessage(String.format("PublisherCountries: %s\n", error.getPublisherCountries()));
			}
		}
	}
		
}