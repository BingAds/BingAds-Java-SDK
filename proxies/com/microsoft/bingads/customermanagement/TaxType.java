
package com.microsoft.bingads.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="Business"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxType", namespace = "https://bingads.microsoft.com/Customer/v9/Entities")
@XmlEnum
public enum TaxType {

    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Business")
    BUSINESS("Business");
    private final String value;

    TaxType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxType fromValue(String v) {
        for (TaxType c: TaxType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
