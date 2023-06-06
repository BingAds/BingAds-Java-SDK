
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
 *         <element name="ReportRequestStatus" type="{https://bingads.microsoft.com/Reporting/v13}ReportRequestStatus" minOccurs="0"/>
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
