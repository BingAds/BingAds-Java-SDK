
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformanceInsightsUrlId.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PerformanceInsightsUrlId">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RecRecommendationPage"/>
 *     &lt;enumeration value="RecCompetitionPage"/>
 *     &lt;enumeration value="SettingCreateOrder"/>
 *     &lt;enumeration value="SettingRemoveHold"/>
 *     &lt;enumeration value="SettingAddFunds"/>
 *     &lt;enumeration value="ReportSearchTerm"/>
 *     &lt;enumeration value="ReportPublisherWebsite"/>
 *     &lt;enumeration value="ReportAuctionInsights"/>
 *     &lt;enumeration value="HelpDocNetworkSetting"/>
 *     &lt;enumeration value="HelpDocEditorial"/>
 *     &lt;enumeration value="HelpDocWebsiteReport"/>
 *     &lt;enumeration value="HelpDocWebsiteExclusion"/>
 *     &lt;enumeration value="HelpDocCreateOrder"/>
 *     &lt;enumeration value="HelpDocRemoveHold"/>
 *     &lt;enumeration value="HelpDocAddFunds"/>
 *     &lt;enumeration value="HelpDocRecommendation"/>
 *     &lt;enumeration value="HelpDocAudienceNetwork"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
