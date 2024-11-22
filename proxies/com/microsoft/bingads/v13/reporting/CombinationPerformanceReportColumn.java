
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CombinationPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CombinationPerformanceReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="AccountName"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CampaignType"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="AssetGroupId"/>
 *     <enumeration value="AssetGroupName"/>
 *     <enumeration value="AdId"/>
 *     <enumeration value="AdType"/>
 *     <enumeration value="Headline1"/>
 *     <enumeration value="Headline2"/>
 *     <enumeration value="Headline3"/>
 *     <enumeration value="CombinationLongHeadline"/>
 *     <enumeration value="Description1"/>
 *     <enumeration value="Description2"/>
 *     <enumeration value="Image"/>
 *     <enumeration value="Logo"/>
 *     <enumeration value="Impressions"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="Spend"/>
 *     <enumeration value="Ctr"/>
 *     <enumeration value="Conversions"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CombinationPerformanceReportColumn")
@XmlEnum
public enum CombinationPerformanceReportColumn {

    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignType")
    CAMPAIGN_TYPE("CampaignType"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AssetGroupId")
    ASSET_GROUP_ID("AssetGroupId"),
    @XmlEnumValue("AssetGroupName")
    ASSET_GROUP_NAME("AssetGroupName"),
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("AdType")
    AD_TYPE("AdType"),
    @XmlEnumValue("Headline1")
    HEADLINE_1("Headline1"),
    @XmlEnumValue("Headline2")
    HEADLINE_2("Headline2"),
    @XmlEnumValue("Headline3")
    HEADLINE_3("Headline3"),
    @XmlEnumValue("CombinationLongHeadline")
    COMBINATION_LONG_HEADLINE("CombinationLongHeadline"),
    @XmlEnumValue("Description1")
    DESCRIPTION_1("Description1"),
    @XmlEnumValue("Description2")
    DESCRIPTION_2("Description2"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Logo")
    LOGO("Logo"),
    @XmlEnumValue("Impressions")
    IMPRESSIONS("Impressions"),
    @XmlEnumValue("Clicks")
    CLICKS("Clicks"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("Ctr")
    CTR("Ctr"),
    @XmlEnumValue("Conversions")
    CONVERSIONS("Conversions");
    private final String value;

    CombinationPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CombinationPerformanceReportColumn fromValue(String v) {
        for (CombinationPerformanceReportColumn c: CombinationPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
