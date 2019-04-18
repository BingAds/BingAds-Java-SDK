package com.microsoft.bingads.examples.v13;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.campaignmanagement.*;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.util.Base64;
import java.util.Calendar;

public class ResponsiveAds extends ExampleBase {

    public static void main(java.lang.String[] args) {
   	
        // To run this example you'll need to provide your own image.  
        // For required aspect ratios and recommended dimensions please see 
        // Image remarks at https://go.microsoft.com/fwlink/?linkid=872754.
        
        java.lang.String MEDIA_FILE_PATH = "c:\\dev\\media\\";
        java.lang.String RESPONSIVE_AD_MEDIA_FILE_NAME = "imageresponsivead1200x628.png";
        
        try
        {
            authorizationData = getAuthorizationData();
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                authorizationData, 
                API_ENVIRONMENT,
                ICampaignManagementService.class);

            // Add an image to your media library. 
            // The image asset is needed later to create the responsive ad.
            
            Image landscapeImageMedia = getImageMedia("Image191x100",
                MEDIA_FILE_PATH + RESPONSIVE_AD_MEDIA_FILE_NAME);

            ArrayOfMedia addMedia = new ArrayOfMedia();
            addMedia.getMedias().add(landscapeImageMedia);
            CampaignManagementExampleHelper.outputArrayOfMedia(addMedia);

            outputStatusMessage("-----\nAddMedia:");
            ArrayOflong mediaIds = CampaignManagementExampleHelper.addMedia(
                authorizationData.getAccountId(),
                addMedia).getMediaIds();
            outputStatusMessage("MediaIds:");
            CampaignManagementExampleHelper.outputArrayOflong(mediaIds);
            
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
            campaign.setName("Women's Shoes " + System.currentTimeMillis());
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
            adGroup.setName("Women's Red Shoe Sale");
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
            ResponsiveAd responsiveAd = new ResponsiveAd();
            responsiveAd.setBusinessName("Contoso");
            responsiveAd.setCallToAction(CallToAction.ADD_TO_CART);  
            ArrayOfstring finalUrls = new ArrayOfstring();
            finalUrls.getStrings().add("http://www.contoso.com/womenshoesale");
            responsiveAd.setFinalUrls(finalUrls);
            responsiveAd.setHeadline("Fast & Easy Setup");
            // You are only required to provide a landscape image asset. 
            // Optionally you can include additional asset links, i.e., one image asset for each supported sub type. 
            // For any image asset sub types that you do not explicitly set, 
            // the service will automatically create image asset links by cropping the LandscapeImageMedia.
            ArrayOfAssetLink assetLinks = new ArrayOfAssetLink();
            AssetLink assetLink = new AssetLink();
            ImageAsset imageAsset = new ImageAsset();
            imageAsset.setCropHeight(null);
            imageAsset.setCropWidth(null);
            imageAsset.setCropX(null);
            imageAsset.setCropY(null);
            imageAsset.setId(mediaIds.getLongs().get(0));
            imageAsset.setName("My LandscapeImageMedia");
            imageAsset.setSubType("LandscapeImageMedia");            
            assetLink.setAsset(imageAsset);
            assetLinks.getAssetLinks().add(assetLink);
            responsiveAd.setImages(assetLinks);
            responsiveAd.setLongHeadlineString("Find New Customers & Increase Sales!");
            responsiveAd.setText("Find New Customers & Increase Sales! Start Advertising on Contoso Today.");
            ads.getAds().add(responsiveAd);
            
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
            
            // Delete the account's media.

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
