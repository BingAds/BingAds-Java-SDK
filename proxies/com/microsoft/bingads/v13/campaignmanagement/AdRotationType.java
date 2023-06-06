
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRotationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdRotationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OptimizeForClicks"/>
 *     &lt;enumeration value="RotateAdsEvenly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
