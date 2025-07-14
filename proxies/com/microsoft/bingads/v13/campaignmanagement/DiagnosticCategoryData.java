
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticCategoryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DiagnosticCategoryData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActionLinks" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfHealthCheckActionLinkMetadata" minOccurs="0"/>
 *         <element name="CategoryDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CategoryKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CategorySeverity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CategoryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosticCategoryData", propOrder = {
    "actionLinks",
    "categoryDisplayName",
    "categoryKey",
    "categorySeverity",
    "categoryStatus",
    "description"
})
public class DiagnosticCategoryData {

    @XmlElement(name = "ActionLinks", nillable = true)
    protected ArrayOfHealthCheckActionLinkMetadata actionLinks;
    @XmlElement(name = "CategoryDisplayName", nillable = true)
    protected String categoryDisplayName;
    @XmlElement(name = "CategoryKey", nillable = true)
    protected String categoryKey;
    @XmlElement(name = "CategorySeverity", nillable = true)
    protected String categorySeverity;
    @XmlElement(name = "CategoryStatus", nillable = true)
    protected String categoryStatus;
    @XmlElement(name = "Description", nillable = true)
    protected String description;

    /**
     * Gets the value of the actionLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHealthCheckActionLinkMetadata }
     *     
     */
    public ArrayOfHealthCheckActionLinkMetadata getActionLinks() {
        return actionLinks;
    }

    /**
     * Sets the value of the actionLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHealthCheckActionLinkMetadata }
     *     
     */
    public void setActionLinks(ArrayOfHealthCheckActionLinkMetadata value) {
        this.actionLinks = value;
    }

    /**
     * Gets the value of the categoryDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryDisplayName() {
        return categoryDisplayName;
    }

    /**
     * Sets the value of the categoryDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryDisplayName(String value) {
        this.categoryDisplayName = value;
    }

    /**
     * Gets the value of the categoryKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryKey() {
        return categoryKey;
    }

    /**
     * Sets the value of the categoryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryKey(String value) {
        this.categoryKey = value;
    }

    /**
     * Gets the value of the categorySeverity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategorySeverity() {
        return categorySeverity;
    }

    /**
     * Sets the value of the categorySeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategorySeverity(String value) {
        this.categorySeverity = value;
    }

    /**
     * Gets the value of the categoryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryStatus() {
        return categoryStatus;
    }

    /**
     * Sets the value of the categoryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryStatus(String value) {
        this.categoryStatus = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
