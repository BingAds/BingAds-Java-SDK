
package com.microsoft.bingads.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Advertiser"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountType", namespace = "https://bingads.microsoft.com/Customer/v9/Entities")
@XmlEnum
public enum AccountType {

    @XmlEnumValue("Advertiser")
    ADVERTISER("Advertiser");
    private final String value;

    AccountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountType fromValue(String v) {
        for (AccountType c: AccountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
