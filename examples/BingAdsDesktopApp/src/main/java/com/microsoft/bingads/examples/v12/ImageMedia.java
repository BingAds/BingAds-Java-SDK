package com.microsoft.bingads.examples.v12;

import java.util.ArrayList;
import java.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.File;
import java.nio.file.Files;

import com.microsoft.bingads.*;
import com.microsoft.bingads.v12.campaignmanagement.*;

public class ImageMedia extends ExampleBase {

    public static void main(java.lang.String[] args) {
   	
        // To run this example you'll need access to image media files 
        // for responsive ads and image ad extensions.

        java.lang.String MEDIA_FILE_PATH = "c:\\dev\\media\\";

        // For required aspect ratios and recommended dimensions please see 
        // Image remarks at https://go.microsoft.com/fwlink/?linkid=872754.

        java.lang.String LANDSCAPE_IMAGE_MEDIA_FILE_NAME = "imageresponsivead1200x628.png";
        java.lang.String LANDSCAPE_LOGO_MEDIA_FILE_NAME = "imageresponsivead1200x300.png";
        java.lang.String SQUARE_IMAGE_MEDIA_FILE_NAME = "imageresponsivead1200x1200.png";
        java.lang.String SQUARE_LOGO_MEDIA_FILE_NAME = "imageresponsivead1100x1100.png";
        java.lang.String IMAGE_AD_EXTENSION_MEDIA_FILE_NAME = "imageadextension300x200.png";
        
        try
        {
            authorizationData = getAuthorizationData(null,null);
	         
            CampaignManagementExampleHelper.CampaignManagementService = new ServiceClient<ICampaignManagementService>(
                authorizationData, 
                API_ENVIRONMENT,
                ICampaignManagementService.class);

            Image landscapeImageMedia = getImageMedia(
                "Image191x100",
                MEDIA_FILE_PATH + LANDSCAPE_IMAGE_MEDIA_FILE_NAME);

            Image landscapeLogoMedia = getImageMedia(
                "Image4x1",
                MEDIA_FILE_PATH + LANDSCAPE_LOGO_MEDIA_FILE_NAME);

            Image squareImageMedia = getImageMedia(
                "Image1x1",
                MEDIA_FILE_PATH + SQUARE_IMAGE_MEDIA_FILE_NAME);

            Image squareLogoMedia = getImageMedia(
                "Image1x1",
                MEDIA_FILE_PATH + SQUARE_LOGO_MEDIA_FILE_NAME);

            Image imageAdExtensionMedia = getImageMedia(
                "Image15x10",
                MEDIA_FILE_PATH + IMAGE_AD_EXTENSION_MEDIA_FILE_NAME);

            ArrayOfMedia addMedia = new ArrayOfMedia();
            addMedia.getMedias().add(landscapeImageMedia);
            addMedia.getMedias().add(landscapeLogoMedia);
            addMedia.getMedias().add(squareImageMedia);
            addMedia.getMedias().add(squareLogoMedia);
            addMedia.getMedias().add(imageAdExtensionMedia);
            CampaignManagementExampleHelper.outputArrayOfMedia(addMedia);

            ArrayOflong imageMediaIds = CampaignManagementExampleHelper.addMedia(
                authorizationData.getAccountId(),
                addMedia).getMediaIds();

            // The index of returned IDs is consistent with the order you submitted them in the request;
            // however, the sequence of the IDs themselves is not guaranteed. For example you might observe:
            // - Landscape Image Media Id == imageMediaIds[0] == 1
            // - Landscape Logo Media Id == imageMediaIds[1] == 4
            // - Square Image Media Id == imageMediaIds[2] == 3
            // - Square Logo Media Id == imageMediaIds[3] == 2
            // - Image Ad Extension Media Id == imageMediaIds[4] == 0

            // You can use the first four Media Ids when you add or update a Responsive Ad
            // in an Audience campaign e.g., see AudienceCampaigns.java. 

            ArrayOflong adMediaIds = new ArrayOflong();
            adMediaIds.getLongs().add(imageMediaIds.getLongs().get(0));
            adMediaIds.getLongs().add(imageMediaIds.getLongs().get(1));
            adMediaIds.getLongs().add(imageMediaIds.getLongs().get(2));
            adMediaIds.getLongs().add(imageMediaIds.getLongs().get(3));
            outputStatusMessage("Media Ids for Responsive Ad:");
            CampaignManagementExampleHelper.outputArrayOflong(adMediaIds);

            // You can use the fifth Media Id when you add or update an Image Ad Extension
            // in a Search campaign e.g., see AdExtensions.java.

            ArrayOflong extensionMediaIds = new ArrayOflong();
            extensionMediaIds.getLongs().add(imageMediaIds.getLongs().get(4));
            outputStatusMessage("Media Ids for Image Ad Extension:");
            CampaignManagementExampleHelper.outputArrayOflong(extensionMediaIds);

            // Get the media representations to confirm the stored dimensions
            // and get the Url where you can later view or download the media.

            ArrayList<MediaEnabledEntityFilter> responsiveAdFilter = new ArrayList<MediaEnabledEntityFilter>();
            responsiveAdFilter.add(MediaEnabledEntityFilter.RESPONSIVE_AD);
            ArrayOfMediaMetaData getResponsiveAdMediaMetaData = CampaignManagementExampleHelper.getMediaMetaDataByAccountId(
                responsiveAdFilter).getMediaMetaData();
            CampaignManagementExampleHelper.outputArrayOfMediaMetaData(getResponsiveAdMediaMetaData);

            ArrayList<MediaEnabledEntityFilter> imageAdExtensionFilter = new ArrayList<MediaEnabledEntityFilter>();
            imageAdExtensionFilter.add(MediaEnabledEntityFilter.IMAGE_AD_EXTENSION);
            ArrayOfMediaMetaData getImageAdExtensionMediaMetaData = CampaignManagementExampleHelper.getMediaMetaDataByAccountId(
                imageAdExtensionFilter).getMediaMetaData();
            CampaignManagementExampleHelper.outputArrayOfMediaMetaData(getImageAdExtensionMediaMetaData);

            ArrayOfMediaMetaData getMediaMetaData = CampaignManagementExampleHelper.getMediaMetaDataByIds(imageMediaIds).getMediaMetaData();
            CampaignManagementExampleHelper.outputArrayOfMediaMetaData(getMediaMetaData);


            // Comment out (disable) the delete operation if you want to use the media IDs  
            // in another example e.g., AudienceCampaigns.java.

            DeleteMediaResponse deleteMediaResponse = CampaignManagementExampleHelper.deleteMedia(
                authorizationData.getAccountId(),
                imageMediaIds);

            for(java.lang.Long id : imageMediaIds.getLongs()){
                outputStatusMessage(String.format("Deleted Media Id %s\n", id));
            }

            outputStatusMessage("Program execution completed\n"); 

        } 
        catch (Exception ex) {
            String faultXml = BingAdsExceptionHelper.getBingAdsExceptionFaultXml(ex, System.out);
            String message = BingAdsExceptionHelper.handleBingAdsSDKException(ex, System.out);
            ex.printStackTrace();
        }
    }
    
    /*
     * Get image media that can be created via the Bing Ads Campaign Management API.
     * The media type reflects the aspect ratio.
     */
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

    /* 
     * Get the image media as base64 string.  
     */    
    static java.lang.String getBmpBase64String(
        java.lang.String imageFileName) throws UnsupportedEncodingException, IOException
    {
        File fi = new File(imageFileName);
        byte[] imageBytes = Files.readAllBytes(fi.toPath());
        java.lang.String base64String = new java.lang.String(Base64.getEncoder().encode(imageBytes), "UTF-8");
        return base64String;
    }
 }
