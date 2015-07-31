
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrandZonePerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BrandZonePerformanceReportColumn">
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
 *     &lt;enumeration value="AdTitle"/>
 *     &lt;enumeration value="Impressions"/>
 *     &lt;enumeration value="Clicks"/>
 *     &lt;enumeration value="Ctr"/>
 *     &lt;enumeration value="Spend"/>
 *     &lt;enumeration value="DeviceType"/>
 *     &lt;enumeration value="Language"/>
 *     &lt;enumeration value="CampaignStatus"/>
 *     &lt;enumeration value="AccountStatus"/>
 *     &lt;enumeration value="AdGroupStatus"/>
 *     &lt;enumeration value="KeywordStatus"/>
 *     &lt;enumeration value="DisplayPosition"/>
 *     &lt;enumeration value="AssetId"/>
 *     &lt;enumeration value="ComponentName"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="PricingModel"/>
 *     &lt;enumeration value="DeviceOS"/>
 *     &lt;enumeration value="ComponentTitle"/>
 *     &lt;enumeration value="ComponentClicks"/>
 *     &lt;enumeration value="ComponentTotalClicks"/>
 *     &lt;enumeration value="ComponentCTR"/>
 *     &lt;enumeration value="ComponentNonBillableClicks"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BrandZonePerformanceReportColumn")
@XmlEnum
public enum BrandZonePerformanceReportColumn {

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
    @XmlEnumValue("AdTitle")
    AD_TITLE("AdTitle"),
    @XmlEnumValue("Impressions")
    IMPRESSIONS("Impressions"),
    @XmlEnumValue("Clicks")
    CLICKS("Clicks"),
    @XmlEnumValue("Ctr")
    CTR("Ctr"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("CampaignStatus")
    CAMPAIGN_STATUS("CampaignStatus"),
    @XmlEnumValue("AccountStatus")
    ACCOUNT_STATUS("AccountStatus"),
    @XmlEnumValue("AdGroupStatus")
    AD_GROUP_STATUS("AdGroupStatus"),
    @XmlEnumValue("KeywordStatus")
    KEYWORD_STATUS("KeywordStatus"),
    @XmlEnumValue("DisplayPosition")
    DISPLAY_POSITION("DisplayPosition"),
    @XmlEnumValue("AssetId")
    ASSET_ID("AssetId"),
    @XmlEnumValue("ComponentName")
    COMPONENT_NAME("ComponentName"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("PricingModel")
    PRICING_MODEL("PricingModel"),
    @XmlEnumValue("DeviceOS")
    DEVICE_OS("DeviceOS"),
    @XmlEnumValue("ComponentTitle")
    COMPONENT_TITLE("ComponentTitle"),
    @XmlEnumValue("ComponentClicks")
    COMPONENT_CLICKS("ComponentClicks"),
    @XmlEnumValue("ComponentTotalClicks")
    COMPONENT_TOTAL_CLICKS("ComponentTotalClicks"),
    @XmlEnumValue("ComponentCTR")
    COMPONENT_CTR("ComponentCTR"),
    @XmlEnumValue("ComponentNonBillableClicks")
    COMPONENT_NON_BILLABLE_CLICKS("ComponentNonBillableClicks");
    private final String value;

    BrandZonePerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BrandZonePerformanceReportColumn fromValue(String v) {
        for (BrandZonePerformanceReportColumn c: BrandZonePerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
