
package com.microsoft.bingads.v10.adinsight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupBidLandscapeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroupBidLandscapeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Uniform"/>
 *     &lt;enumeration value="DefaultBidOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
