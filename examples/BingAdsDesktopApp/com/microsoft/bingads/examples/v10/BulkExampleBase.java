package com.microsoft.bingads.examples.v10;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.microsoft.bingads.v10.bulk.BulkEntityIterable;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.bulk.DownloadFileType;
import com.microsoft.bingads.v10.bulk.EntityUploadParameters;
import com.microsoft.bingads.v10.bulk.FileUploadParameters;
import com.microsoft.bingads.v10.bulk.ResponseMode;
import com.microsoft.bingads.v10.bulk.ResultFileType;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v10.bulk.entities.BulkAppAdExtension;
import com.microsoft.bingads.v10.bulk.entities.BulkCallAdExtension;
import com.microsoft.bingads.v10.bulk.entities.BulkCalloutAdExtension;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignAppAdExtension;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignCallAdExtension;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignCalloutAdExtension;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignDayTimeTarget;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignDayTimeTargetBid;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignLocationAdExtension;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignLocationTarget;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignLocationTargetBid;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignProductScope;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignRadiusTarget;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignRadiusTargetBid;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignReviewAdExtension;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignSiteLinkAdExtension;
import com.microsoft.bingads.v10.bulk.entities.BulkEntity;
import com.microsoft.bingads.v10.bulk.entities.BulkError;
import com.microsoft.bingads.v10.bulk.entities.BulkKeyword;
import com.microsoft.bingads.v10.bulk.entities.BulkLocationAdExtension;
import com.microsoft.bingads.v10.bulk.entities.BulkProductAd;
import com.microsoft.bingads.v10.bulk.entities.BulkReviewAdExtension;
import com.microsoft.bingads.v10.bulk.entities.BulkSiteLink;
import com.microsoft.bingads.v10.bulk.entities.BulkSiteLinkAdExtension;
import com.microsoft.bingads.v10.bulk.entities.BulkTextAd;
import com.microsoft.bingads.v10.bulk.entities.PerformanceData;
import com.microsoft.bingads.v10.bulk.entities.QualityScoreData;
import com.microsoft.bingads.v10.bulk.entities.BulkRemarketingList;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupRemarketingListAssociation;
import com.microsoft.bingads.v10.campaignmanagement.CityTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.CountryTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.DayTimeTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.DistanceUnit;
import com.microsoft.bingads.v10.campaignmanagement.MetroAreaTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.PostalCodeTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.RadiusTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.SiteLink;
import com.microsoft.bingads.v10.campaignmanagement.StateTargetBid;

public class BulkExampleBase extends ExampleBase {

    // Provides methods for downloading and uploading bulk files. 
    static BulkServiceManager BulkService;

    // Provides methods to write a bulk entity to file. 
    static BulkFileWriter Writer;

    // Provides methods to read bulk entities from a file. 
    static BulkFileReader Reader;
    
    // The directory for the bulk files.
    static java.lang.String FileDirectory = "c:\\bulk\\";
    
    // The name of the bulk download file.
    static java.lang.String DownloadFileName = "download.csv";

    // The name of the bulk upload file.
    static java.lang.String UploadFileName = "upload.csv";

    // The name of the bulk upload result file.
    static java.lang.String ResultFileName = "result.csv";
    
    // The bulk file extension type.
    static DownloadFileType FileType = DownloadFileType.CSV; 
    
    // The maximum amount of time (in milliseconds) that you want to wait for the bulk download or upload.
    static int TimeoutInMilliseconds = 36000000;
    
    final static long targetIdKey = -1; 
    final static long appAdExtensionIdKey = -11; 
    final static long callAdExtensionIdKey = -12; 
    final static long calloutAdExtensionIdKey = -13; 
    final static long imageAdExtensionIdKey = -14; 
    final static long locationAdExtensionIdKey = -15; 
    final static long reviewAdExtensionIdKey = -16; 
    final static long siteLinksAdExtensionIdKey = -17; 
    final static long negativeKeywordListIdKey = -18; 
    final static long campaignIdKey = -111; 
    final static long adGroupIdKey = -1111; 
    final static long negativeKeywordIdKey = -11111; 
     
    public BulkExampleBase() {}

