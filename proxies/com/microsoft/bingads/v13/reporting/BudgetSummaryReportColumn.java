
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetSummaryReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BudgetSummaryReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AccountName"/>
 *     <enumeration value="AccountNumber"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="CampaignName"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="Date"/>
 *     <enumeration value="CurrencyCode"/>
 *     <enumeration value="MonthlyBudget"/>
 *     <enumeration value="DailySpend"/>
 *     <enumeration value="MonthToDateSpend"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
