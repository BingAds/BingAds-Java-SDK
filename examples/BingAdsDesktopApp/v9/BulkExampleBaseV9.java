package com.microsoft.bingads.examples.v9;

import java.util.ArrayList;
import java.util.List;

import com.microsoft.bingads.bulk.DownloadFileType;
import com.microsoft.bingads.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.bulk.entities.BulkAppAdExtension;
import com.microsoft.bingads.bulk.entities.BulkCallAdExtension;
import com.microsoft.bingads.bulk.entities.BulkCampaign;
import com.microsoft.bingads.bulk.entities.BulkCampaignAppAdExtension;
import com.microsoft.bingads.bulk.entities.BulkCampaignCallAdExtension;
import com.microsoft.bingads.bulk.entities.BulkCampaignLocationAdExtension;
import com.microsoft.bingads.bulk.entities.BulkCampaignProductScope;
import com.microsoft.bingads.bulk.entities.BulkCampaignSiteLinkAdExtension;
import com.microsoft.bingads.bulk.entities.BulkError;
import com.microsoft.bingads.bulk.entities.BulkKeyword;
import com.microsoft.bingads.bulk.entities.BulkLocationAdExtension;
import com.microsoft.bingads.bulk.entities.BulkProductAd;
import com.microsoft.bingads.bulk.entities.BulkSiteLink;
import com.microsoft.bingads.bulk.entities.BulkSiteLinkAdExtension;
import com.microsoft.bingads.bulk.entities.BulkTextAd;
import com.microsoft.bingads.bulk.entities.PerformanceData;
import com.microsoft.bingads.bulk.entities.QualityScoreData;
import com.microsoft.bingads.campaignmanagement.SiteLink;

public class BulkExampleBaseV9 extends ExampleBaseV9 {

	/// <summary>
    /// The directory for the bulk files.
    /// </summary>
    static java.lang.String FileDirectory = "c:\\bulk\\";

    /// <summary>
    /// The name of the bulk upload file.
    /// </summary>
    static java.lang.String UploadFileName = "upload.csv";

    /// <summary>
    /// The name of the bulk upload file.
    /// </summary>
    static java.lang.String ResultFileName = "result.csv";
    
    /// <summary>
    /// The bulk file extension type.
    /// </summary>
    static DownloadFileType FileType = DownloadFileType.CSV; 
     
	public BulkExampleBaseV9() {}
	
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
			outputStatusMessage(String.format("TextAd DisplayUrl: %s\nTextAd Id: %s\n", 
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
			outputStatusMessage(String.format("Keyword Text: %s\nKeyword Id: %s\n", 
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
            outputStatusMessage(String.format("AccountId: %s\n", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s\n",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
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
            	outputStatusMessage(String.format("AdExtensionId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getAdExtensionId()));
                outputStatusMessage(String.format("EntityId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getEntityId()));
            }
            outputStatusMessage(String.format("CampaignName: %s\n", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s\n", entity.getClientId()));
            outputStatusMessage(String.format("EditorialStatus: %s\n", entity.getEditorialStatus()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Status: %s\n", entity.getStatus()));
            
            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
	}

	static void outputBulkCallAdExtensions(Iterable<BulkCallAdExtension> bulkEntities){
		for (BulkCallAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkCallAdExtension: \n");
            outputStatusMessage(String.format("AccountId: %s\n", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s\n",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
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
            	outputStatusMessage(String.format("AdExtensionId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getAdExtensionId()));
                outputStatusMessage(String.format("EntityId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getEntityId()));
            }
            outputStatusMessage(String.format("CampaignName: %s\n", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s\n", entity.getClientId()));
            outputStatusMessage(String.format("EditorialStatus: %s\n", entity.getEditorialStatus()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Status: %s\n", entity.getStatus()));
            
            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
	}

	static void outputBulkLocationAdExtensions(Iterable<BulkLocationAdExtension> bulkEntities){
		for (BulkLocationAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkLocationAdExtension: \n");
            outputStatusMessage(String.format("AccountId: %s\n", entity.getAccountId()));
            outputStatusMessage(String.format("ClientId: %s\n",entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
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
            	outputStatusMessage(String.format("AdExtensionId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getAdExtensionId()));
                outputStatusMessage(String.format("EntityId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getEntityId()));
            }
            outputStatusMessage(String.format("CampaignName: %s\n", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s\n", entity.getClientId()));
            outputStatusMessage(String.format("EditorialStatus: %s\n", entity.getEditorialStatus()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Status: %s\n", entity.getStatus()));
            
            if (entity.hasErrors())
            {
                outputBulkErrors(entity.getErrors());
            }
        }
	}
	
	static void outputBulkSiteLinkAdExtensions(Iterable<BulkSiteLinkAdExtension> bulkEntities){
		for (BulkSiteLinkAdExtension entity : bulkEntities){
            outputStatusMessage("\nBulkSiteLinkAdExtension: \n");
            outputStatusMessage(String.format("AccountId: %s\n", entity.getAccountId()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
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
            outputStatusMessage(String.format("AccountId: %s\n", entity.getAccountId()));
            outputStatusMessage(String.format("AdExtensionId: %s\n", entity.getAdExtensionId()));
            outputStatusMessage(String.format("ClientId: %s\n", entity.getClientId()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Order: %s\n", entity.getOrder()));
            outputStatusMessage(String.format("Status: %s\n", entity.getStatus()));
            outputStatusMessage(String.format("Version: %s\n", entity.getVersion()));

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
            	outputStatusMessage(String.format("AdExtensionId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getAdExtensionId()));
                outputStatusMessage(String.format("EntityId: %s\n", entity.getAdExtensionIdToEntityIdAssociation().getEntityId()));
            }
            outputStatusMessage(String.format("CampaignName: %s\n", entity.getCampaignName()));
            outputStatusMessage(String.format("ClientId: %s\n", entity.getClientId()));
            outputStatusMessage(String.format("EditorialStatus: %s\n", entity.getEditorialStatus()));
            if(entity.getLastModifiedTime() != null){
            	outputStatusMessage(String.format("LastModifiedTime: %s\n",entity.getLastModifiedTime().getTime()));
            }
            outputStatusMessage(String.format("Status: %s\n", entity.getStatus()));
            
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
			outputStatusMessage(String.format("Number: %s\n", error.getNumber()));
			if(error.getEditorialReasonCode() != null){
				outputStatusMessage(String.format("EditorialTerm: %s\n", error.getEditorialTerm()));
				outputStatusMessage(String.format("EditorialReasonCode: %s\n", error.getEditorialReasonCode()));
				outputStatusMessage(String.format("EditorialLocation: %s\n", error.getEditorialLocation()));
				outputStatusMessage(String.format("PublisherCountries: %s\n", error.getPublisherCountries()));
			}
		}
	}
}
