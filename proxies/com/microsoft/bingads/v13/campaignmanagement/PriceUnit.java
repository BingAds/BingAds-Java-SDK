
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceUnit">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="PerHour"/>
 *     <enumeration value="PerDay"/>
 *     <enumeration value="PerWeek"/>
 *     <enumeration value="PerMonth"/>
 *     <enumeration value="PerYear"/>
 *     <enumeration value="None"/>
 *     <enumeration value="PerNight"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceUnit")
@XmlEnum
public enum PriceUnit {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("PerHour")
    PER_HOUR("PerHour"),
    @XmlEnumValue("PerDay")
    PER_DAY("PerDay"),
    @XmlEnumValue("PerWeek")
    PER_WEEK("PerWeek"),
    @XmlEnumValue("PerMonth")
    PER_MONTH("PerMonth"),
    @XmlEnumValue("PerYear")
    PER_YEAR("PerYear"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("PerNight")
    PER_NIGHT("PerNight");
    private final String value;

    PriceUnit(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceUnit fromValue(String v) {
        for (PriceUnit c: PriceUnit.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
