
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupBidLandscapeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdGroupBidLandscapeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Uniform"/>
 *     <enumeration value="DefaultBidOnly"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AdGroupBidLandscapeType")
@XmlEnum
public enum AdGroupBidLandscapeType {

    @XmlEnumValue("Uniform")
    UNIFORM("Uniform"),
    @XmlEnumValue("DefaultBidOnly")
    DEFAULT_BID_ONLY("DefaultBidOnly");
    private final String value;

    AdGroupBidLandscapeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdGroupBidLandscapeType fromValue(String v) {
        for (AdGroupBidLandscapeType c: AdGroupBidLandscapeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
