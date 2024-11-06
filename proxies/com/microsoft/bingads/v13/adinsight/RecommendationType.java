
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecommendationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RecommendationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CampaignBudgetRecommendation"/>
 *     <enumeration value="KeywordRecommendation"/>
 *     <enumeration value="ResponsiveSearchAdRecommendation"/>
 *     <enumeration value="RemoveConflictingNegativeKeywordRecommendation"/>
 *     <enumeration value="UseBroadMatchKeywordRecommendation"/>
 *     <enumeration value="ResponsiveSearchAdAssetRecommendation"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RecommendationType")
@XmlEnum
public enum RecommendationType {

    @XmlEnumValue("CampaignBudgetRecommendation")
    CAMPAIGN_BUDGET_RECOMMENDATION("CampaignBudgetRecommendation"),
    @XmlEnumValue("KeywordRecommendation")
    KEYWORD_RECOMMENDATION("KeywordRecommendation"),
    @XmlEnumValue("ResponsiveSearchAdRecommendation")
    RESPONSIVE_SEARCH_AD_RECOMMENDATION("ResponsiveSearchAdRecommendation"),
    @XmlEnumValue("RemoveConflictingNegativeKeywordRecommendation")
    REMOVE_CONFLICTING_NEGATIVE_KEYWORD_RECOMMENDATION("RemoveConflictingNegativeKeywordRecommendation"),
    @XmlEnumValue("UseBroadMatchKeywordRecommendation")
    USE_BROAD_MATCH_KEYWORD_RECOMMENDATION("UseBroadMatchKeywordRecommendation"),
    @XmlEnumValue("ResponsiveSearchAdAssetRecommendation")
    RESPONSIVE_SEARCH_AD_ASSET_RECOMMENDATION("ResponsiveSearchAdAssetRecommendation");
    private final String value;

    RecommendationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecommendationType fromValue(String v) {
        for (RecommendationType c: RecommendationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
