
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Day.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Day">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Sunday"/>
 *     <enumeration value="Monday"/>
 *     <enumeration value="Tuesday"/>
 *     <enumeration value="Wednesday"/>
 *     <enumeration value="Thursday"/>
 *     <enumeration value="Friday"/>
 *     <enumeration value="Saturday"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Day")
@XmlEnum
public enum Day {

    @XmlEnumValue("Sunday")
    SUNDAY("Sunday"),
    @XmlEnumValue("Monday")
    MONDAY("Monday"),
    @XmlEnumValue("Tuesday")
    TUESDAY("Tuesday"),
    @XmlEnumValue("Wednesday")
    WEDNESDAY("Wednesday"),
    @XmlEnumValue("Thursday")
    THURSDAY("Thursday"),
    @XmlEnumValue("Friday")
    FRIDAY("Friday"),
    @XmlEnumValue("Saturday")
    SATURDAY("Saturday");
    private final String value;

    Day(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Day fromValue(String v) {
        for (Day c: Day.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
