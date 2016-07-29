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
    REVIEW_AD_EXTENSIONS("ReviewAdExtensions"),
    AD_GROUP_PRODUCT_PARTITIONS("AdGroupProductPartitions"),
    CAMPAIGN_PRODUCT_SCOPES("CampaignProductScopes"),
    CAMPAIGN_REVIEW_AD_EXTENSIONS("CampaignReviewAdExtensions"),
    AD_GROUP_REVIEW_AD_EXTENSIONS("AdGroupReviewAdExtensions"),
    CALLOUT_AD_EXTENSIONS("CalloutAdExtensions"),
    CAMPAIGN_CALLOUT_AD_EXTENSIONS("CampaignCalloutAdExtensions"),
    AD_GROUP_CALLOUT_AD_EXTENSIONS("AdGroupCalloutAdExtensions"),
    SITELINK2_AD_EXTENSIONS("Sitelink2AdExtensions"),
    CAMPAIGN_SITELINK2_AD_EXTENSIONS("CampaignSitelink2AdExtensions"),
    AD_GROUP_SITELINK2_AD_EXTENSIONS("AdGroupSitelink2AdExtensions"),
    STRUCTURED_SNIPPET_AD_EXTENSIONS("StructuredSnippetAdExtensions"),
    CAMPAIGN_STRUCTURED_SNIPPET_AD_EXTENSIONS("CampaignStructuredSnippetAdExtensions"),
    AD_GROUP_STRUCTURED_SNIPPET_AD_EXTENSIONS("AdGroupStructuredSnippetAdExtensions"),
    REMARKETING_LISTS("RemarketingLists"),
    AD_GROUP_REMARKETING_LIST_ASSOCIATIONS("AdGroupRemarketingListAssociations"),
    BUDGETS("Budgets"),
    TEXT_ADS("TextAds"),
    PRODUCT_ADS("ProductAds"),
    APP_INSTALL_ADS("AppInstallAds"),
    EXPANDED_TEXT_ADS("ExpandedTextAds");
        
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