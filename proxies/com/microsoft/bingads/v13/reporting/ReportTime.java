
package com.microsoft.bingads.v13.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomDateRangeEnd" type="{https://bingads.microsoft.com/Reporting/v13}Date" minOccurs="0"/>
 *         &lt;element name="CustomDateRangeStart" type="{https://bingads.microsoft.com/Reporting/v13}Date" minOccurs="0"/>
 *         &lt;element name="PredefinedTime" type="{https://bingads.microsoft.com/Reporting/v13}ReportTimePeriod" minOccurs="0"/>
 *         &lt;element name="ReportTimeZone" type="{https://bingads.microsoft.com/Reporting/v13}ReportTimeZone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportTime", propOrder = {
    "customDateRangeEnd",
    "customDateRangeStart",
    "predefinedTime",
    "reportTimeZone"
})
public class ReportTime {

    @XmlElement(name = "CustomDateRangeEnd", nillable = true)
    protected Date customDateRangeEnd;
    @XmlElement(name = "CustomDateRangeStart", nillable = true)
    protected Date customDateRangeStart;
    @XmlElement(name = "PredefinedTime", nillable = true)
    @XmlSchemaType(name = "string")
    protected ReportTimePeriod predefinedTime;
    @XmlElement(name = "ReportTimeZone", nillable = true)
    @XmlSchemaType(name = "string")
    protected ReportTimeZone reportTimeZone;

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
     *     {@link ReportTimePeriod }
     *     
     */
    public ReportTimePeriod getPredefinedTime() {
        return predefinedTime;
    }

    /**
     * Sets the value of the predefinedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportTimePeriod }
     *     
     */
    public void setPredefinedTime(ReportTimePeriod value) {
        this.predefinedTime = value;
    }

    /**
     * Gets the value of the reportTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link ReportTimeZone }
     *     
     */
    public ReportTimeZone getReportTimeZone() {
        return reportTimeZone;
    }

    /**
     * Sets the value of the reportTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportTimeZone }
     *     
     */
    public void setReportTimeZone(ReportTimeZone value) {
        this.reportTimeZone = value;
    }

}
