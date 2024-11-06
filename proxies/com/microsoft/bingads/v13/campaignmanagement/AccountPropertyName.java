
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountPropertyName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountPropertyName">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="TrackingUrlTemplate"/>
 *     <enumeration value="MSCLKIDAutoTaggingEnabled"/>
 *     <enumeration value="AdClickParallelTracking"/>
 *     <enumeration value="FinalUrlSuffix"/>
 *     <enumeration value="IncludeViewThroughConversions"/>
 *     <enumeration value="ProfileExpansionEnabled"/>
 *     <enumeration value="AllowImageAutoRetrieve"/>
 *     <enumeration value="AutoApplyRecommendations"/>
 *     <enumeration value="IncludeAutoBiddingViewThroughConversions"/>
 *     <enumeration value="AutoBiddingViewThroughConversionsValueAttributionWeight"/>
 *     <enumeration value="LoopBackWindowForViewThroughConversions"/>
 *     <enumeration value="BusinessAttributes"/>
 *     <enumeration value="EnableMMAUnderDSAAdgroups"/>
 *     <enumeration value="OptOutFromMCM"/>
 *     <enumeration value="NetflixTCAccepted"/>
 *     <enumeration value="BlockedContentSegments"/>
 *     <enumeration value="AssetAIEnhancementOptout"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
    ENABLE_MMA_UNDER_DSA_ADGROUPS("EnableMMAUnderDSAAdgroups"),
    @XmlEnumValue("OptOutFromMCM")
    OPT_OUT_FROM_MCM("OptOutFromMCM"),
    @XmlEnumValue("NetflixTCAccepted")
    NETFLIX_TC_ACCEPTED("NetflixTCAccepted"),
    @XmlEnumValue("BlockedContentSegments")
    BLOCKED_CONTENT_SEGMENTS("BlockedContentSegments"),
    @XmlEnumValue("AssetAIEnhancementOptout")
    ASSET_AI_ENHANCEMENT_OPTOUT("AssetAIEnhancementOptout");
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
