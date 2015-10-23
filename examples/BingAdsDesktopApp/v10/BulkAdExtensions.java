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

public class BulkAdExtensions extends BulkExampleBaseV10 {
	
    static AuthorizationData authorizationData;
    static BulkServiceManager BulkService; 
    static BulkFileWriter Writer;  
    static BulkFileReader Reader;  
    
    final static long appAdExtensionIdKey = -11; 
    final static long callAdExtensionIdKey = -12; 
    final static long locationAdExtensionIdKey = -13; 
    final static long siteLinksAdExtensionIdKey = -14; 
    final static long campaignIdKey = -123; 
        
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

            // Prepare the bulk entities that you want to upload. Each bulk entity contains the corresponding campaign management object, 
            // and additional elements needed to read from and write to a bulk file. 
			
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
			campaign.setName("Summer Shoes " + System.currentTimeMillis());
			campaign.setDescription("Summer shoes line.");
			campaign.setBudgetType(BudgetLimitType.MONTHLY_BUDGET_SPEND_UNTIL_DEPLETED);
			campaign.setMonthlyBudget(1000.00);
			campaign.setTimeZone("PacificTimeUSCanadaTijuana");
			campaign.setStatus(CampaignStatus.PAUSED);
			
			// DaylightSaving is not supported in the Bulk file schema. Whether or not you specify it in a BulkCampaign,
            // the value is not written to the Bulk file, and by default DaylightSaving is set to true.
			campaign.setDaylightSaving(true);
			
			// Used with FinalUrls shown in the text ads that we will add below.
	        campaign.setTrackingUrlTemplate(
	       		 "http://tracker.example.com/?season={_season}&promocode={_promocode}&u={lpurl}");
	        
			bulkCampaign.setCampaign(campaign);
            
			// Prepare extensions for upload


			BulkAppAdExtension bulkAppAdExtension = new BulkAppAdExtension();
			bulkAppAdExtension.setAccountId(authorizationData.getAccountId());
			AppAdExtension appAdExtension = new AppAdExtension();
	        appAdExtension.setAppPlatform("Windows");
	        appAdExtension.setAppStoreId("AppStoreIdGoesHere");
	        appAdExtension.setDestinationUrl("DestinationUrlGoesHere");
	        appAdExtension.setDisplayText("Contoso");
			appAdExtension.setId(appAdExtensionIdKey);
			bulkAppAdExtension.setAppAdExtension(appAdExtension);

			BulkCampaignAppAdExtension bulkCampaignAppAdExtension = new BulkCampaignAppAdExtension();
			AdExtensionIdToEntityIdAssociation appAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
			appAdExtensionIdToEntityIdAssociation.setAdExtensionId(appAdExtensionIdKey);
			appAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
			bulkCampaignAppAdExtension.setAdExtensionIdToEntityIdAssociation(appAdExtensionIdToEntityIdAssociation);

			BulkCallAdExtension bulkCallAdExtension = new BulkCallAdExtension();
			bulkCallAdExtension.setAccountId(authorizationData.getAccountId());
			CallAdExtension callAdExtension = new CallAdExtension();
			callAdExtension.setCountryCode("US");
			callAdExtension.setPhoneNumber("2065550100");
			callAdExtension.setIsCallOnly(false);
			callAdExtension.setId(callAdExtensionIdKey);
			bulkCallAdExtension.setCallAdExtension(callAdExtension);

			BulkCampaignCallAdExtension bulkCampaignCallAdExtension = new BulkCampaignCallAdExtension();
			AdExtensionIdToEntityIdAssociation callAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
			callAdExtensionIdToEntityIdAssociation.setAdExtensionId(callAdExtensionIdKey);
			callAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
			bulkCampaignCallAdExtension.setAdExtensionIdToEntityIdAssociation(callAdExtensionIdToEntityIdAssociation);

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

			BulkCampaignLocationAdExtension bulkCampaignLocationAdExtension = new BulkCampaignLocationAdExtension();
			AdExtensionIdToEntityIdAssociation locationAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
			locationAdExtensionIdToEntityIdAssociation.setAdExtensionId(locationAdExtensionIdKey);
			locationAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
			bulkCampaignLocationAdExtension.setAdExtensionIdToEntityIdAssociation(locationAdExtensionIdToEntityIdAssociation);

			BulkSiteLinkAdExtension bulkSiteLinkAdExtension = new BulkSiteLinkAdExtension();
			bulkSiteLinkAdExtension.setAccountId(authorizationData.getAccountId());
			SiteLinksAdExtension siteLinksAdExtension = new SiteLinksAdExtension();
			siteLinksAdExtension.setId(siteLinksAdExtensionIdKey);
			ArrayOfSiteLink siteLinks = new ArrayOfSiteLink();
			        