    /// Writes the specified entities to a local file and uploads the file. We could have uploaded directly
    /// without writing to file. This example writes to file as an exercise so that you can view the structure 
    /// of the bulk records being uploaded as needed. 
    
    static BulkFileReader writeEntitiesAndUploadFile(List<BulkEntity> uploadEntities) throws IOException, ExecutionException, InterruptedException {
    	Writer = new BulkFileWriter(new File(FileDirectory + UploadFileName));

    	for(BulkEntity entity : uploadEntities){
    		Writer.writeEntity(entity);
    	}
        
        Writer.close();

        FileUploadParameters fileUploadParameters = new FileUploadParameters();
        fileUploadParameters.setResultFileDirectory(new File(FileDirectory));
        fileUploadParameters.setResultFileName(ResultFileName);
        fileUploadParameters.setUploadFilePath(new File(FileDirectory + UploadFileName));
        fileUploadParameters.setResponseMode(ResponseMode.ERRORS_AND_RESULTS);
        fileUploadParameters.setOverwriteResultFile(true);
        
        File bulkFilePath = BulkService.uploadFileAsync(fileUploadParameters, null, null).get();
        
        return new BulkFileReader(bulkFilePath, ResultFileType.UPLOAD, FileType);
    }

    static void outputBulkCampaigns(Iterable<BulkCampaign> bulkEntities){
        for (BulkCampaign entity : bulkEntities){
            outputStatusMessage("\nBulkCampaign: \n");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                    outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
            }

            outputBulkPerformanceData(entity.getPerformanceData());
            outputBulkQualityScoreData(entity.getQualityScoreData());

            // Output the Campaign Management Campaign Object
            outputCampaign(entity.getCampaign());

            if(entity.hasErrors()){
                    outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkAdGroups(Iterable<BulkAdGroup> bulkEntities){
        for (BulkAdGroup entity : bulkEntities){
            outputStatusMessage("\nBulkAdGroup: \n");
            outputStatusMessage(String.format("CampaignId: %s", entity.getCampaignId()));
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            outputStatusMessage(String.format("IsExpired: %s", entity.getIsExpired()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
            }

            outputBulkPerformanceData(entity.getPerformanceData());
            outputBulkQualityScoreData(entity.getQualityScoreData());

            // Output the Campaign Management AdGroup Object
            outputAdGroup(entity.getAdGroup());

            if(entity.hasErrors()){
                    outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkTextAds(Iterable<BulkTextAd> bulkEntities){
        for (BulkTextAd entity : bulkEntities){
            outputStatusMessage("BulkTextAd: \n");
            outputStatusMessage(String.format("TextAd DisplayUrl: %s\nTextAd Id: %s", 
                            entity.getAd().getDisplayUrl(),
                            entity.getAd().getId()));

            if(entity.hasErrors()){
                    outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkKeywords(Iterable<BulkKeyword> bulkEntities){
        for (BulkKeyword entity : bulkEntities){
            outputStatusMessage("BulkKeyword: \n");
            outputStatusMessage(String.format("Keyword Text: %s\nKeyword Id: %s", 
                            entity.getKeyword().getText(),
                            entity.getKeyword().getId()));

            if(entity.hasErrors()){
                    outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkProductAds(Iterable<BulkProductAd> bulkEntities){
        for (BulkProductAd entity : bulkEntities){
            outputStatusMessage("\nBulkProductAd: \n");
            outputStatusMessage(String.format("AdGroupId: %s", entity.getAdGroupId()));
            outputStatusMessage(String.format("AdGroupName: %s", entity.getAdGroupName()));
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                    outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
            }

            outputBulkPerformanceData(entity.getPerformanceData());

            // Output the Campaign Management ProductAd Object
            outputProductAd(entity.getProductAd());

            if(entity.hasErrors()){
                    outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignProductScopes(Iterable<BulkCampaignProductScope> bulkEntities){
        for (BulkCampaignProductScope entity : bulkEntities){
            outputStatusMessage("\nBulkCampaignProductScope: \n");
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                    outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management CampaignCriterion and ProductScope Objects
            outputCampaignCriterionWithProductScope(entity.getCampaignCriterion());

            if(entity.hasErrors()){
                    outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkAdGroupProductPartitions(Iterable<BulkAdGroupProductPartition> bulkEntities){
        for (BulkAdGroupProductPartition entity : bulkEntities){
            outputStatusMessage("\nBulkAdGroupProductPartition: \n");
            outputStatusMessage(String.format("AdGroupName: %s", entity.getAdGroupName()));
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                    outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management AdGroupCriterion and ProductPartition Objects
            outputAdGroupCriterionWithProductPartition(entity.getAdGroupCriterion());

            if(entity.hasErrors()){
                    outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkAppAdExtensions(Iterable<BulkAppAdExtension> bulkEntities){
        for (BulkAppAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkAppAdExtension: \n");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management AppAdExtension Object
            outputAppAdExtension(entity.getAppAdExtension());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignAppAdExtensions(Iterable<BulkCampaignAppAdExtension> bulkEntities){
        for (BulkCampaignAppAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkCampaignAppAdExtension: \n");
            if(entity.getAdExtensionIdToEntityIdAssociation() != null){
                outputStatusMessage(String.format("AdExtensionId: %s", entity.getAdExtensionIdToEntityIdAssociation().getAdExtensionId()));
                outputStatusMessage(String.format("EntityId: %s", entity.getAdExtensionIdToEntityIdAssociation().getEntityId()));
            }
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            outputStatusMessage(String.format("EditorialStatus: %s", entity.getEditorialStatus()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Status: %s", entity.getStatus()));

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCallAdExtensions(Iterable<BulkCallAdExtension> bulkEntities){
        for (BulkCallAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkCallAdExtension: \n");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management CallAdExtension Object
            outputCallAdExtension(entity.getCallAdExtension());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignCallAdExtensions(Iterable<BulkCampaignCallAdExtension> bulkEntities){
        for (BulkCampaignCallAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkCampaignCallAdExtension: \n");
            if(entity.getAdExtensionIdToEntityIdAssociation() != null){
                outputStatusMessage(String.format("AdExtensionId: %s", entity.getAdExtensionIdToEntityIdAssociation().getAdExtensionId()));
                outputStatusMessage(String.format("EntityId: %s", entity.getAdExtensionIdToEntityIdAssociation().getEntityId()));
            }
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            outputStatusMessage(String.format("EditorialStatus: %s", entity.getEditorialStatus()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Status: %s", entity.getStatus()));

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCalloutAdExtensions(Iterable<BulkCalloutAdExtension> bulkEntities){
        for (BulkCalloutAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkCalloutAdExtension: \n");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management CalloutAdExtension Object
            outputCalloutAdExtension(entity.getCalloutAdExtension());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignCalloutAdExtensions(Iterable<BulkCampaignCalloutAdExtension> bulkEntities){
        for (BulkCampaignCalloutAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkCampaignCalloutAdExtension: \n");
            if(entity.getAdExtensionIdToEntityIdAssociation() != null){
                outputStatusMessage(String.format("AdExtensionId: %s", entity.getAdExtensionIdToEntityIdAssociation().getAdExtensionId()));
                outputStatusMessage(String.format("EntityId: %s", entity.getAdExtensionIdToEntityIdAssociation().getEntityId()));
            }
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            outputStatusMessage(String.format("EditorialStatus: %s", entity.getEditorialStatus()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Status: %s", entity.getStatus()));

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkLocationAdExtensions(Iterable<BulkLocationAdExtension> bulkEntities){
        for (BulkLocationAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkLocationAdExtension: \n");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management LocationAdExtension Object
            outputLocationAdExtension(entity.getLocationAdExtension());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignLocationAdExtensions(Iterable<BulkCampaignLocationAdExtension> bulkEntities){
        for (BulkCampaignLocationAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkCampaignLocationAdExtension: \n");
            if(entity.getAdExtensionIdToEntityIdAssociation() != null){
                outputStatusMessage(String.format("AdExtensionId: %s", entity.getAdExtensionIdToEntityIdAssociation().getAdExtensionId()));
                outputStatusMessage(String.format("EntityId: %s", entity.getAdExtensionIdToEntityIdAssociation().getEntityId()));
            }
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            outputStatusMessage(String.format("EditorialStatus: %s", entity.getEditorialStatus()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Status: %s", entity.getStatus()));

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkReviewAdExtensions(Iterable<BulkReviewAdExtension> bulkEntities){
        for (BulkReviewAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkReviewAdExtension: \n");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management ReviewAdExtension Object
            outputReviewAdExtension(entity.getReviewAdExtension());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignReviewAdExtensions(Iterable<BulkCampaignReviewAdExtension> bulkEntities){
        for (BulkCampaignReviewAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkCampaignReviewAdExtension: \n");
            if(entity.getAdExtensionIdToEntityIdAssociation() != null){
                outputStatusMessage(String.format("AdExtensionId: %s", entity.getAdExtensionIdToEntityIdAssociation().getAdExtensionId()));
                outputStatusMessage(String.format("EntityId: %s", entity.getAdExtensionIdToEntityIdAssociation().getEntityId()));
            }
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            outputStatusMessage(String.format("EditorialStatus: %s", entity.getEditorialStatus()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Status: %s", entity.getStatus()));

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkSiteLinkAdExtensions(Iterable<BulkSiteLinkAdExtension> bulkEntities){
        for (BulkSiteLinkAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkSiteLinkAdExtension: \n");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management SiteLinksAdExtension Object
            outputSiteLinksAdExtension(entity.getSiteLinksAdExtension());

            if (entity.getSiteLinks() != null && entity.getSiteLinks().size() > 0)
            {
                outputBulkSiteLinks(entity.getSiteLinks());
            }
        }
    }

    static void outputBulkSiteLinks(Iterable<BulkSiteLink> bulkEntities)
    {
        for (BulkSiteLink entity : bulkEntities)
        {
            outputStatusMessage("\nBulkSiteLink: \n");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("AdExtensionId: %s", entity.getAdExtensionId()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Order: %s", entity.getOrder()));
            outputStatusMessage(String.format("Status: %s", entity.getStatus()));
            outputStatusMessage(String.format("Version: %s", entity.getVersion()));

            // Output the Campaign Management SiteLink Object
            List<SiteLink> siteLinks = new ArrayList<SiteLink>();
            siteLinks.add(entity.getSiteLink());
            outputSiteLinks(siteLinks);

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignSiteLinkAdExtensions(Iterable<BulkCampaignSiteLinkAdExtension> bulkEntities){
        for (BulkCampaignSiteLinkAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkCampaignSiteLinkAdExtension: \n");
            if(entity.getAdExtensionIdToEntityIdAssociation() != null){
                outputStatusMessage(String.format("AdExtensionId: %s", entity.getAdExtensionIdToEntityIdAssociation().getAdExtensionId()));
                outputStatusMessage(String.format("EntityId: %s", entity.getAdExtensionIdToEntityIdAssociation().getEntityId()));
            }
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            outputStatusMessage(String.format("EditorialStatus: %s", entity.getEditorialStatus()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Status: %s", entity.getStatus()));

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignDayTimeTargets(Iterable<BulkCampaignDayTimeTarget> bulkEntities) {
        for (BulkCampaignDayTimeTarget entity : bulkEntities){
            // If the BulkCampaignDayTimeTarget object was created by the application, and not read from a bulk file, 
            // then there will be no BulkCampaignDayTimeTargetBid objects. For example if you want to print the 
            // BulkCampaignDayTimeTarget prior to upload.
            if (entity.getBids().size() == 0 && entity.getDayTimeTarget() != null){
                    outputStatusMessage("BulkCampaignDayTimeTarget: \n");
                    outputStatusMessage(String.format("Campaign Name: %s\n", entity.getCampaignName()));
                    outputStatusMessage(String.format("Campaign Id: %s\n", entity.getCampaignId()));
                    outputStatusMessage(String.format("Target Id: %s\n", entity.getTargetId()));

                    for (DayTimeTargetBid bid : entity.getDayTimeTarget().getBids().getDayTimeTargetBids()){
                            outputStatusMessage("Campaign Management DayTimeTargetBid Object: ");
                            outputStatusMessage(String.format("Bid Adjustment: %s", bid.getBidAdjustment()));
                            outputStatusMessage(String.format("Day : %s", bid.getDay()));
                            outputStatusMessage(String.format("From Hour : %s", bid.getFromHour()));
                            outputStatusMessage(String.format("From Minute: %s", bid.getFromMinute()));
                            outputStatusMessage(String.format("To Hour : %s", bid.getToHour()));
                            outputStatusMessage(String.format("To Minute: %s\n", bid.getToMinute()));
                    }
            }
            else {
                    outputBulkCampaignDayTimeTargetBids(entity.getBids());
            }
        }
    }

    static void outputBulkCampaignDayTimeTargetBids(Iterable<BulkCampaignDayTimeTargetBid> bulkEntities){
        for (BulkCampaignDayTimeTargetBid entity : bulkEntities){
            outputStatusMessage("BulkCampaignDayTimeTargetBid: \n");
            outputStatusMessage(String.format("Campaign Name: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("Campaign Id: %s", entity.getCampaignId()));
            outputStatusMessage(String.format("Target Id: %s\n", entity.getTargetId()));

            outputStatusMessage(String.format("Bid Adjustment: %s", entity.getDayTimeTargetBid().getBidAdjustment()));
            outputStatusMessage(String.format("Day : %s", entity.getDayTimeTargetBid().getDay()));
            outputStatusMessage(String.format("From Hour : %s", entity.getDayTimeTargetBid().getFromHour()));
            outputStatusMessage(String.format("From Minute: %s", entity.getDayTimeTargetBid().getFromMinute()));
            outputStatusMessage(String.format("To Hour : %s", entity.getDayTimeTargetBid().getToHour()));
            outputStatusMessage(String.format("To Minute: %s\n", entity.getDayTimeTargetBid().getToMinute()));

            if(entity.hasErrors()){
                    outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignLocationTargets(Iterable<BulkCampaignLocationTarget> bulkEntities) {
        for (BulkCampaignLocationTarget entity : bulkEntities){
            // If the BulkCampaignLocationTarget object was created by the application, and not read from a bulk file, 
            // then there will be no BulkCampaignLocationTargetBid objects. For example if you want to print the 
            // BulkCampaignLocationTarget prior to upload.
            if (entity.getBids().size() == 0){
                outputStatusMessage("BulkCampaignLocationTarget: \n");
                outputStatusMessage(String.format("Campaign Name: %s\n", entity.getCampaignName()));
                outputStatusMessage(String.format("Campaign Id: %s\n", entity.getCampaignId()));
                outputStatusMessage(String.format("Target Id: %s\n", entity.getTargetId()));
                outputStatusMessage(String.format("Intent Option: %s\n", entity.getIntentOption()));

                if (entity.getCityTarget() != null){
                    for (CityTargetBid bid : entity.getCityTarget().getBids().getCityTargetBids()){
                        outputStatusMessage("Campaign Management CityTargetBid Object: ");
                        outputStatusMessage(String.format("Bid Adjustment: %s", bid.getBidAdjustment()));
                        outputStatusMessage(String.format("City : %s", bid.getCity()));
                        outputStatusMessage(String.format("Location Is Excluded: %s", bid.isIsExcluded()));
                    }
                }
                if (entity.getCountryTarget() != null){
                    for (CountryTargetBid bid : entity.getCountryTarget().getBids().getCountryTargetBids()){
                        outputStatusMessage("Campaign Management CountryTargetBid Object: ");
                        outputStatusMessage(String.format("Bid Adjustment: %s", bid.getBidAdjustment()));
                        outputStatusMessage(String.format("CountryAndRegion : %s", bid.getCountryAndRegion()));
                        outputStatusMessage(String.format("Location Is Excluded: %s", bid.isIsExcluded()));
                    }
                }
                if (entity.getMetroAreaTarget() != null){
                    for (MetroAreaTargetBid bid : entity.getMetroAreaTarget().getBids().getMetroAreaTargetBids()){
                        outputStatusMessage("Campaign Management MetroAreaTargetBid Object: ");
                        outputStatusMessage(String.format("Bid Adjustment: %s", bid.getBidAdjustment()));
                        outputStatusMessage(String.format("MetroArea : %s", bid.getMetroArea()));
                        outputStatusMessage(String.format("Location Is Excluded: %s", bid.isIsExcluded()));
                    }
                }
                if (entity.getPostalCodeTarget() != null){
                    for (PostalCodeTargetBid bid : entity.getPostalCodeTarget().getBids().getPostalCodeTargetBids()){
                        outputStatusMessage("Campaign Management PostalTargetBid Object: ");
                        outputStatusMessage(String.format("Bid Adjustment: %s", bid.getBidAdjustment()));
                        outputStatusMessage(String.format("PostalCode : %s", bid.getPostalCode()));
                        outputStatusMessage(String.format("Location Is Excluded: %s", bid.isIsExcluded()));
                    }
                }
                if (entity.getStateTarget() != null){
                    for (StateTargetBid bid : entity.getStateTarget().getBids().getStateTargetBids()){
                        outputStatusMessage("Campaign Management StateTargetBid Object: ");
                        outputStatusMessage(String.format("Bid Adjustment: %s", bid.getBidAdjustment()));
                        outputStatusMessage(String.format("State", bid.getState()));
                        outputStatusMessage(String.format("Location Is Excluded: %s", bid.isIsExcluded()));
                    }
                }
            }
            else {
                    outputBulkCampaignLocationTargetBids(entity.getBids());
            }

        }
    }

    static void outputBulkCampaignLocationTargetBids(Iterable<BulkCampaignLocationTargetBid> bulkEntities){
        for (BulkCampaignLocationTargetBid entity : bulkEntities){
            outputStatusMessage("BulkCampaignDayTimeTargetBid: \n");
            outputStatusMessage(String.format("Campaign Name: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("Campaign Id: %s", entity.getCampaignId()));
            outputStatusMessage(String.format("Target Id: %s\n", entity.getTargetId()));
            outputStatusMessage(String.format("IntentOption: %s\n", entity.getIntentOption()));

            outputStatusMessage(String.format("Bid Adjustment: %s", entity.getBidAdjustment()));
            outputStatusMessage(String.format("Location Type: %s", entity.getLocationType()));
            outputStatusMessage(String.format("Location: %s\n", entity.getLocation()));

            if(entity.hasErrors()){
                    outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignRadiusTargets(Iterable<BulkCampaignRadiusTarget> bulkEntities) {
        for (BulkCampaignRadiusTarget entity : bulkEntities){
            // If the BulkCampaignRadiusTarget object was created by the application, and not read from a bulk file, 
            // then there will be no BulkCampaignRadiusTargetBid objects. For example if you want to print the 
            // BulkCampaignRadiusTarget prior to upload.
            if (entity.getBids().size() == 0 && entity.getRadiusTarget() != null){
                outputStatusMessage("BulkCampaignRadiusTarget: \n");
                outputStatusMessage(String.format("Campaign Name: %s\n", entity.getCampaignName()));
                outputStatusMessage(String.format("Campaign Id: %s\n", entity.getCampaignId()));
                outputStatusMessage(String.format("Target Id: %s\n", entity.getTargetId()));

                for (RadiusTargetBid bid : entity.getRadiusTarget().getBids().getRadiusTargetBids()){
                    outputStatusMessage("Campaign Management RadiusTargetBid Object: ");
                    outputStatusMessage(String.format("Bid Adjustment: %s", bid.getBidAdjustment()));
                    outputStatusMessage(String.format("Name : %s", bid.getName()));
                    outputStatusMessage(String.format("Radius : %s", bid.getRadius()));
                    java.lang.String radiusUnit = bid.getRadiusUnit() == DistanceUnit.KILOMETERS ? "Kilometers" : "Miles";
                    outputStatusMessage(String.format("Radius Unit: %s", radiusUnit));
                }
            }
            else {
                    outputBulkCampaignRadiusTargetBids(entity.getBids());
            }
        }
    }

    static void outputBulkCampaignRadiusTargetBids(Iterable<BulkCampaignRadiusTargetBid> bulkEntities){
        for (BulkCampaignRadiusTargetBid entity : bulkEntities){
            outputStatusMessage("BulkCampaignRadiusTargetBid: \n");
            outputStatusMessage(String.format("Campaign Name: %s\n", entity.getCampaignName()));
            outputStatusMessage(String.format("Campaign Id: %s\n", entity.getCampaignId()));
            outputStatusMessage(String.format("Target Id: %s\n", entity.getTargetId()));

            outputStatusMessage("Campaign Management RadiusTargetBid Object: ");
            outputStatusMessage(String.format("Bid Adjustment: %s", entity.getRadiusTargetBid().getBidAdjustment()));
            outputStatusMessage(String.format("Name : %s", entity.getRadiusTargetBid().getName()));
            outputStatusMessage(String.format("Radius : %s", entity.getRadiusTargetBid().getRadius()));
            java.lang.String radiusUnit = entity.getRadiusTargetBid().getRadiusUnit() == 
                            DistanceUnit.KILOMETERS ? "Kilometers" : "Miles";
            outputStatusMessage(String.format("Radius Unit: %s", radiusUnit));

            if(entity.hasErrors()){
                    outputBulkErrors(entity.getErrors());
            }
        }
    }
        
    static void outputBulkRemarketingLists(Iterable<BulkRemarketingList> bulkEntities){
        for (BulkRemarketingList entity : bulkEntities){
            outputStatusMessage("\nBulkRemarketingList: \n");
            outputStatusMessage(String.format("Status: %s", entity.getStatus()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management RemarketingList Object
            outputRemarketingList(entity.getRemarketingList());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkAdGroupRemarketingLists(Iterable<BulkAdGroupRemarketingListAssociation> bulkEntities){
        for (BulkAdGroupRemarketingListAssociation entity : bulkEntities){
            outputStatusMessage("\nBulkAdGroupRemarketingList: \n");
            outputStatusMessage(String.format("Campaign Name: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("Ad Group Name: %s", entity.getAdGroupName()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management AdGroupRemarketingListAssociation Object
            outputAdGroupRemarketingListAssociation(entity.getAdGroupRemarketingListAssociation());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkPerformanceData(PerformanceData performanceData){
        if (performanceData != null)
        {
            outputStatusMessage("PerformanceData: ");
            outputStatusMessage(String.format("AverageCostPerClick: %s", performanceData.getAverageCostPerClick()));
            outputStatusMessage(String.format("AverageCostPerThousandImpressions: %s", performanceData.getAverageCostPerThousandImpressions()));
            outputStatusMessage(String.format("AveragePosition: %s", performanceData.getAveragePosition()));
            outputStatusMessage(String.format("Clicks: %s", performanceData.getClicks()));
            outputStatusMessage(String.format("ClickThroughRate: %s", performanceData.getClickThroughRate()));
            outputStatusMessage(String.format("Conversions: %s", performanceData.getConversions()));
            outputStatusMessage(String.format("CostPerConversion: %s", performanceData.getCostPerConversion()));
            outputStatusMessage(String.format("Impressions: %s", performanceData.getImpressions()));
            outputStatusMessage(String.format("Spend: %s", performanceData.getSpend()));
        }
    }

    static void outputBulkQualityScoreData(QualityScoreData qualityScoreData){
        if (qualityScoreData != null)
        {
            outputStatusMessage("QualityScoreData: ");
            outputStatusMessage(String.format("KeywordRelevance: %s", qualityScoreData.getKeywordRelevance()));
            outputStatusMessage(String.format("LandingPageRelevance: %s", qualityScoreData.getLandingPageRelevance()));
            outputStatusMessage(String.format("LandingPageUserExperience: %s", qualityScoreData.getLandingPageUserExperience()));
            outputStatusMessage(String.format("QualityScore: %s", qualityScoreData.getQualityScore()));
        }
    }

    static void outputBulkErrors(Iterable<BulkError> errors){
        for (BulkError error : errors){
            outputStatusMessage(String.format("Error: %s", error.getError()));
            outputStatusMessage(String.format("Number: %s", error.getNumber()));
            if(error.getEditorialReasonCode() != null){
                    outputStatusMessage(String.format("EditorialTerm: %s", error.getEditorialTerm()));
                    outputStatusMessage(String.format("EditorialReasonCode: %s", error.getEditorialReasonCode()));
                    outputStatusMessage(String.format("EditorialLocation: %s", error.getEditorialLocation()));
                    outputStatusMessage(String.format("PublisherCountries: %s", error.getPublisherCountries()));
            }
        }
    }
}
