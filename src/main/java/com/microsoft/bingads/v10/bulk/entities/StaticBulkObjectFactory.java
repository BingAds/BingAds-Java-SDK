package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.internal.bulk.StringTable;
import com.microsoft.bingads.v10.internal.bulk.BulkObject;
import com.microsoft.bingads.v10.internal.bulk.BulkObjectFactory;
import com.microsoft.bingads.v10.internal.bulk.Creator;
import com.microsoft.bingads.v10.internal.bulk.RowValues;
import com.microsoft.bingads.v10.internal.bulk.entities.BulkAdGroupNegativeSitesIdentifier;
import com.microsoft.bingads.v10.internal.bulk.entities.BulkCampaignNegativeSitesIdentifier;
import com.microsoft.bingads.v10.internal.bulk.entities.BulkEntityIdentifier;
import com.microsoft.bingads.v10.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.v10.internal.bulk.entities.SiteLinkAdExtensionIdentifier;
import com.microsoft.bingads.v10.internal.bulk.FormatVersion;
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

    private static final Map<Class, Map<Class, String>> TARGET_IDENTIFIER_TYPE_REVERSE_MAP;

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
        m.put(StringTable.ReviewAdExtension, new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkReviewAdExtension();
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
        m.put("Campaign Age Target", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignAgeTargetBid();
            }
        }, StringTable.Target, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkCampaignTargetIdentifier(BulkCampaignAgeTargetBid.class);
            }
        }));

        m.put("Campaign DayTime Target", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignDayTimeTargetBid();
            }
        }, StringTable.Target, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkCampaignTargetIdentifier(BulkCampaignDayTimeTargetBid.class);
            }
        }));

        m.put("Campaign DeviceOS Target", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignDeviceOsTargetBid();
            }
        }, StringTable.Target, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkCampaignTargetIdentifier(BulkCampaignDeviceOsTargetBid.class);
            }
        }));

        m.put("Campaign Gender Target", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignGenderTargetBid();
            }
        }, StringTable.Target, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkCampaignTargetIdentifier(BulkCampaignGenderTargetBid.class);
            }
        }));

        m.put("Campaign Location Target", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignLocationTargetBid();
            }
        }, StringTable.Target, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkCampaignTargetIdentifier(BulkCampaignLocationTargetBid.class);
            }
        }));

        m.put("Campaign Negative Location Target", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignNegativeLocationTargetBid();
            }
        }, StringTable.Target, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkCampaignTargetIdentifier(BulkCampaignNegativeLocationTargetBid.class);
            }
        }));

        m.put("Campaign Radius Target", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkCampaignRadiusTargetBid();
            }
        }, StringTable.Target, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkCampaignTargetIdentifier(BulkCampaignRadiusTargetBid.class);
            }
        }));

        m.put("Ad Group Age Target", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupAgeTargetBid();
            }
        }, StringTable.Target, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkAdGroupTargetIdentifier(BulkAdGroupAgeTargetBid.class);
            }
        }));

        m.put("Ad Group DayTime Target", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupDayTimeTargetBid();
            }
        }, StringTable.Target, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkAdGroupTargetIdentifier(BulkAdGroupDayTimeTargetBid.class);
            }
        }));

        m.put("Ad Group DeviceOS Target", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupDeviceOsTargetBid();
            }
        }, StringTable.Target, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkAdGroupTargetIdentifier(BulkAdGroupDeviceOsTargetBid.class);
            }
        }));

        m.put("Ad Group Gender Target", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupGenderTargetBid();
            }
        }, StringTable.Target, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkAdGroupTargetIdentifier(BulkAdGroupGenderTargetBid.class);
            }
        }));

        m.put("Ad Group Location Target", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupLocationTargetBid();
            }
        }, StringTable.Target, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkAdGroupTargetIdentifier(BulkAdGroupLocationTargetBid.class);
            }
        }));

        m.put("Ad Group Negative Location Target", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupNegativeLocationTargetBid();
            }
        }, StringTable.Target, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkAdGroupTargetIdentifier(BulkAdGroupNegativeLocationTargetBid.class);
            }
        }));

        m.put("Ad Group Radius Target", new EntityInfo(new Creator<SingleRecordBulkEntity>() {
            @Override
            public SingleRecordBulkEntity create() {
                return new BulkAdGroupRadiusTargetBid();
            }
        }, StringTable.Target, new Creator<BulkEntityIdentifier>() {
            @Override
            public BulkEntityIdentifier create() {
                return new BulkAdGroupTargetIdentifier(BulkAdGroupRadiusTargetBid.class);
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

        Map<Class, Map<Class, String>> targetIdentifierTypeReverseMap = new HashMap<Class, Map<Class, String>>();

        for (Entry<String, EntityInfo> entry : INDIVIDUAL_ENTITY_MAP.entrySet()) {
            c.put(entry.getValue().getCreator().create().getClass(), entry.getKey());

            if (entry.getValue().getIdentifierCreator() != null) {
                BulkEntityIdentifier identifier = entry.getValue().getIdentifierCreator().create();

                if (identifier instanceof BulkTargetIdentifier) {
                    if (!targetIdentifierTypeReverseMap.containsKey(identifier.getClass())) {
                        targetIdentifierTypeReverseMap.put(identifier.getClass(), new HashMap<Class, String>());
                    }

                    targetIdentifierTypeReverseMap.get(identifier.getClass()).put(((BulkTargetIdentifier) identifier).getTargetBidType(), entry.getKey());
                } else {
                    c.put(identifier.getClass(), entry.getKey());
                }
            }
        }

        for (Entry<String, Supplier<BulkObject>> entry : ADDITIONAL_OBJECT_MAP.entrySet()) {
            c.put(entry.getValue().get().getClass(), entry.getKey());
        }

        TYPE_REVERSE_MAP = Collections.unmodifiableMap(c);

        TARGET_IDENTIFIER_TYPE_REVERSE_MAP = Collections.unmodifiableMap(targetIdentifierTypeReverseMap);
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

        if (bulkObject instanceof BulkTargetIdentifier) {
            BulkTargetIdentifier identifier = (BulkTargetIdentifier) bulkObject;

            return TARGET_IDENTIFIER_TYPE_REVERSE_MAP.get(identifier.getClass()).get(identifier.getTargetBidType());
        }

        return TYPE_REVERSE_MAP.get(bulkObject.getClass());
    }

}
