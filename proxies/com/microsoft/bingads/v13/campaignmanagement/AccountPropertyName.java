
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
 *     &lt;enumeration value="AllowImageAutoRetrieve"/>
 *     &lt;enumeration value="AutoApplyRecommendations"/>
 *     &lt;enumeration value="IncludeAutoBiddingViewThroughConversions"/>
 *     &lt;enumeration value="AutoBiddingViewThroughConversionsValueAttributionWeight"/>
 *     &lt;enumeration value="LoopBackWindowForViewThroughConversions"/>
 *     &lt;enumeration value="BusinessAttributes"/>
 *     &lt;enumeration value="EnableMMAUnderDSAAdgroups"/>
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
    @XmlEnumValue("AllowImageAutoRetrieve")
    ALLOW_IMAGE_AUTO_RETRIEVE("AllowImageAutoRetrieve"),
    @XmlEnumValue("AutoApplyRecommendations")
    AUTO_APPLY_RECOMMENDATIONS("AutoApplyRecommendations"),
    @XmlEnumValue("IncludeAutoBiddingViewThroughConversions")
    INCLUDE_AUTO_BIDDING_VIEW_THROUGH_CONVERSIONS("IncludeAutoBiddingViewThroughConversions"),
    @XmlEnumValue("AutoBiddingViewThroughConversionsValueAttributionWeight")
    AUTO_BIDDING_VIEW_THROUGH_CONVERSIONS_VALUE_ATTRIBUTION_WEIGHT("AutoBiddingViewThroughConversionsValueAttributionWeight"),
    @XmlEnumValue("LoopBackWindowForViewThroughConversions")
    LOOP_BACK_WINDOW_FOR_VIEW_THROUGH_CONVERSIONS("LoopBackWindowForViewThroughConversions"),
    @XmlEnumValue("BusinessAttributes")
    BUSINESS_ATTRIBUTES("BusinessAttributes"),
    @XmlEnumValue("EnableMMAUnderDSAAdgroups")
    ENABLE_MMA_UNDER_DSA_ADGROUPS("EnableMMAUnderDSAAdgroups");
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
