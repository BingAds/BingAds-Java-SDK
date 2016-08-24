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

public class BulkAdExtensions extends BulkExampleBase {
	
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
			
			// Used with FinalUrls shown in the sitelinks that we will add below.
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

			BulkCallAdExtension bulkCallAdExtension = new BulkCallAdExtension();
			bulkCallAdExtension.setAccountId(authorizationData.getAccountId());
			CallAdExtension callAdExtension = new CallAdExtension();
			callAdExtension.setCountryCode("US");
			callAdExtension.setPhoneNumber("2065550100");
			callAdExtension.setIsCallOnly(false);
			callAdExtension.setId(callAdExtensionIdKey);
			bulkCallAdExtension.setCallAdExtension(callAdExtension);
			
			BulkCalloutAdExtension bulkCalloutAdExtension = new BulkCalloutAdExtension();
			bulkCalloutAdExtension.setAccountId(authorizationData.getAccountId());
			CalloutAdExtension calloutAdExtension = new CalloutAdExtension();
			calloutAdExtension.setText("Callout text");
			calloutAdExtension.setId(calloutAdExtensionIdKey);
			bulkCalloutAdExtension.setCalloutAdExtension(calloutAdExtension);

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
			
			BulkReviewAdExtension bulkReviewAdExtension = new BulkReviewAdExtension();
			bulkReviewAdExtension.setAccountId(authorizationData.getAccountId());
			ReviewAdExtension reviewAdExtension = new ReviewAdExtension();
			reviewAdExtension.setIsExact(true);
			reviewAdExtension.setSource("Review Source Name");
			reviewAdExtension.setText("Review Text");
			// The Url of the third-party review. This is not your business Url.
			reviewAdExtension.setUrl("http://review.contoso.com"); 
			reviewAdExtension.setId(reviewAdExtensionIdKey);
			bulkReviewAdExtension.setReviewAdExtension(reviewAdExtension);

			// Note that when written to file using the BulkFileWriter, an extra Sitelink Ad Extension record with Deleted
            // status precedes the actual site link record or records that you want to upload. All bulk entities 
            // that are derived from MultiRecordBulkEntiy are preceded with a Deleted record using the BulkFileWriter. 
            // In this example it is a moot point because we are creating a new ad extension. If the specified
            // ad extension Id already exists in your account, the Deleted record effectively deletes the existing
            // extension and replaces it with the SiteLinksAdExtension specified below.
			
			BulkSiteLinkAdExtension bulkSiteLinkAdExtension = new BulkSiteLinkAdExtension();
			bulkSiteLinkAdExtension.setAccountId(authorizationData.getAccountId());
			SiteLinksAdExtension siteLinksAdExtension = new SiteLinksAdExtension();
			
			// Note that if you do not specify a negative Id as reference key, each of SiteLinks items will
            // be split during upload into separate sitelink ad extensions with unique ad extension identifiers.
			siteLinksAdExtension.setId(siteLinksAdExtensionIdKey);
			ArrayOfSiteLink siteLinks = new ArrayOfSiteLink();
			        
