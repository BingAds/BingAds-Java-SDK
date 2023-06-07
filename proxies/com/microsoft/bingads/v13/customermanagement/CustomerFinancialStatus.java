
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerFinancialStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CustomerFinancialStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ProposalsOnly"/>
 *     <enumeration value="PendingCreditCheck"/>
 *     <enumeration value="ClearFinancialStatus"/>
 *     <enumeration value="SoldToOnly"/>
 *     <enumeration value="CreditHold"/>
 *     <enumeration value="CreditWarning"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CustomerFinancialStatus", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
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
