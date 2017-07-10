package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.internal.bulk.BulkObject;
import com.microsoft.bingads.v11.internal.bulk.BulkObjectFactory;
import com.microsoft.bingads.v11.internal.bulk.Creator;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import com.microsoft.bingads.v11.internal.bulk.entities.BulkAdGroupNegativeSitesIdentifier;
import com.microsoft.bingads.v11.internal.bulk.entities.BulkCampaignNegativeSitesIdentifier;
import com.microsoft.bingads.v11.internal.bulk.entities.BulkEntityIdentifier;
import com.microsoft.bingads.v11.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.v11.internal.bulk.entities.SiteLinkAdExtensionIdentifier;
import com.microsoft.bingads.v11.internal.bulk.FormatVersion;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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
        m.put(StringTable.SiteLinksAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkSiteLink();
            }
        }, StringTable.SiteLinkExtensionOrder, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new SiteLinkAdExtensionIdentifier();
            }
        }));
        m.put(StringTable.CampaignSiteLinksAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignSiteLinkAdExtension();
            }
        }));
        m.put(StringTable.AdGroupSiteLinksAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupSiteLinkAdExtension();
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
        m.put(StringTable.Sitelink2AdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkSitelink2AdExtension();
            }
        }));     
        m.put(StringTable.AccountSitelink2AdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAccountSitelink2AdExtension();
            }
        }));   
        m.put(StringTable.CampaignSitelink2AdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignSitelink2AdExtension();
            }
        }));        
        m.put(StringTable.AdGroupSitelink2AdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupSitelink2AdExtension();
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
        
        m.put(StringTable.CampaignAgeCriterion, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignAgeCriterion();
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