	        for(int i=0; i < 2; i++){
	       	    SiteLink siteLink = new SiteLink();
	            siteLink.setDisplayText("Women's Shoe Sale " + (i+1));
	            
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
			// Note that BulkSiteLinkAdExtension.SiteLinks is read only and only 
            // accessible when reading results from the download or upload results file.
            // To upload new site links for a new site links ad extension, you should specify
            // BulkSiteLinkAdExtension.SiteLinksAdExtension.SiteLinks as shown above.
			
			// Prepare ad extension associations for upload
			
			BulkCampaignAppAdExtension bulkCampaignAppAdExtension = new BulkCampaignAppAdExtension();
			AdExtensionIdToEntityIdAssociation appAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
			appAdExtensionIdToEntityIdAssociation.setAdExtensionId(appAdExtensionIdKey);
			appAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
			bulkCampaignAppAdExtension.setAdExtensionIdToEntityIdAssociation(appAdExtensionIdToEntityIdAssociation);

			BulkCampaignCallAdExtension bulkCampaignCallAdExtension = new BulkCampaignCallAdExtension();
			AdExtensionIdToEntityIdAssociation callAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
			callAdExtensionIdToEntityIdAssociation.setAdExtensionId(callAdExtensionIdKey);
			callAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
			bulkCampaignCallAdExtension.setAdExtensionIdToEntityIdAssociation(callAdExtensionIdToEntityIdAssociation);

			BulkCampaignCalloutAdExtension bulkCampaignCalloutAdExtension = new BulkCampaignCalloutAdExtension();
			AdExtensionIdToEntityIdAssociation calloutAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
			calloutAdExtensionIdToEntityIdAssociation.setAdExtensionId(calloutAdExtensionIdKey);
			calloutAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
			bulkCampaignCalloutAdExtension.setAdExtensionIdToEntityIdAssociation(calloutAdExtensionIdToEntityIdAssociation);

			BulkCampaignLocationAdExtension bulkCampaignLocationAdExtension = new BulkCampaignLocationAdExtension();
			AdExtensionIdToEntityIdAssociation locationAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
			locationAdExtensionIdToEntityIdAssociation.setAdExtensionId(locationAdExtensionIdKey);
			locationAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
			bulkCampaignLocationAdExtension.setAdExtensionIdToEntityIdAssociation(locationAdExtensionIdToEntityIdAssociation);

			BulkCampaignReviewAdExtension bulkCampaignReviewAdExtension = new BulkCampaignReviewAdExtension();
			AdExtensionIdToEntityIdAssociation reviewAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
			reviewAdExtensionIdToEntityIdAssociation.setAdExtensionId(reviewAdExtensionIdKey);
			reviewAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
			bulkCampaignReviewAdExtension.setAdExtensionIdToEntityIdAssociation(reviewAdExtensionIdToEntityIdAssociation);

			BulkCampaignSiteLinkAdExtension bulkCampaignSiteLinkAdExtension = new BulkCampaignSiteLinkAdExtension();
			AdExtensionIdToEntityIdAssociation siteLinkAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
			siteLinkAdExtensionIdToEntityIdAssociation.setAdExtensionId(siteLinksAdExtensionIdKey);
			siteLinkAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
			bulkCampaignSiteLinkAdExtension.setAdExtensionIdToEntityIdAssociation(siteLinkAdExtensionIdToEntityIdAssociation);
				
			
			// Upload the entities created above.
            // Dependent entities such as BulkCampaignCallAdExtension must be written after any dependencies,  
            // for example the BulkCampaign and BulkCallAdExtension. 
			
			List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();
			uploadEntities.add(bulkCampaign);
            uploadEntities.add(bulkAppAdExtension);
            uploadEntities.add(bulkCampaignAppAdExtension);
            uploadEntities.add(bulkCallAdExtension);
            uploadEntities.add(bulkCampaignCallAdExtension);
            uploadEntities.add(bulkCalloutAdExtension);
            uploadEntities.add(bulkCampaignCalloutAdExtension);
            uploadEntities.add(bulkLocationAdExtension);
            uploadEntities.add(bulkCampaignLocationAdExtension);
            uploadEntities.add(bulkReviewAdExtension);
            uploadEntities.add(bulkCampaignReviewAdExtension);
            uploadEntities.add(bulkSiteLinkAdExtension);
            uploadEntities.add(bulkCampaignSiteLinkAdExtension);

            outputStatusMessage("\nAdding campaign, ad extensions, and associations . . .\n");
            
            // Upload and write the output

	        Reader = writeEntitiesAndUploadFile(uploadEntities);
	        downloadEntities = Reader.getEntities();
	        
            List<BulkCampaign> campaignResults = new ArrayList<BulkCampaign>();
            List<BulkAppAdExtension> appAdExtensionResults = new ArrayList<BulkAppAdExtension>();
            List<BulkCallAdExtension> callAdExtensionResults = new ArrayList<BulkCallAdExtension>();
            List<BulkCalloutAdExtension> calloutAdExtensionResults = new ArrayList<BulkCalloutAdExtension>();
            List<BulkLocationAdExtension> locationAdExtensionResults = new ArrayList<BulkLocationAdExtension>();
            List<BulkReviewAdExtension> reviewAdExtensionResults = new ArrayList<BulkReviewAdExtension>();
            List<BulkSiteLinkAdExtension> siteLinkAdExtensionResults = new ArrayList<BulkSiteLinkAdExtension>();
            
            for (BulkEntity entity : downloadEntities) {
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
				else if (entity instanceof BulkCalloutAdExtension) {
					calloutAdExtensionResults.add((BulkCalloutAdExtension) entity);
					outputBulkCalloutAdExtensions(Arrays.asList((BulkCalloutAdExtension) entity) );
				}
				else if (entity instanceof BulkCampaignCalloutAdExtension) {
					outputBulkCampaignCalloutAdExtensions(Arrays.asList((BulkCampaignCalloutAdExtension) entity) );
				}
				else if (entity instanceof BulkLocationAdExtension) {
					locationAdExtensionResults.add((BulkLocationAdExtension) entity);
					outputBulkLocationAdExtensions(Arrays.asList((BulkLocationAdExtension) entity) );
				}
				else if (entity instanceof BulkCampaignLocationAdExtension) {
					outputBulkCampaignLocationAdExtensions(Arrays.asList((BulkCampaignLocationAdExtension) entity) );
				}
				else if (entity instanceof BulkReviewAdExtension) {
					reviewAdExtensionResults.add((BulkReviewAdExtension) entity);
					outputBulkReviewAdExtensions(Arrays.asList((BulkReviewAdExtension) entity) );
				}
				else if (entity instanceof BulkCampaignReviewAdExtension) {
					outputBulkCampaignReviewAdExtensions(Arrays.asList((BulkCampaignReviewAdExtension) entity) );
				}
				else if (entity instanceof BulkSiteLinkAdExtension) {
					siteLinkAdExtensionResults.add((BulkSiteLinkAdExtension) entity);
					outputBulkSiteLinkAdExtensions(Arrays.asList((BulkSiteLinkAdExtension) entity) );
				}
				else if (entity instanceof BulkCampaignSiteLinkAdExtension) {
					outputBulkCampaignSiteLinkAdExtensions(Arrays.asList((BulkCampaignSiteLinkAdExtension) entity) );
				}
			}
            
			downloadEntities.close();
            Reader.close();
            
            // Update the site links ad extension. 
            // Add an additional site link, and update an existing site link

            // Do not create a BulkSiteLinkAdExtension for update, unless you want to replace all existing SiteLinks
            // with the specified SiteLinks for the specified ad extension. 
            // Instead you should upload one or more site links as a list of BulkSiteLink.

            BulkSiteLink newBulkSiteLink = new BulkSiteLink();
            
            SiteLink siteLink = new SiteLink();
            siteLink.setDisplayText("Women's Shoe Sale 3");
            
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
            customParameter1.setValue("PROMO3");
            ArrayOfCustomParameter customParameters = new ArrayOfCustomParameter();
            customParameters.getCustomParameters().add(customParameter1);
            CustomParameter customParameter2 = new CustomParameter();
            customParameter2.setKey("season");
            customParameter2.setValue("summer");
            customParameters.getCustomParameters().add(customParameter2);
            urlCustomParameters.setParameters(customParameters);
            siteLink.setUrlCustomParameters(urlCustomParameters);
            
            newBulkSiteLink.setSiteLink(siteLink);
            newBulkSiteLink.setOrder(3);
            newBulkSiteLink.setAccountId(authorizationData.getAccountId());
            newBulkSiteLink.setAdExtensionId(siteLinkAdExtensionResults.get(0).getSiteLinksAdExtension().getId());
                        
            BulkSiteLink existingSiteLink = siteLinkAdExtensionResults.get(0).getSiteLinks().get(0);
        	CustomParameters updatedUrlCustomParameters = new CustomParameters();
            CustomParameter updatedCustomParameter = new CustomParameter();
            customParameter1.setKey("promoCode");
            customParameter1.setValue("updatedpromo");
            ArrayOfCustomParameter updatedCustomParameters = new ArrayOfCustomParameter();
            updatedCustomParameters.getCustomParameters().add(updatedCustomParameter);
            existingSiteLink.getSiteLink().setUrlCustomParameters(updatedUrlCustomParameters);


	        // Write the new site link and updated site link to the file

	        uploadEntities = new ArrayList<BulkEntity>();
	        uploadEntities.add(existingSiteLink);
	        uploadEntities.add(newBulkSiteLink);
	        
            outputStatusMessage("\nUpdating sitelinks . . .\n");
            
            // Upload and write the output

	        Reader = writeEntitiesAndUploadFile(uploadEntities);
	        downloadEntities = Reader.getEntities();
			for (BulkEntity entity : downloadEntities) {
				if (entity instanceof BulkSiteLink) {
					outputBulkSiteLinks(Arrays.asList((BulkSiteLink) entity) );
				}
			}
			downloadEntities.close();
            Reader.close();
                       
            //Delete the campaign and ad extensions that were previously added. 
            //You should remove this region if you want to view the added entities in the 
            //Bing Ads web application or another tool.

            //You must set the Id field to the corresponding entity identifier, and the Status field to Deleted. 

            //When you delete a BulkCampaign or BulkCallAdExtension, dependent entities such as BulkCampaignCallAdExtension 
            //are deleted without being specified explicitly.  
            
            uploadEntities = new ArrayList<BulkEntity>();
            
            for (BulkCampaign campaignResult : campaignResults){
            	campaignResult.getCampaign().setStatus(CampaignStatus.DELETED);
            	uploadEntities.add(campaignResult);
            }
            
            for (BulkAppAdExtension appAdExtensionResult : appAdExtensionResults){
            	appAdExtensionResult.getAppAdExtension().setStatus(AdExtensionStatus.DELETED);
            	//By default the sample does not successfully create any app ad extensions,
                //because you need to provide details such as the AppStoreId.
                //You can uncomment the following line if you added an app ad extension above.
                //uploadEntities.Add(appAdExtensionResult); 
            	//uploadEntities.add(appAdExtensionResult);
            }
            
            for (BulkCallAdExtension callAdExtensionResult : callAdExtensionResults){
            	callAdExtensionResult.getCallAdExtension().setStatus(AdExtensionStatus.DELETED);
            	uploadEntities.add(callAdExtensionResult);
            }
            
            for (BulkCalloutAdExtension calloutAdExtensionResult : calloutAdExtensionResults){
            	calloutAdExtensionResult.getCalloutAdExtension().setStatus(AdExtensionStatus.DELETED);
            	uploadEntities.add(calloutAdExtensionResult);
            }
            
            for (BulkLocationAdExtension locationAdExtensionResult : locationAdExtensionResults){
            	locationAdExtensionResult.getLocationAdExtension().setStatus(AdExtensionStatus.DELETED);
            	uploadEntities.add(locationAdExtensionResult);
            }
            
            for (BulkReviewAdExtension reviewAdExtensionResult : reviewAdExtensionResults){
            	reviewAdExtensionResult.getReviewAdExtension().setStatus(AdExtensionStatus.DELETED);
            	uploadEntities.add(reviewAdExtensionResult);
            }
            
            for (BulkSiteLinkAdExtension siteLinkAdExtensionResult : siteLinkAdExtensionResults){
            	siteLinkAdExtensionResult.getSiteLinksAdExtension().setStatus(AdExtensionStatus.DELETED);
            	uploadEntities.add(siteLinkAdExtensionResult);
            }
            
            // Upload and write the output

	        Reader = writeEntitiesAndUploadFile(uploadEntities);
	        downloadEntities = Reader.getEntities();
            
            for (BulkEntity entity : downloadEntities) {
				if (entity instanceof BulkCampaign) {
					campaignResults.add((BulkCampaign) entity);
					outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
				}
				else if (entity instanceof BulkAppAdExtension) {
					appAdExtensionResults.add((BulkAppAdExtension) entity);
					outputBulkAppAdExtensions(Arrays.asList((BulkAppAdExtension) entity) );
				}
				else if (entity instanceof BulkCallAdExtension) {
					callAdExtensionResults.add((BulkCallAdExtension) entity);
					outputBulkCallAdExtensions(Arrays.asList((BulkCallAdExtension) entity) );
				}
				else if (entity instanceof BulkCalloutAdExtension) {
					calloutAdExtensionResults.add((BulkCalloutAdExtension) entity);
					outputBulkCalloutAdExtensions(Arrays.asList((BulkCalloutAdExtension) entity) );
				}
				else if (entity instanceof BulkLocationAdExtension) {
					locationAdExtensionResults.add((BulkLocationAdExtension) entity);
					outputBulkLocationAdExtensions(Arrays.asList((BulkLocationAdExtension) entity) );
				}
				else if (entity instanceof BulkReviewAdExtension) {
					reviewAdExtensionResults.add((BulkReviewAdExtension) entity);
					outputBulkReviewAdExtensions(Arrays.asList((BulkReviewAdExtension) entity) );
				}
				else if (entity instanceof BulkSiteLinkAdExtension) {
					siteLinkAdExtensionResults.add((BulkSiteLinkAdExtension) entity);
					outputBulkSiteLinkAdExtensions(Arrays.asList((BulkSiteLinkAdExtension) entity) );
				}
			}
			downloadEntities.close();
            Reader.close();
            
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