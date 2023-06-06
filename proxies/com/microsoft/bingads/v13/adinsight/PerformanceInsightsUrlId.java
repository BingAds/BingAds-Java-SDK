
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformanceInsightsUrlId.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PerformanceInsightsUrlId">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RecRecommendationPage"/>
 *     <enumeration value="RecCompetitionPage"/>
 *     <enumeration value="SettingCreateOrder"/>
 *     <enumeration value="SettingRemoveHold"/>
 *     <enumeration value="SettingAddFunds"/>
 *     <enumeration value="ReportSearchTerm"/>
 *     <enumeration value="ReportPublisherWebsite"/>
 *     <enumeration value="ReportAuctionInsights"/>
 *     <enumeration value="HelpDocNetworkSetting"/>
 *     <enumeration value="HelpDocEditorial"/>
 *     <enumeration value="HelpDocWebsiteReport"/>
 *     <enumeration value="HelpDocWebsiteExclusion"/>
 *     <enumeration value="HelpDocCreateOrder"/>
 *     <enumeration value="HelpDocRemoveHold"/>
 *     <enumeration value="HelpDocAddFunds"/>
 *     <enumeration value="HelpDocRecommendation"/>
 *     <enumeration value="HelpDocAudienceNetwork"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PerformanceInsightsUrlId")
@XmlEnum
public enum PerformanceInsightsUrlId {

    @XmlEnumValue("RecRecommendationPage")
    REC_RECOMMENDATION_PAGE("RecRecommendationPage"),
    @XmlEnumValue("RecCompetitionPage")
    REC_COMPETITION_PAGE("RecCompetitionPage"),
    @XmlEnumValue("SettingCreateOrder")
    SETTING_CREATE_ORDER("SettingCreateOrder"),
    @XmlEnumValue("SettingRemoveHold")
    SETTING_REMOVE_HOLD("SettingRemoveHold"),
    @XmlEnumValue("SettingAddFunds")
    SETTING_ADD_FUNDS("SettingAddFunds"),
    @XmlEnumValue("ReportSearchTerm")
    REPORT_SEARCH_TERM("ReportSearchTerm"),
    @XmlEnumValue("ReportPublisherWebsite")
    REPORT_PUBLISHER_WEBSITE("ReportPublisherWebsite"),
    @XmlEnumValue("ReportAuctionInsights")
    REPORT_AUCTION_INSIGHTS("ReportAuctionInsights"),
    @XmlEnumValue("HelpDocNetworkSetting")
    HELP_DOC_NETWORK_SETTING("HelpDocNetworkSetting"),
    @XmlEnumValue("HelpDocEditorial")
    HELP_DOC_EDITORIAL("HelpDocEditorial"),
    @XmlEnumValue("HelpDocWebsiteReport")
    HELP_DOC_WEBSITE_REPORT("HelpDocWebsiteReport"),
    @XmlEnumValue("HelpDocWebsiteExclusion")
    HELP_DOC_WEBSITE_EXCLUSION("HelpDocWebsiteExclusion"),
    @XmlEnumValue("HelpDocCreateOrder")
    HELP_DOC_CREATE_ORDER("HelpDocCreateOrder"),
    @XmlEnumValue("HelpDocRemoveHold")
    HELP_DOC_REMOVE_HOLD("HelpDocRemoveHold"),
    @XmlEnumValue("HelpDocAddFunds")
    HELP_DOC_ADD_FUNDS("HelpDocAddFunds"),
    @XmlEnumValue("HelpDocRecommendation")
    HELP_DOC_RECOMMENDATION("HelpDocRecommendation"),
    @XmlEnumValue("HelpDocAudienceNetwork")
    HELP_DOC_AUDIENCE_NETWORK("HelpDocAudienceNetwork");
    private final String value;

    PerformanceInsightsUrlId(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerformanceInsightsUrlId fromValue(String v) {
        for (PerformanceInsightsUrlId c: PerformanceInsightsUrlId.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
