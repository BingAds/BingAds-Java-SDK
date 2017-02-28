
package com.microsoft.bingads.v10.bulk;

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
 *     &lt;enumeration value="CampaignNegativeSites"/>
 *     &lt;enumeration value="AdGroupNegativeSites"/>
 *     &lt;enumeration value="CampaignSiteLinksAdExtensions"/>
 *     &lt;enumeration value="CampaignLocationAdExtensions"/>
 *     &lt;enumeration value="CampaignCallAdExtensions"/>
 *     &lt;enumeration value="AdGroupSiteLinksAdExtensions"/>
 *     &lt;enumeration value="LocationAdExtensions"/>
 *     &lt;enumeration value="CallAdExtensions"/>
 *     &lt;enumeration value="SiteLinksAdExtensions"/>
 *     &lt;enumeration value="NegativeKeywordLists"/>
 *     &lt;enumeration value="SharedNegativeKeywords"/>
 *     &lt;enumeration value="CampaignNegativeKeywordListAssociations"/>
 *     &lt;enumeration value="ImageAdExtensions"/>
 *     &lt;enumeration value="CampaignImageAdExtensions"/>
 *     &lt;enumeration value="AdGroupImageAdExtensions"/>
 *     &lt;enumeration value="AppAdExtensions"/>
 *     &lt;enumeration value="AdGroupAppAdExtensions"/>
 *     &lt;enumeration value="CampaignAppAdExtensions"/>
 *     &lt;enumeration value="NewsAdExtensions"/>
 *     &lt;enumeration value="ReviewAdExtensions"/>
 *     &lt;enumeration value="CampaignNegativeDynamicSearchAdTargets"/>
 *     &lt;enumeration value="AdGroupProductPartitions"/>
 *     &lt;enumeration value="CampaignProductScopes"/>
 *     &lt;enumeration value="CampaignReviewAdExtensions"/>
 *     &lt;enumeration value="AdGroupReviewAdExtensions"/>
 *     &lt;enumeration value="CalloutAdExtensions"/>
 *     &lt;enumeration value="CampaignCalloutAdExtensions"/>
 *     &lt;enumeration value="AdGroupCalloutAdExtensions"/>
 *     &lt;enumeration value="Sitelink2AdExtensions"/>
 *     &lt;enumeration value="CampaignSitelink2AdExtensions"/>
 *     &lt;enumeration value="AdGroupSitelink2AdExtensions"/>
 *     &lt;enumeration value="ActionLinkAdExtensions"/>
 *     &lt;enumeration value="CampaignActionLinkAdExtensions"/>
 *     &lt;enumeration value="AdGroupActionLinkAdExtensions"/>
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
 *     &lt;enumeration value="CampaignTargetCriterions"/>
 *     &lt;enumeration value="AdGroupTargetCriterions"/>
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
    @XmlEnumValue("CampaignNegativeSites")
    CAMPAIGN_NEGATIVE_SITES("CampaignNegativeSites"),
    @XmlEnumValue("AdGroupNegativeSites")
    AD_GROUP_NEGATIVE_SITES("AdGroupNegativeSites"),
    @XmlEnumValue("CampaignSiteLinksAdExtensions")
    CAMPAIGN_SITE_LINKS_AD_EXTENSIONS("CampaignSiteLinksAdExtensions"),
    @XmlEnumValue("CampaignLocationAdExtensions")
    CAMPAIGN_LOCATION_AD_EXTENSIONS("CampaignLocationAdExtensions"),
    @XmlEnumValue("CampaignCallAdExtensions")
    CAMPAIGN_CALL_AD_EXTENSIONS("CampaignCallAdExtensions"),
    @XmlEnumValue("AdGroupSiteLinksAdExtensions")
    AD_GROUP_SITE_LINKS_AD_EXTENSIONS("AdGroupSiteLinksAdExtensions"),
    @XmlEnumValue("LocationAdExtensions")
    LOCATION_AD_EXTENSIONS("LocationAdExtensions"),
    @XmlEnumValue("CallAdExtensions")
    CALL_AD_EXTENSIONS("CallAdExtensions"),
    @XmlEnumValue("SiteLinksAdExtensions")
    SITE_LINKS_AD_EXTENSIONS("SiteLinksAdExtensions"),
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
    @XmlEnumValue("NewsAdExtensions")
    NEWS_AD_EXTENSIONS("NewsAdExtensions"),
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
    @XmlEnumValue("Sitelink2AdExtensions")
    SITELINK_2_AD_EXTENSIONS("Sitelink2AdExtensions"),
    @XmlEnumValue("CampaignSitelink2AdExtensions")
    CAMPAIGN_SITELINK_2_AD_EXTENSIONS("CampaignSitelink2AdExtensions"),
    @XmlEnumValue("AdGroupSitelink2AdExtensions")
    AD_GROUP_SITELINK_2_AD_EXTENSIONS("AdGroupSitelink2AdExtensions"),
    @XmlEnumValue("ActionLinkAdExtensions")
    ACTION_LINK_AD_EXTENSIONS("ActionLinkAdExtensions"),
    @XmlEnumValue("CampaignActionLinkAdExtensions")
    CAMPAIGN_ACTION_LINK_AD_EXTENSIONS("CampaignActionLinkAdExtensions"),
    @XmlEnumValue("AdGroupActionLinkAdExtensions")
    AD_GROUP_ACTION_LINK_AD_EXTENSIONS("AdGroupActionLinkAdExtensions"),
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
    @XmlEnumValue("CampaignTargetCriterions")
    CAMPAIGN_TARGET_CRITERIONS("CampaignTargetCriterions"),
    @XmlEnumValue("AdGroupTargetCriterions")
    AD_GROUP_TARGET_CRITERIONS("AdGroupTargetCriterions");
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
