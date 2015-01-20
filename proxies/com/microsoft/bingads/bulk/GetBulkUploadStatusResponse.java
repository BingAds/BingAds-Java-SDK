
package com.microsoft.bingads.bulk;

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
 *         &lt;element name="RequestStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResultFileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "requestStatus",
    "resultFileUrl"
})
@XmlRootElement(name = "GetBulkUploadStatusResponse")
public class GetBulkUploadStatusResponse {

    @XmlElement(name = "RequestStatus", nillable = true)
    protected String requestStatus;
    @XmlElement(name = "ResultFileUrl", nillable = true)
    protected String resultFileUrl;

    /**
     * Gets the value of the requestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestStatus() {
        return requestStatus;
    }

    /**
     * Sets the value of the requestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestStatus(String value) {
        this.requestStatus = value;
    }

    /**
     * Gets the value of the resultFileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultFileUrl() {
        return resultFileUrl;
    }

    /**
     * Sets the value of the resultFileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultFileUrl(String value) {
        this.resultFileUrl = value;
    }

}
