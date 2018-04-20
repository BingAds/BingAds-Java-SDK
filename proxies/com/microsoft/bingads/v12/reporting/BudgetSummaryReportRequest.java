
package com.microsoft.bingads.v12.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetSummaryReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetSummaryReportRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/Reporting/v12}ReportRequest">
 *       &lt;sequence>
 *         &lt;element name="Columns" type="{https://bingads.microsoft.com/Reporting/v12}ArrayOfBudgetSummaryReportColumn"/>
 *         &lt;element name="Scope" type="{https://bingads.microsoft.com/Reporting/v12}AccountThroughCampaignReportScope"/>
 *         &lt;element name="Time" type="{https://bingads.microsoft.com/Reporting/v12}BudgetSummaryReportTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetSummaryReportRequest", propOrder = {
    "columns",
    "scope",
    "time"
})
public class BudgetSummaryReportRequest
    extends ReportRequest
{

    @XmlElement(name = "Columns", required = true, nillable = true)
    protected ArrayOfBudgetSummaryReportColumn columns;
    @XmlElement(name = "Scope", required = true, nillable = true)
    protected AccountThroughCampaignReportScope scope;
    @XmlElement(name = "Time", required = true, nillable = true)
    protected BudgetSummaryReportTime time;

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBudgetSummaryReportColumn }
     *     
     */
    public ArrayOfBudgetSummaryReportColumn getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBudgetSummaryReportColumn }
     *     
     */
    public void setColumns(ArrayOfBudgetSummaryReportColumn value) {
        this.columns = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link AccountThroughCampaignReportScope }
     *     
     */
    public AccountThroughCampaignReportScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountThroughCampaignReportScope }
     *     
     */
    public void setScope(AccountThroughCampaignReportScope value) {
        this.scope = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetSummaryReportTime }
     *     
     */
    public BudgetSummaryReportTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetSummaryReportTime }
     *     
     */
    public void setTime(BudgetSummaryReportTime value) {
        this.time = value;
    }

}
