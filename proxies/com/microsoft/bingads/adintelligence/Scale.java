
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Scale.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Scale">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Minimal"/>
 *     &lt;enumeration value="Low"/>
 *     &lt;enumeration value="Medium"/>
 *     &lt;enumeration value="High"/>
 *     &lt;enumeration value="VeryHigh"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Scale")
@XmlEnum
public enum Scale {

    @XmlEnumValue("Minimal")
    MINIMAL("Minimal"),
    @XmlEnumValue("Low")
    LOW("Low"),
    @XmlEnumValue("Medium")
    MEDIUM("Medium"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("VeryHigh")
    VERY_HIGH("VeryHigh");
    private final String value;

    Scale(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Scale fromValue(String v) {
        for (Scale c: Scale.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
