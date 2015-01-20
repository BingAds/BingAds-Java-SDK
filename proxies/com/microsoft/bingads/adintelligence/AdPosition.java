
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdPosition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="MainLine1"/>
 *     &lt;enumeration value="MainLine2"/>
 *     &lt;enumeration value="MainLine3"/>
 *     &lt;enumeration value="MainLine4"/>
 *     &lt;enumeration value="SideBar1"/>
 *     &lt;enumeration value="SideBar2"/>
 *     &lt;enumeration value="SideBar3"/>
 *     &lt;enumeration value="SideBar4"/>
 *     &lt;enumeration value="SideBar5"/>
 *     &lt;enumeration value="SideBar6"/>
 *     &lt;enumeration value="SideBar7"/>
 *     &lt;enumeration value="SideBar8"/>
 *     &lt;enumeration value="SideBar9"/>
 *     &lt;enumeration value="SideBar10"/>
 *     &lt;enumeration value="Aggregate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdPosition")
@XmlEnum
public enum AdPosition {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("MainLine1")
    MAIN_LINE_1("MainLine1"),
    @XmlEnumValue("MainLine2")
    MAIN_LINE_2("MainLine2"),
    @XmlEnumValue("MainLine3")
    MAIN_LINE_3("MainLine3"),
    @XmlEnumValue("MainLine4")
    MAIN_LINE_4("MainLine4"),
    @XmlEnumValue("SideBar1")
    SIDE_BAR_1("SideBar1"),
    @XmlEnumValue("SideBar2")
    SIDE_BAR_2("SideBar2"),
    @XmlEnumValue("SideBar3")
    SIDE_BAR_3("SideBar3"),
    @XmlEnumValue("SideBar4")
    SIDE_BAR_4("SideBar4"),
    @XmlEnumValue("SideBar5")
    SIDE_BAR_5("SideBar5"),
    @XmlEnumValue("SideBar6")
    SIDE_BAR_6("SideBar6"),
    @XmlEnumValue("SideBar7")
    SIDE_BAR_7("SideBar7"),
    @XmlEnumValue("SideBar8")
    SIDE_BAR_8("SideBar8"),
    @XmlEnumValue("SideBar9")
    SIDE_BAR_9("SideBar9"),
    @XmlEnumValue("SideBar10")
    SIDE_BAR_10("SideBar10"),
    @XmlEnumValue("Aggregate")
    AGGREGATE("Aggregate");
    private final String value;

    AdPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdPosition fromValue(String v) {
        for (AdPosition c: AdPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
