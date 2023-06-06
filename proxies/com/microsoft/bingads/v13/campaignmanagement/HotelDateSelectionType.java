
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelDateSelectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HotelDateSelectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="DefaultSelection"/>
 *     &lt;enumeration value="UserSelection"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HotelDateSelectionType")
@XmlEnum
public enum HotelDateSelectionType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("DefaultSelection")
    DEFAULT_SELECTION("DefaultSelection"),
    @XmlEnumValue("UserSelection")
    USER_SELECTION("UserSelection");
    private final String value;

    HotelDateSelectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HotelDateSelectionType fromValue(String v) {
        for (HotelDateSelectionType c: HotelDateSelectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
