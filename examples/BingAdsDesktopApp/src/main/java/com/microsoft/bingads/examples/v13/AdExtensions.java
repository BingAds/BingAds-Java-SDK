package com.microsoft.bingads.examples.v13;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.campaignmanagement.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.util.Base64;

public class AdExtensions extends ExampleBase {

    public static void main(java.lang.String[] args) {
        
   	// To run this example you'll need to provide your own image.  
        // For required aspect ratios and recommended dimensions please see 
        // Image remarks at https://go.microsoft.com/fwlink/?linkid=872754.

        java.lang.String MEDIA_FILE_PATH = "c:\\dev\\media\\";
        java.lang.String IMAGE_AD_EXTENSION_MEDIA_FILE_NAME = "imageadextension300x200.png";
        
        try
        {
            authorizationData = getAuthorizationData();

            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    authorizationData,
                    API_ENVIRONMENT,
                    ICampaignManagementService.class);
                        
            Calendar calendar = Calendar.getInstance();
                                      
            // Add a campaign to associate with ad extensions. 

            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            campaign.setDailyBudget(50.00);
            ArrayOfstring languages = new ArrayOfstring();
            languages.getStrings().add("All");
            campaign.setLanguages(languages);
            campaign.setName("Everyone's Shoes " + System.currentTimeMillis());
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            campaigns.getCampaigns().add(campaign);

            outputStatusMessage("-----\nAddCampaigns:");
            AddCampaignsResponse addCampaignsResponse = CampaignManagementExampleHelper.addCampaigns(
                authorizationData.getAccountId(), 
                campaigns
            );            
            ArrayOfNullableOflong campaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            outputStatusMessage("CampaignIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(campaignIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(campaignErrors);
            
            // Create media for the image ad extension that we'll add later. 
            
            Image imageAdExtensionMedia = getImageMedia(
                "Image15x10",
                MEDIA_FILE_PATH + IMAGE_AD_EXTENSION_MEDIA_FILE_NAME);

            ArrayOfMedia addMedia = new ArrayOfMedia();
            addMedia.getMedias().add(imageAdExtensionMedia);
            CampaignManagementExampleHelper.outputArrayOfMedia(addMedia);

            outputStatusMessage("-----\nAddMedia:");
            ArrayOflong mediaIds = CampaignManagementExampleHelper.addMedia(
                authorizationData.getAccountId(),
                addMedia).getMediaIds();
            outputStatusMessage("MediaIds:");
            CampaignManagementExampleHelper.outputArrayOflong(mediaIds);

            // Add the extensions to the account's library.

            ArrayOfAdExtension adExtensions = new ArrayOfAdExtension();
            
            ActionAdExtension actionAdExtension = new ActionAdExtension();
            actionAdExtension.setActionType(ActionAdExtensionActionType.ACT_NOW);
            com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring finalUrls = new com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring();
            finalUrls.getStrings().add("https://www.contoso.com/womenshoesale");
            actionAdExtension.setFinalUrls(finalUrls);
            actionAdExtension.setLanguage("English");
            actionAdExtension.setStatus(AdExtensionStatus.ACTIVE);
            adExtensions.getAdExtensions().add(actionAdExtension);

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
            adExtensions.getAdExtensions().add(callAdExtension);

            CalloutAdExtension calloutAdExtension = new CalloutAdExtension();
            calloutAdExtension.setText("Callout text");
            adExtensions.getAdExtensions().add(calloutAdExtension);

            LocationAdExtension locationAdExtension = new LocationAdExtension();
            locationAdExtension.setPhoneNumber("206-555-0100");
            locationAdExtension.setCompanyName("Contoso Shoes");
            com.microsoft.bingads.v13.campaignmanagement.Address address = 
                    new com.microsoft.bingads.v13.campaignmanagement.Address();
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
            adExtensions.getAdExtensions().add(locationAdExtension);
            
            PriceAdExtension priceAdExtension = new PriceAdExtension();
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
            adExtensions.getAdExtensions().add(priceAdExtension);

            ReviewAdExtension reviewAdExtension = new ReviewAdExtension();
            reviewAdExtension.setIsExact(true);
            reviewAdExtension.setSource("Review Source Name");
            reviewAdExtension.setText("Review Text");
            // The Url of the third-party review. This is not your business Url.
            reviewAdExtension.setUrl("https://review.contoso.com"); 
            adExtensions.getAdExtensions().add(reviewAdExtension);
            
            SitelinkAdExtension sitelinkAdExtension = new SitelinkAdExtension();
            sitelinkAdExtension.setDescription1("Simple & Transparent.");
            sitelinkAdExtension.setDescription2("No Upfront Cost.");
            sitelinkAdExtension.setDisplayText("Everyone's Shoe Sale");
            sitelinkAdExtension.setFinalUrls(finalUrls);
            adExtensions.getAdExtensions().add(sitelinkAdExtension);
                        
            StructuredSnippetAdExtension structuredSnippetAdExtension = new StructuredSnippetAdExtension();
            structuredSnippetAdExtension.setHeader("Brands");
            com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring values = new com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring();
            values.getStrings().add("Windows");
            values.getStrings().add("Xbox");
            values.getStrings().add("Skype");
            structuredSnippetAdExtension.setValues(values);
            adExtensions.getAdExtensions().add(structuredSnippetAdExtension);            
            
            outputStatusMessage("-----\nAddAdExtensions:");
            AddAdExtensionsResponse addAdExtensionsResponse = CampaignManagementExampleHelper.addAdExtensions(
                authorizationData.getAccountId(),
                adExtensions);
            outputStatusMessage("AdExtensionIdentities:");
            ArrayOfAdExtensionIdentity adExtensionIdentities = addAdExtensionsResponse.getAdExtensionIdentities();
            outputStatusMessage("NestedPartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchErrorCollection(addAdExtensionsResponse.getNestedPartialErrors());
            
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

            // Associate the ad extensions with the campaign. 
            
            outputStatusMessage("-----\nSetAdExtensionsAssociations:");
            SetAdExtensionsAssociationsResponse setAdExtensionsAssociationsResponse = CampaignManagementExampleHelper.setAdExtensionsAssociations(
                authorizationData.getAccountId(), 
                adExtensionIdToEntityIdAssociations, 
                AssociationType.CAMPAIGN);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(setAdExtensionsAssociationsResponse.getPartialErrors());
            
            // Get editorial rejection reasons for the ad extension and entity associations.
            
            outputStatusMessage("-----\nGetAdExtensionsEditorialReasons:");
            GetAdExtensionsEditorialReasonsResponse getAdExtensionsEditorialReasonsResponse = CampaignManagementExampleHelper.getAdExtensionsEditorialReasons(
                authorizationData.getAccountId(), 
                adExtensionIdToEntityIdAssociations, 
                AssociationType.CAMPAIGN);
            outputStatusMessage("EditorialReasons:");
            ArrayOfAdExtensionEditorialReasonCollection adExtensionEditorialReasonCollection = getAdExtensionsEditorialReasonsResponse.getEditorialReasons();
            CampaignManagementExampleHelper.outputArrayOfAdExtensionEditorialReasonCollection(adExtensionEditorialReasonCollection);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(getAdExtensionsEditorialReasonsResponse.getPartialErrors());
            
            // Get only the location extensions and remove scheduling.

            ArrayList<AdExtensionsTypeFilter> adExtensionsTypeFilter = new ArrayList<AdExtensionsTypeFilter>();
            adExtensionsTypeFilter.add(AdExtensionsTypeFilter.LOCATION_AD_EXTENSION);
            
            ArrayList<AdExtensionAdditionalField> returnAdditionalFields = new ArrayList<AdExtensionAdditionalField>();
            returnAdditionalFields.add(AdExtensionAdditionalField.DISPLAY_TEXT);
            returnAdditionalFields.add(AdExtensionAdditionalField.IMAGES);

            // In this example partial errors will be returned for indices where the ad extensions 
            // are not location ad extensions.
            // This is an example, and ideally you would only send the required ad extension IDs.
            
            outputStatusMessage("-----\nGetAdExtensionsByIds:");
            GetAdExtensionsByIdsResponse getAdExtensionsByIdsResponse = CampaignManagementExampleHelper.getAdExtensionsByIds(
                authorizationData.getAccountId(),
                adExtensionIds,
                adExtensionsTypeFilter,
                returnAdditionalFields);
            adExtensions = getAdExtensionsByIdsResponse.getAdExtensions();
            outputStatusMessage("AdExtensions:");
            CampaignManagementExampleHelper.outputArrayOfAdExtension(adExtensions);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(getAdExtensionsByIdsResponse.getPartialErrors());     

            ArrayOfAdExtension updateExtensions = new ArrayOfAdExtension();
            ArrayOflong updateExtensionIds = new ArrayOflong();

            for (AdExtension extension : adExtensions.getAdExtensions())
            {
                // GetAdExtensionsByIds will return a nil element if the request conditions were not met.
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

            outputStatusMessage("-----\nUpdateAdExtensions:"); 
            CampaignManagementExampleHelper.updateAdExtensions(
                    authorizationData.getAccountId(), 
                    updateExtensions);
            outputStatusMessage("Removed scheduling from the location ad extensions.");

            // Get only the location extension to output the result.
            
            outputStatusMessage("-----\nGetAdExtensionsByIds:");
            getAdExtensionsByIdsResponse = CampaignManagementExampleHelper.getAdExtensionsByIds(
                authorizationData.getAccountId(),
                adExtensionIds,
                adExtensionsTypeFilter,
                returnAdditionalFields);
            adExtensions = getAdExtensionsByIdsResponse.getAdExtensions();
            outputStatusMessage("AdExtensions:");
            CampaignManagementExampleHelper.outputArrayOfAdExtension(adExtensions);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(getAdExtensionsByIdsResponse.getPartialErrors());  

            // Delete the ad extension associations, ad extensions, and campaign, that were previously added.  
            // At this point the ad extensions are still available in the account's ad extensions library. 
            
            outputStatusMessage("-----\nDeleteAdExtensionsAssociations:");
            CampaignManagementExampleHelper.deleteAdExtensionsAssociations(
                authorizationData.getAccountId(),
                adExtensionIdToEntityIdAssociations,
                AssociationType.CAMPAIGN);
            outputStatusMessage("Deleted ad extension associations.");

            // Delete the ad extensions from the account’s ad extension library.

            outputStatusMessage("-----\nDeleteAdExtensions:");
            CampaignManagementExampleHelper.deleteAdExtensions(
                authorizationData.getAccountId(),
                adExtensionIds);
            outputStatusMessage("Deleted ad extensions.");
            
            // Delete the account's media that was used for the image ad extension.
            
            outputStatusMessage("-----\nDeleteMedia:");
            CampaignManagementExampleHelper.deleteMedia(
                    authorizationData.getAccountId(), 
                    mediaIds);

            for (java.lang.Long id : mediaIds.getLongs())
            {
                outputStatusMessage(String.format("Deleted Media Id %s", id));
            }

            // Delete the campaign and everything it contains e.g., ad groups and ads.

            outputStatusMessage("-----\nDeleteCampaigns:");
            ArrayOflong deleteCampaignIds = new ArrayOflong();
            deleteCampaignIds.getLongs().add(campaignIds.getLongs().get(0));
            CampaignManagementExampleHelper.deleteCampaigns(
                    authorizationData.getAccountId(), 
                    deleteCampaignIds);
            outputStatusMessage(String.format("Deleted CampaignId %d", deleteCampaignIds.getLongs().get(0)));        
        } 
        catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
    }        
    
    // Get image media that can be managed with the Campaign Management API.

    static Image getImageMedia(
        java.lang.String mediaType, 
        java.lang.String imageFileName) throws UnsupportedEncodingException, IOException
    {
        Image image = new Image();
        image.setData(getBmpBase64String(imageFileName));
        image.setMediaType(mediaType);
        image.setType("Image");

        return image;
    }

    // Get the image media as base64 string.

    static java.lang.String getBmpBase64String(
        java.lang.String imageFileName) throws UnsupportedEncodingException, IOException
    {
        File fi = new File(imageFileName);
        byte[] imageBytes = Files.readAllBytes(fi.toPath());
        java.lang.String base64String = new java.lang.String(Base64.getEncoder().encode(imageBytes), "UTF-8");
        return base64String;
    }
}