	        for(int i=0; i < 2; i++){
	       	    SiteLink siteLink = new SiteLink();
	            siteLink.setDisplayText("Women's Shoe Sale " + (i+1));
	            
	            // Destination URLs are deprecated and will be sunset in March 2016. 
	            // If you are currently using the Destination URL, you must upgrade to Final URLs. 
	            // Here is an example of a DestinationUrl you might have used previously. 
	            // siteLink.setDestinationUrl("http://www.contoso.com/womenshoesale/?season=spring&promocode=PROMO123");

	            // To migrate from DestinationUrl to FinalUrls for existing sitelinks, you can set DestinationUrl
	            // to an empty string when updating the sitelink. If you are removing DestinationUrl,
	            // then FinalUrls is required.
	            // siteLink.setDestinationUrl("");

	            // With FinalUrls you can separate the tracking template, custom parameters, and 
	            // landing page URLs. 
	            ArrayOfstring finalUrls = new ArrayOfstring();
	            finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
	            siteLink.setFinalUrls(finalUrls);
	            
	            // Final Mobile URLs can also be used if you want to direct the user to a different page 
	            // for mobile devices.
	            ArrayOfstring finalMobileUrls = new ArrayOfstring();
	            finalMobileUrls.getStrings().add("http://mobile.contoso.com/womenshoesale");
	            siteLink.setFinalMobileUrls(finalMobileUrls);
	            
	            // You could use a tracking template which would override the campaign level
	            // tracking template. Tracking templates defined for lower level entities 
	            // override those set for higher level entities.
	            // In this example we are using the campaign level tracking template.
	            siteLink.setTrackingUrlTemplate(null);

	            // Set custom parameters that are specific to this sitelink, 
	            // and can be used by the sitelink, ad group, campaign, or account level tracking template. 
	            // In this example we are using the campaign level tracking template.
	            CustomParameters urlCustomParameters = new CustomParameters();
	            CustomParameter customParameter1 = new CustomParameter();
	            customParameter1.setKey("promoCode");
	            customParameter1.setValue("PROMO" + (i+1));
	            ArrayOfCustomParameter customParameters = new ArrayOfCustomParameter();
	            customParameters.getCustomParameters().add(customParameter1);
	            CustomParameter customParameter2 = new CustomParameter();
	            customParameter2.setKey("season");
	            customParameter2.setValue("summer");
	            customParameters.getCustomParameters().add(customParameter2);
	            urlCustomParameters.setParameters(customParameters);
	            siteLink.setUrlCustomParameters(urlCustomParameters);
	            
	            siteLinks.getSiteLinks().add(siteLink);
	        }
			
			siteLinksAdExtension.setSiteLinks(siteLinks);
			bulkSiteLinkAdExtension.setSiteLinksAdExtension(siteLinksAdExtension);
		
			BulkCampaignSiteLinkAdExtension bulkCampaignSiteLinkAdExtension = new BulkCampaignSiteLinkAdExtension();
			AdExtensionIdToEntityIdAssociation siteLinkAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
			siteLinkAdExtensionIdToEntityIdAssociation.setAdExtensionId(siteLinksAdExtensionIdKey);
			siteLinkAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
			bulkCampaignSiteLinkAdExtension.setAdExtensionIdToEntityIdAssociation(siteLinkAdExtensionIdToEntityIdAssociation);
				
			
            // Upload the entities created above.
            // Dependent entities such as BulkCampaignLocationTarget must be written after any dependencies,  
            // for example a BulkCampaign. 
			
			List<BulkEntity> entities = new ArrayList<BulkEntity>();
			entities.add(bulkCampaign);
            entities.add(bulkAppAdExtension);
            entities.add(bulkCampaignAppAdExtension);
            entities.add(bulkCallAdExtension);
            entities.add(bulkCampaignCallAdExtension);
            entities.add(bulkLocationAdExtension);
            entities.add(bulkCampaignLocationAdExtension);
            entities.add(bulkSiteLinkAdExtension);
            entities.add(bulkCampaignSiteLinkAdExtension);

            outputStatusMessage("\nAdding campaign, ad extensions, and associations . . .\n");
            
	    	Reader = uploadEntities(entities);

	        // Write the upload output

	        bulkEntities = Reader.getEntities();
	        
	        outputStatusMessage(String.format("Upload Results Bulk File Pat: %s\n", Reader.getBulkFilePath()));
            
            // Write the upload output

            bulkEntities = Reader.getEntities();
            List<BulkCampaign> campaignResults = new ArrayList<BulkCampaign>();
            List<BulkAppAdExtension> appAdExtensionResults = new ArrayList<BulkAppAdExtension>();
            List<BulkCallAdExtension> callAdExtensionResults = new ArrayList<BulkCallAdExtension>();
            List<BulkLocationAdExtension> locationAdExtensionResults = new ArrayList<BulkLocationAdExtension>();
            List<BulkSiteLinkAdExtension> siteLinkAdExtensionResults = new ArrayList<BulkSiteLinkAdExtension>();
            
            for (BulkEntity entity : bulkEntities) {
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
            
			bulkEntities.close();
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


            // Upload the updated sitelink.

	        entities = new ArrayList<BulkEntity>();
			
            for (BulkSiteLink bSiteLink : bulkSiteLinks)
            {
            	entities.add(bSiteLink);
            }
            
            outputStatusMessage("\nUpdating sitelinks . . .\n");
           
	    	Reader = uploadEntities(entities);

	        // Write the upload output

	        bulkEntities = Reader.getEntities();
	        
            outputStatusMessage("Upload Results Bulk File Path" + Reader.getBulkFilePath() + "\n");
            
            bulkEntities = Reader.getEntities();
            
            for (BulkEntity entity : bulkEntities) {
				if (entity instanceof BulkSiteLink) {
					outputBulkSiteLinks(Arrays.asList((BulkSiteLink) entity) );
				}
			}
			bulkEntities.close();
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
            

            // Upload the entities that you want deleted.

            entities = new ArrayList<BulkEntity>();
			
            entities.add(bulkCampaign);
            entities.add(bulkAppAdExtension);
            entities.add(bulkCallAdExtension);
            entities.add(bulkLocationAdExtension);
            entities.add(bulkSiteLinkAdExtension);

            outputStatusMessage("\nDeleting campaign and ad extensions . . .\n");
            
            Reader = uploadEntities(entities);

	        // Write the upload output

	        bulkEntities = Reader.getEntities();
	        
            outputStatusMessage("Upload Results Bulk File Path" + Reader.getBulkFilePath() + "\n");

            // Write the upload output

            bulkEntities = Reader.getEntities();
            
            for (BulkEntity entity : bulkEntities) {
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
			bulkEntities.close();
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