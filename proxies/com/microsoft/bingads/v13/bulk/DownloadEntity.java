
package com.microsoft.bingads.v13.bulk;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DownloadEntity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DownloadEntity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Campaigns"/>
 *     &lt;enumeration value="AdGroups"/>
 *     &lt;enumeration value="Ads"/>
 *     &lt;enumeration value="Keywords"/>
 *     &lt;enumeration value="CampaignNegativeKeywords"/>
 *     &lt;enumeration value="AdGroupNegativeKeywords"/>
 *     &lt;enumeration value="CampaignTargetCriterions"/>
 *     &lt;enumeration value="AdGroupTargetCriterions"/>
 *     &lt;enumeration value="CampaignNegativeSites"/>
 *     &lt;enumeration value="AdGroupNegativeSites"/>
 *     &lt;enumeration value="CampaignLocationAdExtensions"/>
 *     &lt;enumeration value="CampaignCallAdExtensions"/>
 *     &lt;enumeration value="LocationAdExtensions"/>
 *     &lt;enumeration value="CallAdExtensions"/>
 *     &lt;enumeration value="NegativeKeywordLists"/>
 *     &lt;enumeration value="SharedNegativeKeywords"/>
 *     &lt;enumeration value="CampaignNegativeKeywordListAssociations"/>
 *     &lt;enumeration value="ImageAdExtensions"/>
 *     &lt;enumeration value="CampaignImageAdExtensions"/>
 *     &lt;enumeration value="AdGroupImageAdExtensions"/>
 *     &lt;enumeration value="AppAdExtensions"/>
 *     &lt;enumeration value="AdGroupAppAdExtensions"/>
 *     &lt;enumeration value="CampaignAppAdExtensions"/>
 *     &lt;enumeration value="PriceAdExtensions"/>
 *     &lt;enumeration value="ReviewAdExtensions"/>
 *     &lt;enumeration value="CampaignNegativeDynamicSearchAdTargets"/>
 *     &lt;enumeration value="AdGroupProductPartitions"/>
 *     &lt;enumeration value="CampaignProductScopes"/>
 *     &lt;enumeration value="CampaignReviewAdExtensions"/>
 *     &lt;enumeration value="AdGroupReviewAdExtensions"/>
 *     &lt;enumeration value="CalloutAdExtensions"/>
 *     &lt;enumeration value="CampaignCalloutAdExtensions"/>
 *     &lt;enumeration value="AdGroupCalloutAdExtensions"/>
 *     &lt;enumeration value="SitelinkAdExtensions"/>
 *     &lt;enumeration value="CampaignSitelinkAdExtensions"/>
 *     &lt;enumeration value="AdGroupSitelinkAdExtensions"/>
 *     &lt;enumeration value="StructuredSnippetAdExtensions"/>
 *     &lt;enumeration value="CampaignStructuredSnippetAdExtensions"/>
 *     &lt;enumeration value="AdGroupStructuredSnippetAdExtensions"/>
 *     &lt;enumeration value="RemarketingLists"/>
 *     &lt;enumeration value="AdGroupRemarketingListAssociations"/>
 *     &lt;enumeration value="Budgets"/>
 *     &lt;enumeration value="TextAds"/>
 *     &lt;enumeration value="ProductAds"/>
 *     &lt;enumeration value="AppInstallAds"/>
 *     &lt;enumeration value="ExpandedTextAds"/>
 *     &lt;enumeration value="DynamicSearchAds"/>
 *     &lt;enumeration value="AdGroupDynamicSearchAdTargets"/>
 *     &lt;enumeration value="AdGroupNegativeDynamicSearchAdTargets"/>
 *     &lt;enumeration value="CampaignPriceAdExtensions"/>
 *     &lt;enumeration value="AdGroupPriceAdExtensions"/>
 *     &lt;enumeration value="Labels"/>
 *     &lt;enumeration value="CampaignLabels"/>
 *     &lt;enumeration value="AdGroupLabels"/>
 *     &lt;enumeration value="TextAdLabels"/>
 *     &lt;enumeration value="KeywordLabels"/>
 *     &lt;enumeration value="AdGroupNegativeRemarketingListAssociations"/>
 *     &lt;enumeration value="CustomAudiences"/>
 *     &lt;enumeration value="AdGroupCustomAudienceAssociations"/>
 *     &lt;enumeration value="AdGroupNegativeCustomAudienceAssociations"/>
 *     &lt;enumeration value="InMarketAudiences"/>
 *     &lt;enumeration value="AdGroupInMarketAudienceAssociations"/>
 *     &lt;enumeration value="AdGroupNegativeInMarketAudienceAssociations"/>
 *     &lt;enumeration value="Audiences"/>
 *     &lt;enumeration value="AdGroupAudienceAssociations"/>
 *     &lt;enumeration value="AdGroupNegativeAudienceAssociations"/>
 *     &lt;enumeration value="ProductAdLabels"/>
 *     &lt;enumeration value="AppInstallAdLabels"/>
 *     &lt;enumeration value="ExpandedTextAdLabels"/>
 *     &lt;enumeration value="DynamicSearchAdLabels"/>
 *     &lt;enumeration value="AccountLocationAdExtensions"/>
 *     &lt;enumeration value="AccountImageAdExtensions"/>
 *     &lt;enumeration value="AccountAppAdExtensions"/>
 *     &lt;enumeration value="AccountPriceAdExtensions"/>
 *     &lt;enumeration value="AccountReviewAdExtensions"/>
 *     &lt;enumeration value="AccountCalloutAdExtensions"/>
 *     &lt;enumeration value="AccountSitelinkAdExtensions"/>
 *     &lt;enumeration value="AccountStructuredSnippetAdExtensions"/>
 *     &lt;enumeration value="ResponsiveAds"/>
 *     &lt;enumeration value="ResponsiveAdLabels"/>
 *     &lt;enumeration value="ProductAudiences"/>
 *     &lt;enumeration value="AdGroupProductAudienceAssociations"/>
 *     &lt;enumeration value="AdGroupNegativeProductAudienceAssociations"/>
 *     &lt;enumeration value="SimilarRemarketingLists"/>
 *     &lt;enumeration value="AdGroupSimilarRemarketingListAssociations"/>
 *     &lt;enumeration value="AdGroupNegativeSimilarRemarketingListAssociations"/>
 *     &lt;enumeration value="Experiments"/>
 *     &lt;enumeration value="ActionAdExtensions"/>
 *     &lt;enumeration value="CampaignActionAdExtensions"/>
 *     &lt;enumeration value="AdGroupActionAdExtensions"/>
 *     &lt;enumeration value="AccountActionAdExtensions"/>
 *     &lt;enumeration value="ResponsiveSearchAds"/>
 *     &lt;enumeration value="ResponsiveSearchAdLabels"/>
 *     &lt;enumeration value="CampaignAudienceAssociations"/>
 *     &lt;enumeration value="CampaignNegativeAudienceAssociations"/>
 *     &lt;enumeration value="CampaignCustomAudienceAssociations"/>
 *     &lt;enumeration value="CampaignNegativeCustomAudienceAssociations"/>
 *     &lt;enumeration value="CampaignInMarketAudienceAssociations"/>
 *     &lt;enumeration value="CampaignNegativeInMarketAudienceAssociations"/>
 *     &lt;enumeration value="CampaignProductAudienceAssociations"/>
 *     &lt;enumeration value="CampaignNegativeProductAudienceAssociations"/>
 *     &lt;enumeration value="CampaignRemarketingListAssociations"/>
 *     &lt;enumeration value="CampaignNegativeRemarketingListAssociations"/>
 *     &lt;enumeration value="CampaignSimilarRemarketingListAssociations"/>
 *     &lt;enumeration value="CampaignNegativeSimilarRemarketingListAssociations"/>
 *     &lt;enumeration value="Feeds"/>
 *     &lt;enumeration value="FeedItems"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DownloadEntity")
