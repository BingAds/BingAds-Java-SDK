
package com.microsoft.bingads.v13.reporting;

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
 *     &lt;enumeration value="BidMatchType"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="QualityScore"/>
 *     &lt;enumeration value="ExpectedCtr"/>
 *     &lt;enumeration value="AdRelevance"/>
 *     &lt;enumeration value="LandingPageExperience"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="HistoricalQualityScore"/>
 *     &lt;enumeration value="HistoricalExpectedCtr"/>
 *     &lt;enumeration value="HistoricalAdRelevance"/>
 *     &lt;enumeration value="HistoricalLandingPageExperience"/>
 *     &lt;enumeration value="QualityImpact"/>
 *     &lt;enumeration value="CampaignStatus"/>
 *     &lt;enumeration value="AccountStatus"/>
 *     &lt;enumeration value="AdGroupStatus"/>
 *     &lt;enumeration value="KeywordStatus"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="TopVsOther"/>
 *     &lt;enumeration value="DeviceOS"/>
 *     &lt;enumeration value="Assists"/>
 *     &lt;enumeration value="Revenue"/>
 *     &lt;enumeration value="ReturnOnAdSpend"/>
 *     &lt;enumeration value="CostPerAssist"/>
 *     &lt;enumeration value="RevenuePerConversion"/>
 *     &lt;enumeration value="RevenuePerAssist"/>
 *     &lt;enumeration value="TrackingTemplate"/>
 *     &lt;enumeration value="CustomParameters"/>
 *     &lt;enumeration value="FinalUrl"/>
 *     &lt;enumeration value="FinalMobileUrl"/>
 *     &lt;enumeration value="FinalAppUrl"/>
 *     &lt;enumeration value="BidStrategyType"/>
 *     &lt;enumeration value="KeywordLabels"/>
 *     &lt;enumeration value="Mainline1Bid"/>
 *     &lt;enumeration value="MainlineBid"/>
 *     &lt;enumeration value="FirstPageBid"/>
 *     &lt;enumeration value="FinalUrlSuffix"/>
 *     &lt;enumeration value="BaseCampaignId"/>
 *     &lt;enumeration value="AllConversions"/>
 *     &lt;enumeration value="AllRevenue"/>
 *     &lt;enumeration value="AllConversionRate"/>
 *     &lt;enumeration value="AllCostPerConversion"/>
 *     &lt;enumeration value="AllReturnOnAdSpend"/>
 *     &lt;enumeration value="AllRevenuePerConversion"/>
 *     &lt;enumeration value="ViewThroughConversions"/>
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
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("QualityScore")
    QUALITY_SCORE("QualityScore"),
    @XmlEnumValue("ExpectedCtr")
    EXPECTED_CTR("ExpectedCtr"),
    @XmlEnumValue("AdRelevance")
    AD_RELEVANCE("AdRelevance"),
    @XmlEnumValue("LandingPageExperience")
    LANDING_PAGE_EXPERIENCE("LandingPageExperience"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("HistoricalQualityScore")
    HISTORICAL_QUALITY_SCORE("HistoricalQualityScore"),
    @XmlEnumValue("HistoricalExpectedCtr")
    HISTORICAL_EXPECTED_CTR("HistoricalExpectedCtr"),
    @XmlEnumValue("HistoricalAdRelevance")
    HISTORICAL_AD_RELEVANCE("HistoricalAdRelevance"),
    @XmlEnumValue("HistoricalLandingPageExperience")
    HISTORICAL_LANDING_PAGE_EXPERIENCE("HistoricalLandingPageExperience"),
    @XmlEnumValue("QualityImpact")
    QUALITY_IMPACT("QualityImpact"),
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
    @XmlEnumValue("TrackingTemplate")
    TRACKING_TEMPLATE("TrackingTemplate"),
    @XmlEnumValue("CustomParameters")
    CUSTOM_PARAMETERS("CustomParameters"),
    @XmlEnumValue("FinalUrl")
    FINAL_URL("FinalUrl"),
    @XmlEnumValue("FinalMobileUrl")
    FINAL_MOBILE_URL("FinalMobileUrl"),
    @XmlEnumValue("FinalAppUrl")
    FINAL_APP_URL("FinalAppUrl"),
    @XmlEnumValue("BidStrategyType")
    BID_STRATEGY_TYPE("BidStrategyType"),
    @XmlEnumValue("KeywordLabels")
    KEYWORD_LABELS("KeywordLabels"),
    @XmlEnumValue("Mainline1Bid")
    MAINLINE_1_BID("Mainline1Bid"),
    @XmlEnumValue("MainlineBid")
    MAINLINE_BID("MainlineBid"),
    @XmlEnumValue("FirstPageBid")
    FIRST_PAGE_BID("FirstPageBid"),
    @XmlEnumValue("FinalUrlSuffix")
    FINAL_URL_SUFFIX("FinalUrlSuffix"),
    @XmlEnumValue("BaseCampaignId")
    BASE_CAMPAIGN_ID("BaseCampaignId"),
    @XmlEnumValue("AllConversions")
    ALL_CONVERSIONS("AllConversions"),
    @XmlEnumValue("AllRevenue")
    ALL_REVENUE("AllRevenue"),
    @XmlEnumValue("AllConversionRate")
    ALL_CONVERSION_RATE("AllConversionRate"),
    @XmlEnumValue("AllCostPerConversion")
    ALL_COST_PER_CONVERSION("AllCostPerConversion"),
    @XmlEnumValue("AllReturnOnAdSpend")
    ALL_RETURN_ON_AD_SPEND("AllReturnOnAdSpend"),
    @XmlEnumValue("AllRevenuePerConversion")
    ALL_REVENUE_PER_CONVERSION("AllRevenuePerConversion"),
    @XmlEnumValue("ViewThroughConversions")
    VIEW_THROUGH_CONVERSIONS("ViewThroughConversions");
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
