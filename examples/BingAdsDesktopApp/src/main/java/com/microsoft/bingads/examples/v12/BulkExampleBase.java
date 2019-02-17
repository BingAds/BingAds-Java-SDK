package com.microsoft.bingads.examples.v12;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.microsoft.bingads.v12.bulk.*;
import com.microsoft.bingads.v12.bulk.entities.*;
import com.microsoft.bingads.v12.campaignmanagement.*;

public class BulkExampleBase extends ExampleBase {

    // Provides methods for downloading and uploading bulk files. 
    static BulkServiceManager BulkServiceManager;

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
    static DownloadFileType BulkDownloadFileType = DownloadFileType.CSV; 
    
    // The maximum amount of time (in milliseconds) that you want to wait for the bulk download or upload.
    static int TimeoutInMilliseconds = 36000000;
    
    static long actionAdExtensionIdKey = -10; 
    static long appAdExtensionIdKey = -11; 
    static long callAdExtensionIdKey = -12; 
    static long calloutAdExtensionIdKey = -13; 
    static long imageAdExtensionIdKey = -14; 
    static long locationAdExtensionIdKey = -15; 
    static long priceAdExtensionIdKey = -16; 
    static long reviewAdExtensionIdKey = -17; 
    static long sitelinkAdExtensionIdKey = -18; 
    static long structuredSnippetAdExtensionIdKey = -19; 
    static long negativeKeywordListIdKey = -20; 
    static long budgetIdKey = -21;
    static long campaignIdKey = -111; 
    static long adGroupIdKey = -1111; 
    static long negativeKeywordIdKey = -11111; 
     
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
        
        File bulkFilePath = BulkServiceManager.uploadFileAsync(fileUploadParameters, null, null).get();
        
