
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelDateSelectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="HotelDateSelectionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="DefaultSelection"/>
 *     <enumeration value="UserSelection"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
