
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetSummaryReportTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetSummaryReportTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomDateRangeEnd" type="{https://bingads.microsoft.com/Reporting/v9}Date" minOccurs="0"/>
 *         &lt;element name="CustomDateRangeStart" type="{https://bingads.microsoft.com/Reporting/v9}Date" minOccurs="0"/>
 *         &lt;element name="PredefinedTime" type="{https://bingads.microsoft.com/Reporting/v9}BudgetSummaryReportTimePeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetSummaryReportTime", propOrder = {
    "customDateRangeEnd",
    "customDateRangeStart",
    "predefinedTime"
})
public class BudgetSummaryReportTime {

    @XmlElement(name = "CustomDateRangeEnd", nillable = true)
    protected Date customDateRangeEnd;
    @XmlElement(name = "CustomDateRangeStart", nillable = true)
    protected Date customDateRangeStart;
    @XmlElement(name = "PredefinedTime", nillable = true)
    @XmlSchemaType(name = "string")
    protected BudgetSummaryReportTimePeriod predefinedTime;

    /**
     * Gets the value of the customDateRangeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getCustomDateRangeEnd() {
        return customDateRangeEnd;
    }

    /**
     * Sets the value of the customDateRangeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setCustomDateRangeEnd(Date value) {
        this.customDateRangeEnd = value;
    }

    /**
     * Gets the value of the customDateRangeStart property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getCustomDateRangeStart() {
        return customDateRangeStart;
    }

    /**
     * Sets the value of the customDateRangeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setCustomDateRangeStart(Date value) {
        this.customDateRangeStart = value;
    }

    /**
     * Gets the value of the predefinedTime property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetSummaryReportTimePeriod }
     *     
     */
    public BudgetSummaryReportTimePeriod getPredefinedTime() {
        return predefinedTime;
    }

    /**
     * Sets the value of the predefinedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetSummaryReportTimePeriod }
     *     
     */
    public void setPredefinedTime(BudgetSummaryReportTimePeriod value) {
        this.predefinedTime = value;
    }

}
