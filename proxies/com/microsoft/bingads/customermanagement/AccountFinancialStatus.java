
package com.microsoft.bingads.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountFinancialStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountFinancialStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Proposed"/>
 *     &lt;enumeration value="PendingCreditCheck"/>
 *     &lt;enumeration value="ClearFinancialStatus"/>
 *     &lt;enumeration value="SoldToOnly"/>
 *     &lt;enumeration value="CreditWarning"/>
 *     &lt;enumeration value="Hold"/>
 *     &lt;enumeration value="WriteOff"/>
 *     &lt;enumeration value="TaxOnHold"/>
 *     &lt;enumeration value="UserHold"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountFinancialStatus", namespace = "https://bingads.microsoft.com/Customer/v9/Entities")
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
