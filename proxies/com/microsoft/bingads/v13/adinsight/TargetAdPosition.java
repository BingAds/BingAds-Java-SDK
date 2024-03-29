
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetAdPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TargetAdPosition">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MainLine1"/>
 *     <enumeration value="MainLine"/>
 *     <enumeration value="FirstPage"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TargetAdPosition")
@XmlEnum
public enum TargetAdPosition {

    @XmlEnumValue("MainLine1")
    MAIN_LINE_1("MainLine1"),
    @XmlEnumValue("MainLine")
    MAIN_LINE("MainLine"),
    @XmlEnumValue("FirstPage")
    FIRST_PAGE("FirstPage");
    private final String value;

    TargetAdPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TargetAdPosition fromValue(String v) {
        for (TargetAdPosition c: TargetAdPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
