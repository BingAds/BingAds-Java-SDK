
package com.microsoft.bingads.v11.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerFinancialStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerFinancialStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ProposalsOnly"/>
 *     &lt;enumeration value="PendingCreditCheck"/>
 *     &lt;enumeration value="ClearFinancialStatus"/>
 *     &lt;enumeration value="SoldToOnly"/>
 *     &lt;enumeration value="CreditHold"/>
 *     &lt;enumeration value="CreditWarning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerFinancialStatus", namespace = "https://bingads.microsoft.com/Customer/v11/Entities")
@XmlEnum
public enum CustomerFinancialStatus {

    @XmlEnumValue("ProposalsOnly")
    PROPOSALS_ONLY("ProposalsOnly"),
    @XmlEnumValue("PendingCreditCheck")
    PENDING_CREDIT_CHECK("PendingCreditCheck"),
    @XmlEnumValue("ClearFinancialStatus")
    CLEAR_FINANCIAL_STATUS("ClearFinancialStatus"),
    @XmlEnumValue("SoldToOnly")
    SOLD_TO_ONLY("SoldToOnly"),
    @XmlEnumValue("CreditHold")
    CREDIT_HOLD("CreditHold"),
    @XmlEnumValue("CreditWarning")
    CREDIT_WARNING("CreditWarning");
    private final String value;

    CustomerFinancialStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerFinancialStatus fromValue(String v) {
        for (CustomerFinancialStatus c: CustomerFinancialStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
