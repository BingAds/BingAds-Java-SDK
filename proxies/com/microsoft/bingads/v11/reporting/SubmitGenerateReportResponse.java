
package com.microsoft.bingads.v11.reporting;

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
 *         &lt;element name="ReportRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "reportRequestId"
})
@XmlRootElement(name = "SubmitGenerateReportResponse")
public class SubmitGenerateReportResponse {

    @XmlElement(name = "ReportRequestId", nillable = true)
    protected String reportRequestId;

    /**
     * Gets the value of the reportRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportRequestId() {
        return reportRequestId;
    }

    /**
     * Sets the value of the reportRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportRequestId(String value) {
        this.reportRequestId = value;
    }

}
