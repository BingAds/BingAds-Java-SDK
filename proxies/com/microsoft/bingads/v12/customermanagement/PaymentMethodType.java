
package com.microsoft.bingads.v12.customermanagement;

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
 *     &lt;enumeration value="PayPal"/>
 *     &lt;enumeration value="ELV"/>
 *     &lt;enumeration value="OfflinePaymentMethod"/>
 *     &lt;enumeration value="VBA"/>
 *     &lt;enumeration value="Boleto"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodType", namespace = "https://bingads.microsoft.com/Customer/v12/Entities")
@XmlEnum
public enum PaymentMethodType {

    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("Check")
    CHECK("Check"),
    @XmlEnumValue("ElectronicFundsTransfer")
    ELECTRONIC_FUNDS_TRANSFER("ElectronicFundsTransfer"),
    @XmlEnumValue("PayPal")
    PAY_PAL("PayPal"),
    ELV("ELV"),
    @XmlEnumValue("OfflinePaymentMethod")
    OFFLINE_PAYMENT_METHOD("OfflinePaymentMethod"),
    VBA("VBA"),
    @XmlEnumValue("Boleto")
    BOLETO("Boleto");
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
