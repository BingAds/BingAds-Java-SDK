package com.microsoft.bingads.examples.v12;

import java.util.ArrayList;
import java.util.Calendar;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.campaignmanagement.*;

public class AdExtensions extends ExampleBase {

    public static void main(java.lang.String[] args) {
   	 
        try
        {
            //authenticateWithOAuth();
            authorizationData = getAuthorizationData(null,null);

            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    authorizationData,
                    API_ENVIRONMENT,
                    ICampaignManagementService.class);
                        
            Calendar calendar = Calendar.getInstance();
                                      
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

            AddCampaignsResponse addCampaignsResponse = CampaignManagementExampleHelper.addCampaigns(authorizationData.getAccountId(), campaigns);
            ArrayOfNullableOflong campaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(campaignIds);
            CampaignManagementExampleHelper.outputArrayOfBatchError(campaignErrors);

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
            callScheduling.setEndDate(new com.microsoft.bingads.v12.campaignmanagement.Date());
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
            com.microsoft.bingads.v12.campaignmanagement.Address address = 
                    new com.microsoft.bingads.v12.campaignmanagement.Address();
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
            locationScheduling.setEndDate(new com.microsoft.bingads.v12.campaignmanagement.Date());
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
            com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring values = new com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring();
            values.getStrings().add("Windows");
            values.getStrings().add("Xbox");
            values.getStrings().add("Skype");
            structuredSnippetAdExtension.setValues(values);
            adExtensions.getAdExtensions().add(structuredSnippetAdExtension);
            
            // We are using a helper function to get sample sitelink ad extensions.
            adExtensions.getAdExtensions().addAll(getSampleSitelinkAdExtensions());
            
            // Add all extensions to the account's ad extension library
            AddAdExtensionsResponse addAdExtensionsResponse = CampaignManagementExampleHelper.addAdExtensions(
                authorizationData.getAccountId(),
                adExtensions
                );

            CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(addAdExtensionsResponse.getNestedPartialErrors());
            ArrayOfAdExtensionIdentity adExtensionIdentities = addAdExtensionsResponse.getAdExtensionIdentities();
                    
            outputStatusMessage("Added ad extensions.\n");

            // DeleteAdExtensionsAssociations, SetAdExtensionsAssociations, and GetAdExtensionsEditorialReasons 
            // operations each require a list of type AdExtensionIdToEntityIdAssociation.
            ArrayOfAdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociations = new ArrayOfAdExtensionIdToEntityIdAssociation();

            // GetAdExtensionsByIds requires a list of type long.
            ArrayOflong adExtensionIds = new ArrayOflong();

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
            CampaignManagementExampleHelper.setAdExtensionsAssociations(
                authorizationData.getAccountId(), 
                adExtensionIdToEntityIdAssociations, 
                AssociationType.CAMPAIGN
                );

            outputStatusMessage("Set ad extension associations.\n");

            // Get editorial rejection reasons for the respective ad extension and entity associations.
            GetAdExtensionsEditorialReasonsResponse getAdExtensionsEditorialReasonsResponse = CampaignManagementExampleHelper.getAdExtensionsEditorialReasons(
                authorizationData.getAccountId(), 
                adExtensionIdToEntityIdAssociations, 
                AssociationType.CAMPAIGN
                );
            
            ArrayOfAdExtensionEditorialReasonCollection adExtensionEditorialReasonCollection = getAdExtensionsEditorialReasonsResponse.getEditorialReasons();

            ArrayList<AdExtensionsTypeFilter> adExtensionsTypeFilter = new ArrayList<AdExtensionsTypeFilter>();
            
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.APP_AD_EXTENSION);
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.CALL_AD_EXTENSION);
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.CALLOUT_AD_EXTENSION);
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.LOCATION_AD_EXTENSION);
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.REVIEW_AD_EXTENSION);
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.SITELINK_AD_EXTENSION);
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.STRUCTURED_SNIPPET_AD_EXTENSION);
                        
            // Get the specified ad extensions from the account's ad extension library.
            GetAdExtensionsByIdsResponse getAdExtensionsByIdsResponse = CampaignManagementExampleHelper.getAdExtensionsByIds(
                authorizationData.getAccountId(),
                adExtensionIds, 
                adExtensionsTypeFilter
            );
            adExtensions = getAdExtensionsByIdsResponse.getAdExtensions();
            
            outputStatusMessage("List of ad extensions that were added above:\n");
            CampaignManagementExampleHelper.outputArrayOfAdExtension(adExtensions);
            CampaignManagementExampleHelper.outputArrayOfAdExtensionEditorialReasonCollection(adExtensionEditorialReasonCollection);
            CampaignManagementExampleHelper.outputArrayOfBatchError(getAdExtensionsByIdsResponse.getPartialErrors());            
            
            // Get only the location extensions and remove scheduling.

            adExtensionsTypeFilter = new ArrayList<AdExtensionsTypeFilter>();
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.LOCATION_AD_EXTENSION);

            getAdExtensionsByIdsResponse = CampaignManagementExampleHelper.getAdExtensionsByIds(
                authorizationData.getAccountId(),
                adExtensionIds,
                adExtensionsTypeFilter
            );
            adExtensions = getAdExtensionsByIdsResponse.getAdExtensions();
            CampaignManagementExampleHelper.outputArrayOfBatchError(getAdExtensionsByIdsResponse.getPartialErrors());

            ArrayOfAdExtension updateExtensions = new ArrayOfAdExtension();
            ArrayOflong updateExtensionIds = new ArrayOflong();

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
            CampaignManagementExampleHelper.updateAdExtensions(authorizationData.getAccountId(), updateExtensions);

            // Get only the location extension to output the result.
            getAdExtensionsByIdsResponse = CampaignManagementExampleHelper.getAdExtensionsByIds(
                authorizationData.getAccountId(),
                updateExtensionIds,
                adExtensionsTypeFilter
            );
            adExtensions = getAdExtensionsByIdsResponse.getAdExtensions();
            CampaignManagementExampleHelper.outputArrayOfBatchError(getAdExtensionsByIdsResponse.getPartialErrors());

            outputStatusMessage("List of ad extensions that were updated above:\n");
            CampaignManagementExampleHelper.outputArrayOfAdExtension(adExtensions);
            CampaignManagementExampleHelper.outputArrayOfAdExtensionEditorialReasonCollection(adExtensionEditorialReasonCollection);
            CampaignManagementExampleHelper.outputArrayOfBatchError(getAdExtensionsByIdsResponse.getPartialErrors());   


            // Remove the specified associations from the respective campaigns or ad groups. 
            // The extensions are still available in the account's extensions library. 
            CampaignManagementExampleHelper.deleteAdExtensionsAssociations(
                authorizationData.getAccountId(),
                adExtensionIdToEntityIdAssociations,
                AssociationType.CAMPAIGN
                );

            outputStatusMessage("Deleted ad extension associations.\n");

            // Deletes the ad extensions from the account's ad extension library.
            CampaignManagementExampleHelper.deleteAdExtensions(
                authorizationData.getAccountId(),
                adExtensionIds
                );

            outputStatusMessage("Deleted ad extensions.\n");

            // Delete the campaign from the account.

            ArrayOflong deleteCampaignIds = new ArrayOflong();
            deleteCampaignIds.getLongs().add(campaignIds.getLongs().get(0));
            CampaignManagementExampleHelper.deleteCampaigns(authorizationData.getAccountId(), deleteCampaignIds);
            outputStatusMessage(String.format("Deleted CampaignId %d\n", campaignIds.getLongs().get(0)));
        
        } 
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        }
    }
        
    private static ArrayList<SitelinkAdExtension> getSampleSitelinkAdExtensions(){
        ArrayList<SitelinkAdExtension> sitelinkAdExtensions = new ArrayList<SitelinkAdExtension>();
        
        // Define the first SitelinkAdExtension
        
        SitelinkAdExtension sitelinkAdExtensionA = new SitelinkAdExtension();
        sitelinkAdExtensionA.setDescription1("Simple & Transparent.");
        sitelinkAdExtensionA.setDescription2("No Upfront Cost.");
        sitelinkAdExtensionA.setDisplayText("Women's Shoe Sale 1");

        // With FinalUrls you can separate the tracking template, custom parameters, and 
        // landing page URLs. 
        com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring finalUrls = new com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring();
        finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
        sitelinkAdExtensionA.setFinalUrls(finalUrls);

        // Final Mobile URLs can also be used if you want to direct the user to a different page 
        // for mobile devices.
        com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring finalMobileUrls = new com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring();
        finalMobileUrls.getStrings().add("http://mobile.contoso.com/womenshoesale");
        sitelinkAdExtensionA.setFinalMobileUrls(finalMobileUrls);

        // You could use a tracking template which would override the campaign level
        // tracking template. Tracking templates defined for lower level entities 
        // override those set for higher level entities.
        // In this example we are using the campaign level tracking template.
        sitelinkAdExtensionA.setTrackingUrlTemplate(null);

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
        sitelinkAdExtensionA.setUrlCustomParameters(urlCustomParameters);

        sitelinkAdExtensions.add(sitelinkAdExtensionA);
        
        // Define the second SitelinkAdExtension
        
        SitelinkAdExtension sitelinkAdExtensionB = new SitelinkAdExtension();
        sitelinkAdExtensionB.setDescription1("Do Amazing Things With Contoso.");
        sitelinkAdExtensionB.setDescription2("Read Our Case Studies.");
        sitelinkAdExtensionB.setDisplayText("Women's Shoe Sale 2");
        sitelinkAdExtensionB.setFinalUrls(finalUrls);
        sitelinkAdExtensionB.setFinalMobileUrls(finalMobileUrls);
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
        sitelinkAdExtensionB.setUrlCustomParameters(urlCustomParameters2);

        sitelinkAdExtensions.add(sitelinkAdExtensionB);
        
        return sitelinkAdExtensions;
    }
}
