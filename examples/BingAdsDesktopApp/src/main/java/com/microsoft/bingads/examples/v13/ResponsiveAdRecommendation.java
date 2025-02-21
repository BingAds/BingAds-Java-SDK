package com.microsoft.bingads.examples.v13;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.campaignmanagement.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.file.Files;
import java.rmi.RemoteException;
import java.util.Base64;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class ResponsiveAdRecommendation extends ExampleBase {
    public static void main(java.lang.String[] args) {

        // To run this example you'll need to provide a valid Ad Final URL
        String AdFinalURL = "https://contoso.com";

        // Set to false to disable cleanup of created entities at the end
        boolean DoCleanup = true;

        try {
            authorizationData = getAuthorizationData();

            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                    authorizationData,
                    API_ENVIRONMENT,
                    ICampaignManagementService.class);

            CreateResponsiveAdRecommendationRequest request = new CreateResponsiveAdRecommendationRequest();

            request.setFinalUrls(new ArrayOfstring(Arrays.asList(AdFinalURL)));

            System.out.println("Getting ad recommendation for URL " + AdFinalURL + " ...");

            CreateResponsiveAdRecommendationResponse recommendationResponse =
                CampaignManagementExampleHelper.CampaignManagementService.getService().createResponsiveAdRecommendation(request);

            ResponsiveAd ad = recommendationResponse.getResponsiveAd();

            List<AdRecommendationImageSuggestion> imageSuggestions = recommendationResponse
                .getImageSuggestions()
                .getAdRecommendationImageSuggestions();

            // select a few images from the suggested list. This example picks first 5 images
            List<AdRecommendationImageSuggestion> selectedImages = imageSuggestions.subList(0, 5);

            // add selected images to your media library
            saveImages(selectedImages);
            
            ad.setImages(new ArrayOfAssetLink(selectedImages.stream().map(x -> x.getAssetLink()).collect(Collectors.toList())));

            ad.setBusinessName("Contoso");
            ad.setCallToActionLanguage(LanguageName.ENGLISH);

            // Create an Audience campaign with one ad group and a responsive ad.

            ArrayOfCampaign campaigns = new ArrayOfCampaign();
            Campaign campaign = new Campaign();
            campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
            // CampaignType must be set for Audience campaigns
            ArrayList<CampaignType> campaignTypes = new ArrayList<CampaignType>();
            campaignTypes.add(CampaignType.AUDIENCE);
            campaign.setCampaignType(campaignTypes);
            campaign.setDailyBudget(50.00);
            ArrayOfstring languages = new ArrayOfstring();
            languages.getStrings().add("All");
            campaign.setLanguages(languages);
            campaign.setName("Ad recommendation test " + new java.util.Date());
            campaign.setTimeZone("PacificTimeUSCanadaTijuana");
            campaigns.getCampaigns().add(campaign);

            outputStatusMessage("-----\nAddCampaigns:");
            AddCampaignsResponse addCampaignsResponse = CampaignManagementExampleHelper.addCampaigns(
                    authorizationData.getAccountId(),
                    campaigns);
            ArrayOfNullableOflong campaignIds = addCampaignsResponse.getCampaignIds();
            ArrayOfBatchError campaignErrors = addCampaignsResponse.getPartialErrors();
            outputStatusMessage("CampaignIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(campaignIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(campaignErrors);

            // Add an ad group within the campaign.

            ArrayOfAdGroup adGroups = new ArrayOfAdGroup();
            AdGroup adGroup = new AdGroup();
            adGroup.setName("Holiday Sale");
            adGroup.setStartDate(null);
            Calendar calendar = Calendar.getInstance();
            adGroup.setEndDate(new com.microsoft.bingads.v13.campaignmanagement.Date());
            adGroup.getEndDate().setDay(31);
            adGroup.getEndDate().setMonth(12);
            adGroup.getEndDate().setYear(calendar.get(Calendar.YEAR));
            Bid CpcBid = new Bid();
            CpcBid.setAmount(0.09);
            adGroup.setCpcBid(CpcBid);
            // Network cannot be set for ad groups in Audience campaigns
            adGroup.setNetwork(null);
            adGroups.getAdGroups().add(adGroup);

            outputStatusMessage("-----\nAddAdGroups:");
            AddAdGroupsResponse addAdGroupsResponse = CampaignManagementExampleHelper.addAdGroups(
                    campaignIds.getLongs().get(0),
                    adGroups,
                    false);
            ArrayOfNullableOflong adGroupIds = addAdGroupsResponse.getAdGroupIds();
            ArrayOfBatchError adGroupErrors = addAdGroupsResponse.getPartialErrors();
            outputStatusMessage("AdGroupIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adGroupIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(adGroupErrors);

            // Add a responsive ad within the ad group.

            ArrayOfAd ads = new ArrayOfAd();

            ads.getAds().add(ad);

            outputStatusMessage("-----\nAddAds:");
            AddAdsResponse addAdsResponse = CampaignManagementExampleHelper.addAds(
                    adGroupIds.getLongs().get(0),
                    ads);
            ArrayOfNullableOflong adIds = addAdsResponse.getAdIds();
            ArrayOfBatchError adErrors = addAdsResponse.getPartialErrors();
            outputStatusMessage("AdIds:");
            CampaignManagementExampleHelper.outputArrayOfNullableOflong(adIds);
            outputStatusMessage("PartialErrors:");
            CampaignManagementExampleHelper.outputArrayOfBatchError(adErrors);

            System.out.println("\nCreated campaign: " + campaign.getName());

            if (!DoCleanup) {
                return;
            }

            // Delete the account's media.

            ArrayOflong mediaIds = new ArrayOflong(ad.getImages().getAssetLinks().stream().map(x -> x.getAsset().getId()).collect(Collectors.toList()));

            outputStatusMessage("-----\nDeleteMedia:");
            CampaignManagementExampleHelper.deleteMedia(
                    authorizationData.getAccountId(),
                    mediaIds);

            for (java.lang.Long id : mediaIds.getLongs()) {
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
        } catch (Exception ex) {
            String faultXml = ExampleExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            outputStatusMessage(faultXml);
            String message = ExampleExceptionHelper.handleBingAdsSDKException(ex, System.out);
            outputStatusMessage(message);
        }
    }

    // Get image media that can be managed with the Campaign Management API.

    static Image getImageMedia(
            java.lang.String mediaType,
            java.lang.String imageFileName) throws UnsupportedEncodingException, IOException {
        Image image = new Image();
        image.setData(getBmpBase64String(imageFileName));
        image.setMediaType(mediaType);
        image.setType("Image");

        return image;
    }

    // Get the image media as base64 string.

    static java.lang.String getBmpBase64String(
            java.lang.String imageFileName) throws UnsupportedEncodingException, IOException {
        File fi = new File(imageFileName);
        byte[] imageBytes = Files.readAllBytes(fi.toPath());
        java.lang.String base64String = new java.lang.String(Base64.getEncoder().encode(imageBytes), "UTF-8");
        return base64String;
    }

    private static void saveImages(List<AdRecommendationImageSuggestion> imageSuggestions) throws RemoteException, Exception {
        ArrayOfMedia mediaToAdd = new ArrayOfMedia();

        for (AdRecommendationImageSuggestion imageSuggestion : imageSuggestions) {
            Image image = imageSuggestion.getImage();
                           
            byte[] imageBytes = downloadBytes(new URL(imageSuggestion.getImageUrl()));

            String imageBase64 = new String(Base64.getEncoder().encode(imageBytes));   
            
            image.setData(imageBase64);

            mediaToAdd.getMedias().add(image);
        }

        ArrayOflong mediaIds = CampaignManagementExampleHelper.addMedia(
            authorizationData.getAccountId(),
            mediaToAdd).getMediaIds();

        for (int i = 0; i < mediaIds.getLongs().size(); i++) {
            imageSuggestions.get(i).getAssetLink().getAsset().setId(mediaIds.getLongs().get(i));
        }
    }

    private static byte[] downloadBytes(URL url) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte[] buffer = new byte[4096];

        int bytesRead;

        InputStream inputStream = null;

        try {
            inputStream = url.openStream();

            while ((bytesRead = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, bytesRead);
            }

            return outputStream.toByteArray();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}
