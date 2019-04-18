package com.microsoft.bingads.examples.v13;

import java.util.ArrayList;
import java.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.File;
import java.nio.file.Files;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.campaignmanagement.*;

public class ImageMedia extends ExampleBase {

    public static void main(java.lang.String[] args) {
   	
        // To run this example you'll need to provide your own images.  
        // For required aspect ratios and recommended dimensions please see 
        // Image remarks at https://go.microsoft.com/fwlink/?linkid=872754.

        java.lang.String MEDIA_FILE_PATH = "c:\\dev\\media\\";
        java.lang.String RESPONSIVE_AD_MEDIA_FILE_NAME = "imageresponsivead1200x628.png";
        java.lang.String IMAGE_AD_EXTENSION_MEDIA_FILE_NAME = "imageadextension300x200.png";
        
        try
        {
            authorizationData = getAuthorizationData();
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                authorizationData, 
                API_ENVIRONMENT,
                ICampaignManagementService.class);

            Image responsiveAdImageMedia = getImageMedia(
                "Image191x100",
                MEDIA_FILE_PATH + RESPONSIVE_AD_MEDIA_FILE_NAME);

            Image imageAdExtensionMedia = getImageMedia(
                "Image15x10",
                MEDIA_FILE_PATH + IMAGE_AD_EXTENSION_MEDIA_FILE_NAME);

            ArrayOfMedia addMedia = new ArrayOfMedia();
            addMedia.getMedias().add(responsiveAdImageMedia);
            addMedia.getMedias().add(imageAdExtensionMedia);
            outputStatusMessage("Ready to upload image media:");
            CampaignManagementExampleHelper.outputArrayOfMedia(addMedia);

            outputStatusMessage("-----\nAddMedia:");
            ArrayOflong mediaIds = CampaignManagementExampleHelper.addMedia(
                authorizationData.getAccountId(),
                addMedia).getMediaIds();
            outputStatusMessage("MediaIds:");
            CampaignManagementExampleHelper.outputArrayOflong(mediaIds);

            // Get the media representations to confirm the stored dimensions
            // and get the Url where you can later view or download the media.

            ArrayList<MediaEnabledEntityFilter> responsiveAdFilter = new ArrayList<MediaEnabledEntityFilter>();
            responsiveAdFilter.add(MediaEnabledEntityFilter.RESPONSIVE_AD);
            
            outputStatusMessage("-----\nGetMediaMetaDataByAccountId:");
            ArrayOfMediaMetaData getResponsiveAdMediaMetaData = CampaignManagementExampleHelper.getMediaMetaDataByAccountId(
                    responsiveAdFilter,
                    null).getMediaMetaData();
            outputStatusMessage("MediaMetaData:");
            CampaignManagementExampleHelper.outputArrayOfMediaMetaData(getResponsiveAdMediaMetaData);

            ArrayList<MediaEnabledEntityFilter> imageAdExtensionFilter = new ArrayList<MediaEnabledEntityFilter>();
            imageAdExtensionFilter.add(MediaEnabledEntityFilter.IMAGE_AD_EXTENSION);
            
            outputStatusMessage("-----\nGetMediaMetaDataByAccountId:");
            ArrayOfMediaMetaData getImageAdExtensionMediaMetaData = CampaignManagementExampleHelper.getMediaMetaDataByAccountId(
                    imageAdExtensionFilter,
                    null).getMediaMetaData();
            outputStatusMessage("MediaMetaData:");
            CampaignManagementExampleHelper.outputArrayOfMediaMetaData(getImageAdExtensionMediaMetaData);

            outputStatusMessage("-----\nGetMediaMetaDataByIds:");
            ArrayOfMediaMetaData getMediaMetaData = CampaignManagementExampleHelper.getMediaMetaDataByIds(
                    mediaIds).getMediaMetaData();
            outputStatusMessage("MediaMetaData:");
            CampaignManagementExampleHelper.outputArrayOfMediaMetaData(getMediaMetaData);

            // Delete the account's media.

            outputStatusMessage("-----\nDeleteMedia:");
            CampaignManagementExampleHelper.deleteMedia(
                    authorizationData.getAccountId(), 
                    mediaIds);

            for (java.lang.Long id : mediaIds.getLongs())
            {
                outputStatusMessage(String.format("Deleted Media Id %s", id));
            }
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
