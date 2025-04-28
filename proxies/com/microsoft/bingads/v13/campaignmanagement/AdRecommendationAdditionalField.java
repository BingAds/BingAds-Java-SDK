
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRecommendationAdditionalField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdRecommendationAdditionalField">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ImageSuggestionMetadata"/>
 *     <enumeration value="MediaRefineResults"/>
 *     <enumeration value="PromptBrandWarning"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdRecommendationAdditionalField")
@XmlEnum
public enum AdRecommendationAdditionalField {

    @XmlEnumValue("ImageSuggestionMetadata")
    IMAGE_SUGGESTION_METADATA("ImageSuggestionMetadata"),
    @XmlEnumValue("MediaRefineResults")
    MEDIA_REFINE_RESULTS("MediaRefineResults"),
    @XmlEnumValue("PromptBrandWarning")
    PROMPT_BRAND_WARNING("PromptBrandWarning");
    private final String value;

    AdRecommendationAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdRecommendationAdditionalField fromValue(String v) {
        for (AdRecommendationAdditionalField c: AdRecommendationAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
