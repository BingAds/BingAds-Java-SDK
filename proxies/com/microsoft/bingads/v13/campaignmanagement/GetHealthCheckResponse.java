
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
 *         <element name="HealthCheckMetadatas" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfHealthCheckMetadata" minOccurs="0"/>
 *         <element name="HealthCheckDatas" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfHealthCheckData" minOccurs="0"/>
 *         <element name="HealthCheckErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfHealthCheckError" minOccurs="0"/>
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
    "healthCheckMetadatas",
    "healthCheckDatas",
    "healthCheckErrors"
})
@XmlRootElement(name = "GetHealthCheckResponse")
public class GetHealthCheckResponse {

    @XmlElement(name = "HealthCheckMetadatas", nillable = true)
    protected ArrayOfHealthCheckMetadata healthCheckMetadatas;
    @XmlElement(name = "HealthCheckDatas", nillable = true)
    protected ArrayOfHealthCheckData healthCheckDatas;
    @XmlElement(name = "HealthCheckErrors", nillable = true)
    protected ArrayOfHealthCheckError healthCheckErrors;

    /**
     * Gets the value of the healthCheckMetadatas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHealthCheckMetadata }
     *     
     */
    public ArrayOfHealthCheckMetadata getHealthCheckMetadatas() {
        return healthCheckMetadatas;
    }

    /**
     * Sets the value of the healthCheckMetadatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHealthCheckMetadata }
     *     
     */
    public void setHealthCheckMetadatas(ArrayOfHealthCheckMetadata value) {
        this.healthCheckMetadatas = value;
    }

    /**
     * Gets the value of the healthCheckDatas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHealthCheckData }
     *     
     */
    public ArrayOfHealthCheckData getHealthCheckDatas() {
        return healthCheckDatas;
    }

    /**
     * Sets the value of the healthCheckDatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHealthCheckData }
     *     
     */
    public void setHealthCheckDatas(ArrayOfHealthCheckData value) {
        this.healthCheckDatas = value;
    }

    /**
     * Gets the value of the healthCheckErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHealthCheckError }
     *     
     */
    public ArrayOfHealthCheckError getHealthCheckErrors() {
        return healthCheckErrors;
    }

    /**
     * Sets the value of the healthCheckErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHealthCheckError }
     *     
     */
    public void setHealthCheckErrors(ArrayOfHealthCheckError value) {
        this.healthCheckErrors = value;
    }

}
