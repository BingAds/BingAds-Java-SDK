
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LocationCondition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ExcludedLocationIntent" type="{https://bingads.microsoft.com/CampaignManagement/v13}IntentOption" minOccurs="0"/>
 *         <element name="ExcludedLocations" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfLocationConditionItem" minOccurs="0"/>
 *         <element name="IncludedLocationIntent" type="{https://bingads.microsoft.com/CampaignManagement/v13}IntentOption" minOccurs="0"/>
 *         <element name="IncludedLocations" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfLocationConditionItem" minOccurs="0"/>
 *         <element name="IsPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCondition", propOrder = {
    "excludedLocationIntent",
    "excludedLocations",
    "includedLocationIntent",
    "includedLocations",
    "isPrimary"
})
public class LocationCondition {

    @XmlElement(name = "ExcludedLocationIntent", nillable = true)
    @XmlSchemaType(name = "string")
    protected IntentOption excludedLocationIntent;
    @XmlElement(name = "ExcludedLocations", nillable = true)
    protected ArrayOfLocationConditionItem excludedLocations;
    @XmlElement(name = "IncludedLocationIntent", nillable = true)
    @XmlSchemaType(name = "string")
    protected IntentOption includedLocationIntent;
    @XmlElement(name = "IncludedLocations", nillable = true)
    protected ArrayOfLocationConditionItem includedLocations;
    @XmlElement(name = "IsPrimary")
    protected Boolean isPrimary;

    /**
     * Gets the value of the excludedLocationIntent property.
     * 
     * @return
     *     possible object is
     *     {@link IntentOption }
     *     
     */
    public IntentOption getExcludedLocationIntent() {
        return excludedLocationIntent;
    }

    /**
     * Sets the value of the excludedLocationIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntentOption }
     *     
     */
    public void setExcludedLocationIntent(IntentOption value) {
        this.excludedLocationIntent = value;
    }

    /**
     * Gets the value of the excludedLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocationConditionItem }
     *     
     */
    public ArrayOfLocationConditionItem getExcludedLocations() {
        return excludedLocations;
    }

    /**
     * Sets the value of the excludedLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocationConditionItem }
     *     
     */
    public void setExcludedLocations(ArrayOfLocationConditionItem value) {
        this.excludedLocations = value;
    }

    /**
     * Gets the value of the includedLocationIntent property.
     * 
     * @return
     *     possible object is
     *     {@link IntentOption }
     *     
     */
    public IntentOption getIncludedLocationIntent() {
        return includedLocationIntent;
    }

    /**
     * Sets the value of the includedLocationIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntentOption }
     *     
     */
    public void setIncludedLocationIntent(IntentOption value) {
        this.includedLocationIntent = value;
    }

    /**
     * Gets the value of the includedLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocationConditionItem }
     *     
     */
    public ArrayOfLocationConditionItem getIncludedLocations() {
        return includedLocations;
    }

    /**
     * Sets the value of the includedLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocationConditionItem }
     *     
     */
    public void setIncludedLocations(ArrayOfLocationConditionItem value) {
        this.includedLocations = value;
    }

    /**
     * Gets the value of the isPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets the value of the isPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimary(Boolean value) {
        this.isPrimary = value;
    }

}
