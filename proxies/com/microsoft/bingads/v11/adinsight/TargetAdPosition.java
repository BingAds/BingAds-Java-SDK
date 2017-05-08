
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetAdPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TargetAdPosition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MainLine1"/>
 *     &lt;enumeration value="MainLine"/>
 *     &lt;enumeration value="SideBar"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TargetAdPosition")
@XmlEnum
public enum TargetAdPosition {

    @XmlEnumValue("MainLine1")
    MAIN_LINE_1("MainLine1"),
    @XmlEnumValue("MainLine")
    MAIN_LINE("MainLine"),
    @XmlEnumValue("SideBar")
    SIDE_BAR("SideBar");
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
