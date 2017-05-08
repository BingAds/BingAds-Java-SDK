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

public class BulkPauseAds extends BulkExampleBase {
	
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

            ArrayOfDownloadEntity entities = new ArrayOfDownloadEntity();
            entities.getDownloadEntities().add(DownloadEntity.ADS);

            DownloadParameters downloadParameters = new DownloadParameters();
            downloadParameters.setDownloadEntities(entities);
            downloadParameters.setFileType(DownloadFileType.CSV);

            // Download all ads in the account.
            File bulkFilePath = BulkService.downloadFileAsync(downloadParameters, null, null).get();
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
}
