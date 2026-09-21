
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanySizeCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CompanySizeCategory">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="MyselfOnly"/>
 *     <enumeration value="Size2To10"/>
 *     <enumeration value="Size11To50"/>
 *     <enumeration value="Size51To200"/>
 *     <enumeration value="Size201To500"/>
 *     <enumeration value="Size501To1000"/>
 *     <enumeration value="Size1001To5000"/>
 *     <enumeration value="Size5001To10000"/>
 *     <enumeration value="Size10001Plus"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CompanySizeCategory")
@XmlEnum
public enum CompanySizeCategory {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("MyselfOnly")
    MYSELF_ONLY("MyselfOnly"),
    @XmlEnumValue("Size2To10")
    SIZE_2_TO_10("Size2To10"),
    @XmlEnumValue("Size11To50")
    SIZE_11_TO_50("Size11To50"),
    @XmlEnumValue("Size51To200")
    SIZE_51_TO_200("Size51To200"),
    @XmlEnumValue("Size201To500")
    SIZE_201_TO_500("Size201To500"),
    @XmlEnumValue("Size501To1000")
    SIZE_501_TO_1000("Size501To1000"),
    @XmlEnumValue("Size1001To5000")
    SIZE_1001_TO_5000("Size1001To5000"),
    @XmlEnumValue("Size5001To10000")
    SIZE_5001_TO_10000("Size5001To10000"),
    @XmlEnumValue("Size10001Plus")
    SIZE_10001_PLUS("Size10001Plus");
    private final String value;

    CompanySizeCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanySizeCategory fromValue(String v) {
        for (CompanySizeCategory c: CompanySizeCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
