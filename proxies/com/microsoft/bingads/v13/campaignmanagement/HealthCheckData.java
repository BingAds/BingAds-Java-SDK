
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HealthCheckData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HealthCheckData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HealthCheckDataVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HealthCheckEntity" type="{https://bingads.microsoft.com/CampaignManagement/v13}HealthCheckEntity" minOccurs="0"/>
 *         <element name="HealthCheckJsonData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HealthCheckName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HealthCheckSubEntityResults" type="{https://bingads.microsoft.com/CampaignManagement/v13}HealthCheckSubEntityData" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthCheckData", propOrder = {
    "healthCheckDataVersion",
    "healthCheckEntity",
    "healthCheckJsonData",
    "healthCheckName",
    "healthCheckSubEntityResults"
})
public class HealthCheckData {

    @XmlElement(name = "HealthCheckDataVersion", nillable = true)
    protected String healthCheckDataVersion;
    @XmlElement(name = "HealthCheckEntity", nillable = true)
    protected HealthCheckEntity healthCheckEntity;
    @XmlElement(name = "HealthCheckJsonData", nillable = true)
    protected String healthCheckJsonData;
    @XmlElement(name = "HealthCheckName", nillable = true)
    protected String healthCheckName;
    @XmlElement(name = "HealthCheckSubEntityResults", nillable = true)
    protected HealthCheckSubEntityData healthCheckSubEntityResults;

    /**
     * Gets the value of the healthCheckDataVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthCheckDataVersion() {
        return healthCheckDataVersion;
    }

    /**
     * Sets the value of the healthCheckDataVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthCheckDataVersion(String value) {
        this.healthCheckDataVersion = value;
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
     * Gets the value of the healthCheckJsonData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthCheckJsonData() {
        return healthCheckJsonData;
    }

    /**
     * Sets the value of the healthCheckJsonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthCheckJsonData(String value) {
        this.healthCheckJsonData = value;
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

    /**
     * Gets the value of the healthCheckSubEntityResults property.
     * 
     * @return
     *     possible object is
     *     {@link HealthCheckSubEntityData }
     *     
     */
    public HealthCheckSubEntityData getHealthCheckSubEntityResults() {
        return healthCheckSubEntityResults;
    }

    /**
     * Sets the value of the healthCheckSubEntityResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthCheckSubEntityData }
     *     
     */
    public void setHealthCheckSubEntityResults(HealthCheckSubEntityData value) {
        this.healthCheckSubEntityResults = value;
    }

}
