
package com.microsoft.bingads.v11.customerbilling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredicateOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PredicateOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Equals"/>
 *     &lt;enumeration value="NotEquals"/>
 *     &lt;enumeration value="Contains"/>
 *     &lt;enumeration value="In"/>
 *     &lt;enumeration value="GreaterThanEquals"/>
 *     &lt;enumeration value="LessThanEquals"/>
 *     &lt;enumeration value="StartsWith"/>
 *     &lt;enumeration value="NotContains"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PredicateOperator", namespace = "https://bingads.microsoft.com/Customer/v11/Entities")
@XmlEnum
public enum PredicateOperator {

    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("NotEquals")
    NOT_EQUALS("NotEquals"),
    @XmlEnumValue("Contains")
    CONTAINS("Contains"),
    @XmlEnumValue("In")
    IN("In"),
    @XmlEnumValue("GreaterThanEquals")
    GREATER_THAN_EQUALS("GreaterThanEquals"),
    @XmlEnumValue("LessThanEquals")
    LESS_THAN_EQUALS("LessThanEquals"),
    @XmlEnumValue("StartsWith")
    STARTS_WITH("StartsWith"),
    @XmlEnumValue("NotContains")
    NOT_CONTAINS("NotContains");
    private final String value;

    PredicateOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PredicateOperator fromValue(String v) {
        for (PredicateOperator c: PredicateOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
