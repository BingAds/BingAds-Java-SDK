
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRecommendationTextTone.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdRecommendationTextTone">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Friendly"/>
 *     <enumeration value="Persuasive"/>
 *     <enumeration value="Cute"/>
 *     <enumeration value="Inspiring"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdRecommendationTextTone")
@XmlEnum
public enum AdRecommendationTextTone {

    @XmlEnumValue("Friendly")
    FRIENDLY("Friendly"),
    @XmlEnumValue("Persuasive")
    PERSUASIVE("Persuasive"),
    @XmlEnumValue("Cute")
    CUTE("Cute"),
    @XmlEnumValue("Inspiring")
    INSPIRING("Inspiring");
    private final String value;

    AdRecommendationTextTone(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdRecommendationTextTone fromValue(String v) {
        for (AdRecommendationTextTone c: AdRecommendationTextTone.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
