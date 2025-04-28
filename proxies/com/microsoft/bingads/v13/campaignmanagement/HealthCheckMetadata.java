
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HealthCheckMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HealthCheckMetadata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HealthCheckActionLinksMetadata" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfHealthCheckActionLinkMetadata" minOccurs="0"/>
 *         <element name="HealthCheckCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HealthCheckCategoryDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HealthCheckColumnsMetadata" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfHealthCheckColumnMetadata" minOccurs="0"/>
 *         <element name="HealthCheckDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HealthCheckDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HealthCheckHelpTooltip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HealthCheckName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HealthCheckSeverity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HealthCheckSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthCheckMetadata", propOrder = {
    "healthCheckActionLinksMetadata",
    "healthCheckCategory",
    "healthCheckCategoryDisplayName",
    "healthCheckColumnsMetadata",
    "healthCheckDescription",
    "healthCheckDisplayName",
    "healthCheckHelpTooltip",
    "healthCheckName",
    "healthCheckSeverity",
    "healthCheckSubType"
})
public class HealthCheckMetadata {

    @XmlElement(name = "HealthCheckActionLinksMetadata", nillable = true)
    protected ArrayOfHealthCheckActionLinkMetadata healthCheckActionLinksMetadata;
    @XmlElement(name = "HealthCheckCategory", nillable = true)
    protected String healthCheckCategory;
    @XmlElement(name = "HealthCheckCategoryDisplayName", nillable = true)
    protected String healthCheckCategoryDisplayName;
    @XmlElement(name = "HealthCheckColumnsMetadata", nillable = true)
    protected ArrayOfHealthCheckColumnMetadata healthCheckColumnsMetadata;
    @XmlElement(name = "HealthCheckDescription", nillable = true)
    protected String healthCheckDescription;
    @XmlElement(name = "HealthCheckDisplayName", nillable = true)
    protected String healthCheckDisplayName;
    @XmlElement(name = "HealthCheckHelpTooltip", nillable = true)
    protected String healthCheckHelpTooltip;
    @XmlElement(name = "HealthCheckName", nillable = true)
    protected String healthCheckName;
    @XmlElement(name = "HealthCheckSeverity", nillable = true)
    protected String healthCheckSeverity;
    @XmlElement(name = "HealthCheckSubType", nillable = true)
    protected String healthCheckSubType;

    /**
     * Gets the value of the healthCheckActionLinksMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHealthCheckActionLinkMetadata }
     *     
     */
    public ArrayOfHealthCheckActionLinkMetadata getHealthCheckActionLinksMetadata() {
        return healthCheckActionLinksMetadata;
    }

    /**
     * Sets the value of the healthCheckActionLinksMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHealthCheckActionLinkMetadata }
     *     
     */
    public void setHealthCheckActionLinksMetadata(ArrayOfHealthCheckActionLinkMetadata value) {
        this.healthCheckActionLinksMetadata = value;
    }

    /**
     * Gets the value of the healthCheckCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthCheckCategory() {
        return healthCheckCategory;
    }

    /**
     * Sets the value of the healthCheckCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthCheckCategory(String value) {
        this.healthCheckCategory = value;
    }

    /**
     * Gets the value of the healthCheckCategoryDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthCheckCategoryDisplayName() {
        return healthCheckCategoryDisplayName;
    }

    /**
     * Sets the value of the healthCheckCategoryDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthCheckCategoryDisplayName(String value) {
        this.healthCheckCategoryDisplayName = value;
    }

    /**
     * Gets the value of the healthCheckColumnsMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHealthCheckColumnMetadata }
     *     
     */
    public ArrayOfHealthCheckColumnMetadata getHealthCheckColumnsMetadata() {
        return healthCheckColumnsMetadata;
    }

    /**
     * Sets the value of the healthCheckColumnsMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHealthCheckColumnMetadata }
     *     
     */
    public void setHealthCheckColumnsMetadata(ArrayOfHealthCheckColumnMetadata value) {
        this.healthCheckColumnsMetadata = value;
    }

    /**
     * Gets the value of the healthCheckDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthCheckDescription() {
        return healthCheckDescription;
    }

    /**
     * Sets the value of the healthCheckDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthCheckDescription(String value) {
        this.healthCheckDescription = value;
    }

    /**
     * Gets the value of the healthCheckDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthCheckDisplayName() {
        return healthCheckDisplayName;
    }

    /**
     * Sets the value of the healthCheckDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthCheckDisplayName(String value) {
        this.healthCheckDisplayName = value;
    }

    /**
     * Gets the value of the healthCheckHelpTooltip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthCheckHelpTooltip() {
        return healthCheckHelpTooltip;
    }

    /**
     * Sets the value of the healthCheckHelpTooltip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthCheckHelpTooltip(String value) {
        this.healthCheckHelpTooltip = value;
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
     * Gets the value of the healthCheckSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthCheckSeverity() {
        return healthCheckSeverity;
    }

    /**
     * Sets the value of the healthCheckSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthCheckSeverity(String value) {
        this.healthCheckSeverity = value;
    }

    /**
     * Gets the value of the healthCheckSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthCheckSubType() {
        return healthCheckSubType;
    }

    /**
     * Sets the value of the healthCheckSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthCheckSubType(String value) {
        this.healthCheckSubType = value;
    }

}
