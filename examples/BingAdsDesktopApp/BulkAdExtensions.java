package com.microsoft.bingads.examples;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.microsoft.bingads.*;
import com.microsoft.bingads.bulk.entities.*;
import com.microsoft.bingads.bulk.*;
import com.microsoft.bingads.bulk.AdApiError;
import com.microsoft.bingads.bulk.AdApiFaultDetail_Exception;
import com.microsoft.bingads.bulk.ApiFaultDetail_Exception;
import com.microsoft.bingads.bulk.BatchError;
import com.microsoft.bingads.bulk.OperationError;
import com.microsoft.bingads.campaignmanagement.*;

public class BulkAdExtensions {
	
    static AuthorizationData authorizationData;
    static BulkServiceManager BulkService; 
    static BulkFileWriter Writer;  
    static BulkFileReader Reader;  
    
    /// <summary>
    /// The directory for the bulk files.
    /// </summary>
    static java.lang.String FileDirectory = "c:\\bulk\\";

    /// <summary>
    /// The name of the bulk upload file.
    /// </summary>
    static java.lang.String UploadFileName = "upload.csv";

    /// <summary>
    /// The name of the bulk upload file.
    /// </summary>
    static java.lang.String ResultFileName = "result.csv";
    
    /// <summary>
    /// The bulk file extension type.
    /// </summary>
    static DownloadFileType FileType = DownloadFileType.CSV; 
     
    final static long appAdExtensionIdKey = -11; 
    final static long callAdExtensionIdKey = -12; 
    final static long locationAdExtensionIdKey = -13; 
    final static long siteLinksAdExtensionIdKey = -14; 
    final static long campaignIdKey = -123; 
    
    private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;
        
