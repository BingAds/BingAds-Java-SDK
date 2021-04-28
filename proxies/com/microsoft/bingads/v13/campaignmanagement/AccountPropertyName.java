
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountPropertyName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountPropertyName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="TrackingUrlTemplate"/>
 *     &lt;enumeration value="MSCLKIDAutoTaggingEnabled"/>
 *     &lt;enumeration value="AdClickParallelTracking"/>
 *     &lt;enumeration value="FinalUrlSuffix"/>
 *     &lt;enumeration value="IncludeViewThroughConversions"/>
 *     &lt;enumeration value="ProfileExpansionEnabled"/>
 *     &lt;enumeration value="AllowCrawlImagesFromLandingPage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountPropertyName")
@XmlEnum
public enum AccountPropertyName {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("TrackingUrlTemplate")
    TRACKING_URL_TEMPLATE("TrackingUrlTemplate"),
    @XmlEnumValue("MSCLKIDAutoTaggingEnabled")
    MSCLKID_AUTO_TAGGING_ENABLED("MSCLKIDAutoTaggingEnabled"),
    @XmlEnumValue("AdClickParallelTracking")
    AD_CLICK_PARALLEL_TRACKING("AdClickParallelTracking"),
    @XmlEnumValue("FinalUrlSuffix")
    FINAL_URL_SUFFIX("FinalUrlSuffix"),
    @XmlEnumValue("IncludeViewThroughConversions")
    INCLUDE_VIEW_THROUGH_CONVERSIONS("IncludeViewThroughConversions"),
    @XmlEnumValue("ProfileExpansionEnabled")
    PROFILE_EXPANSION_ENABLED("ProfileExpansionEnabled"),
    @XmlEnumValue("AllowCrawlImagesFromLandingPage")
    ALLOW_CRAWL_IMAGES_FROM_LANDING_PAGE("AllowCrawlImagesFromLandingPage");
    private final String value;

    AccountPropertyName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountPropertyName fromValue(String v) {
        for (AccountPropertyName c: AccountPropertyName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
