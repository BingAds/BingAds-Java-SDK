
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HealthCheckEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HealthCheckEntity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HealthCheckEntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="HealthCheckEntityLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthCheckEntity", propOrder = {
    "healthCheckEntityId",
    "healthCheckEntityLevel"
})
public class HealthCheckEntity {

    @XmlElement(name = "HealthCheckEntityId")
    protected Long healthCheckEntityId;
    @XmlElement(name = "HealthCheckEntityLevel", nillable = true)
    protected String healthCheckEntityLevel;

    /**
     * Gets the value of the healthCheckEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHealthCheckEntityId() {
        return healthCheckEntityId;
    }

    /**
     * Sets the value of the healthCheckEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHealthCheckEntityId(Long value) {
        this.healthCheckEntityId = value;
    }

    /**
     * Gets the value of the healthCheckEntityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthCheckEntityLevel() {
        return healthCheckEntityLevel;
    }

    /**
     * Sets the value of the healthCheckEntityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthCheckEntityLevel(String value) {
        this.healthCheckEntityLevel = value;
    }

}