        return new BulkFileReader(bulkFilePath, ResultFileType.UPLOAD, BulkDownloadFileType);
    }
        
    static void outputBulkBudgets(Iterable<BulkBudget> bulkEntities){
        for (BulkBudget entity : bulkEntities){
            outputStatusMessage("BulkBudget:");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                    outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Status: %s", entity.getStatus()));

            // Output the Campaign Management Budget Object
            CampaignManagementExampleHelper.outputBudget(entity.getBudget());

            if(entity.hasErrors()){
                outputBulkErrors(entity.getErrors());
            }
        }
    }


    static void outputBulkCampaigns(Iterable<BulkCampaign> bulkEntities){
        for (BulkCampaign entity : bulkEntities){
            outputStatusMessage("BulkCampaign:");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
            }

            outputBulkQualityScoreData(entity.getQualityScoreData());

            // Output the Campaign Management Campaign Object
            CampaignManagementExampleHelper.outputCampaign(entity.getCampaign());

            if(entity.hasErrors()){
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkAdGroups(Iterable<BulkAdGroup> bulkEntities){
        for (BulkAdGroup entity : bulkEntities){
            outputStatusMessage("BulkAdGroup:");
            outputStatusMessage(String.format("CampaignId: %s", entity.getCampaignId()));
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            outputStatusMessage(String.format("IsExpired: %s", entity.getIsExpired()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
            }

            outputBulkQualityScoreData(entity.getQualityScoreData());

            // Output the Campaign Management AdGroup Object
            CampaignManagementExampleHelper.outputAdGroup(entity.getAdGroup());

            if(entity.hasErrors()){
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkTextAds(Iterable<BulkTextAd> bulkEntities){
        for (BulkTextAd entity : bulkEntities){
            outputStatusMessage("BulkTextAd:");
            outputStatusMessage(String.format("AdGroupId: %s", entity.getAdGroupId()));
            outputStatusMessage(String.format("AdGroupName: %s", entity.getAdGroupName()));
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management TextAd Object
            CampaignManagementExampleHelper.outputAd(entity.getTextAd());

            if(entity.hasErrors()){
                outputBulkErrors(entity.getErrors());
            }
        }
    }
    
    static void outputBulkExpandedTextAds(Iterable<BulkExpandedTextAd> bulkEntities){
        for (BulkExpandedTextAd entity : bulkEntities){
            outputStatusMessage("BulkExpandedTextAd:");
            outputStatusMessage(String.format("AdGroupId: %s", entity.getAdGroupId()));
            outputStatusMessage(String.format("AdGroupName: %s", entity.getAdGroupName()));
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management ExpandedTextAd Object
            CampaignManagementExampleHelper.outputAd(entity.getExpandedTextAd());

            if(entity.hasErrors()){
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkKeywords(Iterable<BulkKeyword> bulkEntities){
        for (BulkKeyword entity : bulkEntities){
            outputStatusMessage("BulkKeyword:");
            outputStatusMessage(String.format("AdGroupId: {0}", entity.getAdGroupId()));
            outputStatusMessage(String.format("AdGroupName: {0}", entity.getAdGroupName()));
            outputStatusMessage(String.format("CampaignName: {0}", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: {0}", entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
            }

            outputBulkQualityScoreData(entity.getQualityScoreData());
            outputBulkBidSuggestions(entity.getBidSuggestions());

            // Output the Campaign Management Keyword Object
            CampaignManagementExampleHelper.outputKeyword(entity.getKeyword());

            if(entity.hasErrors()){
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkProductAds(Iterable<BulkProductAd> bulkEntities){
        for (BulkProductAd entity : bulkEntities){
            outputStatusMessage("BulkProductAd:");
            outputStatusMessage(String.format("AdGroupId: %s", entity.getAdGroupId()));
            outputStatusMessage(String.format("AdGroupName: %s", entity.getAdGroupName()));
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management ProductAd Object
            CampaignManagementExampleHelper.outputAd(entity.getProductAd());

            if(entity.hasErrors()){
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignProductScopes(Iterable<BulkCampaignProductScope> bulkEntities){
        for (BulkCampaignProductScope entity : bulkEntities){
            outputStatusMessage("BulkCampaignProductScope:");
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management BiddableCampaignCriterion
            CampaignManagementExampleHelper.outputBiddableCampaignCriterion((BiddableCampaignCriterion)entity.getBiddableCampaignCriterion());

            if(entity.hasErrors()){
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkAdGroupProductPartitions(Iterable<BulkAdGroupProductPartition> bulkEntities){
        for (BulkAdGroupProductPartition entity : bulkEntities){
            outputStatusMessage("BulkAdGroupProductPartition:");
            outputStatusMessage(String.format("AdGroupName: %s", entity.getAdGroupName()));
            outputStatusMessage(String.format("CampaignName: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s", entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s", entity.getLastModifiedTime().getTime()));
            }
            
            // BulkAdGroupProductPartition can have either BiddableAdGroupCriterion or NegativeAdGroupCriterion

            if (entity.getAdGroupCriterion() instanceof BiddableAdGroupCriterion)
            {
                // Output the Campaign Management BiddableAdGroupCriterion
                CampaignManagementExampleHelper.outputBiddableAdGroupCriterion((BiddableAdGroupCriterion)entity.getAdGroupCriterion());

            }
            else if (entity.getAdGroupCriterion() instanceof NegativeAdGroupCriterion)
            {                
                // Output the Campaign Management NegativeAdGroupCriterion
                CampaignManagementExampleHelper.outputNegativeAdGroupCriterion((NegativeAdGroupCriterion)entity.getAdGroupCriterion());
            }

            if(entity.hasErrors()){
                outputBulkErrors(entity.getErrors());
            }
        }
    }
    
    static void outputBulkActionAdExtensions(Iterable<BulkActionAdExtension> bulkEntities){
        for (BulkActionAdExtension entity : bulkEntities){
            outputStatusMessage("BulkActionAdExtension:");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management ActionAdExtension Object
            CampaignManagementExampleHelper.outputAdExtension(entity.getActionAdExtension());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignActionAdExtensions(Iterable<BulkCampaignActionAdExtension> bulkEntities){
        for (BulkCampaignActionAdExtension entity : bulkEntities){
            outputStatusMessage("BulkCampaignActionAdExtension:");
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

    static void outputBulkAppAdExtensions(Iterable<BulkAppAdExtension> bulkEntities){
        for (BulkAppAdExtension entity : bulkEntities){
            outputStatusMessage("BulkAppAdExtension:");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management AppAdExtension Object
            CampaignManagementExampleHelper.outputAdExtension(entity.getAppAdExtension());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignAppAdExtensions(Iterable<BulkCampaignAppAdExtension> bulkEntities){
        for (BulkCampaignAppAdExtension entity : bulkEntities){
            outputStatusMessage("BulkCampaignAppAdExtension:");
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
            outputStatusMessage("BulkCallAdExtension:");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management CallAdExtension Object
            CampaignManagementExampleHelper.outputAdExtension(entity.getCallAdExtension());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignCallAdExtensions(Iterable<BulkCampaignCallAdExtension> bulkEntities){
        for (BulkCampaignCallAdExtension entity : bulkEntities){
            outputStatusMessage("BulkCampaignCallAdExtension:");
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
            outputStatusMessage("BulkCalloutAdExtension:");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management CalloutAdExtension Object
            CampaignManagementExampleHelper.outputAdExtension(entity.getCalloutAdExtension());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignCalloutAdExtensions(Iterable<BulkCampaignCalloutAdExtension> bulkEntities){
        for (BulkCampaignCalloutAdExtension entity : bulkEntities){
            outputStatusMessage("BulkCampaignCalloutAdExtension:");
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
            outputStatusMessage("BulkLocationAdExtension:");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management LocationAdExtension Object
            CampaignManagementExampleHelper.outputAdExtension(entity.getLocationAdExtension());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignLocationAdExtensions(Iterable<BulkCampaignLocationAdExtension> bulkEntities){
        for (BulkCampaignLocationAdExtension entity : bulkEntities){
            outputStatusMessage("BulkCampaignLocationAdExtension:");
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
    
    static void outputBulkPriceAdExtensions(Iterable<BulkPriceAdExtension> bulkEntities){
        for (BulkPriceAdExtension entity : bulkEntities){
            outputStatusMessage("BulkPriceAdExtension:");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management PriceAdExtension Object
            CampaignManagementExampleHelper.outputAdExtension(entity.getPriceAdExtension());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignPriceAdExtensions(Iterable<BulkCampaignPriceAdExtension> bulkEntities){
        for (BulkCampaignPriceAdExtension entity : bulkEntities){
            outputStatusMessage("BulkCampaignPriceAdExtension:");
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
            outputStatusMessage("BulkReviewAdExtension:");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management ReviewAdExtension Object
            CampaignManagementExampleHelper.outputAdExtension(entity.getReviewAdExtension());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkCampaignReviewAdExtensions(Iterable<BulkCampaignReviewAdExtension> bulkEntities){
        for (BulkCampaignReviewAdExtension entity : bulkEntities){
            outputStatusMessage("BulkCampaignReviewAdExtension:");
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

    static void outputBulkSitelinkAdExtensions(Iterable<BulkSitelinkAdExtension> bulkEntities){
        for (BulkSitelinkAdExtension entity : bulkEntities){
            outputStatusMessage("BulkSitelinkAdExtension:");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management SitelinkAdExtension Object
            CampaignManagementExampleHelper.outputAdExtension(entity.getSitelinkAdExtension());
        }
    }
    
    static void outputBulkCampaignSitelinkAdExtensions(Iterable<BulkCampaignSitelinkAdExtension> bulkEntities){
        for (BulkCampaignSitelinkAdExtension entity : bulkEntities){
            outputStatusMessage("BulkCampaignSitelinkAdExtension:");
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
    
    static void outputBulkStructuredSnippetAdExtensions(Iterable<BulkStructuredSnippetAdExtension> bulkEntities){
        for (BulkStructuredSnippetAdExtension entity : bulkEntities){
            outputStatusMessage("BulkStructuredSnippetAdExtension:");
            outputStatusMessage(String.format("AccountId: %s", entity.getAccountId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management StructuredSnippetAdExtension Object
            CampaignManagementExampleHelper.outputAdExtension(entity.getStructuredSnippetAdExtension());
        }
    }
    
    static void outputBulkCampaignStructuredSnippetAdExtensions(Iterable<BulkCampaignStructuredSnippetAdExtension> bulkEntities){
        for (BulkCampaignStructuredSnippetAdExtension entity : bulkEntities){
            outputStatusMessage("BulkCampaignStructuredSnippetAdExtension:");
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

    static void outputBulkRemarketingLists(Iterable<BulkRemarketingList> bulkEntities){
        for (BulkRemarketingList entity : bulkEntities){
            outputStatusMessage("BulkRemarketingList:");
            outputStatusMessage(String.format("Status: %s", entity.getStatus()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management RemarketingList Object
            CampaignManagementExampleHelper.outputAudience(entity.getRemarketingList());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
    }

    static void outputBulkAdGroupRemarketingListAssociations(Iterable<BulkAdGroupRemarketingListAssociation> bulkEntities){
        for (BulkAdGroupRemarketingListAssociation entity : bulkEntities){
            outputStatusMessage("BulkAdGroupRemarketingList:");
            outputStatusMessage(String.format("Campaign Name: %s", entity.getCampaignName()));
            outputStatusMessage(String.format("Ad Group Name: %s", entity.getAdGroupName()));
            outputStatusMessage(String.format("ClientId: %s",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
                outputStatusMessage(String.format("LastModifiedTime: %s",entity.getLastModifiedTime().getTime()));
            }

            // Output the Campaign Management BiddableAdGroupCriterion Object
            CampaignManagementExampleHelper.outputBiddableAdGroupCriterion(entity.getBiddableAdGroupCriterion());

            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
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
    
    static void outputBulkBidSuggestions(BidSuggestionData bidSuggestions){
        if (bidSuggestions != null)
        {
            outputStatusMessage("QualityScoreData: ");
            outputStatusMessage("BidSuggestions: ");
            outputStatusMessage(String.format("BestPosition: {0}", bidSuggestions.getBestPosition()));
            outputStatusMessage(String.format("MainLine: {0}", bidSuggestions.getMainLine()));
            outputStatusMessage(String.format("FirstPage: {0}", bidSuggestions.getFirstPage()));
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
    
    static BulkEntity getExampleBulkCampaign() {
        // Map properties in the Bulk file to the BulkAdGroup
        BulkCampaign bulkCampaign = new BulkCampaign();
        
        // 'Parent Id' column header in the Bulk file
        bulkCampaign.setAccountId(0L);        
        // 'Client Id' column header in the Bulk file
        bulkCampaign.setClientId("ClientIdGoesHere");
        
        // Map properties in the Bulk file to the 
        // Campaign object of the Campaign Management service.
        Campaign campaign = new Campaign();
        
        // 'Bid Strategy Type' column header in the Bulk file
        campaign.setBiddingScheme(new EnhancedCpcBiddingScheme());
        // 'Budget Id' column header in the Bulk file
        campaign.setBudgetId(null);
        // 'Budget Type' column header in the Bulk file
        campaign.setBudgetType(BudgetLimitType.DAILY_BUDGET_STANDARD);
        // 'Campaign Type' column header in the Bulk file
        ArrayList<CampaignType> campaignTypes = new ArrayList<CampaignType>();
        campaignTypes.add(CampaignType.SEARCH);
        campaign.setCampaignType(campaignTypes);
        // 'Budget' column header in the Bulk file
        campaign.setDailyBudget(50D);
        // 'Id' column header in the Bulk file
        campaign.setId(campaignIdKey);
        // 'Language' column header in the Bulk file
        campaign.setLanguages(null);
        // 'Name' column header in the Bulk file
        campaign.setName("Women's Shoes " + System.currentTimeMillis());
        // 'Bid Adjustment' column header in the Bulk file
        campaign.setAudienceAdsBidAdjustment(null);
        // 'Status' column header in the Bulk file
        campaign.setStatus(CampaignStatus.PAUSED);
        // 'Time Zone' column header in the Bulk file
        campaign.setTimeZone("PacificTimeUSCanadaTijuana");
        // 'Tracking Template' column header in the Bulk file
        campaign.setTrackingUrlTemplate(null);
        // 'Custom Parameter' column header in the Bulk file
        campaign.setUrlCustomParameters(getExampleCustomParameters());
        
        bulkCampaign.setCampaign(campaign);
        
        return bulkCampaign;
    }
    
    static BulkEntity getExampleBulkAdGroup() {
        // Map properties in the Bulk file to the BulkAdGroup
        BulkAdGroup bulkAdGroup = new BulkAdGroup();
        
        // 'Campaign' column header in the Bulk file
        bulkAdGroup.setCampaignName("ParentCampaignNameGoesHere");
        // 'Parent Id' column header in the Bulk file
        bulkAdGroup.setCampaignId(campaignIdKey);
        // 'Client Id' column header in the Bulk file
        bulkAdGroup.setClientId("ClientIdGoesHere");
        
        // Map properties in the Bulk file to the 
        // AdGroup object of the Campaign Management service.
        AdGroup adGroup = new AdGroup();

        // 'Ad Rotation' column header in the Bulk file
        AdRotation adRotation = new AdRotation();
        adRotation.setType(AdRotationType.ROTATE_ADS_EVENLY);
        adGroup.setAdRotation(adRotation);
        // 'Bid Adjustment' column header in the Bulk file
        adGroup.setAudienceAdsBidAdjustment(10);
        // 'Bid Strategy Type' column header in the Bulk file
        adGroup.setBiddingScheme(new ManualCpcBiddingScheme());
        // 'End Date' column header in the Bulk file
        adGroup.setEndDate(null);
        // 'Id' column header in the Bulk file
        adGroup.setId(adGroupIdKey);
        // 'Language' column header in the Bulk file
        adGroup.setLanguage("English");
        // 'Ad Group' column header in the Bulk file
        adGroup.setName("Women's Red Shoe Sale");
        // 'Network Distribution' column header in the Bulk file
        adGroup.setNetwork(Network.OWNED_AND_OPERATED_AND_SYNDICATED_SEARCH);
        // 'Target Setting' column header in the Bulk file
        ArrayOfSetting settings = new ArrayOfSetting();
        TargetSetting targetSetting = new TargetSetting();
        ArrayOfTargetSettingDetail targetSettingDetails = new ArrayOfTargetSettingDetail();
        TargetSettingDetail adGroupAudienceTargetSettingDetail = new TargetSettingDetail();
        adGroupAudienceTargetSettingDetail.setCriterionTypeGroup(CriterionTypeGroup.AUDIENCE);
        adGroupAudienceTargetSettingDetail.setTargetAndBid(Boolean.TRUE);
        targetSettingDetails.getTargetSettingDetails().add(adGroupAudienceTargetSettingDetail);
        targetSetting.setDetails(targetSettingDetails);
        settings.getSettings().add(targetSetting);
        adGroup.setSettings(settings);
        // 'Cpc Bid' column header in the Bulk file
        Bid bid = new Bid();
        bid.setAmount(10D);
        adGroup.setCpcBid(bid);
        // 'Start Date' column header in the Bulk file
        adGroup.setStartDate(null);
        // 'Status' column header in the Bulk file
        adGroup.setStatus(AdGroupStatus.ACTIVE);
        // 'Tracking Template' column header in the Bulk file
        adGroup.setTrackingUrlTemplate(null);
        // 'Custom Parameter' column header in the Bulk file
        adGroup.setUrlCustomParameters(getExampleCustomParameters());
        
        bulkAdGroup.setAdGroup(adGroup);
        
        return bulkAdGroup;
    }
    
    static CustomParameters getExampleCustomParameters(){
        CustomParameters customParameters = new CustomParameters();
        CustomParameter customParameter1 = new CustomParameter();
        customParameter1.setKey("promoCode");
        customParameter1.setValue("PROMO");
        ArrayOfCustomParameter parameters = new ArrayOfCustomParameter();
        parameters.getCustomParameters().add(customParameter1);
        CustomParameter customParameter2 = new CustomParameter();
        customParameter2.setKey("season");
        customParameter2.setValue("summer");
        parameters.getCustomParameters().add(customParameter2);
        customParameters.setParameters(parameters);
        
        return customParameters;
    }
}
