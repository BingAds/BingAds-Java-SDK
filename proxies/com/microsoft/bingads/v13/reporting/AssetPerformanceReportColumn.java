
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AssetPerformanceReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="AccountName"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="AdGroupName"/>
 *     <enumeration value="AssetId"/>
 *     <enumeration value="AssetContent"/>
 *     <enumeration value="AssetType"/>
 *     <enumeration value="AssetSource"/>
 *     <enumeration value="Impressions"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="Ctr"/>
 *     <enumeration value="Spend"/>
 *     <enumeration value="VideoViews"/>
 *     <enumeration value="VideoViewsAt25Percent"/>
 *     <enumeration value="VideoViewsAt50Percent"/>
 *     <enumeration value="VideoViewsAt75Percent"/>
 *     <enumeration value="CompletedVideoViews"/>
 *     <enumeration value="VideoCompletionRate"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AssetPerformanceReportColumn")
@XmlEnum
public enum AssetPerformanceReportColumn {

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
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AdGroupName")
    AD_GROUP_NAME("AdGroupName"),
    @XmlEnumValue("AssetId")
    ASSET_ID("AssetId"),
    @XmlEnumValue("AssetContent")
    ASSET_CONTENT("AssetContent"),
    @XmlEnumValue("AssetType")
    ASSET_TYPE("AssetType"),
    @XmlEnumValue("AssetSource")
    ASSET_SOURCE("AssetSource"),
    @XmlEnumValue("Impressions")
    IMPRESSIONS("Impressions"),
    @XmlEnumValue("Clicks")
    CLICKS("Clicks"),
    @XmlEnumValue("Ctr")
    CTR("Ctr"),
    @XmlEnumValue("Spend")
    SPEND("Spend"),
    @XmlEnumValue("VideoViews")
    VIDEO_VIEWS("VideoViews"),
    @XmlEnumValue("VideoViewsAt25Percent")
    VIDEO_VIEWS_AT_25_PERCENT("VideoViewsAt25Percent"),
    @XmlEnumValue("VideoViewsAt50Percent")
    VIDEO_VIEWS_AT_50_PERCENT("VideoViewsAt50Percent"),
    @XmlEnumValue("VideoViewsAt75Percent")
    VIDEO_VIEWS_AT_75_PERCENT("VideoViewsAt75Percent"),
    @XmlEnumValue("CompletedVideoViews")
    COMPLETED_VIDEO_VIEWS("CompletedVideoViews"),
    @XmlEnumValue("VideoCompletionRate")
    VIDEO_COMPLETION_RATE("VideoCompletionRate");
    private final String value;

    AssetPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AssetPerformanceReportColumn fromValue(String v) {
        for (AssetPerformanceReportColumn c: AssetPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
