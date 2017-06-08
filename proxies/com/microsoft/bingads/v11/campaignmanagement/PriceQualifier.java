
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceQualifier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceQualifier">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="From"/>
 *     &lt;enumeration value="UpTo"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Average"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
