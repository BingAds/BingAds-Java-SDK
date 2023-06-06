
package com.microsoft.bingads.v13.bulk;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompressionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CompressionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Zip"/>
 *     <enumeration value="GZip"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
