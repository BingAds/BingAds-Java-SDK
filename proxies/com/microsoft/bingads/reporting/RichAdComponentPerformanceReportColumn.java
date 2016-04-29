
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RichAdComponentPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RichAdComponentPerformanceReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="TimePeriod"/>
 *     &lt;enumeration value="AdId"/>
 *     &lt;enumeration value="AdTitle"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="AdGroupName"/>
 *     &lt;enumeration value="AdGroupId"/>
 *     &lt;enumeration value="RichAdSubType"/>
 *     &lt;enumeration value="ComponentType"/>
 *     &lt;enumeration value="ComponentTitle"/>
 *     &lt;enumeration value="ComponentDestinationURL"/>
 *     &lt;enumeration value="ComponentClicks"/>
 *     &lt;enumeration value="ComponentNonBillableClicks"/>
 *     &lt;enumeration value="ComponentTotalClicks"/>
 *     &lt;enumeration value="ComponentCTR"/>
 *     &lt;enumeration value="AccountStatus"/>
 *     &lt;enumeration value="CampaignStatus"/>
 *     &lt;enumeration value="AdGroupStatus"/>
 *     &lt;enumeration value="AdStatus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RichAdComponentPerformanceReportColumn")
@XmlEnum
public enum RichAdComponentPerformanceReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("AdTitle")
    AD_TITLE("AdTitle"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("RichAdSubType")
    RICH_AD_SUB_TYPE("RichAdSubType"),
    @XmlEnumValue("ComponentType")
    COMPONENT_TYPE("ComponentType"),
    @XmlEnumValue("ComponentTitle")
    COMPONENT_TITLE("ComponentTitle"),
    @XmlEnumValue("ComponentDestinationURL")
    COMPONENT_DESTINATION_URL("ComponentDestinationURL"),
    @XmlEnumValue("ComponentClicks")
    COMPONENT_CLICKS("ComponentClicks"),
    @XmlEnumValue("ComponentNonBillableClicks")
    COMPONENT_NON_BILLABLE_CLICKS("ComponentNonBillableClicks"),
    @XmlEnumValue("ComponentTotalClicks")
    COMPONENT_TOTAL_CLICKS("ComponentTotalClicks"),
    @XmlEnumValue("ComponentCTR")
    COMPONENT_CTR("ComponentCTR"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus"),
    @XmlEnumValue("AdStatus")
    AD_STATUS("AdStatus");
    private final String value;

    RichAdComponentPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RichAdComponentPerformanceReportColumn fromValue(String v) {
        for (RichAdComponentPerformanceReportColumn c: RichAdComponentPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
