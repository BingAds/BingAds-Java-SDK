
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRotationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdRotationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OptimizeForClicks"/>
 *     <enumeration value="RotateAdsEvenly"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdRotationType")
@XmlEnum
public enum AdRotationType {

    @XmlEnumValue("OptimizeForClicks")
    OPTIMIZE_FOR_CLICKS("OptimizeForClicks"),
    @XmlEnumValue("RotateAdsEvenly")
    ROTATE_ADS_EVENLY("RotateAdsEvenly");
    private final String value;

    AdRotationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdRotationType fromValue(String v) {
        for (AdRotationType c: AdRotationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
