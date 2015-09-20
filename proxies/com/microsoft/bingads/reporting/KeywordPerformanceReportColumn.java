
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KeywordPerformanceReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="Keyword"/>
 *     &lt;enumeration value="KeywordId"/>
 *     &lt;enumeration value="AdId"/>
 *     &lt;enumeration value="AdType"/>
 *     &lt;enumeration value="DestinationUrl"/>
 *     &lt;enumeration value="CurrentMaxCpc"/>
 *     &lt;enumeration value="CurrencyCode"/>
 *     &lt;enumeration value="DeliveredMatchType"/>
 *     &lt;enumeration value="AdDistribution"/>
 *     &lt;enumeration value="Impressions"/>
 *     &lt;enumeration value="Clicks"/>
 *     &lt;enumeration value="Ctr"/>
 *     &lt;enumeration value="AverageCpc"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="AveragePosition"/>
 *     &lt;enumeration value="Conversions"/>
 *     &lt;enumeration value="ConversionRate"/>
 *     &lt;enumeration value="CostPerConversion"/>
 *     &lt;enumeration value="AverageCpm"/>
 *     &lt;enumeration value="PricingModel"/>
 *     &lt;enumeration value="BidMatchType"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="QualityScore"/>
 *     &lt;enumeration value="KeywordRelevance"/>
 *     &lt;enumeration value="LandingPageRelevance"/>
 *     &lt;enumeration value="LandingPageUserExperience"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="HistoricQualityScore"/>
 *     &lt;enumeration value="HistoricKeywordRelevance"/>
 *     &lt;enumeration value="HistoricLandingPageRelevance"/>
 *     &lt;enumeration value="HistoricLandingPageUserExperience"/>
 *     &lt;enumeration value="KeywordMatchTypeId"/>
 *     &lt;enumeration value="QualityImpact"/>
 *     &lt;enumeration value="BusinessListingId"/>
 *     &lt;enumeration value="BusinessListingName"/>
 *     &lt;enumeration value="BusinessCategoryId"/>
 *     &lt;enumeration value="BusinessCategoryName"/>
 *     &lt;enumeration value="CampaignStatus"/>
 *     &lt;enumeration value="AccountStatus"/>
 *     &lt;enumeration value="AdGroupStatus"/>
 *     &lt;enumeration value="KeywordStatus"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="TopVsOther"/>
 *     &lt;enumeration value="DeviceOS"/>
 *     &lt;enumeration value="Assists"/>
 *     &lt;enumeration value="ExtendedCost"/>
 *     &lt;enumeration value="Revenue"/>
 *     &lt;enumeration value="ReturnOnAdSpend"/>
 *     &lt;enumeration value="CostPerAssist"/>
 *     &lt;enumeration value="RevenuePerConversion"/>
 *     &lt;enumeration value="RevenuePerAssist"/>
 *     &lt;enumeration value="BounceRate"/>
 *     &lt;enumeration value="TotalVisits"/>
 *     &lt;enumeration value="AveragePagesPerVisit"/>
 *     &lt;enumeration value="AverageDurationPerVisit"/>
 *     &lt;enumeration value="TrackingTemplate"/>
 *     &lt;enumeration value="CustomParameters"/>
 *     &lt;enumeration value="FinalURL"/>
 *     &lt;enumeration value="FinalMobileURL"/>
 *     &lt;enumeration value="FinalAppURL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KeywordPerformanceReportColumn")
