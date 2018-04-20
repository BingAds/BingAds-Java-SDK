
package com.microsoft.bingads.v12.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportRequestStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportRequestStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportDownloadUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{https://bingads.microsoft.com/Reporting/v12}ReportRequestStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportRequestStatus", propOrder = {
    "reportDownloadUrl",
    "status"
})
public class ReportRequestStatus {

    @XmlElement(name = "ReportDownloadUrl", nillable = true)
    protected String reportDownloadUrl;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected ReportRequestStatusType status;

    /**
     * Gets the value of the reportDownloadUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportDownloadUrl() {
        return reportDownloadUrl;
    }

    /**
     * Sets the value of the reportDownloadUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportDownloadUrl(String value) {
        this.reportDownloadUrl = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ReportRequestStatusType }
     *     
     */
    public ReportRequestStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportRequestStatusType }
     *     
     */
    public void setStatus(ReportRequestStatusType value) {
        this.status = value;
    }

}
