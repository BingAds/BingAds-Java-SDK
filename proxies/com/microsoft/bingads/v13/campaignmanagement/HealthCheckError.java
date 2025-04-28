
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HealthCheckError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HealthCheckError">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Errors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfOperationError" minOccurs="0"/>
 *         <element name="HealthCheckEntity" type="{https://bingads.microsoft.com/CampaignManagement/v13}HealthCheckEntity" minOccurs="0"/>
 *         <element name="HealthCheckName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthCheckError", propOrder = {
    "errors",
    "healthCheckEntity",
    "healthCheckName"
})
public class HealthCheckError {

    @XmlElement(name = "Errors", nillable = true)
    protected ArrayOfOperationError errors;
    @XmlElement(name = "HealthCheckEntity", nillable = true)
    protected HealthCheckEntity healthCheckEntity;
    @XmlElement(name = "HealthCheckName", nillable = true)
    protected String healthCheckName;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOperationError }
     *     
     */
    public ArrayOfOperationError getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOperationError }
     *     
     */
    public void setErrors(ArrayOfOperationError value) {
        this.errors = value;
    }

    /**
     * Gets the value of the healthCheckEntity property.
     * 
     * @return
     *     possible object is
     *     {@link HealthCheckEntity }
     *     
     */
    public HealthCheckEntity getHealthCheckEntity() {
        return healthCheckEntity;
    }

    /**
     * Sets the value of the healthCheckEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthCheckEntity }
     *     
     */
    public void setHealthCheckEntity(HealthCheckEntity value) {
        this.healthCheckEntity = value;
    }

    /**
     * Gets the value of the healthCheckName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthCheckName() {
        return healthCheckName;
    }

    /**
     * Sets the value of the healthCheckName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthCheckName(String value) {
        this.healthCheckName = value;
    }

}
