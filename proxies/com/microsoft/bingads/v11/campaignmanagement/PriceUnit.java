
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceUnit.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceUnit">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="PerHour"/>
 *     &lt;enumeration value="PerDay"/>
 *     &lt;enumeration value="PerWeek"/>
 *     &lt;enumeration value="PerMonth"/>
 *     &lt;enumeration value="PerYear"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="PerNight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
