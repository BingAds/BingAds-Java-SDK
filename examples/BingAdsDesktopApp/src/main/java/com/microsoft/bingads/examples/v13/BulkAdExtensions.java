package com.microsoft.bingads.examples.v13;

import com.microsoft.bingads.v13.bulk.entities.*;
import com.microsoft.bingads.v13.bulk.*;
import com.microsoft.bingads.v13.campaignmanagement.*;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class BulkAdExtensions extends BulkExampleBase {
	        
    public static void main(String[] args) {
		
        BulkEntityIterable downloadEntities = null;

        try {
            authorizationData = getAuthorizationData();
                        
            Calendar calendar = Calendar.getInstance();
            
            BulkServiceManager = new BulkServiceManager(
                    authorizationData, 
                    API_ENVIRONMENT);
            
            BulkServiceManager.setStatusPollIntervalInMilliseconds(5000);

            // Add a new campaign and associate it with ad extensions. 
			
            BulkCampaign bulkCampaign = new BulkCampaign();
            bulkCampaign.setClientId("YourClientIdGoesHere");
            Campaign campaign = new Campaign();
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setDailyBudget(50.00);
            campaign.setId(campaignIdKey);
            com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring languages = 
                    new com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring();
            languages.getStrings().add("All");
            campaign.setLanguages(languages);
            campaign.setName("Everyone's Shoes " + System.currentTimeMillis());
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            bulkCampaign.setCampaign(campaign);
            
            BulkActionAdExtension bulkActionAdExtension = new BulkActionAdExtension();
            ActionAdExtension actionAdExtension = new ActionAdExtension();
            actionAdExtension.setActionType(ActionAdExtensionActionType.ACT_NOW);
            com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring finalUrls = 
                    new com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring();
            finalUrls.getStrings().add("https://contoso.com");
            actionAdExtension.setFinalUrls(finalUrls);
            actionAdExtension.setId(actionAdExtensionIdKey);
            actionAdExtension.setLanguage("English");
            actionAdExtension.setStatus(AdExtensionStatus.ACTIVE);
            bulkActionAdExtension.setActionAdExtension(actionAdExtension);

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
            // Include the call extension Monday - Friday from 9am - 9pm
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
            callScheduling.setEndDate(new com.microsoft.bingads.v13.campaignmanagement.Date());
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
            com.microsoft.bingads.v13.campaignmanagement.Address address = new com.microsoft.bingads.v13.campaignmanagement.Address();
            address.setStreetAddress("1234 Washington Place");
            address.setStreetAddress2("Suite 1210");
            address.setCityName("Woodinville");
            address.setProvinceName("WA");
            address.setCountryCode("US");
            address.setPostalCode("98608");
            locationAdExtension.setAddress(address);
            // Include the location extension every Saturday morning
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
            locationScheduling.setEndDate(new com.microsoft.bingads.v13.campaignmanagement.Date());
            locationScheduling.getEndDate().setDay(31);
            locationScheduling.getEndDate().setMonth(12);
            locationScheduling.getEndDate().setYear(calendar.get(Calendar.YEAR) + 1);
            locationScheduling.setStartDate(null);
            locationAdExtension.setScheduling(locationScheduling);
            locationAdExtension.setId(locationAdExtensionIdKey);
            bulkLocationAdExtension.setLocationAdExtension(locationAdExtension);
            
            BulkPriceAdExtension bulkPriceAdExtension = new BulkPriceAdExtension();
            PriceAdExtension priceAdExtension = new PriceAdExtension();
            priceAdExtension.setId(priceAdExtensionIdKey);
            priceAdExtension.setLanguage("English");
            priceAdExtension.setPriceExtensionType(PriceExtensionType.EVENTS);
            ArrayOfPriceTableRow tableRows = new ArrayOfPriceTableRow();
            PriceTableRow tableRowA = new PriceTableRow();
            tableRowA.setCurrencyCode("USD");
            tableRowA.setDescription("Come to the event");
            tableRowA.setFinalUrls(finalUrls);
            tableRowA.setHeader("New Event");
            tableRowA.setPrice(9.99D);
            tableRowA.setPriceQualifier(PriceQualifier.FROM);
            tableRowA.setPriceUnit(PriceUnit.PER_DAY);
            tableRows.getPriceTableRows().add(tableRowA);
            PriceTableRow tableRowB = new PriceTableRow();
            tableRowB.setCurrencyCode("USD");
            tableRowB.setDescription("Come to the next event");
            tableRowB.setFinalUrls(finalUrls);
            tableRowB.setHeader("Next Event");
            tableRowB.setPrice(9.99D);
            tableRowB.setPriceQualifier(PriceQualifier.FROM);
            tableRowB.setPriceUnit(PriceUnit.PER_DAY);
            tableRows.getPriceTableRows().add(tableRowB);
            PriceTableRow tableRowC = new PriceTableRow();
            tableRowC.setCurrencyCode("USD");
            tableRowC.setDescription("Come to the final event");
            tableRowC.setFinalUrls(finalUrls);
            tableRowC.setHeader("Final Event");
            tableRowC.setPrice(9.99D);
            tableRowC.setPriceQualifier(PriceQualifier.FROM);
            tableRowC.setPriceUnit(PriceUnit.PER_DAY);
            tableRows.getPriceTableRows().add(tableRowC);
            priceAdExtension.setTableRows(tableRows);
            bulkPriceAdExtension.setPriceAdExtension(priceAdExtension);

            BulkReviewAdExtension bulkReviewAdExtension = new BulkReviewAdExtension();
            bulkReviewAdExtension.setAccountId(authorizationData.getAccountId());
            ReviewAdExtension reviewAdExtension = new ReviewAdExtension();
            reviewAdExtension.setIsExact(true);
            reviewAdExtension.setSource("Review Source Name");
            reviewAdExtension.setText("Review Text");
            // The Url of the third-party review. This is not your business Url.
            reviewAdExtension.setUrl("https://review.contoso.com"); 
            reviewAdExtension.setId(reviewAdExtensionIdKey);
            bulkReviewAdExtension.setReviewAdExtension(reviewAdExtension);
            
            BulkSitelinkAdExtension bulkSitelinkAdExtension = new BulkSitelinkAdExtension();
            bulkSitelinkAdExtension.setAccountId(authorizationData.getAccountId());
            SitelinkAdExtension sitelinkAdExtension = new SitelinkAdExtension();
            sitelinkAdExtension.setDescription1("Simple & Transparent.");
            sitelinkAdExtension.setDescription2("No Upfront Cost.");
            sitelinkAdExtension.setDisplayText("Everyone's Shoe Sale");
            sitelinkAdExtension.setFinalUrls(finalUrls);
            sitelinkAdExtension.setId(sitelinkAdExtensionIdKey);
            bulkSitelinkAdExtension.setSitelinkAdExtension(sitelinkAdExtension);
            
            BulkStructuredSnippetAdExtension bulkStructuredSnippetAdExtension = new BulkStructuredSnippetAdExtension();
            bulkStructuredSnippetAdExtension.setAccountId(authorizationData.getAccountId());
            StructuredSnippetAdExtension structuredSnippetAdExtension = new StructuredSnippetAdExtension();
            structuredSnippetAdExtension.setHeader("Brands");
            com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring values = new com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring();
            values.getStrings().add("Windows");
            values.getStrings().add("Xbox");
            values.getStrings().add("Skype");
            structuredSnippetAdExtension.setValues(values);
            structuredSnippetAdExtension.setId(structuredSnippetAdExtensionIdKey);
            bulkStructuredSnippetAdExtension.setStructuredSnippetAdExtension(structuredSnippetAdExtension);
	           
            // Prepare ad extension associations for upload

            BulkCampaignActionAdExtension bulkCampaignActionAdExtension = new BulkCampaignActionAdExtension();
            AdExtensionIdToEntityIdAssociation actionAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
            actionAdExtensionIdToEntityIdAssociation.setAdExtensionId(actionAdExtensionIdKey);
            actionAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
            bulkCampaignActionAdExtension.setAdExtensionIdToEntityIdAssociation(actionAdExtensionIdToEntityIdAssociation);
            
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
            
            BulkCampaignPriceAdExtension bulkCampaignPriceAdExtension = new BulkCampaignPriceAdExtension();
            AdExtensionIdToEntityIdAssociation priceAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
            priceAdExtensionIdToEntityIdAssociation.setAdExtensionId(priceAdExtensionIdKey);
            priceAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
            bulkCampaignPriceAdExtension.setAdExtensionIdToEntityIdAssociation(priceAdExtensionIdToEntityIdAssociation);

            BulkCampaignReviewAdExtension bulkCampaignReviewAdExtension = new BulkCampaignReviewAdExtension();
            AdExtensionIdToEntityIdAssociation reviewAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
            reviewAdExtensionIdToEntityIdAssociation.setAdExtensionId(reviewAdExtensionIdKey);
            reviewAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
            bulkCampaignReviewAdExtension.setAdExtensionIdToEntityIdAssociation(reviewAdExtensionIdToEntityIdAssociation);
            
            BulkCampaignSitelinkAdExtension bulkCampaignSitelinkAdExtension = new BulkCampaignSitelinkAdExtension();
            AdExtensionIdToEntityIdAssociation siteLinkAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
            siteLinkAdExtensionIdToEntityIdAssociation.setAdExtensionId(sitelinkAdExtensionIdKey);
            siteLinkAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
            bulkCampaignSitelinkAdExtension.setAdExtensionIdToEntityIdAssociation(siteLinkAdExtensionIdToEntityIdAssociation);

            BulkCampaignStructuredSnippetAdExtension bulkCampaignStructuredSnippetAdExtension = new BulkCampaignStructuredSnippetAdExtension();
            AdExtensionIdToEntityIdAssociation structuredSnippetAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
            structuredSnippetAdExtensionIdToEntityIdAssociation.setAdExtensionId(structuredSnippetAdExtensionIdKey);
            structuredSnippetAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
            bulkCampaignStructuredSnippetAdExtension.setAdExtensionIdToEntityIdAssociation(structuredSnippetAdExtensionIdToEntityIdAssociation);

            // Upload the entities created above.
			
            List<BulkEntity> uploadEntities = new ArrayList<BulkEntity>();
            uploadEntities.add(bulkCampaign);
            uploadEntities.add(bulkActionAdExtension);
            uploadEntities.add(bulkCampaignActionAdExtension);
            uploadEntities.add(bulkAppAdExtension);
            uploadEntities.add(bulkCampaignAppAdExtension);
            uploadEntities.add(bulkCallAdExtension);
            uploadEntities.add(bulkCampaignCallAdExtension);
            uploadEntities.add(bulkCalloutAdExtension);
            uploadEntities.add(bulkCampaignCalloutAdExtension);
            uploadEntities.add(bulkLocationAdExtension);
            uploadEntities.add(bulkCampaignLocationAdExtension);
            uploadEntities.add(bulkPriceAdExtension);
            uploadEntities.add(bulkCampaignPriceAdExtension);
            uploadEntities.add(bulkReviewAdExtension);
            uploadEntities.add(bulkCampaignReviewAdExtension);
            uploadEntities.add(bulkStructuredSnippetAdExtension);
            uploadEntities.add(bulkCampaignStructuredSnippetAdExtension);
            uploadEntities.add(bulkSitelinkAdExtension);
            uploadEntities.add(bulkCampaignSitelinkAdExtension);

            outputStatusMessage("-----\nAdding campaign, ad extensions, and associations...");
            
            // Upload and write the output

            Reader = writeEntitiesAndUploadFile(uploadEntities);
            downloadEntities = Reader.getEntities();
            
            outputStatusMessage("Upload results:");

            List<BulkCampaign> campaignResults = new ArrayList<BulkCampaign>();
            List<BulkActionAdExtension> actionAdExtensionResults = new ArrayList<BulkActionAdExtension>();
            List<BulkAppAdExtension> appAdExtensionResults = new ArrayList<BulkAppAdExtension>();
            List<BulkCallAdExtension> callAdExtensionResults = new ArrayList<BulkCallAdExtension>();
            List<BulkCalloutAdExtension> calloutAdExtensionResults = new ArrayList<BulkCalloutAdExtension>();
            List<BulkLocationAdExtension> locationAdExtensionResults = new ArrayList<BulkLocationAdExtension>();
            List<BulkPriceAdExtension> priceAdExtensionResults = new ArrayList<BulkPriceAdExtension>();
            List<BulkReviewAdExtension> reviewAdExtensionResults = new ArrayList<BulkReviewAdExtension>();
            List<BulkSitelinkAdExtension> sitelinkAdExtensionResults = new ArrayList<BulkSitelinkAdExtension>();
            List<BulkStructuredSnippetAdExtension> structuredSnippetAdExtensionResults = new ArrayList<BulkStructuredSnippetAdExtension>();
            
            for (BulkEntity entity : downloadEntities) {
                if (entity instanceof BulkCampaign) {
                    campaignResults.add((BulkCampaign) entity);
                    outputBulkCampaigns(Arrays.asList((BulkCampaign) entity) );
                }
                else if (entity instanceof BulkActionAdExtension) {
                    actionAdExtensionResults.add((BulkActionAdExtension) entity);
                    outputBulkActionAdExtensions(Arrays.asList((BulkActionAdExtension) entity) );
                }
                else if (entity instanceof BulkCampaignActionAdExtension) {
                    outputBulkCampaignActionAdExtensions(Arrays.asList((BulkCampaignActionAdExtension) entity) );
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
                else if (entity instanceof BulkPriceAdExtension) {
                    priceAdExtensionResults.add((BulkPriceAdExtension) entity);
                    outputBulkPriceAdExtensions(Arrays.asList((BulkPriceAdExtension) entity) );
                }
                else if (entity instanceof BulkCampaignPriceAdExtension) {
                    outputBulkCampaignPriceAdExtensions(Arrays.asList((BulkCampaignPriceAdExtension) entity) );
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
                else if (entity instanceof BulkSitelinkAdExtension) {
                    sitelinkAdExtensionResults.add((BulkSitelinkAdExtension) entity);
                    outputBulkSitelinkAdExtensions(Arrays.asList((BulkSitelinkAdExtension) entity) );
                }
                else if (entity instanceof BulkCampaignSitelinkAdExtension) {
                    outputBulkCampaignSitelinkAdExtensions(Arrays.asList((BulkCampaignSitelinkAdExtension) entity) );
                }
            }

            downloadEntities.close();
            Reader.close();
                
            // Delete the campaign and ad extensions that were previously added. 
            
            uploadEntities = new ArrayList<BulkEntity>();
            
            for (BulkCampaign campaignResult : campaignResults){
            	campaignResult.getCampaign().setStatus(CampaignStatus.DELETED);
            	uploadEntities.add(campaignResult);
            }
            
            for (BulkActionAdExtension actionAdExtensionResult : actionAdExtensionResults){
            	actionAdExtensionResult.getActionAdExtension().setStatus(AdExtensionStatus.DELETED);
            	uploadEntities.add(actionAdExtensionResult);
            }
            
            for (BulkAppAdExtension appAdExtensionResult : appAdExtensionResults){
                //By default the sample does not successfully create any app ad extensions,
                //because you need to provide details above such as the AppStoreId.
                if (appAdExtensionResult.getAppAdExtension().getId() > 0)
                {
                    appAdExtensionResult.getAppAdExtension().setStatus(AdExtensionStatus.DELETED);
                    uploadEntities.add(appAdExtensionResult);
                }
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
            
            for (BulkPriceAdExtension priceAdExtensionResult : priceAdExtensionResults){
            	priceAdExtensionResult.getPriceAdExtension().setStatus(AdExtensionStatus.DELETED);
            	uploadEntities.add(priceAdExtensionResult);
            }
            
            for (BulkReviewAdExtension reviewAdExtensionResult : reviewAdExtensionResults){
            	reviewAdExtensionResult.getReviewAdExtension().setStatus(AdExtensionStatus.DELETED);
            	uploadEntities.add(reviewAdExtensionResult);
            }
            
            for (BulkSitelinkAdExtension sitelinkAdExtensionResult : sitelinkAdExtensionResults){
            	sitelinkAdExtensionResult.getSitelinkAdExtension().setStatus(AdExtensionStatus.DELETED);
            	uploadEntities.add(sitelinkAdExtensionResult);
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
                else if (entity instanceof BulkActionAdExtension) {
                    actionAdExtensionResults.add((BulkActionAdExtension) entity);
                    outputBulkActionAdExtensions(Arrays.asList((BulkActionAdExtension) entity) );
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
                else if (entity instanceof BulkPriceAdExtension) {
                    priceAdExtensionResults.add((BulkPriceAdExtension) entity);
                    outputBulkPriceAdExtensions(Arrays.asList((BulkPriceAdExtension) entity) );
                }
                else if (entity instanceof BulkReviewAdExtension) {
                    reviewAdExtensionResults.add((BulkReviewAdExtension) entity);
                    outputBulkReviewAdExtensions(Arrays.asList((BulkReviewAdExtension) entity) );
                }
                else if (entity instanceof BulkStructuredSnippetAdExtension) {
                    structuredSnippetAdExtensionResults.add((BulkStructuredSnippetAdExtension) entity);
                    outputBulkStructuredSnippetAdExtensions(Arrays.asList((BulkStructuredSnippetAdExtension) entity) );
                }
                else if (entity instanceof BulkSitelinkAdExtension) {
                    sitelinkAdExtensionResults.add((BulkSitelinkAdExtension) entity);
                    outputBulkSitelinkAdExtensions(Arrays.asList((BulkSitelinkAdExtension) entity) );
                }
            }
            
            downloadEntities.close();
            Reader.close();  
        }
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        } 
        finally {
            if (downloadEntities != null){
                try {
                    downloadEntities.close();
                } 
                catch (IOException ex) {
                    outputStatusMessage(ex.getMessage());
                }
            }
        }
    }    
}
