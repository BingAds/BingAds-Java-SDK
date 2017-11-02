
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressionOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExpressionOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Equals"/>
 *     &lt;enumeration value="BeginsWith"/>
 *     &lt;enumeration value="RegularExpression"/>
 *     &lt;enumeration value="Contains"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
