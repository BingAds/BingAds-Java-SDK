
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LocationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Country"/>
 *     <enumeration value="SubGeography"/>
 *     <enumeration value="MetroArea"/>
 *     <enumeration value="City"/>
 *     <enumeration value="PostalCode"/>
 *     <enumeration value="County"/>
 *     <enumeration value="Neighborhood"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LocationType")
@XmlEnum
public enum LocationType {

    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("SubGeography")
    SUB_GEOGRAPHY("SubGeography"),
    @XmlEnumValue("MetroArea")
    METRO_AREA("MetroArea"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("PostalCode")
    POSTAL_CODE("PostalCode"),
    @XmlEnumValue("County")
    COUNTY("County"),
    @XmlEnumValue("Neighborhood")
    NEIGHBORHOOD("Neighborhood");
    private final String value;

    LocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationType fromValue(String v) {
        for (LocationType c: LocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
