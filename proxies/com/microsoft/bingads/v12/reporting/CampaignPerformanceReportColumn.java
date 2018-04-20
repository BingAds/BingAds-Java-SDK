
package com.microsoft.bingads.v12.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignPerformanceReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="CampaignStatus"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="CurrencyCode"/>
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
 *     &lt;enumeration value="LowQualityClicks"/>
 *     &lt;enumeration value="LowQualityClicksPercent"/>
 *     &lt;enumeration value="LowQualityImpressions"/>
 *     &lt;enumeration value="LowQualityImpressionsPercent"/>
 *     &lt;enumeration value="LowQualityConversions"/>
 *     &lt;enumeration value="LowQualityConversionRate"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="DeviceOS"/>
 *     &lt;enumeration value="ImpressionSharePercent"/>
 *     &lt;enumeration value="ImpressionLostToBudgetPercent"/>
 *     &lt;enumeration value="ImpressionLostToRankPercent"/>
 *     &lt;enumeration value="QualityScore"/>
 *     &lt;enumeration value="ExpectedCtr"/>
 *     &lt;enumeration value="AdRelevance"/>
 *     &lt;enumeration value="LandingPageExperience"/>
 *     &lt;enumeration value="HistoricalQualityScore"/>
 *     &lt;enumeration value="HistoricalExpectedCtr"/>
 *     &lt;enumeration value="HistoricalAdRelevance"/>
 *     &lt;enumeration value="HistoricalLandingPageExperience"/>
 *     &lt;enumeration value="ImpressionLostToBidPercent"/>
 *     &lt;enumeration value="ImpressionLostToAdRelevancePercent"/>
 *     &lt;enumeration value="ImpressionLostToExpectedCtrPercent"/>
 *     &lt;enumeration value="PhoneImpressions"/>
 *     &lt;enumeration value="PhoneCalls"/>
 *     &lt;enumeration value="ManualCalls"/>
 *     &lt;enumeration value="ClickCalls"/>
 *     &lt;enumeration value="Ptr"/>
 *     &lt;enumeration value="AverageCpp"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="TopVsOther"/>
 *     &lt;enumeration value="BidMatchType"/>
 *     &lt;enumeration value="DeliveredMatchType"/>
 *     &lt;enumeration value="Assists"/>
 *     &lt;enumeration value="Revenue"/>
 *     &lt;enumeration value="ReturnOnAdSpend"/>
 *     &lt;enumeration value="CostPerAssist"/>
 *     &lt;enumeration value="RevenuePerConversion"/>
 *     &lt;enumeration value="RevenuePerAssist"/>
 *     &lt;enumeration value="TrackingTemplate"/>
 *     &lt;enumeration value="CustomParameters"/>
 *     &lt;enumeration value="AccountStatus"/>
 *     &lt;enumeration value="BudgetName"/>
 *     &lt;enumeration value="BudgetStatus"/>
 *     &lt;enumeration value="BudgetAssociationStatus"/>
 *     &lt;enumeration value="LowQualityGeneralClicks"/>
 *     &lt;enumeration value="LowQualitySophisticatedClicks"/>
 *     &lt;enumeration value="CampaignLabels"/>
 *     &lt;enumeration value="ExactMatchImpressionSharePercent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignPerformanceReportColumn")
