
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Minute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Minute">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Zero"/>
 *     <enumeration value="Fifteen"/>
 *     <enumeration value="Thirty"/>
 *     <enumeration value="FortyFive"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Minute")
@XmlEnum
public enum Minute {

    @XmlEnumValue("Zero")
    ZERO("Zero"),
    @XmlEnumValue("Fifteen")
    FIFTEEN("Fifteen"),
    @XmlEnumValue("Thirty")
    THIRTY("Thirty"),
    @XmlEnumValue("FortyFive")
    FORTY_FIVE("FortyFive");
    private final String value;

    Minute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Minute fromValue(String v) {
        for (Minute c: Minute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
