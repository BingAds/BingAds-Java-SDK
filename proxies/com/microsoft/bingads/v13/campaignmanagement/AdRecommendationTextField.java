
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRecommendationTextField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdRecommendationTextField">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Headline"/>
 *     <enumeration value="LongHeadline"/>
 *     <enumeration value="Description"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdRecommendationTextField")
@XmlEnum
public enum AdRecommendationTextField {

    @XmlEnumValue("Headline")
    HEADLINE("Headline"),
    @XmlEnumValue("LongHeadline")
    LONG_HEADLINE("LongHeadline"),
    @XmlEnumValue("Description")
    DESCRIPTION("Description");
    private final String value;

    AdRecommendationTextField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdRecommendationTextField fromValue(String v) {
        for (AdRecommendationTextField c: AdRecommendationTextField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
