
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareOfVoiceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ShareOfVoiceReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AccountName"/>
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="Keyword"/>
 *     <enumeration value="DeliveredMatchType"/>
 *     <enumeration value="BidMatchType"/>
 *     <enumeration value="Language"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="KeywordId"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="Impressions"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="Ctr"/>
 *     <enumeration value="AverageCpc"/>
 *     <enumeration value="Spend"/>
 *     <enumeration value="AveragePosition"/>
 *     <enumeration value="ImpressionSharePercent"/>
 *     <enumeration value="ImpressionLostToBudgetPercent"/>
 *     <enumeration value="ImpressionLostToRankAggPercent"/>
 *     <enumeration value="CurrentMaxCpc"/>
 *     <enumeration value="QualityScore"/>
 *     <enumeration value="ExpectedCtr"/>
 *     <enumeration value="AdRelevance"/>
 *     <enumeration value="LandingPageExperience"/>
 *     <enumeration value="Conversions"/>
 *     <enumeration value="ConversionRate"/>
 *     <enumeration value="CostPerConversion"/>
 *     <enumeration value="AdDistribution"/>
 *     <enumeration value="ClickSharePercent"/>
 *     <enumeration value="DeviceType"/>
 *     <enumeration value="Network"/>
 *     <enumeration value="AccountStatus"/>
 *     <enumeration value="CampaignStatus"/>
 *     <enumeration value="AdGroupStatus"/>
 *     <enumeration value="KeywordStatus"/>
 *     <enumeration value="BidStrategyType"/>
 *     <enumeration value="KeywordLabels"/>
 *     <enumeration value="ExactMatchImpressionSharePercent"/>
 *     <enumeration value="TopImpressionShareLostToRankPercent"/>
 *     <enumeration value="TopImpressionShareLostToBudgetPercent"/>
 *     <enumeration value="AbsoluteTopImpressionShareLostToRankPercent"/>
 *     <enumeration value="AbsoluteTopImpressionShareLostToBudgetPercent"/>
 *     <enumeration value="AbsoluteTopImpressionSharePercent"/>
 *     <enumeration value="TopImpressionSharePercent"/>
 *     <enumeration value="AbsoluteTopImpressionRatePercent"/>
 *     <enumeration value="TopImpressionRatePercent"/>
 *     <enumeration value="BaseCampaignId"/>
 *     <enumeration value="AllConversions"/>
 *     <enumeration value="AllConversionRate"/>
 *     <enumeration value="AllCostPerConversion"/>
 *     <enumeration value="ViewThroughConversions"/>
 *     <enumeration value="Goal"/>
 *     <enumeration value="GoalType"/>
 *     <enumeration value="AverageCpm"/>
 *     <enumeration value="ConversionsQualified"/>
 *     <enumeration value="AllConversionsQualified"/>
 *     <enumeration value="ViewThroughConversionsQualified"/>
 *     <enumeration value="ViewThroughRevenue"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
    ALL_COST_PER_CONVERSION("AllCostPerConversion"),
    @XmlEnumValue("ViewThroughConversions")
    VIEW_THROUGH_CONVERSIONS("ViewThroughConversions"),
    @XmlEnumValue("Goal")
    GOAL("Goal"),
    @XmlEnumValue("GoalType")
    GOAL_TYPE("GoalType"),
    @XmlEnumValue("AverageCpm")
    AVERAGE_CPM("AverageCpm"),
    @XmlEnumValue("ConversionsQualified")
    CONVERSIONS_QUALIFIED("ConversionsQualified"),
    @XmlEnumValue("AllConversionsQualified")
    ALL_CONVERSIONS_QUALIFIED("AllConversionsQualified"),
    @XmlEnumValue("ViewThroughConversionsQualified")
    VIEW_THROUGH_CONVERSIONS_QUALIFIED("ViewThroughConversionsQualified"),
    @XmlEnumValue("ViewThroughRevenue")
    VIEW_THROUGH_REVENUE("ViewThroughRevenue");
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
