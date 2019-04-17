
package com.microsoft.bingads.v13.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportRequestStatus" type="{https://bingads.microsoft.com/Reporting/v13}ReportRequestStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reportRequestStatus"
})
@XmlRootElement(name = "PollGenerateReportResponse")
public class PollGenerateReportResponse {

    @XmlElement(name = "ReportRequestStatus", nillable = true)
    protected ReportRequestStatus reportRequestStatus;

    /**
     * Gets the value of the reportRequestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReportRequestStatus }
     *     
     */
    public ReportRequestStatus getReportRequestStatus() {
        return reportRequestStatus;
    }

    /**
     * Sets the value of the reportRequestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportRequestStatus }
     *     
     */
    public void setReportRequestStatus(ReportRequestStatus value) {
        this.reportRequestStatus = value;
    }

}
