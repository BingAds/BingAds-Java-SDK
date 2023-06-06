
package com.microsoft.bingads.v13.bulk;

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
 *         <element name="DownloadRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "downloadRequestId"
})
@XmlRootElement(name = "DownloadCampaignsByAccountIdsResponse")
public class DownloadCampaignsByAccountIdsResponse {

    @XmlElement(name = "DownloadRequestId", nillable = true)
    protected String downloadRequestId;

    /**
     * Gets the value of the downloadRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadRequestId() {
        return downloadRequestId;
    }

    /**
     * Sets the value of the downloadRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadRequestId(String value) {
        this.downloadRequestId = value;
    }

}