@XmlEnum
public enum KeywordPerformanceReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("KeywordId")
    KEYWORD_ID("KeywordId"),
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("AdType")
    AD_TYPE("AdType"),
    @XmlEnumValue("DestinationUrl")
    DESTINATION_URL("DestinationUrl"),
    @XmlEnumValue("CurrentMaxCpc")
    CURRENT_MAX_CPC("CurrentMaxCpc"),
    @XmlEnumValue("CurrencyCode")
    CURRENCY_CODE("CurrencyCode"),
    @XmlEnumValue("DeliveredMatchType")
    DELIVERED_MATCH_TYPE("DeliveredMatchType"),
    @XmlEnumValue("AdDistribution")
    AD_DISTRIBUTION("AdDistribution"),
    @XmlEnumValue("Impressions")
    IMPRESSIONS("Impressions"),
    @XmlEnumValue("Clicks")
    CLICKS("Clicks"),
    @XmlEnumValue("Ctr")
    CTR("Ctr"),
    @XmlEnumValue("AverageCpc")
    AVERAGE_CPC("AverageCpc"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("AveragePosition")
    AVERAGE_POSITION("AveragePosition"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("ConversionRate")
    CONVERSION_RATE("ConversionRate"),
    @XmlEnumValue("CostPerConversion")
    COST_PER_CONVERSION("CostPerConversion"),
    @XmlEnumValue("AverageCpm")
    AVERAGE_CPM("AverageCpm"),
    @XmlEnumValue("PricingModel")
    PRICING_MODEL("PricingModel"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("QualityScore")
    QUALITY_SCORE("QualityScore"),
    @XmlEnumValue("KeywordRelevance")
    KEYWORD_RELEVANCE("KeywordRelevance"),
    @XmlEnumValue("LandingPageRelevance")
    LANDING_PAGE_RELEVANCE("LandingPageRelevance"),
    @XmlEnumValue("LandingPageUserExperience")
    LANDING_PAGE_USER_EXPERIENCE("LandingPageUserExperience"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("HistoricQualityScore")
    HISTORIC_QUALITY_SCORE("HistoricQualityScore"),
    @XmlEnumValue("HistoricKeywordRelevance")
    HISTORIC_KEYWORD_RELEVANCE("HistoricKeywordRelevance"),
    @XmlEnumValue("HistoricLandingPageRelevance")
    HISTORIC_LANDING_PAGE_RELEVANCE("HistoricLandingPageRelevance"),
    @XmlEnumValue("HistoricLandingPageUserExperience")
    HISTORIC_LANDING_PAGE_USER_EXPERIENCE("HistoricLandingPageUserExperience"),
    @XmlEnumValue("KeywordMatchTypeId")
    KEYWORD_MATCH_TYPE_ID("KeywordMatchTypeId"),
    @XmlEnumValue("QualityImpact")
    QUALITY_IMPACT("QualityImpact"),
    @XmlEnumValue("BusinessListingId")
    BUSINESS_LISTING_ID("BusinessListingId"),
    @XmlEnumValue("BusinessListingName")
    BUSINESS_LISTING_NAME("BusinessListingName"),
    @XmlEnumValue("BusinessCategoryId")
    BUSINESS_CATEGORY_ID("BusinessCategoryId"),
    @XmlEnumValue("BusinessCategoryName")
    BUSINESS_CATEGORY_NAME("BusinessCategoryName"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus"),
    @XmlEnumValue("KeywordStatus")
    KEYWORD_STATUS("KeywordStatus"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("TopVsOther")
    TOP_VS_OTHER("TopVsOther"),
    @XmlEnumValue("DeviceOS")
    DEVICE_OS("DeviceOS"),
    @XmlEnumValue("Assists")
    ASSISTS("Assists"),
    @XmlEnumValue("ExtendedCost")
    EXTENDED_COST("ExtendedCost"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("ReturnOnAdSpend")
    RETURN_ON_AD_SPEND("ReturnOnAdSpend"),
    @XmlEnumValue("CostPerAssist")
    COST_PER_ASSIST("CostPerAssist"),
    @XmlEnumValue("RevenuePerConversion")
    REVENUE_PER_CONVERSION("RevenuePerConversion"),
    @XmlEnumValue("RevenuePerAssist")
    REVENUE_PER_ASSIST("RevenuePerAssist"),
    @XmlEnumValue("BounceRate")
    BOUNCE_RATE("BounceRate"),
    @XmlEnumValue("TotalVisits")
    TOTAL_VISITS("TotalVisits"),
    @XmlEnumValue("AveragePagesPerVisit")
    AVERAGE_PAGES_PER_VISIT("AveragePagesPerVisit"),
    @XmlEnumValue("AverageDurationPerVisit")
    AVERAGE_DURATION_PER_VISIT("AverageDurationPerVisit"),
    @XmlEnumValue("TrackingTemplate")
    TRACKING_TEMPLATE("TrackingTemplate"),
    @XmlEnumValue("CustomParameters")
    CUSTOM_PARAMETERS("CustomParameters"),
    @XmlEnumValue("FinalURL")
    FINAL_URL("FinalURL"),
    @XmlEnumValue("FinalMobileURL")
    FINAL_MOBILE_URL("FinalMobileURL"),
    @XmlEnumValue("FinalAppURL")
    FINAL_APP_URL("FinalAppURL");
    private final String value;

    KeywordPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeywordPerformanceReportColumn fromValue(String v) {
        for (KeywordPerformanceReportColumn c: KeywordPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
