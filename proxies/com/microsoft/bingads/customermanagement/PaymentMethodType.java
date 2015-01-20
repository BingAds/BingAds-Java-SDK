
package com.microsoft.bingads.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="Check"/>
 *     &lt;enumeration value="ElectronicFundsTransfer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodType", namespace = "https://bingads.microsoft.com/Customer/v9/Entities")
@XmlEnum
public enum PaymentMethodType {

    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("Check")
    CHECK("Check"),
    @XmlEnumValue("ElectronicFundsTransfer")
    ELECTRONIC_FUNDS_TRANSFER("ElectronicFundsTransfer");
    private final String value;

    PaymentMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodType fromValue(String v) {
        for (PaymentMethodType c: PaymentMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
