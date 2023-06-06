
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NumberOperator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="Equals"/>
 *     <enumeration value="GreaterThan"/>
 *     <enumeration value="LessThan"/>
 *     <enumeration value="GreaterThanEqualTo"/>
 *     <enumeration value="LessThanEqualTo"/>
 *     <enumeration value="NotEquals"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NumberOperator")
@XmlEnum
public enum NumberOperator {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("GreaterThanEqualTo")
    GREATER_THAN_EQUAL_TO("GreaterThanEqualTo"),
    @XmlEnumValue("LessThanEqualTo")
    LESS_THAN_EQUAL_TO("LessThanEqualTo"),
    @XmlEnumValue("NotEquals")
    NOT_EQUALS("NotEquals");
    private final String value;

    NumberOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NumberOperator fromValue(String v) {
        for (NumberOperator c: NumberOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
