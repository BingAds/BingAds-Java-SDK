
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
 *         <element name="HealthCheckResultsMetadata" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfHealthCheckMetadata" minOccurs="0"/>
 *         <element name="HealthCheckResults" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfHealthCheckData" minOccurs="0"/>
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
    "healthCheckResultsMetadata",
    "healthCheckResults",
    "healthCheckErrors"
})
@XmlRootElement(name = "GetHealthCheckResponse")
public class GetHealthCheckResponse {

    @XmlElement(name = "HealthCheckResultsMetadata", nillable = true)
    protected ArrayOfHealthCheckMetadata healthCheckResultsMetadata;
    @XmlElement(name = "HealthCheckResults", nillable = true)
    protected ArrayOfHealthCheckData healthCheckResults;
    @XmlElement(name = "HealthCheckErrors", nillable = true)
    protected ArrayOfHealthCheckError healthCheckErrors;

    /**
     * Gets the value of the healthCheckResultsMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHealthCheckMetadata }
     *     
     */
    public ArrayOfHealthCheckMetadata getHealthCheckResultsMetadata() {
        return healthCheckResultsMetadata;
    }

    /**
     * Sets the value of the healthCheckResultsMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHealthCheckMetadata }
     *     
     */
    public void setHealthCheckResultsMetadata(ArrayOfHealthCheckMetadata value) {
        this.healthCheckResultsMetadata = value;
    }

    /**
     * Gets the value of the healthCheckResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHealthCheckData }
     *     
     */
    public ArrayOfHealthCheckData getHealthCheckResults() {
        return healthCheckResults;
    }

    /**
     * Sets the value of the healthCheckResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHealthCheckData }
     *     
     */
    public void setHealthCheckResults(ArrayOfHealthCheckData value) {
        this.healthCheckResults = value;
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
