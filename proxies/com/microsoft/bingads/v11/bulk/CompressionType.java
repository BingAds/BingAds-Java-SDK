
package com.microsoft.bingads.v11.bulk;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompressionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompressionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Zip"/>
 *     &lt;enumeration value="GZip"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompressionType")
@XmlEnum
public enum CompressionType {

    @XmlEnumValue("Zip")
    ZIP("Zip"),
    @XmlEnumValue("GZip")
    G_ZIP("GZip");
    private final String value;

    CompressionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompressionType fromValue(String v) {
        for (CompressionType c: CompressionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
