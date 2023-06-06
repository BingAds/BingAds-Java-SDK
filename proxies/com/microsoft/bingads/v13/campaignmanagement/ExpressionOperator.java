
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressionOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ExpressionOperator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Equals"/>
 *     <enumeration value="BeginsWith"/>
 *     <enumeration value="RegularExpression"/>
 *     <enumeration value="Contains"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExpressionOperator")
@XmlEnum
public enum ExpressionOperator {

    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("BeginsWith")
    BEGINS_WITH("BeginsWith"),
    @XmlEnumValue("RegularExpression")
    REGULAR_EXPRESSION("RegularExpression"),
    @XmlEnumValue("Contains")
    CONTAINS("Contains");
    private final String value;

    ExpressionOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExpressionOperator fromValue(String v) {
        for (ExpressionOperator c: ExpressionOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
