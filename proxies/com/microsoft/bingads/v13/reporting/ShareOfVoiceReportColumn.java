
package com.microsoft.bingads.v13.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareOfVoiceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShareOfVoiceReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="Keyword"/>
 *     &lt;enumeration value="DeliveredMatchType"/>
 *     &lt;enumeration value="BidMatchType"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="KeywordId"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="Impressions"/>
 *     &lt;enumeration value="Clicks"/>
 *     &lt;enumeration value="Ctr"/>
 *     &lt;enumeration value="AverageCpc"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="AveragePosition"/>
 *     &lt;enumeration value="ImpressionSharePercent"/>
 *     &lt;enumeration value="ImpressionLostToBudgetPercent"/>
 *     &lt;enumeration value="ImpressionLostToRankAggPercent"/>
 *     &lt;enumeration value="CurrentMaxCpc"/>
 *     &lt;enumeration value="QualityScore"/>
 *     &lt;enumeration value="ExpectedCtr"/>
 *     &lt;enumeration value="AdRelevance"/>
 *     &lt;enumeration value="LandingPageExperience"/>
 *     &lt;enumeration value="Conversions"/>
 *     &lt;enumeration value="ConversionRate"/>
 *     &lt;enumeration value="CostPerConversion"/>
 *     &lt;enumeration value="AdDistribution"/>
 *     &lt;enumeration value="ClickSharePercent"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="AccountStatus"/>
 *     &lt;enumeration value="CampaignStatus"/>
 *     &lt;enumeration value="AdGroupStatus"/>
 *     &lt;enumeration value="KeywordStatus"/>
 *     &lt;enumeration value="BidStrategyType"/>
 *     &lt;enumeration value="KeywordLabels"/>
 *     &lt;enumeration value="ExactMatchImpressionSharePercent"/>
 *     &lt;enumeration value="TopImpressionShareLostToRankPercent"/>
 *     &lt;enumeration value="TopImpressionShareLostToBudgetPercent"/>
 *     &lt;enumeration value="AbsoluteTopImpressionShareLostToRankPercent"/>
 *     &lt;enumeration value="AbsoluteTopImpressionShareLostToBudgetPercent"/>
 *     &lt;enumeration value="AbsoluteTopImpressionSharePercent"/>
 *     &lt;enumeration value="TopImpressionSharePercent"/>
 *     &lt;enumeration value="AbsoluteTopImpressionRatePercent"/>
 *     &lt;enumeration value="TopImpressionRatePercent"/>
 *     &lt;enumeration value="BaseCampaignId"/>
 *     &lt;enumeration value="AllConversions"/>
 *     &lt;enumeration value="AllConversionRate"/>
 *     &lt;enumeration value="AllCostPerConversion"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShareOfVoiceReportColumn")
@XmlEnum
public enum ShareOfVoiceReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("DeliveredMatchType")
    DELIVERED_MATCH_TYPE("DeliveredMatchType"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("KeywordId")
    KEYWORD_ID("KeywordId"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
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
    @XmlEnumValue("ImpressionSharePercent")
    IMPRESSION_SHARE_PERCENT("ImpressionSharePercent"),
    @XmlEnumValue("ImpressionLostToBudgetPercent")
    IMPRESSION_LOST_TO_BUDGET_PERCENT("ImpressionLostToBudgetPercent"),
    @XmlEnumValue("ImpressionLostToRankAggPercent")
    IMPRESSION_LOST_TO_RANK_AGG_PERCENT("ImpressionLostToRankAggPercent"),
    @XmlEnumValue("CurrentMaxCpc")
    CURRENT_MAX_CPC("CurrentMaxCpc"),
    @XmlEnumValue("QualityScore")
    QUALITY_SCORE("QualityScore"),
    @XmlEnumValue("ExpectedCtr")
    EXPECTED_CTR("ExpectedCtr"),
    @XmlEnumValue("AdRelevance")
    AD_RELEVANCE("AdRelevance"),
    @XmlEnumValue("LandingPageExperience")
    LANDING_PAGE_EXPERIENCE("LandingPageExperience"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("ConversionRate")
    CONVERSION_RATE("ConversionRate"),
    @XmlEnumValue("CostPerConversion")
    COST_PER_CONVERSION("CostPerConversion"),
    @XmlEnumValue("AdDistribution")
    AD_DISTRIBUTION("AdDistribution"),
    @XmlEnumValue("ClickSharePercent")
    CLICK_SHARE_PERCENT("ClickSharePercent"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus"),
    @XmlEnumValue("KeywordStatus")
    KEYWORD_STATUS("KeywordStatus"),
    @XmlEnumValue("BidStrategyType")
    BID_STRATEGY_TYPE("BidStrategyType"),
    @XmlEnumValue("KeywordLabels")
    KEYWORD_LABELS("KeywordLabels"),
    @XmlEnumValue("ExactMatchImpressionSharePercent")
    EXACT_MATCH_IMPRESSION_SHARE_PERCENT("ExactMatchImpressionSharePercent"),
    @XmlEnumValue("TopImpressionShareLostToRankPercent")
    TOP_IMPRESSION_SHARE_LOST_TO_RANK_PERCENT("TopImpressionShareLostToRankPercent"),
    @XmlEnumValue("TopImpressionShareLostToBudgetPercent")
    TOP_IMPRESSION_SHARE_LOST_TO_BUDGET_PERCENT("TopImpressionShareLostToBudgetPercent"),
    @XmlEnumValue("AbsoluteTopImpressionShareLostToRankPercent")
    ABSOLUTE_TOP_IMPRESSION_SHARE_LOST_TO_RANK_PERCENT("AbsoluteTopImpressionShareLostToRankPercent"),
    @XmlEnumValue("AbsoluteTopImpressionShareLostToBudgetPercent")
    ABSOLUTE_TOP_IMPRESSION_SHARE_LOST_TO_BUDGET_PERCENT("AbsoluteTopImpressionShareLostToBudgetPercent"),
    @XmlEnumValue("AbsoluteTopImpressionSharePercent")
    ABSOLUTE_TOP_IMPRESSION_SHARE_PERCENT("AbsoluteTopImpressionSharePercent"),
    @XmlEnumValue("TopImpressionSharePercent")
    TOP_IMPRESSION_SHARE_PERCENT("TopImpressionSharePercent"),
    @XmlEnumValue("AbsoluteTopImpressionRatePercent")
    ABSOLUTE_TOP_IMPRESSION_RATE_PERCENT("AbsoluteTopImpressionRatePercent"),
    @XmlEnumValue("TopImpressionRatePercent")
    TOP_IMPRESSION_RATE_PERCENT("TopImpressionRatePercent"),
    @XmlEnumValue("BaseCampaignId")
    BASE_CAMPAIGN_ID("BaseCampaignId"),
    @XmlEnumValue("AllConversions")
    ALL_CONVERSIONS("AllConversions"),
    @XmlEnumValue("AllConversionRate")
    ALL_CONVERSION_RATE("AllConversionRate"),
    @XmlEnumValue("AllCostPerConversion")
    ALL_COST_PER_CONVERSION("AllCostPerConversion");
    private final String value;

    ShareOfVoiceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShareOfVoiceReportColumn fromValue(String v) {
        for (ShareOfVoiceReportColumn c: ShareOfVoiceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
