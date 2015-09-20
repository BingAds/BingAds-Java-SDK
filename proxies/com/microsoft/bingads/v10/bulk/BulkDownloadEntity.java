package com.microsoft.bingads.v10.bulk;

/**
 * Enum class for BulkDownloadEntity.
 */
public enum BulkDownloadEntity {

    CAMPAIGNS("Campaigns"),
    AD_GROUPS("AdGroups"),
    ADS("Ads"),
    KEYWORDS("Keywords"),
    CAMPAIGN_NEGATIVE_KEYWORDS("CampaignNegativeKeywords"),
    AD_GROUP_NEGATIVE_KEYWORDS("AdGroupNegativeKeywords"),
    CAMPAIGN_TARGETS("CampaignTargets"),
    AD_GROUP_TARGETS("AdGroupTargets"),
    CAMPAIGN_NEGATIVE_SITES("CampaignNegativeSites"),
    AD_GROUP_NEGATIVE_SITES("AdGroupNegativeSites"),
    CAMPAIGN_SITE_LINKS_AD_EXTENSIONS("CampaignSiteLinksAdExtensions"),
    CAMPAIGN_LOCATION_AD_EXTENSIONS("CampaignLocationAdExtensions"),
    CAMPAIGN_CALL_AD_EXTENSIONS("CampaignCallAdExtensions"),
    AD_GROUP_SITE_LINKS_AD_EXTENSIONS("AdGroupSiteLinksAdExtensions"),
    LOCATION_AD_EXTENSIONS("LocationAdExtensions"),
    CALL_AD_EXTENSIONS("CallAdExtensions"),
    SITE_LINKS_AD_EXTENSIONS("SiteLinksAdExtensions"),
    NEGATIVE_KEYWORD_LISTS("NegativeKeywordLists"),
    SHARED_NEGATIVE_KEYWORDS("SharedNegativeKeywords"),
    CAMPAIGN_NEGATIVE_KEYWORD_LIST_ASSOCIATIONS("CampaignNegativeKeywordListAssociations"),
    IMAGE_AD_EXTENSIONS("ImageAdExtensions"),
    CAMPAIGN_IMAGE_AD_EXTENSIONS("CampaignImageAdExtensions"),
    AD_GROUP_IMAGE_AD_EXTENSIONS("AdGroupImageAdExtensions"),
    APP_AD_EXTENSIONS("AppAdExtensions"),
    AD_GROUP_APP_AD_EXTENSIONS("AdGroupAppAdExtensions"),
    CAMPAIGN_APP_AD_EXTENSIONS("CampaignAppAdExtensions"),
    AD_GROUP_PRODUCT_PARTITIONS("AdGroupProductPartitions"),
    CAMPAIGN_PRODUCT_SCOPES("CampaignProductScopes");
        
    private final String value;

    BulkDownloadEntity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BulkDownloadEntity fromValue(String v) {
        for (BulkDownloadEntity c : BulkDownloadEntity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}