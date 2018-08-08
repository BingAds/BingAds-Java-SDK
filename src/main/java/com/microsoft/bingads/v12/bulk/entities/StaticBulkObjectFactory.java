package com.microsoft.bingads.v12.bulk.entities;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.internal.bulk.BulkObject;
import com.microsoft.bingads.v12.internal.bulk.BulkObjectFactory;
import com.microsoft.bingads.v12.internal.bulk.Creator;
import com.microsoft.bingads.v12.internal.bulk.FormatVersion;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.BulkAdGroupNegativeSitesIdentifier;
import com.microsoft.bingads.v12.internal.bulk.entities.BulkCampaignNegativeSitesIdentifier;
import com.microsoft.bingads.v12.internal.bulk.entities.BulkEntityIdentifier;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Reserved for internal use.
 *
 */
public class StaticBulkObjectFactory implements BulkObjectFactory {

    private static final Map<Class<? extends BulkObject>, String> TYPE_REVERSE_MAP;

    private static final Map<String, EntityInfo> INDIVIDUAL_ENTITY_MAP;

    private static final Map<String, Supplier<BulkObject>> ADDITIONAL_OBJECT_MAP;

    static {
        //List of entities creatable by the factory
        Map<String, EntityInfo> m = new HashMap<String, EntityInfo>();
        m.put(StringTable.Account, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAccount();
            }
        }));
        m.put(StringTable.Campaign, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaign();
            }
        }));
        m.put(StringTable.AdGroup, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroup();
            }
        }));
        m.put(StringTable.ProductAd, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkProductAd();
            }
        }));
        m.put(StringTable.TextAd, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkTextAd();
            }
        }));
        m.put(StringTable.AppInstallAd, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAppInstallAd();
            }
        }));
        m.put(StringTable.ExpandedTextAd, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkExpandedTextAd();
            }
        }));
        m.put(StringTable.DynamicSearchAd, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkDynamicSearchAd();
            }
        }));
        m.put(StringTable.ResponsiveAd, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkResponsiveAd();
            }
        }));
        m.put(StringTable.CampaignNegativeDynamicSearchAdTarget, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignNegativeDynamicSearchAdTarget();
            }
        }));
        m.put(StringTable.AdGroupNegativeDynamicSearchAdTarget, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupNegativeDynamicSearchAdTarget();
            }
        }));
        m.put(StringTable.AdGroupDynamicSearchAdTarget, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupDynamicSearchAdTarget();
            }
        }));        
        m.put(StringTable.Keyword, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkKeyword();
            }
        }));
        m.put(StringTable.ImageAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkImageAdExtension();
            }
        }));
        m.put(StringTable.AccountImageAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAccountImageAdExtension();
            }
        }));
        m.put(StringTable.CampaignImageAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignImageAdExtension();
            }
        }));
        m.put(StringTable.AdGroupImageAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupImageAdExtension();
            }
        }));
        m.put(StringTable.LocationAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkLocationAdExtension();
            }
        }));
        m.put(StringTable.AccountLocationAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAccountLocationAdExtension();
            }
        }));
        m.put(StringTable.CampaignLocationAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignLocationAdExtension();
            }
        }));
        m.put(StringTable.CallAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCallAdExtension();
            }
        }));
        m.put(StringTable.CampaignCallAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignCallAdExtension();
            }
        }));
        m.put(StringTable.AppAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAppAdExtension();
            }
        }));
        m.put(StringTable.AccountAppAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAccountAppAdExtension();
            }
        }));
        m.put(StringTable.CampaignAppAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignAppAdExtension();
            }
        }));
        m.put(StringTable.AdGroupAppAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupAppAdExtension();
            }
        }));
        m.put(StringTable.CalloutAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCalloutAdExtension();
            }
        }));
        m.put(StringTable.AccountCalloutAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAccountCalloutAdExtension();
            }
        }));
        m.put(StringTable.CampaignCalloutAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignCalloutAdExtension();
            }
        }));
        m.put(StringTable.AdGroupCalloutAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupCalloutAdExtension();
            }
        }));
        m.put(StringTable.PriceAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkPriceAdExtension();
            }
        }));
        m.put(StringTable.AccountPriceAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAccountPriceAdExtension();
            }
        }));
        m.put(StringTable.CampaignPriceAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignPriceAdExtension();
            }
        }));
        m.put(StringTable.AdGroupPriceAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupPriceAdExtension();
            }
        }));
        m.put(StringTable.ReviewAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkReviewAdExtension();
            }
        }));
        m.put(StringTable.AccountReviewAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAccountReviewAdExtension();
            }
        }));
        m.put(StringTable.CampaignReviewAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignReviewAdExtension();
            }
        }));
        m.put(StringTable.AdGroupReviewAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupReviewAdExtension();
            }
        }));
        m.put(StringTable.SitelinkAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkSitelinkAdExtension();
            }
        }));     
        m.put(StringTable.AccountSitelinkAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAccountSitelinkAdExtension();
            }
        }));   
        m.put(StringTable.CampaignSitelinkAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignSitelinkAdExtension();
            }
        }));        
        m.put(StringTable.AdGroupSitelinkAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupSitelinkAdExtension();
            }
        }));
        m.put(StringTable.StructuredSnippetAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkStructuredSnippetAdExtension();
            }
        }));
        m.put(StringTable.AccountStructuredSnippetAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAccountStructuredSnippetAdExtension();
            }
        }));
        m.put(StringTable.CampaignStructuredSnippetAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignStructuredSnippetAdExtension();
            }
        }));
        m.put(StringTable.AdGroupStructuredSnippetAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupStructuredSnippetAdExtension();
            }
        }));
        m.put(StringTable.CampaignNegativeSite, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignNegativeSite();
            }
        }, StringTable.Website, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkCampaignNegativeSitesIdentifier();
            }
        }));
        m.put(StringTable.AdGroupNegativeSite, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupNegativeSite();
            }
        }, StringTable.Website, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkAdGroupNegativeSitesIdentifier();
            }
        }));
        m.put("Campaign Product Scope", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignProductScope();
            }
        }));
        m.put("Ad Group Product Partition", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupProductPartition();
            }
        }));
        
        m.put(StringTable.CampaignNegativeKeyword, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignNegativeKeyword();
            }
        }));
        m.put(StringTable.AdGroupNegativeKeyword, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupNegativeKeyword();
            }
        }));
        m.put(StringTable.NegativeKeywordList, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkNegativeKeywordList();
            }
        }));
        m.put(StringTable.ListNegativeKeyword, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkSharedNegativeKeyword();
            }
        }));
        m.put(StringTable.CampaignNegativeKeywordList, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignNegativeKeywordList();
            }
        }));
        m.put(StringTable.RemarketingList, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkRemarketingList();
            }
        }));
        m.put(StringTable.AdGroupRemarketingListAssociation, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupRemarketingListAssociation();
            }
        }));
        m.put(StringTable.AdGroupNegativeRemarketingListAssociation, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupNegativeRemarketingListAssociation();
            }
        }));
        m.put(StringTable.CustomAudience, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCustomAudience();
            }
        }));
        m.put(StringTable.AdGroupCustomAudienceAssociation, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupCustomAudienceAssociation();
            }
        }));
        m.put(StringTable.AdGroupNegativeCustomAudienceAssociation, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupNegativeCustomAudienceAssociation();
            }
        }));
        m.put(StringTable.InMarketAudience, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkInMarketAudience();
            }
        }));
        m.put(StringTable.AdGroupInMarketAudienceAssociation, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupInMarketAudienceAssociation();
            }
        }));
        m.put(StringTable.AdGroupNegativeInMarketAudienceAssociation, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupNegativeInMarketAudienceAssociation();
            }
        }));
        m.put(StringTable.ProductAudience, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkProductAudience();
            }
        }));
        m.put(StringTable.AdGroupProductAudienceAssociation, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupProductAudienceAssociation();
            }
        }));
        m.put(StringTable.AdGroupNegativeProductAudienceAssociation, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupNegativeProductAudienceAssociation();
            }
        }));
        m.put(StringTable.Budget, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkBudget();
            }
        }));
        m.put(StringTable.AdGroupAgeCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupAgeCriterion();
            }
        }));
        m.put(StringTable.AdGroupCompanyNameCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupCompanyNameCriterion();
            }
        }));
        m.put(StringTable.AdGroupIndustryCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupIndustryCriterion();
            }
        }));
        m.put(StringTable.AdGroupJobFunctionCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupJobFunctionCriterion();
            }
        }));
        m.put(StringTable.AdGroupDeviceCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupDeviceCriterion();
            }
        }));
        m.put(StringTable.AdGroupDayTimeCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupDayTimeCriterion();
            }
        }));
        m.put(StringTable.AdGroupRadiusCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupRadiusCriterion();
            }
        }));
        m.put(StringTable.AdGroupGenderCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupGenderCriterion();
            }
        }));
        m.put(StringTable.AdGroupLocationCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupLocationCriterion();
            }
        }));
        m.put(StringTable.AdGroupLocationIntentCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupLocationIntentCriterion();
            }
        }));
        m.put(StringTable.AdGroupNegativeLocationCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupNegativeLocationCriterion();
            }
        }));

        m.put(StringTable.AdGroupNegativeAgeCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupNegativeAgeCriterion();
            }
        }));
        m.put(StringTable.AdGroupNegativeCompanyNameCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupNegativeCompanyNameCriterion();
            }
        }));
        m.put(StringTable.AdGroupNegativeGenderCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupNegativeGenderCriterion();
            }
        }));
        m.put(StringTable.AdGroupNegativeIndustryCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupNegativeIndustryCriterion();
            }
        }));
        m.put(StringTable.AdGroupNegativeJobFunctionCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupNegativeJobFunctionCriterion();
            }
        }));
        m.put(StringTable.CampaignAgeCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignAgeCriterion();
            }
        }));
        m.put(StringTable.CampaignCompanyNameCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignCompanyNameCriterion();
            }
        }));
        m.put(StringTable.CampaignDeviceCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignDeviceCriterion();
            }
        }));
        m.put(StringTable.CampaignDayTimeCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignDayTimeCriterion();
            }
        }));
        m.put(StringTable.CampaignRadiusCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignRadiusCriterion();
            }
        }));
        m.put(StringTable.CampaignGenderCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignGenderCriterion();
            }
        }));
        m.put(StringTable.CampaignIndustryCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignIndustryCriterion();
            }
        }));
        m.put(StringTable.CampaignJobFunctionCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignJobFunctionCriterion();
            }
        }));
        m.put(StringTable.CampaignLocationCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignLocationCriterion();
            }
        }));
        m.put(StringTable.CampaignLocationIntentCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignLocationIntentCriterion();
            }
        }));
        m.put(StringTable.CampaignNegativeLocationCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignNegativeLocationCriterion();
            }
        }));

        m.put(StringTable.Label, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkLabel();
            }
        }));
        m.put(StringTable.CampaignLabel, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignLabel();
            }
        }));
        m.put(StringTable.AdGroupLabel, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupLabel();
            }
        }));
        m.put(StringTable.KeywordLabel, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkKeywordLabel();
            }
        }));
        m.put(StringTable.AppInstallAdLabel, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAppInstallAdLabel();
            }
        }));
        m.put(StringTable.DynamicSearchAdLabel, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkDynamicSearchAdLabel();
            }
        }));
        m.put(StringTable.ExpandedTextAdLabel, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkExpandedTextAdLabel();
            }
        }));
        m.put(StringTable.ProductAdLabel, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkProductAdLabel();
            }
        }));
        m.put(StringTable.ResponsiveAdLabel, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkResponsiveAdLabel();
            }
        }));
        m.put(StringTable.TextAdLabel, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkTextAdLabel();
            }
        }));

        m.put(StringTable.OfflineConversion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkOfflineConversion();
            }
        }));

        INDIVIDUAL_ENTITY_MAP = Collections.unmodifiableMap(m);

        Map<String, Supplier<BulkObject>> addl = new HashMap<String, Supplier<BulkObject>>();
        addl.put(StringTable.KeywordBestPositionBidType, new Supplier<BulkObject>() {
            @Override
            public BulkObject get() {
                return new BulkKeywordBestPositionBid();
            }
        });
        addl.put(StringTable.KeywordMainLineBidType, new Supplier<BulkObject>() {
            @Override
            public BulkObject get() {
                return new BulkKeywordMainLineBid();
            }
        });
        addl.put(StringTable.KeywordFirstPageBidType, new Supplier<BulkObject>() {
            @Override
            public BulkObject get() {
                return new BulkKeywordFirstPageBid();
            }
        });
        addl.put(StringTable.SemanticVersion, new Supplier<BulkObject>() {
            @Override
            public BulkObject get() {
                return new FormatVersion();
            }
        });

        ADDITIONAL_OBJECT_MAP = Collections.unmodifiableMap(addl);

        //Create reverse map
        Map<Class<? extends BulkObject>, String> c = new HashMap<Class<? extends BulkObject>, String>();
        
        for (Entry<String, EntityInfo> entry : INDIVIDUAL_ENTITY_MAP.entrySet()) {
            c.put(entry.getValue().getCreator().create().getClass(), entry.getKey());

            if (entry.getValue().getIdentifierCreator() != null) {
                BulkEntityIdentifier identifier = entry.getValue().getIdentifierCreator().create();
                   c.put(identifier.getClass(), entry.getKey());
            }
        }

        for (Entry<String, Supplier<BulkObject>> entry : ADDITIONAL_OBJECT_MAP.entrySet()) {
            c.put(entry.getValue().get().getClass(), entry.getKey());
        }

        TYPE_REVERSE_MAP = Collections.unmodifiableMap(c);
    }

    @Override
    public BulkObject createBulkObject(RowValues values) {
        String type = values.get(StringTable.Type);

        if (type.endsWith("Error")) {
            return new BulkError();
        }

        if (ADDITIONAL_OBJECT_MAP.containsKey(type)) {
            return ADDITIONAL_OBJECT_MAP.get(type).get();
        }

        if (!INDIVIDUAL_ENTITY_MAP.containsKey(type)) {
            return new UnknownBulkEntity();
        }

        EntityInfo info = INDIVIDUAL_ENTITY_MAP.get(type);

        if ("Deleted".equals(values.get(StringTable.Status))
                && !(info.getDeleteAllColumnName() == null || info.getDeleteAllColumnName().isEmpty())
                && (values.get(info.getDeleteAllColumnName()) == null || values.get(info.getDeleteAllColumnName()).isEmpty())) {
            return info.getIdentifierCreator().create();
        }

        return info.getCreator().create();
    }

    @Override
    public String getBulkRowType(BulkObject bulkObject) {
        if (bulkObject instanceof BulkError) {
            BulkError error = (BulkError)bulkObject;

            return getBulkRowType(error.getEntity()) + " Error";
        }

        return TYPE_REVERSE_MAP.get(bulkObject.getClass());
    }

}
