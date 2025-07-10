
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
 *         <element name="HealthCheckEntities" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfHealthCheckEntity" minOccurs="0"/>
 *         <element name="HealthCheckTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
    "healthCheckEntities",
    "healthCheckTypes"
})
@XmlRootElement(name = "GetDiagnosticsRequest")
public class GetDiagnosticsRequest {

    @XmlElement(name = "HealthCheckEntities", nillable = true)
    protected ArrayOfHealthCheckEntity healthCheckEntities;
    @XmlElement(name = "HealthCheckTypes", nillable = true)
    protected ArrayOfstring healthCheckTypes;

    /**
     * Gets the value of the healthCheckEntities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHealthCheckEntity }
     *     
     */
    public ArrayOfHealthCheckEntity getHealthCheckEntities() {
        return healthCheckEntities;
    }

    /**
     * Sets the value of the healthCheckEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHealthCheckEntity }
     *     
     */
    public void setHealthCheckEntities(ArrayOfHealthCheckEntity value) {
        this.healthCheckEntities = value;
    }

    /**
     * Gets the value of the healthCheckTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getHealthCheckTypes() {
        return healthCheckTypes;
    }

    /**
     * Sets the value of the healthCheckTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setHealthCheckTypes(ArrayOfstring value) {
        this.healthCheckTypes = value;
    }

}
