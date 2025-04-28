
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRecommendationImageField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdRecommendationImageField">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Image"/>
 *     <enumeration value="Logo"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdRecommendationImageField")
@XmlEnum
public enum AdRecommendationImageField {

    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Logo")
    LOGO("Logo");
    private final String value;

    AdRecommendationImageField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdRecommendationImageField fromValue(String v) {
        for (AdRecommendationImageField c: AdRecommendationImageField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
