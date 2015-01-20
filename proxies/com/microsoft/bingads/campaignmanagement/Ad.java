
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DevicePreference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EditorialStatus" type="{https://bingads.microsoft.com/CampaignManagement/v9}AdEditorialStatus" minOccurs="0"/>
 *         &lt;element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Status" type="{https://bingads.microsoft.com/CampaignManagement/v9}AdStatus" minOccurs="0"/>
 *         &lt;element name="Type" type="{https://bingads.microsoft.com/CampaignManagement/v9}AdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ad", propOrder = {
    "devicePreference",
    "editorialStatus",
    "forwardCompatibilityMap",
    "id",
    "status",
    "type"
})
@XmlSeeAlso({
    ProductAd.class,
    MobileAd.class,
    TextAd.class
})
public class Ad {

    @XmlElement(name = "DevicePreference", nillable = true)
    protected Long devicePreference;
    @XmlElement(name = "EditorialStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected AdEditorialStatus editorialStatus;
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "Status", nillable = true)
    @XmlSchemaType(name = "string")
    protected AdStatus status;
    @XmlElement(name = "Type", nillable = true)
    @XmlSchemaType(name = "string")
    protected AdType type;

    /**
     * Gets the value of the devicePreference property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevicePreference() {
        return devicePreference;
    }

    /**
     * Sets the value of the devicePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevicePreference(Long value) {
        this.devicePreference = value;
    }

    /**
     * Gets the value of the editorialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AdEditorialStatus }
     *     
     */
    public AdEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }

    /**
     * Sets the value of the editorialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdEditorialStatus }
     *     
     */
    public void setEditorialStatus(AdEditorialStatus value) {
        this.editorialStatus = value;
    }

    /**
     * Gets the value of the forwardCompatibilityMap property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public ArrayOfKeyValuePairOfstringstring getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }

    /**
     * Sets the value of the forwardCompatibilityMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public void setForwardCompatibilityMap(ArrayOfKeyValuePairOfstringstring value) {
        this.forwardCompatibilityMap = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AdStatus }
     *     
     */
    public AdStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdStatus }
     *     
     */
    public void setStatus(AdStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AdType }
     *     
     */
    public AdType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdType }
     *     
     */
    public void setType(AdType value) {
        this.type = value;
    }

}
