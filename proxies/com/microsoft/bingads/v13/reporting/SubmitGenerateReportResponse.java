
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ReportRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
