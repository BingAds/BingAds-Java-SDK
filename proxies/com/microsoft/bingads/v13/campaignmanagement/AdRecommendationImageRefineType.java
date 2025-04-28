
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRecommendationImageRefineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdRecommendationImageRefineType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BackgroundChange"/>
 *     <enumeration value="RefineDisplay"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdRecommendationImageRefineType")
@XmlEnum
public enum AdRecommendationImageRefineType {

    @XmlEnumValue("BackgroundChange")
    BACKGROUND_CHANGE("BackgroundChange"),
    @XmlEnumValue("RefineDisplay")
    REFINE_DISPLAY("RefineDisplay");
    private final String value;

    AdRecommendationImageRefineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdRecommendationImageRefineType fromValue(String v) {
        for (AdRecommendationImageRefineType c: AdRecommendationImageRefineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
