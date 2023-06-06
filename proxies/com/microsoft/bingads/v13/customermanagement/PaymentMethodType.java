
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PaymentMethodType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CreditCard"/>
 *     <enumeration value="Invoice"/>
 *     <enumeration value="Check"/>
 *     <enumeration value="ElectronicFundsTransfer"/>
 *     <enumeration value="PayPal"/>
 *     <enumeration value="ELV"/>
 *     <enumeration value="OfflinePaymentMethod"/>
 *     <enumeration value="VBA"/>
 *     <enumeration value="Boleto"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PaymentMethodType", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
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
