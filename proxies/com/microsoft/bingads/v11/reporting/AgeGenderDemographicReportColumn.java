
package com.microsoft.bingads.v11.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgeGenderDemographicReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgeGenderDemographicReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="AdDistribution"/>
 *     &lt;enumeration value="AgeGroup"/>
 *     &lt;enumeration value="Gender"/>
 *     &lt;enumeration value="EstimatedImpressionPercent"/>
 *     &lt;enumeration value="EstimatedClickPercent"/>
 *     &lt;enumeration value="EstimatedCtr"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="EstimatedImpressions"/>
 *     &lt;enumeration value="EstimatedClicks"/>
 *     &lt;enumeration value="EstimatedConversions"/>
 *     &lt;enumeration value="EstimatedConversionRate"/>
 *     &lt;enumeration value="AccountStatus"/>
 *     &lt;enumeration value="CampaignStatus"/>
 *     &lt;enumeration value="AdGroupStatus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgeGenderDemographicReportColumn")
@XmlEnum
public enum AgeGenderDemographicReportColumn {

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
    @XmlEnumValue("AdDistribution")
    AD_DISTRIBUTION("AdDistribution"),
    @XmlEnumValue("AgeGroup")
    AGE_GROUP("AgeGroup"),
    @XmlEnumValue("Gender")
    GENDER("Gender"),
    @XmlEnumValue("EstimatedImpressionPercent")
    ESTIMATED_IMPRESSION_PERCENT("EstimatedImpressionPercent"),
    @XmlEnumValue("EstimatedClickPercent")
    ESTIMATED_CLICK_PERCENT("EstimatedClickPercent"),
    @XmlEnumValue("EstimatedCtr")
    ESTIMATED_CTR("EstimatedCtr"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("EstimatedImpressions")
    ESTIMATED_IMPRESSIONS("EstimatedImpressions"),
    @XmlEnumValue("EstimatedClicks")
    ESTIMATED_CLICKS("EstimatedClicks"),
    @XmlEnumValue("EstimatedConversions")
    ESTIMATED_CONVERSIONS("EstimatedConversions"),
    @XmlEnumValue("EstimatedConversionRate")
    ESTIMATED_CONVERSION_RATE("EstimatedConversionRate"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus");
    private final String value;

    AgeGenderDemographicReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgeGenderDemographicReportColumn fromValue(String v) {
        for (AgeGenderDemographicReportColumn c: AgeGenderDemographicReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
