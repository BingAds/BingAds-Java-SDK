
package com.microsoft.bingads.v11.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetSummaryReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BudgetSummaryReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountName"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="CampaignName"/>
 *     &lt;enumeration value="CampaignId"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="CurrencyCode"/>
 *     &lt;enumeration value="MonthlyBudget"/>
 *     &lt;enumeration value="DailySpend"/>
 *     &lt;enumeration value="MonthToDateSpend"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BudgetSummaryReportColumn")
@XmlEnum
public enum BudgetSummaryReportColumn {

    @XmlEnumValue("AccountName")
    ACCOUNT_NAME("AccountName"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("CampaignName")
    CAMPAIGN_NAME("CampaignName"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("CurrencyCode")
    CURRENCY_CODE("CurrencyCode"),
    @XmlEnumValue("MonthlyBudget")
    MONTHLY_BUDGET("MonthlyBudget"),
    @XmlEnumValue("DailySpend")
    DAILY_SPEND("DailySpend"),
    @XmlEnumValue("MonthToDateSpend")
    MONTH_TO_DATE_SPEND("MonthToDateSpend");
    private final String value;

    BudgetSummaryReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BudgetSummaryReportColumn fromValue(String v) {
        for (BudgetSummaryReportColumn c: BudgetSummaryReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
