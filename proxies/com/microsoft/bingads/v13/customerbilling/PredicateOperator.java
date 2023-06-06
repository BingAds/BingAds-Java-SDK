
package com.microsoft.bingads.v13.customerbilling;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredicateOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PredicateOperator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Equals"/>
 *     <enumeration value="NotEquals"/>
 *     <enumeration value="Contains"/>
 *     <enumeration value="In"/>
 *     <enumeration value="GreaterThanEquals"/>
 *     <enumeration value="LessThanEquals"/>
 *     <enumeration value="StartsWith"/>
 *     <enumeration value="NotContains"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PredicateOperator", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
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
