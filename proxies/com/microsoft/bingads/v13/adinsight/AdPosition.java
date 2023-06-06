
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdPosition">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="All"/>
 *     <enumeration value="MainLine1"/>
 *     <enumeration value="MainLine2"/>
 *     <enumeration value="MainLine3"/>
 *     <enumeration value="MainLine4"/>
 *     <enumeration value="FirstPage1"/>
 *     <enumeration value="FirstPage2"/>
 *     <enumeration value="FirstPage3"/>
 *     <enumeration value="FirstPage4"/>
 *     <enumeration value="FirstPage5"/>
 *     <enumeration value="FirstPage6"/>
 *     <enumeration value="FirstPage7"/>
 *     <enumeration value="FirstPage8"/>
 *     <enumeration value="FirstPage9"/>
 *     <enumeration value="FirstPage10"/>
 *     <enumeration value="Aggregate"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
    @XmlEnumValue("FirstPage1")
    FIRST_PAGE_1("FirstPage1"),
    @XmlEnumValue("FirstPage2")
    FIRST_PAGE_2("FirstPage2"),
    @XmlEnumValue("FirstPage3")
    FIRST_PAGE_3("FirstPage3"),
    @XmlEnumValue("FirstPage4")
    FIRST_PAGE_4("FirstPage4"),
    @XmlEnumValue("FirstPage5")
    FIRST_PAGE_5("FirstPage5"),
    @XmlEnumValue("FirstPage6")
    FIRST_PAGE_6("FirstPage6"),
    @XmlEnumValue("FirstPage7")
    FIRST_PAGE_7("FirstPage7"),
    @XmlEnumValue("FirstPage8")
    FIRST_PAGE_8("FirstPage8"),
    @XmlEnumValue("FirstPage9")
    FIRST_PAGE_9("FirstPage9"),
    @XmlEnumValue("FirstPage10")
    FIRST_PAGE_10("FirstPage10"),
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
