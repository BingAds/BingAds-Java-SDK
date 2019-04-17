
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Paused"/>
 *     &lt;enumeration value="BudgetPaused"/>
 *     &lt;enumeration value="BudgetAndManualPaused"/>
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="Suspended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignStatus")
@XmlEnum
public enum CampaignStatus {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Paused")
    PAUSED("Paused"),
    @XmlEnumValue("BudgetPaused")
    BUDGET_PAUSED("BudgetPaused"),
    @XmlEnumValue("BudgetAndManualPaused")
    BUDGET_AND_MANUAL_PAUSED("BudgetAndManualPaused"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended");
    private final String value;

    CampaignStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignStatus fromValue(String v) {
        for (CampaignStatus c: CampaignStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
