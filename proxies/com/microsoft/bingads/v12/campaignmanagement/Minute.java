
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Minute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Minute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Zero"/>
 *     &lt;enumeration value="Fifteen"/>
 *     &lt;enumeration value="Thirty"/>
 *     &lt;enumeration value="FortyFive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
