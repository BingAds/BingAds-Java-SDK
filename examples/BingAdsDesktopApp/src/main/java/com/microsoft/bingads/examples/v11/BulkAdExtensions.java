package com.microsoft.bingads.examples.v11;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v11.bulk.entities.*;
import com.microsoft.bingads.v11.bulk.*;
import com.microsoft.bingads.v11.campaignmanagement.*;

public class BulkAdExtensions extends BulkExampleBase {
	        
    public static void main(String[] args) {
		
        BulkEntityIterable downloadEntities = null;

        try {
            authorizationData = getAuthorizationData(null,null);
                        
            Calendar calendar = Calendar.getInstance();
            
            BulkServiceManager = new BulkServiceManager(authorizationData, API_ENVIRONMENT);
            BulkServiceManager.setStatusPollIntervalInMilliseconds(5000);

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
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setDailyBudget(50.00);
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            campaign.setStatus(CampaignStatus.PAUSED);

            // Used with FinalUrls shown in the sitelinks that we will add below.
            campaign.setTrackingUrlTemplate("http://tracker.example.com/?season={_season}&promocode={_promocode}&u={lpurl}");

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
            // For this example assume the call center is open Monday - Friday from 9am - 9pm
            // in the account's time zone.
            Schedule callScheduling = new Schedule();
            ArrayOfDayTime callDayTimeRanges = new ArrayOfDayTime();
            DayTime callMonday = new DayTime();
            callMonday.setDay(Day.MONDAY);
            callMonday.setStartHour(9);
            callMonday.setStartMinute(Minute.ZERO);
            callMonday.setEndHour(21);
            callMonday.setEndMinute(Minute.ZERO);
            callDayTimeRanges.getDayTimes().add(callMonday);
            DayTime callTuesday = new DayTime();
            callTuesday.setDay(Day.TUESDAY);
            callTuesday.setStartHour(9);
            callTuesday.setStartMinute(Minute.ZERO);
            callTuesday.setEndHour(21);
            callTuesday.setEndMinute(Minute.ZERO);
            callDayTimeRanges.getDayTimes().add(callTuesday);
            DayTime callWednesday = new DayTime();
            callWednesday.setDay(Day.WEDNESDAY);
            callWednesday.setStartHour(9);
            callWednesday.setStartMinute(Minute.ZERO);
            callWednesday.setEndHour(21);
            callWednesday.setEndMinute(Minute.ZERO);
            callDayTimeRanges.getDayTimes().add(callWednesday);
            DayTime callThursday = new DayTime();
            callThursday.setDay(Day.THURSDAY);
            callThursday.setStartHour(9);
            callThursday.setStartMinute(Minute.ZERO);
            callThursday.setEndHour(21);
            callThursday.setEndMinute(Minute.ZERO);
            callDayTimeRanges.getDayTimes().add(callThursday);
            DayTime callFriday = new DayTime();
            callFriday.setDay(Day.FRIDAY);
            callFriday.setStartHour(9);
            callFriday.setStartMinute(Minute.ZERO);
            callFriday.setEndHour(21);
            callFriday.setEndMinute(Minute.ZERO);
            callDayTimeRanges.getDayTimes().add(callFriday);
            callScheduling.setDayTimeRanges(callDayTimeRanges);
            callScheduling.setEndDate(new com.microsoft.bingads.v11.campaignmanagement.Date());
            callScheduling.getEndDate().setDay(31);
            callScheduling.getEndDate().setMonth(12);
            callScheduling.getEndDate().setYear(calendar.get(Calendar.YEAR) + 1);
            callScheduling.setStartDate(null);
            callAdExtension.setScheduling(callScheduling);
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
            com.microsoft.bingads.v11.campaignmanagement.Address address = new com.microsoft.bingads.v11.campaignmanagement.Address();
            address.setStreetAddress("1234 Washington Place");
            address.setStreetAddress2("Suite 1210");
            address.setCityName("Woodinville");
            address.setProvinceName("WA");
            address.setCountryCode("US");
            address.setPostalCode("98608");
            locationAdExtension.setAddress(address);
            // For this example assume you want to drive traffic every Saturday morning
            // in the search user's time zone.
            Schedule locationScheduling = new Schedule();
            ArrayOfDayTime locationDayTimeRanges = new ArrayOfDayTime();
            DayTime locationDayTime = new DayTime();
            locationDayTime.setDay(Day.SATURDAY);
            locationDayTime.setStartHour(9);
            locationDayTime.setStartMinute(Minute.ZERO);
            locationDayTime.setEndHour(12);
            locationDayTime.setEndMinute(Minute.ZERO);
            locationDayTimeRanges.getDayTimes().add(locationDayTime);
            locationScheduling.setDayTimeRanges(locationDayTimeRanges);
            locationScheduling.setEndDate(new com.microsoft.bingads.v11.campaignmanagement.Date());
            locationScheduling.getEndDate().setDay(31);
            locationScheduling.getEndDate().setMonth(12);
            locationScheduling.getEndDate().setYear(calendar.get(Calendar.YEAR) + 1);
            locationScheduling.setStartDate(null);
            locationAdExtension.setScheduling(locationScheduling);
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
            
            BulkStructuredSnippetAdExtension bulkStructuredSnippetAdExtension = new BulkStructuredSnippetAdExtension();
            bulkStructuredSnippetAdExtension.setAccountId(authorizationData.getAccountId());
            StructuredSnippetAdExtension structuredSnippetAdExtension = new StructuredSnippetAdExtension();
            structuredSnippetAdExtension.setHeader("Brands");
            com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring values = new com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring();
            values.getStrings().add("Windows");
            values.getStrings().add("Xbox");
            values.getStrings().add("Skype");
            structuredSnippetAdExtension.setValues(values);
            structuredSnippetAdExtension.setId(structuredSnippetAdExtensionIdKey);
            bulkStructuredSnippetAdExtension.setStructuredSnippetAdExtension(structuredSnippetAdExtension);
			
            
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

            BulkCampaignStructuredSnippetAdExtension bulkCampaignStructuredSnippetAdExtension = new BulkCampaignStructuredSnippetAdExtension();
            AdExtensionIdToEntityIdAssociation structuredSnippetAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
            structuredSnippetAdExtensionIdToEntityIdAssociation.setAdExtensionId(structuredSnippetAdExtensionIdKey);
            structuredSnippetAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
            bulkCampaignStructuredSnippetAdExtension.setAdExtensionIdToEntityIdAssociation(structuredSnippetAdExtensionIdToEntityIdAssociation);


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
            uploadEntities.add(bulkStructuredSnippetAdExtension);
            uploadEntities.add(bulkCampaignStructuredSnippetAdExtension);
            uploadEntities.addAll(getSampleBulkSitelink2AdExtensions(authorizationData.getAccountId()));

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
            List<BulkSitelink2AdExtension> sitelink2AdExtensionResults = new ArrayList<BulkSitelink2AdExtension>();
            List<BulkStructuredSnippetAdExtension> structuredSnippetAdExtensionResults = new ArrayList<BulkStructuredSnippetAdExtension>();
            
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
                else if (entity instanceof BulkStructuredSnippetAdExtension) {
                    structuredSnippetAdExtensionResults.add((BulkStructuredSnippetAdExtension) entity);
                    outputBulkStructuredSnippetAdExtensions(Arrays.asList((BulkStructuredSnippetAdExtension) entity) );
                }
                else if (entity instanceof BulkCampaignStructuredSnippetAdExtension) {
                    outputBulkCampaignStructuredSnippetAdExtensions(Arrays.asList((BulkCampaignStructuredSnippetAdExtension) entity) );
                }
                else if (entity instanceof BulkSitelink2AdExtension) {
                    sitelink2AdExtensionResults.add((BulkSitelink2AdExtension) entity);
                    outputBulkSitelink2AdExtensions(Arrays.asList((BulkSitelink2AdExtension) entity) );
                }
                else if (entity instanceof BulkCampaignSitelink2AdExtension) {
                    outputBulkCampaignSitelink2AdExtensions(Arrays.asList((BulkCampaignSitelink2AdExtension) entity) );
                }
            }

            downloadEntities.close();
            Reader.close();
            
            // Use only the location extension results and remove scheduling.

            uploadEntities = new ArrayList<BulkEntity>();

            for (BulkLocationAdExtension locationAdExtensionResult : locationAdExtensionResults)
            {
                if (locationAdExtensionResult.getLocationAdExtension().getId() > 0)
                {
                    // If you set the Scheduling element null, any existing scheduling set for the ad extension will remain unchanged. 
                    // If you set this to any non-null Schedule object, you are effectively replacing existing scheduling 
                    // for the ad extension. In this example, we will remove any existing scheduling by setting this element  
                    // to an empty Schedule object. 
                    // The "delete_value" keyword will be written to the corresponding columns in the bulk file.
                    locationAdExtensionResult.getLocationAdExtension().setScheduling(new Schedule());
                    uploadEntities.add(locationAdExtensionResult);
                }
            }
	        
            outputStatusMessage("\nRemoving scheduling from location ad extensions . . .\n");

            // Upload and write the output

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();
            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkLocationAdExtension) {
                    outputBulkLocationAdExtensions(Arrays.asList((BulkLocationAdExtension) entity) );
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
            
            for (BulkSitelink2AdExtension sitelink2AdExtensionResult : sitelink2AdExtensionResults){
            	sitelink2AdExtensionResult.getSitelink2AdExtension().setStatus(AdExtensionStatus.DELETED);
            	uploadEntities.add(sitelink2AdExtensionResult);
            }
            
            for (BulkStructuredSnippetAdExtension structuredSnippetAdExtensionResult : structuredSnippetAdExtensionResults){
            	structuredSnippetAdExtensionResult.getStructuredSnippetAdExtension().setStatus(AdExtensionStatus.DELETED);
            	uploadEntities.add(structuredSnippetAdExtensionResult);
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
                else if (entity instanceof BulkStructuredSnippetAdExtension) {
                    structuredSnippetAdExtensionResults.add((BulkStructuredSnippetAdExtension) entity);
                    outputBulkStructuredSnippetAdExtensions(Arrays.asList((BulkStructuredSnippetAdExtension) entity) );
                }
                else if (entity instanceof BulkSitelink2AdExtension) {
                    sitelink2AdExtensionResults.add((BulkSitelink2AdExtension) entity);
                    outputBulkSitelink2AdExtensions(Arrays.asList((BulkSitelink2AdExtension) entity) );
                }
            }
            downloadEntities.close();
            Reader.close();
            
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
    
    // Gets example BulkSitelink2AdExtension and BulkCampaignSitelink2AdExtension objects. 
    private static ArrayList<BulkEntity> getSampleBulkSitelink2AdExtensions(java.lang.Long accountId) {
        ArrayList<BulkEntity> entities = new ArrayList<BulkEntity>();
        
        for(int i=0; i < 2; i++){
            BulkSitelink2AdExtension bulkSitelink2AdExtension = new BulkSitelink2AdExtension();
            bulkSitelink2AdExtension.setAccountId(accountId);
            Sitelink2AdExtension sitelink2AdExtension = new Sitelink2AdExtension();
            sitelink2AdExtension.setId(sitelink2AdExtensionIdKey);
            sitelink2AdExtension.setDescription1("Simple & Transparent.");
            sitelink2AdExtension.setDescription2("No Upfront Cost.");
            sitelink2AdExtension.setDisplayText("Women's Shoe Sale " + (i+1));

            // With FinalUrls you can separate the tracking template, custom parameters, and 
            // landing page URLs. 
            com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring finalUrls = new com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring();
            finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
            sitelink2AdExtension.setFinalUrls(finalUrls);

            // Final Mobile URLs can also be used if you want to direct the user to a different page 
            // for mobile devices.
            com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring finalMobileUrls = new com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring();
            finalMobileUrls.getStrings().add("http://mobile.contoso.com/womenshoesale");
            sitelink2AdExtension.setFinalMobileUrls(finalMobileUrls);

            // You could use a tracking template which would override the campaign level
            // tracking template. Tracking templates defined for lower level entities 
            // override those set for higher level entities.
            // In this example we are using the campaign level tracking template.
            sitelink2AdExtension.setTrackingUrlTemplate(null);

            // Set custom parameters that are specific to this ad extension, 
            // and can be used by the ad extension, ad group, campaign, or account level tracking template. 
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
            sitelink2AdExtension.setUrlCustomParameters(urlCustomParameters);

            bulkSitelink2AdExtension.setSitelink2AdExtension(sitelink2AdExtension);
            entities.add(bulkSitelink2AdExtension);
        }

        BulkCampaignSiteLinkAdExtension bulkCampaignSitelink2AdExtension = new BulkCampaignSiteLinkAdExtension();
        AdExtensionIdToEntityIdAssociation siteLinkAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
        siteLinkAdExtensionIdToEntityIdAssociation.setAdExtensionId(sitelink2AdExtensionIdKey);
        siteLinkAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
        bulkCampaignSitelink2AdExtension.setAdExtensionIdToEntityIdAssociation(siteLinkAdExtensionIdToEntityIdAssociation);
        
        entities.add(bulkCampaignSitelink2AdExtension);
        
        return entities;
    }
}
