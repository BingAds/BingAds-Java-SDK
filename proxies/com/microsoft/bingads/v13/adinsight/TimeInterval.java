
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeInterval.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TimeInterval">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LastMonth"/>
 *     <enumeration value="LastWeek"/>
 *     <enumeration value="LastDay"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TimeInterval")
@XmlEnum
public enum TimeInterval {

    @XmlEnumValue("LastMonth")
    LAST_MONTH("LastMonth"),
    @XmlEnumValue("LastWeek")
    LAST_WEEK("LastWeek"),
    @XmlEnumValue("LastDay")
    LAST_DAY("LastDay");
    private final String value;

    TimeInterval(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeInterval fromValue(String v) {
        for (TimeInterval c: TimeInterval.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
