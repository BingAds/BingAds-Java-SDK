
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PriceQualifier">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="From"/>
 *     <enumeration value="UpTo"/>
 *     <enumeration value="None"/>
 *     <enumeration value="Average"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceQualifier")
@XmlEnum
public enum PriceQualifier {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("From")
    FROM("From"),
    @XmlEnumValue("UpTo")
    UP_TO("UpTo"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Average")
    AVERAGE("Average");
    private final String value;

    PriceQualifier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceQualifier fromValue(String v) {
        for (PriceQualifier c: PriceQualifier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
