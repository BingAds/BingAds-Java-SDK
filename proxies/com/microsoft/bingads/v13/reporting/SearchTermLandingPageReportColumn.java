
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchTermLandingPageReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="SearchTermLandingPageReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="AdId"/>
 *     <enumeration value="AdType"/>
 *     <enumeration value="CampaignType"/>
 *     <enumeration value="Language"/>
 *     <enumeration value="SearchQuery"/>
 *     <enumeration value="Keyword"/>
 *     <enumeration value="BidMatchType"/>
 *     <enumeration value="DeliveredMatchType"/>
 *     <enumeration value="Headline"/>
 *     <enumeration value="FinalUrl"/>
 *     <enumeration value="FinalUrlSource"/>
 *     <enumeration value="Impressions"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="Ctr"/>
 *     <enumeration value="AverageCpc"/>
 *     <enumeration value="Spend"/>
 *     <enumeration value="Conversions"/>
 *     <enumeration value="ConversionRate"/>
 *     <enumeration value="CostPerConversion"/>
 *     <enumeration value="AbsoluteTopImpressionRatePercent"/>
 *     <enumeration value="TopImpressionRatePercent"/>
 *     <enumeration value="Revenue"/>
 *     <enumeration value="ReturnOnAdSpend"/>
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="ConversionsQualified"/>
 *     <enumeration value="MarketingObjective"/>
 *     <enumeration value="Channel"/>
 *     <enumeration value="SubChannel"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SearchTermLandingPageReportColumn")
@XmlEnum
public enum SearchTermLandingPageReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("AdType")
    AD_TYPE("AdType"),
    @XmlEnumValue("CampaignType")
    CAMPAIGN_TYPE("CampaignType"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("SearchQuery")
    SEARCH_QUERY("SearchQuery"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("DeliveredMatchType")
    DELIVERED_MATCH_TYPE("DeliveredMatchType"),
    @XmlEnumValue("Headline")
    HEADLINE("Headline"),
    @XmlEnumValue("FinalUrl")
    FINAL_URL("FinalUrl"),
    @XmlEnumValue("FinalUrlSource")
    FINAL_URL_SOURCE("FinalUrlSource"),
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
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("ConversionRate")
    CONVERSION_RATE("ConversionRate"),
    @XmlEnumValue("CostPerConversion")
    COST_PER_CONVERSION("CostPerConversion"),
    @XmlEnumValue("AbsoluteTopImpressionRatePercent")
    ABSOLUTE_TOP_IMPRESSION_RATE_PERCENT("AbsoluteTopImpressionRatePercent"),
    @XmlEnumValue("TopImpressionRatePercent")
    TOP_IMPRESSION_RATE_PERCENT("TopImpressionRatePercent"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("ReturnOnAdSpend")
    RETURN_ON_AD_SPEND("ReturnOnAdSpend"),
    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("ConversionsQualified")
    CONVERSIONS_QUALIFIED("ConversionsQualified"),
    @XmlEnumValue("MarketingObjective")
    MARKETING_OBJECTIVE("MarketingObjective"),
    @XmlEnumValue("Channel")
    CHANNEL("Channel"),
    @XmlEnumValue("SubChannel")
    SUB_CHANNEL("SubChannel");
    private final String value;

    SearchTermLandingPageReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchTermLandingPageReportColumn fromValue(String v) {
        for (SearchTermLandingPageReportColumn c: SearchTermLandingPageReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
