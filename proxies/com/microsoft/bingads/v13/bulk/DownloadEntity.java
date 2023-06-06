
package com.microsoft.bingads.v13.bulk;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DownloadEntity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="DownloadEntity">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Campaigns"/>
 *     <enumeration value="AdGroups"/>
 *     <enumeration value="Ads"/>
 *     <enumeration value="Keywords"/>
 *     <enumeration value="CampaignNegativeKeywords"/>
 *     <enumeration value="AdGroupNegativeKeywords"/>
 *     <enumeration value="CampaignTargetCriterions"/>
 *     <enumeration value="AdGroupTargetCriterions"/>
 *     <enumeration value="CampaignNegativeSites"/>
 *     <enumeration value="AdGroupNegativeSites"/>
 *     <enumeration value="CampaignLocationAdExtensions"/>
 *     <enumeration value="CampaignCallAdExtensions"/>
 *     <enumeration value="LocationAdExtensions"/>
 *     <enumeration value="CallAdExtensions"/>
 *     <enumeration value="NegativeKeywordLists"/>
 *     <enumeration value="SharedNegativeKeywords"/>
 *     <enumeration value="CampaignNegativeKeywordListAssociations"/>
 *     <enumeration value="ImageAdExtensions"/>
 *     <enumeration value="CampaignImageAdExtensions"/>
 *     <enumeration value="AdGroupImageAdExtensions"/>
 *     <enumeration value="AppAdExtensions"/>
 *     <enumeration value="AdGroupAppAdExtensions"/>
 *     <enumeration value="CampaignAppAdExtensions"/>
 *     <enumeration value="PriceAdExtensions"/>
 *     <enumeration value="ReviewAdExtensions"/>
 *     <enumeration value="CampaignNegativeDynamicSearchAdTargets"/>
 *     <enumeration value="AdGroupProductPartitions"/>
 *     <enumeration value="CampaignProductScopes"/>
 *     <enumeration value="CampaignReviewAdExtensions"/>
 *     <enumeration value="AdGroupReviewAdExtensions"/>
 *     <enumeration value="CalloutAdExtensions"/>
 *     <enumeration value="CampaignCalloutAdExtensions"/>
 *     <enumeration value="AdGroupCalloutAdExtensions"/>
 *     <enumeration value="SitelinkAdExtensions"/>
 *     <enumeration value="CampaignSitelinkAdExtensions"/>
 *     <enumeration value="AdGroupSitelinkAdExtensions"/>
 *     <enumeration value="StructuredSnippetAdExtensions"/>
 *     <enumeration value="CampaignStructuredSnippetAdExtensions"/>
 *     <enumeration value="AdGroupStructuredSnippetAdExtensions"/>
 *     <enumeration value="RemarketingLists"/>
 *     <enumeration value="AdGroupRemarketingListAssociations"/>
 *     <enumeration value="Budgets"/>
 *     <enumeration value="TextAds"/>
 *     <enumeration value="ProductAds"/>
 *     <enumeration value="AppInstallAds"/>
 *     <enumeration value="ExpandedTextAds"/>
 *     <enumeration value="DynamicSearchAds"/>
 *     <enumeration value="AdGroupDynamicSearchAdTargets"/>
 *     <enumeration value="AdGroupNegativeDynamicSearchAdTargets"/>
 *     <enumeration value="CampaignPriceAdExtensions"/>
 *     <enumeration value="AdGroupPriceAdExtensions"/>
 *     <enumeration value="Labels"/>
 *     <enumeration value="CampaignLabels"/>
 *     <enumeration value="AdGroupLabels"/>
 *     <enumeration value="TextAdLabels"/>
 *     <enumeration value="KeywordLabels"/>
 *     <enumeration value="AdGroupNegativeRemarketingListAssociations"/>
 *     <enumeration value="CustomAudiences"/>
 *     <enumeration value="AdGroupCustomAudienceAssociations"/>
 *     <enumeration value="AdGroupNegativeCustomAudienceAssociations"/>
 *     <enumeration value="InMarketAudiences"/>
 *     <enumeration value="AdGroupInMarketAudienceAssociations"/>
 *     <enumeration value="AdGroupNegativeInMarketAudienceAssociations"/>
 *     <enumeration value="Audiences"/>
 *     <enumeration value="AdGroupAudienceAssociations"/>
 *     <enumeration value="AdGroupNegativeAudienceAssociations"/>
 *     <enumeration value="ProductAdLabels"/>
 *     <enumeration value="AppInstallAdLabels"/>
 *     <enumeration value="ExpandedTextAdLabels"/>
 *     <enumeration value="DynamicSearchAdLabels"/>
 *     <enumeration value="AccountLocationAdExtensions"/>
 *     <enumeration value="AccountImageAdExtensions"/>
 *     <enumeration value="AccountAppAdExtensions"/>
 *     <enumeration value="AccountPriceAdExtensions"/>
 *     <enumeration value="AccountReviewAdExtensions"/>
 *     <enumeration value="AccountCalloutAdExtensions"/>
 *     <enumeration value="AccountSitelinkAdExtensions"/>
 *     <enumeration value="AccountStructuredSnippetAdExtensions"/>
 *     <enumeration value="ResponsiveAds"/>
 *     <enumeration value="ResponsiveAdLabels"/>
 *     <enumeration value="ProductAudiences"/>
 *     <enumeration value="AdGroupProductAudienceAssociations"/>
 *     <enumeration value="AdGroupNegativeProductAudienceAssociations"/>
 *     <enumeration value="SimilarRemarketingLists"/>
 *     <enumeration value="AdGroupSimilarRemarketingListAssociations"/>
 *     <enumeration value="AdGroupNegativeSimilarRemarketingListAssociations"/>
 *     <enumeration value="Experiments"/>
 *     <enumeration value="ActionAdExtensions"/>
 *     <enumeration value="CampaignActionAdExtensions"/>
 *     <enumeration value="AdGroupActionAdExtensions"/>
 *     <enumeration value="AccountActionAdExtensions"/>
 *     <enumeration value="ResponsiveSearchAds"/>
 *     <enumeration value="ResponsiveSearchAdLabels"/>
 *     <enumeration value="CampaignAudienceAssociations"/>
 *     <enumeration value="CampaignNegativeAudienceAssociations"/>
 *     <enumeration value="CampaignCustomAudienceAssociations"/>
 *     <enumeration value="CampaignNegativeCustomAudienceAssociations"/>
 *     <enumeration value="CampaignInMarketAudienceAssociations"/>
 *     <enumeration value="CampaignNegativeInMarketAudienceAssociations"/>
 *     <enumeration value="CampaignProductAudienceAssociations"/>
 *     <enumeration value="CampaignNegativeProductAudienceAssociations"/>
 *     <enumeration value="CampaignRemarketingListAssociations"/>
 *     <enumeration value="CampaignNegativeRemarketingListAssociations"/>
 *     <enumeration value="CampaignSimilarRemarketingListAssociations"/>
 *     <enumeration value="CampaignNegativeSimilarRemarketingListAssociations"/>
 *     <enumeration value="Feeds"/>
 *     <enumeration value="FeedItems"/>
 *     <enumeration value="CampaignNegativeStoreCriterions"/>
 *     <enumeration value="PromotionAdExtensions"/>
 *     <enumeration value="AccountPromotionAdExtensions"/>
 *     <enumeration value="CampaignPromotionAdExtensions"/>
 *     <enumeration value="AdGroupPromotionAdExtensions"/>
 *     <enumeration value="CombinedLists"/>
 *     <enumeration value="AdGroupCombinedListAssociations"/>
 *     <enumeration value="AdGroupNegativeCombinedListAssociations"/>
 *     <enumeration value="CampaignCombinedListAssociations"/>
 *     <enumeration value="CampaignNegativeCombinedListAssociations"/>
 *     <enumeration value="Images"/>
 *     <enumeration value="CustomerLists"/>
 *     <enumeration value="AdGroupCustomerListAssociations"/>
 *     <enumeration value="AdGroupNegativeCustomerListAssociations"/>
 *     <enumeration value="CampaignCustomerListAssociations"/>
 *     <enumeration value="CampaignNegativeCustomerListAssociations"/>
 *     <enumeration value="FilterLinkAdExtensions"/>
 *     <enumeration value="AccountFilterLinkAdExtensions"/>
 *     <enumeration value="CampaignFilterLinkAdExtensions"/>
 *     <enumeration value="AdGroupFilterLinkAdExtensions"/>
 *     <enumeration value="FlyerAdExtensions"/>
 *     <enumeration value="AccountFlyerAdExtensions"/>
 *     <enumeration value="CampaignFlyerAdExtensions"/>
 *     <enumeration value="AdGroupFlyerAdExtensions"/>
 *     <enumeration value="BidStrategies"/>
 *     <enumeration value="VideoAdExtensions"/>
 *     <enumeration value="AccountVideoAdExtensions"/>
 *     <enumeration value="CampaignVideoAdExtensions"/>
 *     <enumeration value="AdGroupVideoAdExtensions"/>
 *     <enumeration value="Videos"/>
 *     <enumeration value="DisclaimerAdExtensions"/>
 *     <enumeration value="CampaignDisclaimerAdExtensions"/>
 *     <enumeration value="AdcustomizerAttribute"/>
 *     <enumeration value="CampaignAdcustomizerAttribute"/>
 *     <enumeration value="AdGroupAdcustomizerAttribute"/>
 *     <enumeration value="KeywordAdcustomizerAttribute"/>
 *     <enumeration value="CampaignConversionGoal"/>
 *     <enumeration value="AdGroupHotelListingGroups"/>
 *     <enumeration value="AssetGroups"/>
 *     <enumeration value="AudienceGroups"/>
 *     <enumeration value="CampaignNegativeWebpages"/>
 *     <enumeration value="AudienceGroupAssetGroupAssociations"/>
 *     <enumeration value="AssetGroupListingGroups"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
    FEED_ITEMS("FeedItems"),
    @XmlEnumValue("CampaignNegativeStoreCriterions")
    CAMPAIGN_NEGATIVE_STORE_CRITERIONS("CampaignNegativeStoreCriterions"),
    @XmlEnumValue("PromotionAdExtensions")
    PROMOTION_AD_EXTENSIONS("PromotionAdExtensions"),
    @XmlEnumValue("AccountPromotionAdExtensions")
    ACCOUNT_PROMOTION_AD_EXTENSIONS("AccountPromotionAdExtensions"),
    @XmlEnumValue("CampaignPromotionAdExtensions")
    CAMPAIGN_PROMOTION_AD_EXTENSIONS("CampaignPromotionAdExtensions"),
    @XmlEnumValue("AdGroupPromotionAdExtensions")
    AD_GROUP_PROMOTION_AD_EXTENSIONS("AdGroupPromotionAdExtensions"),
    @XmlEnumValue("CombinedLists")
    COMBINED_LISTS("CombinedLists"),
    @XmlEnumValue("AdGroupCombinedListAssociations")
    AD_GROUP_COMBINED_LIST_ASSOCIATIONS("AdGroupCombinedListAssociations"),
    @XmlEnumValue("AdGroupNegativeCombinedListAssociations")
    AD_GROUP_NEGATIVE_COMBINED_LIST_ASSOCIATIONS("AdGroupNegativeCombinedListAssociations"),
    @XmlEnumValue("CampaignCombinedListAssociations")
    CAMPAIGN_COMBINED_LIST_ASSOCIATIONS("CampaignCombinedListAssociations"),
    @XmlEnumValue("CampaignNegativeCombinedListAssociations")
    CAMPAIGN_NEGATIVE_COMBINED_LIST_ASSOCIATIONS("CampaignNegativeCombinedListAssociations"),
    @XmlEnumValue("Images")
    IMAGES("Images"),
    @XmlEnumValue("CustomerLists")
    CUSTOMER_LISTS("CustomerLists"),
    @XmlEnumValue("AdGroupCustomerListAssociations")
    AD_GROUP_CUSTOMER_LIST_ASSOCIATIONS("AdGroupCustomerListAssociations"),
    @XmlEnumValue("AdGroupNegativeCustomerListAssociations")
    AD_GROUP_NEGATIVE_CUSTOMER_LIST_ASSOCIATIONS("AdGroupNegativeCustomerListAssociations"),
    @XmlEnumValue("CampaignCustomerListAssociations")
    CAMPAIGN_CUSTOMER_LIST_ASSOCIATIONS("CampaignCustomerListAssociations"),
    @XmlEnumValue("CampaignNegativeCustomerListAssociations")
    CAMPAIGN_NEGATIVE_CUSTOMER_LIST_ASSOCIATIONS("CampaignNegativeCustomerListAssociations"),
    @XmlEnumValue("FilterLinkAdExtensions")
    FILTER_LINK_AD_EXTENSIONS("FilterLinkAdExtensions"),
    @XmlEnumValue("AccountFilterLinkAdExtensions")
    ACCOUNT_FILTER_LINK_AD_EXTENSIONS("AccountFilterLinkAdExtensions"),
    @XmlEnumValue("CampaignFilterLinkAdExtensions")
    CAMPAIGN_FILTER_LINK_AD_EXTENSIONS("CampaignFilterLinkAdExtensions"),
    @XmlEnumValue("AdGroupFilterLinkAdExtensions")
    AD_GROUP_FILTER_LINK_AD_EXTENSIONS("AdGroupFilterLinkAdExtensions"),
    @XmlEnumValue("FlyerAdExtensions")
    FLYER_AD_EXTENSIONS("FlyerAdExtensions"),
    @XmlEnumValue("AccountFlyerAdExtensions")
    ACCOUNT_FLYER_AD_EXTENSIONS("AccountFlyerAdExtensions"),
    @XmlEnumValue("CampaignFlyerAdExtensions")
    CAMPAIGN_FLYER_AD_EXTENSIONS("CampaignFlyerAdExtensions"),
    @XmlEnumValue("AdGroupFlyerAdExtensions")
    AD_GROUP_FLYER_AD_EXTENSIONS("AdGroupFlyerAdExtensions"),
    @XmlEnumValue("BidStrategies")
    BID_STRATEGIES("BidStrategies"),
    @XmlEnumValue("VideoAdExtensions")
    VIDEO_AD_EXTENSIONS("VideoAdExtensions"),
    @XmlEnumValue("AccountVideoAdExtensions")
    ACCOUNT_VIDEO_AD_EXTENSIONS("AccountVideoAdExtensions"),
    @XmlEnumValue("CampaignVideoAdExtensions")
    CAMPAIGN_VIDEO_AD_EXTENSIONS("CampaignVideoAdExtensions"),
    @XmlEnumValue("AdGroupVideoAdExtensions")
    AD_GROUP_VIDEO_AD_EXTENSIONS("AdGroupVideoAdExtensions"),
    @XmlEnumValue("Videos")
    VIDEOS("Videos"),
    @XmlEnumValue("DisclaimerAdExtensions")
    DISCLAIMER_AD_EXTENSIONS("DisclaimerAdExtensions"),
    @XmlEnumValue("CampaignDisclaimerAdExtensions")
    CAMPAIGN_DISCLAIMER_AD_EXTENSIONS("CampaignDisclaimerAdExtensions"),
    @XmlEnumValue("AdcustomizerAttribute")
    ADCUSTOMIZER_ATTRIBUTE("AdcustomizerAttribute"),
    @XmlEnumValue("CampaignAdcustomizerAttribute")
    CAMPAIGN_ADCUSTOMIZER_ATTRIBUTE("CampaignAdcustomizerAttribute"),
    @XmlEnumValue("AdGroupAdcustomizerAttribute")
    AD_GROUP_ADCUSTOMIZER_ATTRIBUTE("AdGroupAdcustomizerAttribute"),
    @XmlEnumValue("KeywordAdcustomizerAttribute")
    KEYWORD_ADCUSTOMIZER_ATTRIBUTE("KeywordAdcustomizerAttribute"),
    @XmlEnumValue("CampaignConversionGoal")
    CAMPAIGN_CONVERSION_GOAL("CampaignConversionGoal"),
    @XmlEnumValue("AdGroupHotelListingGroups")
    AD_GROUP_HOTEL_LISTING_GROUPS("AdGroupHotelListingGroups"),
    @XmlEnumValue("AssetGroups")
    ASSET_GROUPS("AssetGroups"),
    @XmlEnumValue("AudienceGroups")
    AUDIENCE_GROUPS("AudienceGroups"),
    @XmlEnumValue("CampaignNegativeWebpages")
    CAMPAIGN_NEGATIVE_WEBPAGES("CampaignNegativeWebpages"),
    @XmlEnumValue("AudienceGroupAssetGroupAssociations")
    AUDIENCE_GROUP_ASSET_GROUP_ASSOCIATIONS("AudienceGroupAssetGroupAssociations"),
    @XmlEnumValue("AssetGroupListingGroups")
    ASSET_GROUP_LISTING_GROUPS("AssetGroupListingGroups");
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