    public static void main(String[] args) {
		
		BulkEntityIterable entities = null;
				
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

            // Prepare the bulk entities that you want to upload. Each bulk entity contains the corresponding campaign management object, 
            // and additional elements needed to read from and write to a bulk file. 
			
			BulkCampaign bulkCampaign = getExampleBulkCampaign();
            
			// Prepare extensions for upload

			BulkAppAdExtension bulkAppAdExtension = getExampleBulkAppAdExtension();
			BulkCampaignAppAdExtension bulkCampaignAppAdExtension = getExampleBulkCampaignAppAdExtension();
			BulkCallAdExtension bulkCallAdExtension = getExampleBulkCallAdExtension();
			BulkCampaignCallAdExtension bulkCampaignCallAdExtension = getExampleBulkCampaignCallAdExtension();
			BulkLocationAdExtension bulkLocationAdExtension = getExampleBulkLocationAdExtension();
			BulkCampaignLocationAdExtension bulkCampaignLocationAdExtension = getExampleBulkCampaignLocationAdExtension();
			BulkSiteLinkAdExtension bulkSiteLinkAdExtension = getExampleBulkSiteLinkAdExtension();
			BulkCampaignSiteLinkAdExtension bulkCampaignSiteLinkAdExtension = getExampleBulkCampaignSiteLinkAdExtension();
			
			
            // Write the entities created above, to the specified file.
            // Dependent entities such as BulkCampaignLocationTarget must be written after any dependencies,  
            // for example a BulkCampaign. 

            Writer = new BulkFileWriter(new File(FileDirectory + UploadFileName));

            Writer.writeEntity(bulkCampaign);
            Writer.writeEntity(bulkAppAdExtension);
            Writer.writeEntity(bulkCampaignAppAdExtension);
            Writer.writeEntity(bulkCallAdExtension);
            Writer.writeEntity(bulkCampaignCallAdExtension);
            Writer.writeEntity(bulkLocationAdExtension);
            Writer.writeEntity(bulkCampaignLocationAdExtension);
            Writer.writeEntity(bulkSiteLinkAdExtension);
            Writer.writeEntity(bulkCampaignSiteLinkAdExtension);

            Writer.close();

            FileUploadParameters fileUploadParameters = new FileUploadParameters();
            fileUploadParameters.setResultFileDirectory(new File(FileDirectory));
            fileUploadParameters.setResultFileName(ResultFileName);
            fileUploadParameters.setUploadFilePath(new File(FileDirectory + UploadFileName));
            fileUploadParameters.setResponseMode(ResponseMode.ERRORS_AND_RESULTS);
            fileUploadParameters.setOverwriteResultFile(true);

            // uploadFileAsync will upload the file you finished writing and will download the results file

            outputStatusMessage("\nAdding campaign, ad extensions, and associations . . .\n");
            File bulkFilePath =
                BulkService.uploadFileAsync(fileUploadParameters, null, null).get();
            Reader = new BulkFileReader(bulkFilePath, ResultFileType.UPLOAD, FileType);
            outputStatusMessage("Upload Results Bulk File Path" + Reader.getBulkFilePath() + "\n");

            // Write the upload output

            entities = Reader.getEntities();
            List<BulkCampaign> campaignResults = new ArrayList<BulkCampaign>();
            List<BulkAppAdExtension> appAdExtensionResults = new ArrayList<BulkAppAdExtension>();
            List<BulkCallAdExtension> callAdExtensionResults = new ArrayList<BulkCallAdExtension>();
            List<BulkLocationAdExtension> locationAdExtensionResults = new ArrayList<BulkLocationAdExtension>();
            List<BulkSiteLinkAdExtension> siteLinkAdExtensionResults = new ArrayList<BulkSiteLinkAdExtension>();
            
            for (BulkEntity entity : entities) {
				if (entity instanceof BulkCampaign) {
					campaignResults.add((BulkCampaign) entity);
					outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
				}
				else if (entity instanceof BulkAppAdExtension) {
					appAdExtensionResults.add((BulkAppAdExtension) entity);
					outputBulkAppAdExtensions(Arrays.asList((BulkAppAdExtension) entity) );
				}
				else if (entity instanceof BulkCampaignAppAdExtension) {
					outputBulkCampaignAppAdExtensions(Arrays.asList((BulkCampaignAppAdExtension) entity) );
				}
				else if (entity instanceof BulkCallAdExtension) {
					callAdExtensionResults.add((BulkCallAdExtension) entity);
					outputBulkCallAdExtensions(Arrays.asList((BulkCallAdExtension) entity) );
				}
				else if (entity instanceof BulkCampaignCallAdExtension) {
					outputBulkCampaignCallAdExtensions(Arrays.asList((BulkCampaignCallAdExtension) entity) );
				}
				else if (entity instanceof BulkLocationAdExtension) {
					locationAdExtensionResults.add((BulkLocationAdExtension) entity);
					outputBulkLocationAdExtensions(Arrays.asList((BulkLocationAdExtension) entity) );
				}
				else if (entity instanceof BulkCampaignLocationAdExtension) {
					outputBulkCampaignLocationAdExtensions(Arrays.asList((BulkCampaignLocationAdExtension) entity) );
				}
				else if (entity instanceof BulkSiteLinkAdExtension) {
					siteLinkAdExtensionResults.add((BulkSiteLinkAdExtension) entity);
					outputBulkSiteLinkAdExtensions(Arrays.asList((BulkSiteLinkAdExtension) entity) );
				}
				else if (entity instanceof BulkCampaignSiteLinkAdExtension) {
					outputBulkCampaignSiteLinkAdExtensions(Arrays.asList((BulkCampaignSiteLinkAdExtension) entity) );
				}
			}
			entities.close();

            Reader.close();
            
            java.lang.Long campaignId = campaignResults.get(0).getCampaign().getId();
            
            
            // Update the site links ad extension. 
            // Do not create a BulkSiteLinkAdExtension for update, unless you want to replace all existing SiteLinks
            // with the specified SiteLinks for the specified ad extension. 
            // Instead you should upload one or more site links as a list of BulkSiteLink.

            List<BulkSiteLink> bulkSiteLinks = new ArrayList<BulkSiteLink>();
            BulkSiteLink bulkSiteLink = new BulkSiteLink();
            SiteLink siteLink = new SiteLink();
            siteLink.setDestinationUrl("Contoso.com");
            siteLink.setDisplayText("Red Shoe Sale");
            bulkSiteLink.setSiteLink(siteLink);
            bulkSiteLinks.add(bulkSiteLink);


	        // Add an additional site link, and update an existing site link
	
	        if (siteLinkAdExtensionResults.get(0).getSiteLinks().size() > 0)
	        {
	        	BulkSiteLink existingSiteLink = siteLinkAdExtensionResults.get(0).getSiteLinks().get(0);
	            existingSiteLink.getSiteLink().setDisplayText("Red Shoes Super Sale");
	
	            // Associate the new site links with the identifier of the existing site links ad extension
	
	            for (BulkSiteLink bSiteLink : bulkSiteLinks)
	            {
	            	bSiteLink.setAdExtensionId(existingSiteLink.getAdExtensionId());
	            }
	
	            bulkSiteLinks.add(existingSiteLink);
	        }


            // Write the updated target to the file

            Writer = new BulkFileWriter(new File(FileDirectory + UploadFileName));

            for (BulkSiteLink bSiteLink : bulkSiteLinks)
            {
                Writer.writeEntity(bSiteLink);
            }
            Writer.close();

            outputStatusMessage("\nUpdating sitelinks . . .\n");
            bulkFilePath =
                BulkService.uploadFileAsync(fileUploadParameters, null, null).get();
            Reader = new BulkFileReader(bulkFilePath, ResultFileType.UPLOAD, FileType);
            outputStatusMessage("Upload Results Bulk File Path" + Reader.getBulkFilePath() + "\n");
            
            entities = Reader.getEntities();
            
            for (BulkEntity entity : entities) {
				if (entity instanceof BulkSiteLink) {
					outputBulkSiteLinks(Arrays.asList((BulkSiteLink) entity) );
				}
			}
			entities.close();
            Reader.close();
            
            
            // Prepare the bulk entities that you want to delete. You must set the Id field to the corresponding 
            // entity identifier, and the Status field to Deleted. 

            bulkCampaign = new BulkCampaign();
            bulkCampaign.setCampaign(new Campaign());
            bulkCampaign.getCampaign().setId(campaignId);
            bulkCampaign.getCampaign().setStatus(CampaignStatus.DELETED);
            
            bulkAppAdExtension = new BulkAppAdExtension();
            bulkAppAdExtension.setAppAdExtension(new AppAdExtension());
            bulkAppAdExtension.getAppAdExtension().setStatus(AdExtensionStatus.DELETED);
            bulkAppAdExtension.getAppAdExtension().setId(appAdExtensionResults.get(0).getAppAdExtension().getId());
            
            bulkCallAdExtension = new BulkCallAdExtension();
            bulkCallAdExtension.setCallAdExtension(new CallAdExtension());
            bulkCallAdExtension.getCallAdExtension().setStatus(AdExtensionStatus.DELETED);
            bulkCallAdExtension.getCallAdExtension().setId(callAdExtensionResults.get(0).getCallAdExtension().getId());

            bulkLocationAdExtension = new BulkLocationAdExtension();
            bulkLocationAdExtension.setLocationAdExtension(new LocationAdExtension());
            bulkLocationAdExtension.getLocationAdExtension().setStatus(AdExtensionStatus.DELETED);
            bulkLocationAdExtension.getLocationAdExtension().setId(locationAdExtensionResults.get(0).getLocationAdExtension().getId());
            
            bulkSiteLinkAdExtension = new BulkSiteLinkAdExtension();
            bulkSiteLinkAdExtension.setSiteLinksAdExtension(new SiteLinksAdExtension());
            bulkSiteLinkAdExtension.getSiteLinksAdExtension().setStatus(AdExtensionStatus.DELETED);
            bulkSiteLinkAdExtension.getSiteLinksAdExtension().setId(siteLinkAdExtensionResults.get(0).getSiteLinksAdExtension().getId());
            

            // Write the entities that you want deleted, to the specified file.

            Writer = new BulkFileWriter(new File(FileDirectory + UploadFileName));

            Writer.writeEntity(bulkCampaign);
            Writer.writeEntity(bulkAppAdExtension);
            Writer.writeEntity(bulkCallAdExtension);
            Writer.writeEntity(bulkLocationAdExtension);
            Writer.writeEntity(bulkSiteLinkAdExtension);

            Writer.close();

            fileUploadParameters = new FileUploadParameters();
            fileUploadParameters.setResultFileDirectory(new File(FileDirectory));
            fileUploadParameters.setResultFileName(ResultFileName);
            fileUploadParameters.setUploadFilePath(new File(FileDirectory + UploadFileName));
            fileUploadParameters.setResponseMode(ResponseMode.ERRORS_AND_RESULTS);
            fileUploadParameters.setOverwriteResultFile(true);

            outputStatusMessage("\nDeleting campaign and ad extensions . . .\n");
            bulkFilePath =
                BulkService.uploadFileAsync(fileUploadParameters, null, null).get();
            Reader = new BulkFileReader(bulkFilePath, ResultFileType.UPLOAD, FileType);
            outputStatusMessage("Upload Results Bulk File Path" + Reader.getBulkFilePath() + "\n");

            // Write the upload output

            entities = Reader.getEntities();
            
            for (BulkEntity entity : entities) {
				if (entity instanceof BulkCampaign) {
					campaignResults.add((BulkCampaign) entity);
					outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
				}
				else if (entity instanceof BulkAppAdExtension) {
					appAdExtensionResults.add((BulkAppAdExtension) entity);
					outputBulkAppAdExtensions(Arrays.asList((BulkAppAdExtension) entity) );
				}
				else if (entity instanceof BulkCampaignAppAdExtension) {
					outputBulkCampaignAppAdExtensions(Arrays.asList((BulkCampaignAppAdExtension) entity) );
				}
				else if (entity instanceof BulkCallAdExtension) {
					callAdExtensionResults.add((BulkCallAdExtension) entity);
					outputBulkCallAdExtensions(Arrays.asList((BulkCallAdExtension) entity) );
				}
				else if (entity instanceof BulkCampaignCallAdExtension) {
					outputBulkCampaignCallAdExtensions(Arrays.asList((BulkCampaignCallAdExtension) entity) );
				}
				else if (entity instanceof BulkLocationAdExtension) {
					locationAdExtensionResults.add((BulkLocationAdExtension) entity);
					outputBulkLocationAdExtensions(Arrays.asList((BulkLocationAdExtension) entity) );
				}
				else if (entity instanceof BulkCampaignLocationAdExtension) {
					outputBulkCampaignLocationAdExtensions(Arrays.asList((BulkCampaignLocationAdExtension) entity) );
				}
				else if (entity instanceof BulkSiteLinkAdExtension) {
					siteLinkAdExtensionResults.add((BulkSiteLinkAdExtension) entity);
					outputBulkSiteLinkAdExtensions(Arrays.asList((BulkSiteLinkAdExtension) entity) );
				}
				else if (entity instanceof BulkCampaignSiteLinkAdExtension) {
					outputBulkCampaignSiteLinkAdExtensions(Arrays.asList((BulkCampaignSiteLinkAdExtension) entity) );
				}
				else if (entity instanceof BulkSiteLink) {
					outputBulkSiteLinks(Arrays.asList((BulkSiteLink) entity) );
				}
			}
			entities.close();
            Reader.close();
		
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
			if (entities != null){
				try {
					entities.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
	
		System.exit(0);
	}
	
	static BulkCampaign getExampleBulkCampaign() {
		BulkCampaign bulkCampaign = new BulkCampaign();
		// ClientId may be used to associate records in the bulk upload file with records in the results file. The value of this field  
		// is not used or stored by the server; it is simply copied from the uploaded record to the corresponding result record. 
		// Note: This bulk file Client Id is not related to an application Client Id for OAuth. 
		bulkCampaign.setClientId("YourClientIdGoesHere");
		Campaign campaign = new Campaign();
		// When using the Campaign Management service, the Id cannot be set. In the context of a BulkCampaign, the Id is optional  
		// and may be used as a negative reference key during bulk upload. For example the same negative reference key for the campaign Id  
		// will be used when adding new ad groups to this new campaign, or when associating ad extensions with the campaign. 
		campaign.setId(campaignIdKey);
		campaign.setName("Winter Clothing " + System.currentTimeMillis());
		campaign.setDescription("Winter clothing line.");
		campaign.setBudgetType(BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED);
		campaign.setMonthlyBudget(1000.00);
		campaign.setTimeZone("PacificTimeUSCanadaTijuana");
		campaign.setStatus(CampaignStatus.PAUSED);
		bulkCampaign.setCampaign(campaign);
		
		return bulkCampaign;
	}
	
	static void outputBulkCampaigns(Iterable<BulkCampaign> bulkEntities){
		for (BulkCampaign entity : bulkEntities){
			outputStatusMessage("\nBulkCampaign: \n");
			outputStatusMessage(String.format("Campaign Name: %s\nCampaign Id: %s\n", 
					entity.getCampaign().getName(),
					entity.getCampaign().getId()));
					
			if(entity.hasErrors()){
				outputErrors(entity.getErrors());
			}
		}
	}
	
	static BulkAppAdExtension getExampleBulkAppAdExtension(){
		BulkAppAdExtension bulkAppAdExtension = new BulkAppAdExtension();
		bulkAppAdExtension.setAccountId(authorizationData.getAccountId());
		AppAdExtension appAdExtension = new AppAdExtension();
        appAdExtension.setAppPlatform("Windows");
        appAdExtension.setAppStoreId("AppStoreIdGoesHere");
        appAdExtension.setDestinationUrl("DestinationUrlGoesHere");
        appAdExtension.setDisplayText("Contoso");
		appAdExtension.setId(appAdExtensionIdKey);
		bulkAppAdExtension.setAppAdExtension(appAdExtension);
		return bulkAppAdExtension;
	}
	
	static void outputBulkAppAdExtensions(Iterable<BulkAppAdExtension> bulkEntities){
		for (BulkAppAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkAppAdExtension: \n");
            outputStatusMessage(String.format("AccountId: %s\n", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s\n",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
            }
            
            // Output the Campaign Management AppAdExtension Object
            outputAppAdExtension(entity.getAppAdExtension());

            if (entity.hasErrors())
            {
                outputErrors(entity.getErrors());
            }
        }
	}
	
	static void outputAppAdExtension(AppAdExtension extension){
		if (extension != null) {
			outputStatusMessage(String.format("AppPlatform: %s\n", extension.getAppPlatform()));
			outputStatusMessage(String.format("AppStoreId: %s\n", extension.getAppStoreId()));
			outputStatusMessage(String.format("DestinationUrl: %s\n", extension.getDestinationUrl()));
			outputStatusMessage(String.format("DevicePreference: %s\n", extension.getDevicePreference()));
			outputStatusMessage(String.format("DisplayText: %s\n", extension.getDisplayText()));
			outputStatusMessage(String.format("Id: %s\n", extension.getId()));
			outputStatusMessage(String.format("Status: %s\n", extension.getStatus()));
			outputStatusMessage(String.format("Version: %s\n", extension.getVersion()));
		}
	}
	
	static BulkCampaignAppAdExtension getExampleBulkCampaignAppAdExtension(){
		BulkCampaignAppAdExtension bulkCampaignAppAdExtension = new BulkCampaignAppAdExtension();
		AdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
		adExtensionIdToEntityIdAssociation.setAdExtensionId(appAdExtensionIdKey);
		adExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
		bulkCampaignAppAdExtension.setAdExtensionIdToEntityIdAssociation(adExtensionIdToEntityIdAssociation);
		return bulkCampaignAppAdExtension;
	}
	
	static void outputBulkCampaignAppAdExtensions(Iterable<BulkCampaignAppAdExtension> bulkEntities){
		for (BulkCampaignAppAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkCampaignAppAdExtension: \n");
            if(entity.getAdExtensionIdToEntityIdAssociation() != null){
            	outputStatusMessage(String.format("AdExtensionId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getAdExtensionId()));
                outputStatusMessage(String.format("EntityId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getEntityId()));
            }
            outputStatusMessage(String.format("CampaignName: %s\n", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s\n", entity.getClientId()));
            outputStatusMessage(String.format("EditorialStatus: %s\n", entity.getEditorialStatus()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Status: %s\n", entity.getStatus()));
            
            if (entity.hasErrors())
            {
                outputErrors(entity.getErrors());
            }
        }
	}
	
	static BulkCallAdExtension getExampleBulkCallAdExtension(){
		BulkCallAdExtension bulkCallAdExtension = new BulkCallAdExtension();
		bulkCallAdExtension.setAccountId(authorizationData.getAccountId());
		CallAdExtension callAdExtension = new CallAdExtension();
		callAdExtension.setCountryCode("US");
		callAdExtension.setPhoneNumber("2065550100");
		callAdExtension.setIsCallOnly(false);
		callAdExtension.setId(callAdExtensionIdKey);
		bulkCallAdExtension.setCallAdExtension(callAdExtension);
		return bulkCallAdExtension;
	}
	
	static void outputBulkCallAdExtensions(Iterable<BulkCallAdExtension> bulkEntities){
		for (BulkCallAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkCallAdExtension: \n");
            outputStatusMessage(String.format("AccountId: %s\n", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s\n",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
            }
            
            // Output the Campaign Management CallAdExtension Object
            outputCallAdExtension(entity.getCallAdExtension());

            if (entity.hasErrors())
            {
                outputErrors(entity.getErrors());
            }
        }
	}
	
	static void outputCallAdExtension(CallAdExtension extension){
		if (extension != null) {
			outputStatusMessage(String.format("Phone number: %s\n", extension.getPhoneNumber()));
            outputStatusMessage(String.format("Country: %s\n", extension.getCountryCode()));
            outputStatusMessage(String.format("Is only clickable item: %s\n", extension.getIsCallOnly()));
		}
	}
	
	static BulkCampaignCallAdExtension getExampleBulkCampaignCallAdExtension(){
		BulkCampaignCallAdExtension bulkCampaignCallAdExtension = new BulkCampaignCallAdExtension();
		AdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
		adExtensionIdToEntityIdAssociation.setAdExtensionId(callAdExtensionIdKey);
		adExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
		bulkCampaignCallAdExtension.setAdExtensionIdToEntityIdAssociation(adExtensionIdToEntityIdAssociation);
		return bulkCampaignCallAdExtension;
	}
	
	static void outputBulkCampaignCallAdExtensions(Iterable<BulkCampaignCallAdExtension> bulkEntities){
		for (BulkCampaignCallAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkCampaignCallAdExtension: \n");
            if(entity.getAdExtensionIdToEntityIdAssociation() != null){
            	outputStatusMessage(String.format("AdExtensionId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getAdExtensionId()));
                outputStatusMessage(String.format("EntityId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getEntityId()));
            }
            outputStatusMessage(String.format("CampaignName: %s\n", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s\n", entity.getClientId()));
            outputStatusMessage(String.format("EditorialStatus: %s\n", entity.getEditorialStatus()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Status: %s\n", entity.getStatus()));
            
            if (entity.hasErrors())
            {
                outputErrors(entity.getErrors());
            }
        }
	}
	
	static BulkLocationAdExtension getExampleBulkLocationAdExtension(){
		BulkLocationAdExtension bulkLocationAdExtension = new BulkLocationAdExtension();
		bulkLocationAdExtension.setAccountId(authorizationData.getAccountId());
		LocationAdExtension locationAdExtension = new LocationAdExtension();
		locationAdExtension.setPhoneNumber("206-555-0100");
		locationAdExtension.setCompanyName("Contoso Shoes");
		locationAdExtension.setIconMediaId(null);
		locationAdExtension.setImageMediaId(null);
		Address address = new Address();
		address.setStreetAddress("1234 Washington Place");
		address.setStreetAddress2("Suite 1210");
		address.setCityName("Woodinville");
		address.setProvinceName("WA");
		address.setCountryCode("US");
		address.setPostalCode("98608");
		locationAdExtension.setAddress(address);
		locationAdExtension.setId(locationAdExtensionIdKey);
		bulkLocationAdExtension.setLocationAdExtension(locationAdExtension);
		return bulkLocationAdExtension;
	}
	
	static void outputBulkLocationAdExtensions(Iterable<BulkLocationAdExtension> bulkEntities){
		for (BulkLocationAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkLocationAdExtension: \n");
            outputStatusMessage(String.format("AccountId: %s\n", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s\n",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management LocationAdExtension Object
            outputLocationAdExtension(entity.getLocationAdExtension());

            if (entity.hasErrors())
            {
                outputErrors(entity.getErrors());
            }
        }
	}
	
	static void outputLocationAdExtension(LocationAdExtension extension){
		if (extension != null) {
			if(extension.getAddress() != null){
				outputStatusMessage(String.format("Street: %s\n", extension.getAddress().getStreetAddress()));
	            outputStatusMessage(String.format("City: %s\n", extension.getAddress().getCityName()));
	            outputStatusMessage(String.format("State: %s\n", extension.getAddress().getProvinceName()));
	            outputStatusMessage(String.format("Country: %s\n", extension.getAddress().getCountryCode()));
	            outputStatusMessage(String.format("Zip code: %s\n", extension.getAddress().getPostalCode()));
			}
			outputStatusMessage(String.format("Company name: %s\n", extension.getCompanyName()));
            outputStatusMessage(String.format("Phone number: %s\n", extension.getPhoneNumber()));
            outputStatusMessage(String.format("Business coordinates determined?: %s\n", extension.getGeoCodeStatus()));
            if(extension.getGeoPoint() != null){
            	outputStatusMessage("GeoPoint: ");
            	outputStatusMessage(String.format("LatitudeInMicroDegrees: %s\n", 
            			extension.getGeoPoint().getLatitudeInMicroDegrees()));
            	outputStatusMessage(String.format("LongitudeInMicroDegrees: %s\n", 
            			extension.getGeoPoint().getLongitudeInMicroDegrees()));
            }
            outputStatusMessage(String.format("Map icon ID: %s\n", extension.getIconMediaId()));
            outputStatusMessage(String.format("Business image ID: %s\n", extension.getImageMediaId()));
		}
	}
	
	static BulkCampaignLocationAdExtension getExampleBulkCampaignLocationAdExtension(){
		BulkCampaignLocationAdExtension bulkCampaignLocationAdExtension = new BulkCampaignLocationAdExtension();
		AdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
		adExtensionIdToEntityIdAssociation.setAdExtensionId(locationAdExtensionIdKey);
		adExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
		bulkCampaignLocationAdExtension.setAdExtensionIdToEntityIdAssociation(adExtensionIdToEntityIdAssociation);
		return bulkCampaignLocationAdExtension;
	}
	
	static void outputBulkCampaignLocationAdExtensions(Iterable<BulkCampaignLocationAdExtension> bulkEntities){
		for (BulkCampaignLocationAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkCampaignLocationAdExtension: \n");
            if(entity.getAdExtensionIdToEntityIdAssociation() != null){
            	outputStatusMessage(String.format("AdExtensionId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getAdExtensionId()));
                outputStatusMessage(String.format("EntityId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getEntityId()));
            }
            outputStatusMessage(String.format("CampaignName: %s\n", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s\n", entity.getClientId()));
            outputStatusMessage(String.format("EditorialStatus: %s\n", entity.getEditorialStatus()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Status: %s\n", entity.getStatus()));
            
            if (entity.hasErrors())
            {
                outputErrors(entity.getErrors());
            }
        }
	}
	
	static BulkSiteLinkAdExtension getExampleBulkSiteLinkAdExtension(){
		BulkSiteLinkAdExtension bulkSiteLinkAdExtension = new BulkSiteLinkAdExtension();
		bulkSiteLinkAdExtension.setAccountId(authorizationData.getAccountId());
		SiteLinksAdExtension siteLinksAdExtension = new SiteLinksAdExtension();
		siteLinksAdExtension.setId(siteLinksAdExtensionIdKey);
		ArrayOfSiteLink siteLinks = new ArrayOfSiteLink();
		SiteLink siteLink0 = new SiteLink();
		siteLink0.setDestinationUrl("Contoso.com");
		siteLink0.setDisplayText("Women's Shoe Sale 1");
		siteLinks.getSiteLinks().add(siteLink0);
		SiteLink siteLink1 = new SiteLink();
		siteLink1.setDestinationUrl("Contoso.com");
		siteLink1.setDisplayText("Women's Shoe Sale 1");
		siteLinks.getSiteLinks().add(siteLink1);
		siteLinksAdExtension.setSiteLinks(siteLinks);
		bulkSiteLinkAdExtension.setSiteLinksAdExtension(siteLinksAdExtension);
		return bulkSiteLinkAdExtension;
	}
	
	static void outputBulkSiteLinkAdExtensions(Iterable<BulkSiteLinkAdExtension> bulkEntities){
		for (BulkSiteLinkAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkSiteLinkAdExtension: \n");
            outputStatusMessage(String.format("AccountId: %s\n", entity.getAccountId()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management SiteLinksAdExtension Object
            outputSiteLinksAdExtension(entity.getSiteLinksAdExtension());

            if (entity.getSiteLinks() != null && entity.getSiteLinks().size() > 0)
            {
                outputBulkSiteLinks(entity.getSiteLinks());
            }
        }
	}
	
	static void outputBulkSiteLinks(Iterable<BulkSiteLink> bulkEntities)
    {
        for (BulkSiteLink entity : bulkEntities)
        {
            outputStatusMessage("\nBulkSiteLink: \n");
            outputStatusMessage(String.format("AccountId: %s\n", entity.getAccountId()));
            outputStatusMessage(String.format("AdExtensionId: %s\n", entity.getAdExtensionId()));
            outputStatusMessage(String.format("ClientId: %s\n", entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Order: %s\n", entity.getOrder()));
            outputStatusMessage(String.format("Status: %s\n", entity.getStatus()));
            outputStatusMessage(String.format("Version: %s\n", entity.getVersion()));

            // Output the Campaign Management SiteLink Object
            List<SiteLink> siteLinks = new ArrayList<SiteLink>();
            siteLinks.add(entity.getSiteLink());
            outputSiteLinks(siteLinks);

            if (entity.hasErrors())
            {
                outputErrors(entity.getErrors());
            }
        }
    }
	
	static void outputSiteLinksAdExtension(SiteLinksAdExtension extension){
		if (extension != null && extension.getSiteLinks() != null) {
			for (SiteLink sLink : extension.getSiteLinks().getSiteLinks())
            {
                outputStatusMessage(String.format("  Display URL: %s\n", sLink.getDisplayText()));
                outputStatusMessage(String.format("  Destination URL: %s\n", sLink.getDestinationUrl()));
            }
		}
	}
	
	static void outputSiteLinks(Iterable<SiteLink> siteLinks){
		if (siteLinks != null) {
			for (SiteLink siteLink : siteLinks)
            {
                outputStatusMessage(String.format("  Display URL: %s\n", siteLink.getDisplayText()));
                outputStatusMessage(String.format("  Destination URL: %s\n", siteLink.getDestinationUrl()));
            }
		}
	}
	
	static BulkCampaignSiteLinkAdExtension getExampleBulkCampaignSiteLinkAdExtension(){
		BulkCampaignSiteLinkAdExtension bulkCampaignSiteLinkAdExtension = new BulkCampaignSiteLinkAdExtension();
		AdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
		adExtensionIdToEntityIdAssociation.setAdExtensionId(siteLinksAdExtensionIdKey);
		adExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
		bulkCampaignSiteLinkAdExtension.setAdExtensionIdToEntityIdAssociation(adExtensionIdToEntityIdAssociation);
		return bulkCampaignSiteLinkAdExtension;
	}
	
	static void outputBulkCampaignSiteLinkAdExtensions(Iterable<BulkCampaignSiteLinkAdExtension> bulkEntities){
		for (BulkCampaignSiteLinkAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkCampaignSiteLinkAdExtension: \n");
            if(entity.getAdExtensionIdToEntityIdAssociation() != null){
            	outputStatusMessage(String.format("AdExtensionId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getAdExtensionId()));
                outputStatusMessage(String.format("EntityId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getEntityId()));
            }
            outputStatusMessage(String.format("CampaignName: %s\n", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s\n", entity.getClientId()));
            outputStatusMessage(String.format("EditorialStatus: %s\n", entity.getEditorialStatus()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Status: %s\n", entity.getStatus()));
            
            if (entity.hasErrors())
            {
                outputErrors(entity.getErrors());
            }
        }
	}
	
	static void outputStatusMessage(java.lang.String message){
		System.out.println(message);
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