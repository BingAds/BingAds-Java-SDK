
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BreakdownCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BreakdownCategory">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="All"/>
 *     <enumeration value="Demographics"/>
 *     <enumeration value="Location"/>
 *     <enumeration value="Interest"/>
 *     <enumeration value="Device"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BreakdownCategory")
@XmlEnum
public enum BreakdownCategory {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Demographics")
    DEMOGRAPHICS("Demographics"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("Interest")
    INTEREST("Interest"),
    @XmlEnumValue("Device")
    DEVICE("Device");
    private final String value;

    BreakdownCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BreakdownCategory fromValue(String v) {
        for (BreakdownCategory c: BreakdownCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
