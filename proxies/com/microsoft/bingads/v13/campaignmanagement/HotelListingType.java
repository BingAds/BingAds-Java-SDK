
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelListingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="HotelListingType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Subdivision"/>
 *     <enumeration value="Unit"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HotelListingType")
@XmlEnum
public enum HotelListingType {

    @XmlEnumValue("Subdivision")
    SUBDIVISION("Subdivision"),
    @XmlEnumValue("Unit")
    UNIT("Unit");
    private final String value;

    HotelListingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HotelListingType fromValue(String v) {
        for (HotelListingType c: HotelListingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
