package com.microsoft.bingads.examples.v10;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
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
import com.microsoft.bingads.customermanagement.*;
import java.rmi.RemoteException;

public class BulkAdExtensions extends BulkExampleBase {
	
    /*
    private static java.lang.String UserName = "<UserNameGoesHere>";
    private static java.lang.String Password = "<PasswordGoesHere>";
    private static java.lang.String DeveloperToken = "<DeveloperTokenGoesHere>";
    private static long CustomerId = <CustomerIdGoesHere>;
    private static long AccountId = <AccountIdGoesHere>;
    */
    
    static ServiceClient<ICampaignManagementService> CampaignService; 
    static ServiceClient<ICustomerManagementService> CustomerService; 
    
    private static java.lang.String SITELINK_MIGRATION = "SiteLinkAdExtension";
        
    public static void main(String[] args) {
		
        BulkEntityIterable downloadEntities = null;

        try {
            AuthorizationData authorizationData = new AuthorizationData();
            authorizationData.setDeveloperToken(DeveloperToken);
            authorizationData.setAuthentication(new PasswordAuthentication(UserName, Password));
            authorizationData.setCustomerId(CustomerId);
            authorizationData.setAccountId(AccountId);
            
            CampaignService = new ServiceClient<ICampaignManagementService>(
                    authorizationData,
                    API_ENVIRONMENT,
                    ICampaignManagementService.class);
            
            CustomerService = new ServiceClient<ICustomerManagementService>(
                    authorizationData,
                    API_ENVIRONMENT,
                    ICustomerManagementService.class);
            
            Calendar calendar = Calendar.getInstance();
                         
            // To prepare for the sitelink ad extensions migration in 2017, you will need to determine
            // whether the account has been migrated from SiteLinksAdExtension to Sitelink2AdExtension. 
            // All ad extension service operations available for both types of sitelinks; however you will 
            // need to determine which type to add, update, and retrieve.

            boolean sitelinkMigrationIsCompleted = false;

            // Optionally you can find out which pilot features the customer is able to use. Even if the customer 
            // is in pilot for sitelink migrations, the accounts that it contains might not be migrated.
            ArrayOfint featurePilotFlags = getCustomerPilotFeatures((long)authorizationData.getCustomerId());
            outputStatusMessage("Customer Pilot flags:");
            outputStatusMessage(Arrays.toString(featurePilotFlags.getInts().toArray()));
                
            // The pilot flag value for Sitelink ad extension migration is 253.
            // Pilot flags apply to all accounts within a given customer; however,
            // each account goes through migration individually and has its own migration status.
            if (featurePilotFlags.getInts().contains(253))
            {
                // Account migration status below will be either NotStarted, InProgress, or Completed.
                outputStatusMessage("Customer is in pilot for Sitelink migration.\n");
            }
            else
            {
                // Account migration status below will be NotInPilot.
                outputStatusMessage("Customer is not in pilot for Sitelink migration.\n");
            }
            
            // Even if you have multiple accounts per customer, each account will have its own
            // migration status. This example checks one account using the provided AuthorizationData.
            com.microsoft.bingads.v10.campaignmanagement.ArrayOflong accountIds = new com.microsoft.bingads.v10.campaignmanagement.ArrayOflong();
            accountIds.getLongs().add(authorizationData.getAccountId());
            ArrayOfAccountMigrationStatusesInfo accountMigrationStatusesInfos = getAccountMigrationStatuses(
                accountIds,
                SITELINK_MIGRATION
            );

            for (AccountMigrationStatusesInfo accountMigrationStatusesInfo : accountMigrationStatusesInfos.getAccountMigrationStatusesInfos())
            {
                outputAccountMigrationStatusesInfo(accountMigrationStatusesInfo);

                for (MigrationStatusInfo migrationStatusInfo : accountMigrationStatusesInfo.getMigrationStatusInfo().getMigrationStatusInfos()){
                    if (migrationStatusInfo.getStatus().equals(MigrationStatus.COMPLETED) && SITELINK_MIGRATION.equals(migrationStatusInfo.getMigrationType())) 
                    {
                        sitelinkMigrationIsCompleted = true;
                    }
                }
            }

            BulkService = new BulkServiceManager(authorizationData, API_ENVIRONMENT);
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
            callScheduling.setEndDate(new com.microsoft.bingads.v10.campaignmanagement.Date());
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
            locationAdExtension.setIconMediaId(null);
            locationAdExtension.setImageMediaId(null);
            com.microsoft.bingads.v10.campaignmanagement.Address address = new com.microsoft.bingads.v10.campaignmanagement.Address();
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
            locationScheduling.setEndDate(new com.microsoft.bingads.v10.campaignmanagement.Date());
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
            com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring values = new com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring();
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
            
            // Before migration only the deprecated BulkSiteLinkAdExtension type can be added, 
            // and after migration only the new BulkSitelink2AdExtension type can be added.
            uploadEntities.addAll(sitelinkMigrationIsCompleted ? 
                    getSampleBulkSitelink2AdExtensions(authorizationData.getAccountId()) : 
                    getSampleBulkSiteLinkAdExtensions(authorizationData.getAccountId()));

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
                // Before migration only the deprecated BulkSiteLinkAdExtension results will be returned, 
                // and after migration only the new BulkSitelink2AdExtension results will be returned.
                else if (entity instanceof BulkSiteLinkAdExtension) {
                    siteLinkAdExtensionResults.add((BulkSiteLinkAdExtension) entity);
                    outputBulkSiteLinkAdExtensions(Arrays.asList((BulkSiteLinkAdExtension) entity) );
                }
                else if (entity instanceof BulkCampaignSiteLinkAdExtension) {
                    outputBulkCampaignSiteLinkAdExtensions(Arrays.asList((BulkCampaignSiteLinkAdExtension) entity) );
                }
                else if (entity instanceof BulkSitelink2AdExtension) {
                    sitelink2AdExtensionResults.add((BulkSitelink2AdExtension) entity);
                    outputBulkSitelink2AdExtensions(Arrays.asList((BulkSitelink2AdExtension) entity) );
                }
                else if (entity instanceof BulkCampaignSiteLinkAdExtension) {
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
            
            for (BulkSiteLinkAdExtension siteLinkAdExtensionResult : siteLinkAdExtensionResults){
            	siteLinkAdExtensionResult.getSiteLinksAdExtension().setStatus(AdExtensionStatus.DELETED);
            	uploadEntities.add(siteLinkAdExtensionResult);
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
                else if (entity instanceof BulkSiteLinkAdExtension) {
                    siteLinkAdExtensionResults.add((BulkSiteLinkAdExtension) entity);
                    outputBulkSiteLinkAdExtensions(Arrays.asList((BulkSiteLinkAdExtension) entity) );
                }
                else if (entity instanceof BulkSitelink2AdExtension) {
                    sitelink2AdExtensionResults.add((BulkSitelink2AdExtension) entity);
                    outputBulkSitelink2AdExtensions(Arrays.asList((BulkSitelink2AdExtension) entity) );
                }
            }
            downloadEntities.close();
            Reader.close();
            
            outputStatusMessage("Program execution completed\n"); 
		
        // Campaign Management service operations can throw AdApiFaultDetail.
        } catch (com.microsoft.bingads.v10.campaignmanagement.AdApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.v10.campaignmanagement.AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
            {
                outputStatusMessage("AdApiError\n");
                outputStatusMessage(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", 
                                error.getCode(), error.getErrorCode(), error.getMessage()));
            }

        // Campaign Management service operations can throw ApiFaultDetail.
        } catch (com.microsoft.bingads.v10.campaignmanagement.ApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.v10.campaignmanagement.BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
            {
                outputStatusMessage(String.format("BatchError at Index: %d\n", error.getIndex()));
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }

            for (com.microsoft.bingads.v10.campaignmanagement.OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
            {
                outputStatusMessage("OperationError\n");
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }

        // Campaign Management service operations can throw EditorialApiFaultDetail.
        } catch (com.microsoft.bingads.v10.campaignmanagement.EditorialApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.v10.campaignmanagement.BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
            {
                outputStatusMessage(String.format("BatchError at Index: %d\n", error.getIndex()));
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }

            for (com.microsoft.bingads.v10.campaignmanagement.EditorialError error : ex.getFaultInfo().getEditorialErrors().getEditorialErrors())
            {
                outputStatusMessage(String.format("EditorialError at Index: %d\n\n", error.getIndex()));
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                outputStatusMessage(String.format("Appealable: %s\nDisapproved Text: %s\nCountry: %s\n\n", 
                                error.getAppealable(), error.getDisapprovedText(), error.getPublisherCountry()));
            }

            for (com.microsoft.bingads.v10.campaignmanagement.OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
            {
                outputStatusMessage("OperationError\n");
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }
            
        // Customer Management service operations can throw AdApiFaultDetail.
        } catch (com.microsoft.bingads.customermanagement.AdApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.customermanagement.AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
            {
	            outputStatusMessage("AdApiError\n");
	            outputStatusMessage(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage()));
            }
        
        // Customer Management service operations can throw ApiFault.
        } catch (com.microsoft.bingads.customermanagement.ApiFault_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.customermanagement.OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
            {
	            outputStatusMessage("OperationError\n");
	            outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }
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
        } catch (Exception ex) {
            outputStatusMessage("Error encountered: ");
            outputStatusMessage(ex.getMessage());
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
    
    // Gets the list of pilot features that the customer is able to use.
    
    static ArrayOfint getCustomerPilotFeatures(java.lang.Long customerId) throws RemoteException, Exception 
    {       
		
        final GetCustomerPilotFeaturesRequest getCustomerPilotFeaturesRequest = new GetCustomerPilotFeaturesRequest();
        getCustomerPilotFeaturesRequest.setCustomerId(customerId);
        
        return CustomerService.getService().getCustomerPilotFeatures(getCustomerPilotFeaturesRequest).getFeaturePilotFlags();
    }
     
    // Gets the account's migration statuses.

    private static ArrayOfAccountMigrationStatusesInfo getAccountMigrationStatuses(
        com.microsoft.bingads.v10.campaignmanagement.ArrayOflong accountIds,
        java.lang.String migrationType)  throws RemoteException, Exception
    {
        GetAccountMigrationStatusesRequest request = new GetAccountMigrationStatusesRequest();

        request.setAccountIds(accountIds);
        request.setMigrationType(migrationType);

        return CampaignService.getService().getAccountMigrationStatuses(request).getMigrationStatuses();
    }     
    
    // Gets example BulkSiteLinkAdExtension and BulkCampaignSiteLinkAdExtension objects. You can use 
    // this type of ad extension if your account has not yet been migrated to BulkSitelink2AdExtension.
    private static ArrayList<BulkEntity> getSampleBulkSiteLinkAdExtensions(java.lang.Long accountId) {
        ArrayList<BulkEntity> entities = new ArrayList<BulkEntity>();
        
        // Note that when written to file using the BulkFileWriter, an extra Sitelink Ad Extension record with Deleted
        // status precedes the actual site link record or records that you want to upload. All bulk entities 
        // that are derived from MultiRecordBulkEntiy are preceded with a Deleted record using the BulkFileWriter. 
        // In this example it is a moot point because we are creating a new ad extension. If the specified
        // ad extension Id already exists in your account, the Deleted record effectively deletes the existing
        // extension and replaces it with the SiteLinksAdExtension specified below.

        BulkSiteLinkAdExtension bulkSiteLinkAdExtension = new BulkSiteLinkAdExtension();
        bulkSiteLinkAdExtension.setAccountId(accountId);
        SiteLinksAdExtension siteLinksAdExtension = new SiteLinksAdExtension();

        // Note that if you do not specify a negative Id as reference key, each of SiteLinks items will
        // be split during upload into separate sitelink ad extensions with unique ad extension identifiers.
        siteLinksAdExtension.setId(siteLinksAdExtensionIdKey);
        ArrayOfSiteLink siteLinks = new ArrayOfSiteLink();

        for(int i=0; i < 2; i++){
            SiteLink siteLink = new SiteLink();
            siteLink.setDescription1("Simple & Transparent.");
            siteLink.setDescription2("No Upfront Cost.");
            siteLink.setDisplayText("Women's Shoe Sale " + (i+1));

            // If you are currently using the Destination URL, you must upgrade to Final URLs. 
            // Here is an example of a DestinationUrl you might have used previously. 
            // siteLink.setDestinationUrl("http://www.contoso.com/womenshoesale/?season=spring&promocode=PROMO123");

            // To migrate from DestinationUrl to FinalUrls, you can set DestinationUrl
            // to an empty string when updating the sitelink. If you are removing DestinationUrl,
            // then FinalUrls is required.
            // siteLink.setDestinationUrl("");

            // With FinalUrls you can separate the tracking template, custom parameters, and 
            // landing page URLs. 
            com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring finalUrls = new com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring();
            finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
            siteLink.setFinalUrls(finalUrls);

            // Final Mobile URLs can also be used if you want to direct the user to a different page 
            // for mobile devices.
            com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring finalMobileUrls = new com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring();
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
        
        entities.add(bulkSiteLinkAdExtension);
        
        BulkCampaignSiteLinkAdExtension bulkCampaignSiteLinkAdExtension = new BulkCampaignSiteLinkAdExtension();
        AdExtensionIdToEntityIdAssociation siteLinkAdExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
        siteLinkAdExtensionIdToEntityIdAssociation.setAdExtensionId(siteLinksAdExtensionIdKey);
        siteLinkAdExtensionIdToEntityIdAssociation.setEntityId(campaignIdKey);
        bulkCampaignSiteLinkAdExtension.setAdExtensionIdToEntityIdAssociation(siteLinkAdExtensionIdToEntityIdAssociation);
        
        entities.add(bulkCampaignSiteLinkAdExtension);

        return entities;
    }
    
    // Gets example BulkSitelink2AdExtension and BulkCampaignSitelink2AdExtension objects. You can use 
    // this type of ad extension if your account has been migrated to BulkSitelink2AdExtension.
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

            // If you are currently using the Destination URL, you must upgrade to Final URLs. 
            // Here is an example of a DestinationUrl you might have used previously. 
            // sitelink2AdExtension.setDestinationUrl("http://www.contoso.com/womenshoesale/?season=spring&promocode=PROMO123");

            // To migrate from DestinationUrl to FinalUrls, you can set DestinationUrl
            // to an empty string when updating the ad extension. If you are removing DestinationUrl,
            // then FinalUrls is required.
            // sitelink2AdExtension.setDestinationUrl("");

            // With FinalUrls you can separate the tracking template, custom parameters, and 
            // landing page URLs. 
            com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring finalUrls = new com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring();
            finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
            sitelink2AdExtension.setFinalUrls(finalUrls);

            // Final Mobile URLs can also be used if you want to direct the user to a different page 
            // for mobile devices.
            com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring finalMobileUrls = new com.microsoft.bingads.v10.campaignmanagement.ArrayOfstring();
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