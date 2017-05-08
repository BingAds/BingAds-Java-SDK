package com.microsoft.bingads.examples.v11;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v11.campaignmanagement.*;
import com.microsoft.bingads.v11.customermanagement.*;

public class AdExtensions extends ExampleBase {

    static AuthorizationData authorizationData;
    static ServiceClient<ICampaignManagementService> CampaignService; 
    static ServiceClient<ICustomerManagementService> CustomerService; 
    
    private static java.lang.String SITELINK_MIGRATION = "SiteLinkAdExtension";
        
    public static void main(java.lang.String[] args) {
   	 
        try
        {
            authorizationData = new AuthorizationData();
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
            com.microsoft.bingads.v11.campaignmanagement.ArrayOflong accountIds = new com.microsoft.bingads.v11.campaignmanagement.ArrayOflong();
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
             
            // Specify one or more campaigns.

            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            campaign.setName("Summer Shoes " + System.currentTimeMillis());
            campaign.setDescription("Summer shoes line.");
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setDailyBudget(50.00);
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");

            // Used with FinalUrls shown in the sitelinks that we will add below.
            campaign.setTrackingUrlTemplate(
                        "http://tracker.example.com/?season={_season}&promocode={_promocode}&u={lpurl}");

            campaigns.getCampaigns().add(campaign);

            AddCampaignsResponse addCampaignsResponse = addCampaigns(authorizationData.getAccountId(), campaigns);
            ArrayOfNullableOflong campaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            outputCampaignsWithPartialErrors(campaigns, campaignIds, campaignErrors);

            // Specify the extensions.

            ArrayOfAdExtension adExtensions = new ArrayOfAdExtension();

            AppAdExtension appAdExtension = new AppAdExtension();
            appAdExtension.setAppPlatform("Windows");
            appAdExtension.setAppStoreId("AppStoreIdGoesHere");
            appAdExtension.setDestinationUrl("DestinationUrlGoesHere");
            appAdExtension.setDisplayText("Contoso");
            // If you supply the AppAdExtension properties above, then you can add this line.
            //adExtensions.getAdExtensions().add(appAdExtension);

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
            adExtensions.getAdExtensions().add(callAdExtension);

            CalloutAdExtension calloutAdExtension = new CalloutAdExtension();
            calloutAdExtension.setText("Callout text");
            adExtensions.getAdExtensions().add(calloutAdExtension);

            LocationAdExtension locationAdExtension = new LocationAdExtension();
            locationAdExtension.setPhoneNumber("206-555-0100");
            locationAdExtension.setCompanyName("Contoso Shoes");
            locationAdExtension.setIconMediaId(null); 
            locationAdExtension.setImageMediaId(null);
            com.microsoft.bingads.v11.campaignmanagement.Address address = 
                    new com.microsoft.bingads.v11.campaignmanagement.Address();
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
            adExtensions.getAdExtensions().add(locationAdExtension);

            ReviewAdExtension reviewAdExtension = new ReviewAdExtension();
            reviewAdExtension.setIsExact(true);
            reviewAdExtension.setSource("Review Source Name");
            reviewAdExtension.setText("Review Text");
            // The Url of the third-party review. This is not your business Url.
            reviewAdExtension.setUrl("http://review.contoso.com"); 
            adExtensions.getAdExtensions().add(reviewAdExtension);
                        
            StructuredSnippetAdExtension structuredSnippetAdExtension = new StructuredSnippetAdExtension();
            structuredSnippetAdExtension.setHeader("Brands");
            com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring values = new com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring();
            values.getStrings().add("Windows");
            values.getStrings().add("Xbox");
            values.getStrings().add("Skype");
            structuredSnippetAdExtension.setValues(values);
            adExtensions.getAdExtensions().add(structuredSnippetAdExtension);
            
            // Before migration only the deprecated SiteLinksAdExtension type can be added, 
            // and after migration only the new Sitelink2AdExtension type can be added.
            adExtensions.getAdExtensions().addAll(sitelinkMigrationIsCompleted ? 
                    getSampleSitelink2AdExtensions() : getSampleSiteLinksAdExtensions());

            
            // Add all extensions to the account's ad extension library
            AddAdExtensionsResponse addAdExtensionsResponse = addAdExtensions(
                authorizationData.getAccountId(),
                adExtensions
                );

            outputBatchErrorCollections(addAdExtensionsResponse.getNestedPartialErrors());
            ArrayOfAdExtensionIdentity adExtensionIdentities = addAdExtensionsResponse.getAdExtensionIdentities();
                    
            outputStatusMessage("Added ad extensions.\n");

            // DeleteAdExtensionsAssociations, SetAdExtensionsAssociations, and GetAdExtensionsEditorialReasons 
            // operations each require a list of type AdExtensionIdToEntityIdAssociation.
            ArrayOfAdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociations = new ArrayOfAdExtensionIdToEntityIdAssociation();

            // GetAdExtensionsByIds requires a list of type long.
            com.microsoft.bingads.v11.campaignmanagement.ArrayOflong adExtensionIds = new com.microsoft.bingads.v11.campaignmanagement.ArrayOflong();

            // Loop through the list of extension IDs and build any required data structures
            // for subsequent operations. 

            for (AdExtensionIdentity adExtensionIdentity : adExtensionIdentities.getAdExtensionIdentities()) {
                AdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociation = new AdExtensionIdToEntityIdAssociation();
                adExtensionIdToEntityIdAssociation.setAdExtensionId(adExtensionIdentity.getId());
                adExtensionIdToEntityIdAssociation.setEntityId(campaignIds.getLongs().get(0));
                adExtensionIdToEntityIdAssociations.getAdExtensionIdToEntityIdAssociations().add(adExtensionIdToEntityIdAssociation);

                adExtensionIds.getLongs().add(adExtensionIdentity.getId());
            }

            // Associate the specified ad extensions with the respective campaigns or ad groups. 
            setAdExtensionsAssociations(
                authorizationData.getAccountId(), 
                adExtensionIdToEntityIdAssociations, 
                AssociationType.CAMPAIGN
                );

            outputStatusMessage("Set ad extension associations.\n");

            // Get editorial rejection reasons for the respective ad extension and entity associations.
            GetAdExtensionsEditorialReasonsResponse getAdExtensionsEditorialReasonsResponse = getAdExtensionsEditorialReasons(
                authorizationData.getAccountId(), 
                adExtensionIdToEntityIdAssociations, 
                AssociationType.CAMPAIGN
                );
            
            ArrayOfAdExtensionEditorialReasonCollection adExtensionEditorialReasonCollection = getAdExtensionsEditorialReasonsResponse.getEditorialReasons();

            ArrayList<AdExtensionsTypeFilter> adExtensionsTypeFilter = new ArrayList<AdExtensionsTypeFilter>();
            
            // If migration has been completed, then you should request the Sitelink2AdExtension objects.
            // You can always request both types; however, before migration only the deprecated SiteLinksAdExtension
            // type will be returned, and after migration only the new Sitelink2AdExtension type will be returned.
            adExtensionsTypeFilter.add(sitelinkMigrationIsCompleted ? 
                    AdExtensionsTypeFilter.SITELINK2_AD_EXTENSION : AdExtensionsTypeFilter.SITE_LINKS_AD_EXTENSION);
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.APP_AD_EXTENSION);
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.CALL_AD_EXTENSION);
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.CALLOUT_AD_EXTENSION);
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.LOCATION_AD_EXTENSION);
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.REVIEW_AD_EXTENSION);
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.STRUCTURED_SNIPPET_AD_EXTENSION);
                        
            // Get the specified ad extensions from the account�s ad extension library.
            GetAdExtensionsByIdsResponse getAdExtensionsByIdsResponse = getAdExtensionsByIds(
                authorizationData.getAccountId(),
                adExtensionIds, 
                adExtensionsTypeFilter
            );
            adExtensions = getAdExtensionsByIdsResponse.getAdExtensions();
            outputPartialErrors(getAdExtensionsByIdsResponse.getPartialErrors());

            outputStatusMessage("List of ad extensions that were added above:\n");
            outputAdExtensionsWithEditorialReasons(adExtensions, adExtensionEditorialReasonCollection);
            
            
            // Get only the location extensions and remove scheduling.

            adExtensionsTypeFilter = new ArrayList<AdExtensionsTypeFilter>();
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.LOCATION_AD_EXTENSION);

            getAdExtensionsByIdsResponse = getAdExtensionsByIds(
                authorizationData.getAccountId(),
                adExtensionIds,
                adExtensionsTypeFilter
            );
            adExtensions = getAdExtensionsByIdsResponse.getAdExtensions();
            outputPartialErrors(getAdExtensionsByIdsResponse.getPartialErrors());

            ArrayOfAdExtension updateExtensions = new ArrayOfAdExtension();
            com.microsoft.bingads.v11.campaignmanagement.ArrayOflong updateExtensionIds = new com.microsoft.bingads.v11.campaignmanagement.ArrayOflong();

            for (AdExtension extension : adExtensions.getAdExtensions())
            {
                // GetAdExtensionsByIds will return a nil element if the request filters / conditions were not met.
                if(extension != null && extension.getId() != null)
                {
                    // Remove read-only elements that would otherwise cause the update operation to fail.
                    AdExtension updateExtension = setReadOnlyAdExtensionElementsToNull(extension);

                    // If you set the Scheduling element null, any existing scheduling set for the ad extension will remain unchanged. 
                    // If you set this to any non-null Schedule object, you are effectively replacing existing scheduling 
                    // for the ad extension. In this example, we will remove any existing scheduling by setting this element  
                    // to an empty Schedule object.
                    updateExtension.setScheduling(new Schedule());

                    updateExtensions.getAdExtensions().add(updateExtension);
                    updateExtensionIds.getLongs().add((long)updateExtension.getId());
                }
            }

            outputStatusMessage("Removing scheduling from the location ad extensions..\n");
            updateAdExtensions(authorizationData.getAccountId(), updateExtensions);

            // Get only the location extension to output the result.
            getAdExtensionsByIdsResponse = getAdExtensionsByIds(
                authorizationData.getAccountId(),
                updateExtensionIds,
                adExtensionsTypeFilter
            );
            adExtensions = getAdExtensionsByIdsResponse.getAdExtensions();
            outputPartialErrors(getAdExtensionsByIdsResponse.getPartialErrors());

            outputStatusMessage("List of ad extensions that were updated above:\n");
            outputAdExtensionsWithEditorialReasons(adExtensions, null);


            // Remove the specified associations from the respective campaigns or ad groups. 
            // The extensions are still available in the account's extensions library. 
            deleteAdExtensionsAssociations(
                authorizationData.getAccountId(),
                adExtensionIdToEntityIdAssociations,
                AssociationType.CAMPAIGN
                );

            outputStatusMessage("Deleted ad extension associations.\n");

            // Deletes the ad extensions from the account�s ad extension library.
            deleteAdExtensions(
                authorizationData.getAccountId(),
                adExtensionIds
                );

            outputStatusMessage("Deleted ad extensions.\n");

            // Delete the campaign from the account.

            com.microsoft.bingads.v11.campaignmanagement.ArrayOflong deleteCampaignIds = new com.microsoft.bingads.v11.campaignmanagement.ArrayOflong();
            deleteCampaignIds.getLongs().add(campaignIds.getLongs().get(0));
            deleteCampaigns(authorizationData.getAccountId(), deleteCampaignIds);
            outputStatusMessage(String.format("Deleted CampaignId %d\n", campaignIds.getLongs().get(0)));
             
        // Campaign Management service operations can throw AdApiFaultDetail.
        } catch (com.microsoft.bingads.v11.campaignmanagement.AdApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.v11.campaignmanagement.AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
            {
                outputStatusMessage("AdApiError\n");
                outputStatusMessage(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", 
                                error.getCode(), error.getErrorCode(), error.getMessage()));
            }

        // Campaign Management service operations can throw ApiFaultDetail.
        } catch (com.microsoft.bingads.v11.campaignmanagement.ApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.v11.campaignmanagement.BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
            {
                outputStatusMessage(String.format("BatchError at Index: %d\n", error.getIndex()));
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }

            for (com.microsoft.bingads.v11.campaignmanagement.OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
            {
                outputStatusMessage("OperationError\n");
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }

        // Campaign Management service operations can throw EditorialApiFaultDetail.
        } catch (com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.v11.campaignmanagement.BatchError error : ex.getFaultInfo().getBatchErrors().getBatchErrors())
            {
                outputStatusMessage(String.format("BatchError at Index: %d\n", error.getIndex()));
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }

            for (com.microsoft.bingads.v11.campaignmanagement.EditorialError error : ex.getFaultInfo().getEditorialErrors().getEditorialErrors())
            {
                outputStatusMessage(String.format("EditorialError at Index: %d\n\n", error.getIndex()));
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
                outputStatusMessage(String.format("Appealable: %s\nDisapproved Text: %s\nCountry: %s\n\n", 
                                error.getAppealable(), error.getDisapprovedText(), error.getPublisherCountry()));
            }

            for (com.microsoft.bingads.v11.campaignmanagement.OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
            {
                outputStatusMessage("OperationError\n");
                outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }
            
        // Customer Management service operations can throw AdApiFaultDetail.
        } catch (com.microsoft.bingads.v11.customermanagement.AdApiFaultDetail_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.v11.customermanagement.AdApiError error : ex.getFaultInfo().getErrors().getAdApiErrors())
            {
	            outputStatusMessage("AdApiError\n");
	            outputStatusMessage(String.format("Code: %d\nError Code: %s\nMessage: %s\n\n", error.getCode(), error.getErrorCode(), error.getMessage()));
            }
        
        // Customer Management service operations can throw ApiFault.
        } catch (com.microsoft.bingads.v11.customermanagement.ApiFault_Exception ex) {
            outputStatusMessage("The operation failed with the following faults:\n");

            for (com.microsoft.bingads.v11.customermanagement.OperationError error : ex.getFaultInfo().getOperationErrors().getOperationErrors())
            {
	            outputStatusMessage("OperationError\n");
	            outputStatusMessage(String.format("Code: %d\nMessage: %s\n\n", error.getCode(), error.getMessage()));
            }
        } catch (RemoteException ex) {
            outputStatusMessage("Service communication error encountered: ");
            outputStatusMessage(ex.getMessage());
            ex.printStackTrace();
        } catch (Exception ex) {
            outputStatusMessage("Error encountered: ");
            outputStatusMessage(ex.getMessage());
            ex.printStackTrace();
        }
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
        com.microsoft.bingads.v11.campaignmanagement.ArrayOflong accountIds,
        java.lang.String migrationType)  throws RemoteException, Exception
    {
        GetAccountMigrationStatusesRequest request = new GetAccountMigrationStatusesRequest();

        request.setAccountIds(accountIds);
        request.setMigrationType(migrationType);

        return CampaignService.getService().getAccountMigrationStatuses(request).getMigrationStatuses();
    }     
    
    // Adds one or more campaigns to the specified account.

    static AddCampaignsResponse addCampaigns(long accountId, ArrayOfCampaign campaigns) throws RemoteException, Exception
    {
        AddCampaignsRequest request = new AddCampaignsRequest();

        request.setAccountId(accountId);
        request.setCampaigns(campaigns);

        return CampaignService.getService().addCampaigns(request);
    }

    // Deletes one or more campaigns from the specified account.

    static void deleteCampaigns(
            long accountId, 
            com.microsoft.bingads.v11.campaignmanagement.ArrayOflong campaignIds) throws RemoteException, Exception
    {
        DeleteCampaignsRequest request = new DeleteCampaignsRequest();

        request.setAccountId(accountId);
        request.setCampaignIds(campaignIds);

        CampaignService.getService().deleteCampaigns(request);
    }

    // Adds one or more ad extensions to the account's ad extension library.

    static AddAdExtensionsResponse addAdExtensions(long accountId, ArrayOfAdExtension adExtensions) throws RemoteException, Exception
    {
        AddAdExtensionsRequest request = new AddAdExtensionsRequest();

        request.setAccountId(accountId);
        request.setAdExtensions(adExtensions);

        return CampaignService.getService().addAdExtensions(request);
    }

    // Deletes one or more ad extensions from the account�s ad extension library.

    static void deleteAdExtensions(
            long accountId, 
            com.microsoft.bingads.v11.campaignmanagement.ArrayOflong adExtensionIds) throws RemoteException, Exception
    {
        DeleteAdExtensionsRequest request = new DeleteAdExtensionsRequest();

        request.setAccountId(accountId);
        request.setAdExtensionIds(adExtensionIds);

        CampaignService.getService().deleteAdExtensions(request);
    }
    
    // Updates one or more ad extensions within the account's ad extension library.

    static UpdateAdExtensionsResponse updateAdExtensions(long accountId, ArrayOfAdExtension adExtensions) throws RemoteException, Exception
    {
        UpdateAdExtensionsRequest request = new UpdateAdExtensionsRequest();

        request.setAccountId(accountId);
        request.setAdExtensions(adExtensions);

        return CampaignService.getService().updateAdExtensions(request);
    }

    // Associates one or more extensions with the corresponding campaign or ad group entities.

    static void setAdExtensionsAssociations(long accountId, ArrayOfAdExtensionIdToEntityIdAssociation associations, AssociationType associationType) throws RemoteException, Exception
    {
        SetAdExtensionsAssociationsRequest request = new SetAdExtensionsAssociationsRequest();

        request.setAccountId(accountId);
        request.setAdExtensionIdToEntityIdAssociations(associations);
        request.setAssociationType(associationType);

        CampaignService.getService().setAdExtensionsAssociations(request);
    }

    // Removes the specified association from the respective campaigns or ad groups.

    static void deleteAdExtensionsAssociations(long accountId, ArrayOfAdExtensionIdToEntityIdAssociation associations, AssociationType associationType) throws RemoteException, Exception
    {
        DeleteAdExtensionsAssociationsRequest request = new DeleteAdExtensionsAssociationsRequest();

        request.setAccountId(accountId);
        request.setAdExtensionIdToEntityIdAssociations(associations);
        request.setAssociationType(associationType);

        CampaignService.getService().deleteAdExtensionsAssociations(request);
    }

    // Gets the specified ad extensions from the account's extension library.

    static GetAdExtensionsByIdsResponse getAdExtensionsByIds(
            long accountId, 
            com.microsoft.bingads.v11.campaignmanagement.ArrayOflong adExtensionIds, 
            ArrayList<AdExtensionsTypeFilter> adExtensionsTypeFilter) throws RemoteException, Exception
    {
        GetAdExtensionsByIdsRequest request = new GetAdExtensionsByIdsRequest();

        request.setAccountId(accountId);
        request.setAdExtensionIds(adExtensionIds);
        request.setAdExtensionType(adExtensionsTypeFilter);

        return CampaignService.getService().getAdExtensionsByIds(request);
    }

    // Gets the reasons why the specified extension failed editorial when 
    // in the context of an associated campaign or ad group.

    private static GetAdExtensionsEditorialReasonsResponse getAdExtensionsEditorialReasons(
        long accountId,
        ArrayOfAdExtensionIdToEntityIdAssociation associations,
        AssociationType associationType)  throws RemoteException, Exception
    {
        GetAdExtensionsEditorialReasonsRequest request = new GetAdExtensionsEditorialReasonsRequest();

        request.setAccountId(accountId);
        request.setAdExtensionIdToEntityIdAssociations(associations);
        request.setAssociationType(associationType);

        return CampaignService.getService().getAdExtensionsEditorialReasons(request);
    }     
    
    private static ArrayList<SiteLinksAdExtension> getSampleSiteLinksAdExtensions(){
        ArrayList<SiteLinksAdExtension> siteLinksAdExtensions = new ArrayList<SiteLinksAdExtension>();
        SiteLinksAdExtension siteLinksAdExtension = new SiteLinksAdExtension();
        ArrayOfSiteLink siteLinks = new ArrayOfSiteLink();

        // Define the first sitelink
        
        SiteLink siteLinkA = new SiteLink();
        siteLinkA.setDescription1("Simple & Transparent.");
        siteLinkA.setDescription2("No Upfront Cost.");
        siteLinkA.setDisplayText("Women's Shoe Sale 1");

        // If you are currently using the Destination URL, you must upgrade to Final URLs. 
        // Here is an example of a DestinationUrl you might have used previously. 
        // siteLink1.setDestinationUrl("http://www.contoso.com/womenshoesale/?season=spring&promocode=PROMO123");

        // To migrate from DestinationUrl to FinalUrls, you can set DestinationUrl
        // to an empty string when updating the sitelink. If you are removing DestinationUrl,
        // then FinalUrls is required.
        // siteLink1.setDestinationUrl("");

        // With FinalUrls you can separate the tracking template, custom parameters, and 
        // landing page URLs. 
        com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring finalUrls = new com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring();
        finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
        siteLinkA.setFinalUrls(finalUrls);

        // Final Mobile URLs can also be used if you want to direct the user to a different page 
        // for mobile devices.
        com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring finalMobileUrls = new com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring();
        finalMobileUrls.getStrings().add("http://mobile.contoso.com/womenshoesale");
        siteLinkA.setFinalMobileUrls(finalMobileUrls);

        // You could use a tracking template which would override the campaign level
        // tracking template. Tracking templates defined for lower level entities 
        // override those set for higher level entities.
        // In this example we are using the campaign level tracking template.
        siteLinkA.setTrackingUrlTemplate(null);

        // Set custom parameters that are specific to this sitelink, 
        // and can be used by the sitelink, ad group, campaign, or account level tracking template. 
        // In this example we are using the campaign level tracking template.
        CustomParameters urlCustomParameters = new CustomParameters();
        CustomParameter customParameter1 = new CustomParameter();
        customParameter1.setKey("promoCode");
        customParameter1.setValue("PROMO1");
        ArrayOfCustomParameter customParameters = new ArrayOfCustomParameter();
        customParameters.getCustomParameters().add(customParameter1);
        CustomParameter customParameter2 = new CustomParameter();
        customParameter2.setKey("season");
        customParameter2.setValue("summer");
        customParameters.getCustomParameters().add(customParameter2);
        urlCustomParameters.setParameters(customParameters);
        siteLinkA.setUrlCustomParameters(urlCustomParameters);

        siteLinks.getSiteLinks().add(siteLinkA);
        
        // Define the second sitelink
        
        SiteLink siteLinkB = new SiteLink();
        siteLinkB.setDescription1("Do Amazing Things With Contoso.");
        siteLinkB.setDescription2("Read Our Case Studies.");
        siteLinkB.setDisplayText("Women's Shoe Sale 2");
        siteLinkB.setFinalUrls(finalUrls);
        siteLinkB.setFinalMobileUrls(finalMobileUrls);
        CustomParameters urlCustomParameters2 = new CustomParameters();
        CustomParameter customParameter3 = new CustomParameter();
        customParameter3.setKey("promoCode");
        customParameter3.setValue("PROMO2");
        ArrayOfCustomParameter customParameters2 = new ArrayOfCustomParameter();
        customParameters2.getCustomParameters().add(customParameter3);
        CustomParameter customParameter4 = new CustomParameter();
        customParameter4.setKey("season");
        customParameter4.setValue("summer");
        customParameters2.getCustomParameters().add(customParameter4);
        urlCustomParameters2.setParameters(customParameters2);
        siteLinkB.setUrlCustomParameters(urlCustomParameters2);

        siteLinks.getSiteLinks().add(siteLinkB);

        siteLinksAdExtension.setSiteLinks(siteLinks);
        siteLinksAdExtensions.add(siteLinksAdExtension);
        
        return siteLinksAdExtensions;
    }
    
    private static ArrayList<Sitelink2AdExtension> getSampleSitelink2AdExtensions(){
        ArrayList<Sitelink2AdExtension> sitelink2AdExtensions = new ArrayList<Sitelink2AdExtension>();
        
        // Define the first Sitelink2AdExtension
        
        Sitelink2AdExtension sitelink2AdExtensionA = new Sitelink2AdExtension();
        sitelink2AdExtensionA.setDescription1("Simple & Transparent.");
        sitelink2AdExtensionA.setDescription2("No Upfront Cost.");
        sitelink2AdExtensionA.setDisplayText("Women's Shoe Sale 1");

        // If you are currently using the Destination URL, you must upgrade to Final URLs. 
        // Here is an example of a DestinationUrl you might have used previously. 
        // sitelink2AdExtensionA.setDestinationUrl("http://www.contoso.com/womenshoesale/?season=spring&promocode=PROMO123");

        // To migrate from DestinationUrl to FinalUrls, you can set DestinationUrl
        // to an empty string when updating the ad extension. If you are removing DestinationUrl,
        // then FinalUrls is required.
        // sitelink2AdExtensionA.setDestinationUrl("");

        // With FinalUrls you can separate the tracking template, custom parameters, and 
        // landing page URLs. 
        com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring finalUrls = new com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring();
        finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
        sitelink2AdExtensionA.setFinalUrls(finalUrls);

        // Final Mobile URLs can also be used if you want to direct the user to a different page 
        // for mobile devices.
        com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring finalMobileUrls = new com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring();
        finalMobileUrls.getStrings().add("http://mobile.contoso.com/womenshoesale");
        sitelink2AdExtensionA.setFinalMobileUrls(finalMobileUrls);

        // You could use a tracking template which would override the campaign level
        // tracking template. Tracking templates defined for lower level entities 
        // override those set for higher level entities.
        // In this example we are using the campaign level tracking template.
        sitelink2AdExtensionA.setTrackingUrlTemplate(null);

        // Set custom parameters that are specific to this ad extension, 
        // and can be used by the ad extension, ad group, campaign, or account level tracking template. 
        // In this example we are using the campaign level tracking template.
        CustomParameters urlCustomParameters = new CustomParameters();
        CustomParameter customParameter1 = new CustomParameter();
        customParameter1.setKey("promoCode");
        customParameter1.setValue("PROMO1");
        ArrayOfCustomParameter customParameters = new ArrayOfCustomParameter();
        customParameters.getCustomParameters().add(customParameter1);
        CustomParameter customParameter2 = new CustomParameter();
        customParameter2.setKey("season");
        customParameter2.setValue("summer");
        customParameters.getCustomParameters().add(customParameter2);
        urlCustomParameters.setParameters(customParameters);
        sitelink2AdExtensionA.setUrlCustomParameters(urlCustomParameters);

        sitelink2AdExtensions.add(sitelink2AdExtensionA);
        
        // Define the second Sitelink2AdExtension
        
        Sitelink2AdExtension sitelink2AdExtensionB = new Sitelink2AdExtension();
        sitelink2AdExtensionB.setDescription1("Do Amazing Things With Contoso.");
        sitelink2AdExtensionB.setDescription2("Read Our Case Studies.");
        sitelink2AdExtensionB.setDisplayText("Women's Shoe Sale 2");
        sitelink2AdExtensionB.setFinalUrls(finalUrls);
        sitelink2AdExtensionB.setFinalMobileUrls(finalMobileUrls);
        CustomParameters urlCustomParameters2 = new CustomParameters();
        CustomParameter customParameter3 = new CustomParameter();
        customParameter3.setKey("promoCode");
        customParameter3.setValue("PROMO2");
        ArrayOfCustomParameter customParameters2 = new ArrayOfCustomParameter();
        customParameters2.getCustomParameters().add(customParameter3);
        CustomParameter customParameter4 = new CustomParameter();
        customParameter4.setKey("season");
        customParameter4.setValue("summer");
        customParameters2.getCustomParameters().add(customParameter4);
        urlCustomParameters2.setParameters(customParameters2);
        sitelink2AdExtensionB.setUrlCustomParameters(urlCustomParameters2);

        sitelink2AdExtensions.add(sitelink2AdExtensionB);
        
        return sitelink2AdExtensions;
    }
}
