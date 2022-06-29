
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParameterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Url"/>
 *     &lt;enumeration value="Entities"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParameterType")
@XmlEnum
public enum ParameterType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Url")
    URL("Url"),
    @XmlEnumValue("Entities")
    ENTITIES("Entities");
    private final String value;

    ParameterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterType fromValue(String v) {
        for (ParameterType c: ParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
