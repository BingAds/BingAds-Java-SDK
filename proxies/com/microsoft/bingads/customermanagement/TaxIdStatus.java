
package com.microsoft.bingads.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxIdStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxIdStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Valid"/>
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Inactive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxIdStatus", namespace = "https://bingads.microsoft.com/Customer/v9/Entities")
@XmlEnum
public enum TaxIdStatus {

    @XmlEnumValue("Valid")
    VALID("Valid"),
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive");
    private final String value;

    TaxIdStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxIdStatus fromValue(String v) {
        for (TaxIdStatus c: TaxIdStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
