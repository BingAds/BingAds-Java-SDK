
package com.microsoft.bingads.v13.campaignmanagement;

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
 *         <element name="RequestStatus" type="{https://bingads.microsoft.com/CampaignManagement/v13}DiagnosticsRequestStatus" minOccurs="0"/>
 *         <element name="Entities" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfEntityResult" minOccurs="0"/>
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
    "requestStatus",
    "entities"
})
@XmlRootElement(name = "GetDiagnosticsResponse")
public class GetDiagnosticsResponse {

    @XmlElement(name = "RequestStatus", nillable = true)
    protected DiagnosticsRequestStatus requestStatus;
    @XmlElement(name = "Entities", nillable = true)
    protected ArrayOfEntityResult entities;

    /**
     * Gets the value of the requestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticsRequestStatus }
     *     
     */
    public DiagnosticsRequestStatus getRequestStatus() {
        return requestStatus;
    }

    /**
     * Sets the value of the requestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticsRequestStatus }
     *     
     */
    public void setRequestStatus(DiagnosticsRequestStatus value) {
        this.requestStatus = value;
    }

    /**
     * Gets the value of the entities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityResult }
     *     
     */
    public ArrayOfEntityResult getEntities() {
        return entities;
    }

    /**
     * Sets the value of the entities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityResult }
     *     
     */
    public void setEntities(ArrayOfEntityResult value) {
        this.entities = value;
    }

}
