
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionValueRuleOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConversionValueRuleOperator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Add"/>
 *     <enumeration value="Multiply"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConversionValueRuleOperator")
@XmlEnum
public enum ConversionValueRuleOperator {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Multiply")
    MULTIPLY("Multiply");
    private final String value;

    ConversionValueRuleOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionValueRuleOperator fromValue(String v) {
        for (ConversionValueRuleOperator c: ConversionValueRuleOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