@XmlEnum
public enum CampaignPerformanceReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("CurrencyCode")
    CURRENCY_CODE("CurrencyCode"),
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
    @XmlEnumValue("LowQualityClicks")
    LOW_QUALITY_CLICKS("LowQualityClicks"),
    @XmlEnumValue("LowQualityClicksPercent")
    LOW_QUALITY_CLICKS_PERCENT("LowQualityClicksPercent"),
    @XmlEnumValue("LowQualityImpressions")
    LOW_QUALITY_IMPRESSIONS("LowQualityImpressions"),
    @XmlEnumValue("LowQualityImpressionsPercent")
    LOW_QUALITY_IMPRESSIONS_PERCENT("LowQualityImpressionsPercent"),
    @XmlEnumValue("LowQualityConversions")
    LOW_QUALITY_CONVERSIONS("LowQualityConversions"),
    @XmlEnumValue("LowQualityConversionRate")
    LOW_QUALITY_CONVERSION_RATE("LowQualityConversionRate"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("DeviceOS")
    DEVICE_OS("DeviceOS"),
    @XmlEnumValue("ImpressionSharePercent")
    IMPRESSION_SHARE_PERCENT("ImpressionSharePercent"),
    @XmlEnumValue("ImpressionLostToBudgetPercent")
    IMPRESSION_LOST_TO_BUDGET_PERCENT("ImpressionLostToBudgetPercent"),
    @XmlEnumValue("ImpressionLostToRankPercent")
    IMPRESSION_LOST_TO_RANK_PERCENT("ImpressionLostToRankPercent"),
    @XmlEnumValue("QualityScore")
    QUALITY_SCORE("QualityScore"),
    @XmlEnumValue("ExpectedCtr")
    EXPECTED_CTR("ExpectedCtr"),
    @XmlEnumValue("AdRelevance")
    AD_RELEVANCE("AdRelevance"),
    @XmlEnumValue("LandingPageExperience")
    LANDING_PAGE_EXPERIENCE("LandingPageExperience"),
    @XmlEnumValue("HistoricalQualityScore")
    HISTORICAL_QUALITY_SCORE("HistoricalQualityScore"),
    @XmlEnumValue("HistoricalExpectedCtr")
    HISTORICAL_EXPECTED_CTR("HistoricalExpectedCtr"),
    @XmlEnumValue("HistoricalAdRelevance")
    HISTORICAL_AD_RELEVANCE("HistoricalAdRelevance"),
    @XmlEnumValue("HistoricalLandingPageExperience")
    HISTORICAL_LANDING_PAGE_EXPERIENCE("HistoricalLandingPageExperience"),
    @XmlEnumValue("ImpressionLostToBidPercent")
    IMPRESSION_LOST_TO_BID_PERCENT("ImpressionLostToBidPercent"),
    @XmlEnumValue("ImpressionLostToAdRelevancePercent")
    IMPRESSION_LOST_TO_AD_RELEVANCE_PERCENT("ImpressionLostToAdRelevancePercent"),
    @XmlEnumValue("ImpressionLostToExpectedCtrPercent")
    IMPRESSION_LOST_TO_EXPECTED_CTR_PERCENT("ImpressionLostToExpectedCtrPercent"),
    @XmlEnumValue("PhoneImpressions")
    PHONE_IMPRESSIONS("PhoneImpressions"),
    @XmlEnumValue("PhoneCalls")
    PHONE_CALLS("PhoneCalls"),
    @XmlEnumValue("ManualCalls")
    MANUAL_CALLS("ManualCalls"),
    @XmlEnumValue("ClickCalls")
    CLICK_CALLS("ClickCalls"),
    @XmlEnumValue("Ptr")
    PTR("Ptr"),
    @XmlEnumValue("AverageCpp")
    AVERAGE_CPP("AverageCpp"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("TopVsOther")
    TOP_VS_OTHER("TopVsOther"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("DeliveredMatchType")
    DELIVERED_MATCH_TYPE("DeliveredMatchType"),
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
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("BudgetName")
    BUDGET_NAME("BudgetName"),
    @XmlEnumValue("BudgetStatus")
    BUDGET_STATUS("BudgetStatus"),
    @XmlEnumValue("BudgetAssociationStatus")
    BUDGET_ASSOCIATION_STATUS("BudgetAssociationStatus"),
    @XmlEnumValue("LowQualityGeneralClicks")
    LOW_QUALITY_GENERAL_CLICKS("LowQualityGeneralClicks"),
    @XmlEnumValue("LowQualitySophisticatedClicks")
    LOW_QUALITY_SOPHISTICATED_CLICKS("LowQualitySophisticatedClicks"),
    @XmlEnumValue("CampaignLabels")
    CAMPAIGN_LABELS("CampaignLabels"),
    @XmlEnumValue("ExactMatchImpressionSharePercent")
    EXACT_MATCH_IMPRESSION_SHARE_PERCENT("ExactMatchImpressionSharePercent");
    private final String value;

    CampaignPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignPerformanceReportColumn fromValue(String v) {
        for (CampaignPerformanceReportColumn c: CampaignPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
