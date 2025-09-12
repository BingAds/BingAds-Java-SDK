
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidStrategyReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BidStrategyReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountStatus"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CampaignStatus"/>
 *     <enumeration value="PortfolioBidStrategyName"/>
 *     <enumeration value="PortfolioBidStrategyStatus"/>
 *     <enumeration value="BidStrategyType"/>
 *     <enumeration value="TargetCPA"/>
 *     <enumeration value="TargetRoas"/>
 *     <enumeration value="TargetImpressionShare"/>
 *     <enumeration value="NumOfCampaigns"/>
 *     <enumeration value="CurrentMaxCpc"/>
 *     <enumeration value="TargetAdPositionType"/>
 *     <enumeration value="Impressions"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="Ctr"/>
 *     <enumeration value="Spend"/>
 *     <enumeration value="Conversions"/>
 *     <enumeration value="ConversionRate"/>
 *     <enumeration value="AverageCpc"/>
 *     <enumeration value="ConversionDelay"/>
 *     <enumeration value="CPA"/>
 *     <enumeration value="ROAS"/>
 *     <enumeration value="AvgTargetCPA"/>
 *     <enumeration value="AvgTargetRoas"/>
 *     <enumeration value="AvgTargetImpressionShare"/>
 *     <enumeration value="ImpressionSharePercent"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BidStrategyReportColumn")
@XmlEnum
public enum BidStrategyReportColumn {

    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("PortfolioBidStrategyName")
    PORTFOLIO_BID_STRATEGY_NAME("PortfolioBidStrategyName"),
    @XmlEnumValue("PortfolioBidStrategyStatus")
    PORTFOLIO_BID_STRATEGY_STATUS("PortfolioBidStrategyStatus"),
    @XmlEnumValue("BidStrategyType")
    BID_STRATEGY_TYPE("BidStrategyType"),
    @XmlEnumValue("TargetCPA")
    TARGET_CPA("TargetCPA"),
    @XmlEnumValue("TargetRoas")
    TARGET_ROAS("TargetRoas"),
    @XmlEnumValue("TargetImpressionShare")
    TARGET_IMPRESSION_SHARE("TargetImpressionShare"),
    @XmlEnumValue("NumOfCampaigns")
    NUM_OF_CAMPAIGNS("NumOfCampaigns"),
    @XmlEnumValue("CurrentMaxCpc")
    CURRENT_MAX_CPC("CurrentMaxCpc"),
    @XmlEnumValue("TargetAdPositionType")
    TARGET_AD_POSITION_TYPE("TargetAdPositionType"),
    @XmlEnumValue("Impressions")
    IMPRESSIONS("Impressions"),
    @XmlEnumValue("Clicks")
    CLICKS("Clicks"),
    @XmlEnumValue("Ctr")
    CTR("Ctr"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("ConversionRate")
    CONVERSION_RATE("ConversionRate"),
    @XmlEnumValue("AverageCpc")
    AVERAGE_CPC("AverageCpc"),
    @XmlEnumValue("ConversionDelay")
    CONVERSION_DELAY("ConversionDelay"),
    CPA("CPA"),
    ROAS("ROAS"),
    @XmlEnumValue("AvgTargetCPA")
    AVG_TARGET_CPA("AvgTargetCPA"),
    @XmlEnumValue("AvgTargetRoas")
    AVG_TARGET_ROAS("AvgTargetRoas"),
    @XmlEnumValue("AvgTargetImpressionShare")
    AVG_TARGET_IMPRESSION_SHARE("AvgTargetImpressionShare"),
    @XmlEnumValue("ImpressionSharePercent")
    IMPRESSION_SHARE_PERCENT("ImpressionSharePercent");
    private final String value;

    BidStrategyReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidStrategyReportColumn fromValue(String v) {
        for (BidStrategyReportColumn c: BidStrategyReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
