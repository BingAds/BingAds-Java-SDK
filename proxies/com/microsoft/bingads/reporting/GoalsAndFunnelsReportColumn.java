
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoalsAndFunnelsReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GoalsAndFunnelsReportColumn">
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
 *     &lt;enumeration value="Goal"/>
 *     &lt;enumeration value="Step1Count"/>
 *     &lt;enumeration value="Step2Count"/>
 *     &lt;enumeration value="Step3Count"/>
 *     &lt;enumeration value="Step4Count"/>
 *     &lt;enumeration value="Step5Count"/>
 *     &lt;enumeration value="Conversions"/>
 *     &lt;enumeration value="Assists"/>
 *     &lt;enumeration value="FunnelConversionRate"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="Revenue"/>
 *     &lt;enumeration value="ReturnOnAdSpend"/>
 *     &lt;enumeration value="ExtendedCost"/>
 *     &lt;enumeration value="GoalId"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="DeviceOS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GoalsAndFunnelsReportColumn")
@XmlEnum
public enum GoalsAndFunnelsReportColumn {

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
    @XmlEnumValue("Goal")
    GOAL("Goal"),
    @XmlEnumValue("Step1Count")
    STEP_1_COUNT("Step1Count"),
    @XmlEnumValue("Step2Count")
    STEP_2_COUNT("Step2Count"),
    @XmlEnumValue("Step3Count")
    STEP_3_COUNT("Step3Count"),
    @XmlEnumValue("Step4Count")
    STEP_4_COUNT("Step4Count"),
    @XmlEnumValue("Step5Count")
    STEP_5_COUNT("Step5Count"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions"),
    @XmlEnumValue("Assists")
    ASSISTS("Assists"),
    @XmlEnumValue("FunnelConversionRate")
    FUNNEL_CONVERSION_RATE("FunnelConversionRate"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue"),
    @XmlEnumValue("ReturnOnAdSpend")
    RETURN_ON_AD_SPEND("ReturnOnAdSpend"),
    @XmlEnumValue("ExtendedCost")
    EXTENDED_COST("ExtendedCost"),
    @XmlEnumValue("GoalId")
    GOAL_ID("GoalId"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("DeviceOS")
    DEVICE_OS("DeviceOS");
    private final String value;

    GoalsAndFunnelsReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GoalsAndFunnelsReportColumn fromValue(String v) {
        for (GoalsAndFunnelsReportColumn c: GoalsAndFunnelsReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