@XmlEnum
public enum DownloadEntity {

    @XmlEnumValue("Campaigns")
    CAMPAIGNS("Campaigns"),
    @XmlEnumValue("AdGroups")
    AD_GROUPS("AdGroups"),
    @XmlEnumValue("Ads")
    ADS("Ads"),
    @XmlEnumValue("Keywords")
    KEYWORDS("Keywords"),
    @XmlEnumValue("CampaignNegativeKeywords")
    CAMPAIGN_NEGATIVE_KEYWORDS("CampaignNegativeKeywords"),
    @XmlEnumValue("AdGroupNegativeKeywords")
    AD_GROUP_NEGATIVE_KEYWORDS("AdGroupNegativeKeywords"),
    @XmlEnumValue("CampaignTargetCriterions")
    CAMPAIGN_TARGET_CRITERIONS("CampaignTargetCriterions"),
    @XmlEnumValue("AdGroupTargetCriterions")
    AD_GROUP_TARGET_CRITERIONS("AdGroupTargetCriterions"),
    @XmlEnumValue("CampaignNegativeSites")
    CAMPAIGN_NEGATIVE_SITES("CampaignNegativeSites"),
    @XmlEnumValue("AdGroupNegativeSites")
    AD_GROUP_NEGATIVE_SITES("AdGroupNegativeSites"),
    @XmlEnumValue("CampaignLocationAdExtensions")
    CAMPAIGN_LOCATION_AD_EXTENSIONS("CampaignLocationAdExtensions"),
    @XmlEnumValue("CampaignCallAdExtensions")
    CAMPAIGN_CALL_AD_EXTENSIONS("CampaignCallAdExtensions"),
    @XmlEnumValue("LocationAdExtensions")
    LOCATION_AD_EXTENSIONS("LocationAdExtensions"),
    @XmlEnumValue("CallAdExtensions")
    CALL_AD_EXTENSIONS("CallAdExtensions"),
    @XmlEnumValue("NegativeKeywordLists")
    NEGATIVE_KEYWORD_LISTS("NegativeKeywordLists"),
    @XmlEnumValue("SharedNegativeKeywords")
    SHARED_NEGATIVE_KEYWORDS("SharedNegativeKeywords"),
    @XmlEnumValue("CampaignNegativeKeywordListAssociations")
    CAMPAIGN_NEGATIVE_KEYWORD_LIST_ASSOCIATIONS("CampaignNegativeKeywordListAssociations"),
    @XmlEnumValue("ImageAdExtensions")
    IMAGE_AD_EXTENSIONS("ImageAdExtensions"),
    @XmlEnumValue("CampaignImageAdExtensions")
    CAMPAIGN_IMAGE_AD_EXTENSIONS("CampaignImageAdExtensions"),
    @XmlEnumValue("AdGroupImageAdExtensions")
    AD_GROUP_IMAGE_AD_EXTENSIONS("AdGroupImageAdExtensions"),
    @XmlEnumValue("AppAdExtensions")
    APP_AD_EXTENSIONS("AppAdExtensions"),
    @XmlEnumValue("AdGroupAppAdExtensions")
    AD_GROUP_APP_AD_EXTENSIONS("AdGroupAppAdExtensions"),
    @XmlEnumValue("CampaignAppAdExtensions")
    CAMPAIGN_APP_AD_EXTENSIONS("CampaignAppAdExtensions"),
    @XmlEnumValue("PriceAdExtensions")
    PRICE_AD_EXTENSIONS("PriceAdExtensions"),
    @XmlEnumValue("ReviewAdExtensions")
    REVIEW_AD_EXTENSIONS("ReviewAdExtensions"),
    @XmlEnumValue("CampaignNegativeDynamicSearchAdTargets")
    CAMPAIGN_NEGATIVE_DYNAMIC_SEARCH_AD_TARGETS("CampaignNegativeDynamicSearchAdTargets"),
    @XmlEnumValue("AdGroupProductPartitions")
    AD_GROUP_PRODUCT_PARTITIONS("AdGroupProductPartitions"),
    @XmlEnumValue("CampaignProductScopes")
    CAMPAIGN_PRODUCT_SCOPES("CampaignProductScopes"),
    @XmlEnumValue("CampaignReviewAdExtensions")
    CAMPAIGN_REVIEW_AD_EXTENSIONS("CampaignReviewAdExtensions"),
    @XmlEnumValue("AdGroupReviewAdExtensions")
    AD_GROUP_REVIEW_AD_EXTENSIONS("AdGroupReviewAdExtensions"),
    @XmlEnumValue("CalloutAdExtensions")
    CALLOUT_AD_EXTENSIONS("CalloutAdExtensions"),
    @XmlEnumValue("CampaignCalloutAdExtensions")
    CAMPAIGN_CALLOUT_AD_EXTENSIONS("CampaignCalloutAdExtensions"),
    @XmlEnumValue("AdGroupCalloutAdExtensions")
    AD_GROUP_CALLOUT_AD_EXTENSIONS("AdGroupCalloutAdExtensions"),
    @XmlEnumValue("SitelinkAdExtensions")
    SITELINK_AD_EXTENSIONS("SitelinkAdExtensions"),
    @XmlEnumValue("CampaignSitelinkAdExtensions")
    CAMPAIGN_SITELINK_AD_EXTENSIONS("CampaignSitelinkAdExtensions"),
    @XmlEnumValue("AdGroupSitelinkAdExtensions")
    AD_GROUP_SITELINK_AD_EXTENSIONS("AdGroupSitelinkAdExtensions"),
    @XmlEnumValue("StructuredSnippetAdExtensions")
    STRUCTURED_SNIPPET_AD_EXTENSIONS("StructuredSnippetAdExtensions"),
    @XmlEnumValue("CampaignStructuredSnippetAdExtensions")
    CAMPAIGN_STRUCTURED_SNIPPET_AD_EXTENSIONS("CampaignStructuredSnippetAdExtensions"),
    @XmlEnumValue("AdGroupStructuredSnippetAdExtensions")
    AD_GROUP_STRUCTURED_SNIPPET_AD_EXTENSIONS("AdGroupStructuredSnippetAdExtensions"),
    @XmlEnumValue("RemarketingLists")
    REMARKETING_LISTS("RemarketingLists"),
    @XmlEnumValue("AdGroupRemarketingListAssociations")
    AD_GROUP_REMARKETING_LIST_ASSOCIATIONS("AdGroupRemarketingListAssociations"),
    @XmlEnumValue("Budgets")
    BUDGETS("Budgets"),
    @XmlEnumValue("TextAds")
    TEXT_ADS("TextAds"),
    @XmlEnumValue("ProductAds")
    PRODUCT_ADS("ProductAds"),
    @XmlEnumValue("AppInstallAds")
    APP_INSTALL_ADS("AppInstallAds"),
    @XmlEnumValue("ExpandedTextAds")
    EXPANDED_TEXT_ADS("ExpandedTextAds"),
    @XmlEnumValue("DynamicSearchAds")
    DYNAMIC_SEARCH_ADS("DynamicSearchAds"),
    @XmlEnumValue("AdGroupDynamicSearchAdTargets")
    AD_GROUP_DYNAMIC_SEARCH_AD_TARGETS("AdGroupDynamicSearchAdTargets"),
    @XmlEnumValue("AdGroupNegativeDynamicSearchAdTargets")
    AD_GROUP_NEGATIVE_DYNAMIC_SEARCH_AD_TARGETS("AdGroupNegativeDynamicSearchAdTargets"),
    @XmlEnumValue("CampaignPriceAdExtensions")
    CAMPAIGN_PRICE_AD_EXTENSIONS("CampaignPriceAdExtensions"),
    @XmlEnumValue("AdGroupPriceAdExtensions")
    AD_GROUP_PRICE_AD_EXTENSIONS("AdGroupPriceAdExtensions"),
    @XmlEnumValue("Labels")
    LABELS("Labels"),
    @XmlEnumValue("CampaignLabels")
    CAMPAIGN_LABELS("CampaignLabels"),
    @XmlEnumValue("AdGroupLabels")
    AD_GROUP_LABELS("AdGroupLabels"),
    @XmlEnumValue("TextAdLabels")
    TEXT_AD_LABELS("TextAdLabels"),
    @XmlEnumValue("KeywordLabels")
    KEYWORD_LABELS("KeywordLabels"),
    @XmlEnumValue("AdGroupNegativeRemarketingListAssociations")
    AD_GROUP_NEGATIVE_REMARKETING_LIST_ASSOCIATIONS("AdGroupNegativeRemarketingListAssociations"),
    @XmlEnumValue("CustomAudiences")
    CUSTOM_AUDIENCES("CustomAudiences"),
    @XmlEnumValue("AdGroupCustomAudienceAssociations")
    AD_GROUP_CUSTOM_AUDIENCE_ASSOCIATIONS("AdGroupCustomAudienceAssociations"),
    @XmlEnumValue("AdGroupNegativeCustomAudienceAssociations")
    AD_GROUP_NEGATIVE_CUSTOM_AUDIENCE_ASSOCIATIONS("AdGroupNegativeCustomAudienceAssociations"),
    @XmlEnumValue("InMarketAudiences")
    IN_MARKET_AUDIENCES("InMarketAudiences"),
    @XmlEnumValue("AdGroupInMarketAudienceAssociations")
    AD_GROUP_IN_MARKET_AUDIENCE_ASSOCIATIONS("AdGroupInMarketAudienceAssociations"),
    @XmlEnumValue("AdGroupNegativeInMarketAudienceAssociations")
    AD_GROUP_NEGATIVE_IN_MARKET_AUDIENCE_ASSOCIATIONS("AdGroupNegativeInMarketAudienceAssociations"),
    @XmlEnumValue("Audiences")
    AUDIENCES("Audiences"),
    @XmlEnumValue("AdGroupAudienceAssociations")
    AD_GROUP_AUDIENCE_ASSOCIATIONS("AdGroupAudienceAssociations"),
    @XmlEnumValue("AdGroupNegativeAudienceAssociations")
    AD_GROUP_NEGATIVE_AUDIENCE_ASSOCIATIONS("AdGroupNegativeAudienceAssociations"),
    @XmlEnumValue("ProductAdLabels")
    PRODUCT_AD_LABELS("ProductAdLabels"),
    @XmlEnumValue("AppInstallAdLabels")
    APP_INSTALL_AD_LABELS("AppInstallAdLabels"),
    @XmlEnumValue("ExpandedTextAdLabels")
    EXPANDED_TEXT_AD_LABELS("ExpandedTextAdLabels"),
    @XmlEnumValue("DynamicSearchAdLabels")
    DYNAMIC_SEARCH_AD_LABELS("DynamicSearchAdLabels"),
    @XmlEnumValue("AccountLocationAdExtensions")
    ACCOUNT_LOCATION_AD_EXTENSIONS("AccountLocationAdExtensions"),
    @XmlEnumValue("AccountImageAdExtensions")
    ACCOUNT_IMAGE_AD_EXTENSIONS("AccountImageAdExtensions"),
    @XmlEnumValue("AccountAppAdExtensions")
    ACCOUNT_APP_AD_EXTENSIONS("AccountAppAdExtensions"),
    @XmlEnumValue("AccountPriceAdExtensions")
    ACCOUNT_PRICE_AD_EXTENSIONS("AccountPriceAdExtensions"),
    @XmlEnumValue("AccountReviewAdExtensions")
    ACCOUNT_REVIEW_AD_EXTENSIONS("AccountReviewAdExtensions"),
    @XmlEnumValue("AccountCalloutAdExtensions")
    ACCOUNT_CALLOUT_AD_EXTENSIONS("AccountCalloutAdExtensions"),
    @XmlEnumValue("AccountSitelinkAdExtensions")
    ACCOUNT_SITELINK_AD_EXTENSIONS("AccountSitelinkAdExtensions"),
    @XmlEnumValue("AccountStructuredSnippetAdExtensions")
    ACCOUNT_STRUCTURED_SNIPPET_AD_EXTENSIONS("AccountStructuredSnippetAdExtensions"),
    @XmlEnumValue("ResponsiveAds")
    RESPONSIVE_ADS("ResponsiveAds"),
    @XmlEnumValue("ResponsiveAdLabels")
    RESPONSIVE_AD_LABELS("ResponsiveAdLabels"),
    @XmlEnumValue("ProductAudiences")
    PRODUCT_AUDIENCES("ProductAudiences"),
    @XmlEnumValue("AdGroupProductAudienceAssociations")
    AD_GROUP_PRODUCT_AUDIENCE_ASSOCIATIONS("AdGroupProductAudienceAssociations"),
    @XmlEnumValue("AdGroupNegativeProductAudienceAssociations")
    AD_GROUP_NEGATIVE_PRODUCT_AUDIENCE_ASSOCIATIONS("AdGroupNegativeProductAudienceAssociations"),
    @XmlEnumValue("SimilarRemarketingLists")
    SIMILAR_REMARKETING_LISTS("SimilarRemarketingLists"),
    @XmlEnumValue("AdGroupSimilarRemarketingListAssociations")
    AD_GROUP_SIMILAR_REMARKETING_LIST_ASSOCIATIONS("AdGroupSimilarRemarketingListAssociations"),
    @XmlEnumValue("AdGroupNegativeSimilarRemarketingListAssociations")
    AD_GROUP_NEGATIVE_SIMILAR_REMARKETING_LIST_ASSOCIATIONS("AdGroupNegativeSimilarRemarketingListAssociations"),
    @XmlEnumValue("Experiments")
    EXPERIMENTS("Experiments"),
    @XmlEnumValue("ActionAdExtensions")
    ACTION_AD_EXTENSIONS("ActionAdExtensions"),
    @XmlEnumValue("CampaignActionAdExtensions")
    CAMPAIGN_ACTION_AD_EXTENSIONS("CampaignActionAdExtensions"),
    @XmlEnumValue("AdGroupActionAdExtensions")
    AD_GROUP_ACTION_AD_EXTENSIONS("AdGroupActionAdExtensions"),
    @XmlEnumValue("AccountActionAdExtensions")
    ACCOUNT_ACTION_AD_EXTENSIONS("AccountActionAdExtensions"),
    @XmlEnumValue("ResponsiveSearchAds")
    RESPONSIVE_SEARCH_ADS("ResponsiveSearchAds"),
    @XmlEnumValue("ResponsiveSearchAdLabels")
    RESPONSIVE_SEARCH_AD_LABELS("ResponsiveSearchAdLabels"),
    @XmlEnumValue("CampaignAudienceAssociations")
    CAMPAIGN_AUDIENCE_ASSOCIATIONS("CampaignAudienceAssociations"),
    @XmlEnumValue("CampaignNegativeAudienceAssociations")
    CAMPAIGN_NEGATIVE_AUDIENCE_ASSOCIATIONS("CampaignNegativeAudienceAssociations"),
    @XmlEnumValue("CampaignCustomAudienceAssociations")
    CAMPAIGN_CUSTOM_AUDIENCE_ASSOCIATIONS("CampaignCustomAudienceAssociations"),
    @XmlEnumValue("CampaignNegativeCustomAudienceAssociations")
    CAMPAIGN_NEGATIVE_CUSTOM_AUDIENCE_ASSOCIATIONS("CampaignNegativeCustomAudienceAssociations"),
    @XmlEnumValue("CampaignInMarketAudienceAssociations")
    CAMPAIGN_IN_MARKET_AUDIENCE_ASSOCIATIONS("CampaignInMarketAudienceAssociations"),
    @XmlEnumValue("CampaignNegativeInMarketAudienceAssociations")
    CAMPAIGN_NEGATIVE_IN_MARKET_AUDIENCE_ASSOCIATIONS("CampaignNegativeInMarketAudienceAssociations"),
    @XmlEnumValue("CampaignProductAudienceAssociations")
    CAMPAIGN_PRODUCT_AUDIENCE_ASSOCIATIONS("CampaignProductAudienceAssociations"),
    @XmlEnumValue("CampaignNegativeProductAudienceAssociations")
    CAMPAIGN_NEGATIVE_PRODUCT_AUDIENCE_ASSOCIATIONS("CampaignNegativeProductAudienceAssociations"),
    @XmlEnumValue("CampaignRemarketingListAssociations")
    CAMPAIGN_REMARKETING_LIST_ASSOCIATIONS("CampaignRemarketingListAssociations"),
    @XmlEnumValue("CampaignNegativeRemarketingListAssociations")
    CAMPAIGN_NEGATIVE_REMARKETING_LIST_ASSOCIATIONS("CampaignNegativeRemarketingListAssociations"),
    @XmlEnumValue("CampaignSimilarRemarketingListAssociations")
    CAMPAIGN_SIMILAR_REMARKETING_LIST_ASSOCIATIONS("CampaignSimilarRemarketingListAssociations"),
    @XmlEnumValue("CampaignNegativeSimilarRemarketingListAssociations")
    CAMPAIGN_NEGATIVE_SIMILAR_REMARKETING_LIST_ASSOCIATIONS("CampaignNegativeSimilarRemarketingListAssociations"),
    @XmlEnumValue("Feeds")
    FEEDS("Feeds"),
    @XmlEnumValue("FeedItems")
    FEED_ITEMS("FeedItems");
    private final String value;

    DownloadEntity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DownloadEntity fromValue(String v) {
        for (DownloadEntity c: DownloadEntity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
