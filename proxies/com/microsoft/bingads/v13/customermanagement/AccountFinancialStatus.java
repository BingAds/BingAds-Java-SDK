
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountFinancialStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AccountFinancialStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Proposed"/>
 *     <enumeration value="PendingCreditCheck"/>
 *     <enumeration value="ClearFinancialStatus"/>
 *     <enumeration value="SoldToOnly"/>
 *     <enumeration value="CreditWarning"/>
 *     <enumeration value="Hold"/>
 *     <enumeration value="WriteOff"/>
 *     <enumeration value="TaxOnHold"/>
 *     <enumeration value="UserHold"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccountFinancialStatus", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
@XmlEnum
public enum AccountFinancialStatus {

    @XmlEnumValue("Proposed")
    PROPOSED("Proposed"),
    @XmlEnumValue("PendingCreditCheck")
    PENDING_CREDIT_CHECK("PendingCreditCheck"),
    @XmlEnumValue("ClearFinancialStatus")
    CLEAR_FINANCIAL_STATUS("ClearFinancialStatus"),
    @XmlEnumValue("SoldToOnly")
    SOLD_TO_ONLY("SoldToOnly"),
    @XmlEnumValue("CreditWarning")
    CREDIT_WARNING("CreditWarning"),
    @XmlEnumValue("Hold")
    HOLD("Hold"),
    @XmlEnumValue("WriteOff")
    WRITE_OFF("WriteOff"),
    @XmlEnumValue("TaxOnHold")
    TAX_ON_HOLD("TaxOnHold"),
    @XmlEnumValue("UserHold")
    USER_HOLD("UserHold");
    private final String value;

    AccountFinancialStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountFinancialStatus fromValue(String v) {
        for (AccountFinancialStatus c: AccountFinancialStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
