
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UetTag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UetTag">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CustomerShare" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomerShare" minOccurs="0"/>
 *         <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TrackingNoScript" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TrackingScript" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TrackingStatus" type="{https://bingads.microsoft.com/CampaignManagement/v13}UetTagTrackingStatus" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UetTag", propOrder = {
    "customerShare",
    "description",
    "id",
    "name",
    "trackingNoScript",
    "trackingScript",
    "trackingStatus"
})
public class UetTag {

    @XmlElement(name = "CustomerShare", nillable = true)
    protected CustomerShare customerShare;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "TrackingNoScript", nillable = true)
    protected String trackingNoScript;
    @XmlElement(name = "TrackingScript", nillable = true)
    protected String trackingScript;
    @XmlElement(name = "TrackingStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected UetTagTrackingStatus trackingStatus;

    /**
     * Gets the value of the customerShare property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerShare }
     *     
     */
    public CustomerShare getCustomerShare() {
        return customerShare;
    }

    /**
     * Sets the value of the customerShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerShare }
     *     
     */
    public void setCustomerShare(CustomerShare value) {
        this.customerShare = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the trackingNoScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNoScript() {
        return trackingNoScript;
    }

    /**
     * Sets the value of the trackingNoScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNoScript(String value) {
        this.trackingNoScript = value;
    }

    /**
     * Gets the value of the trackingScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingScript() {
        return trackingScript;
    }

    /**
     * Sets the value of the trackingScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingScript(String value) {
        this.trackingScript = value;
    }

    /**
     * Gets the value of the trackingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UetTagTrackingStatus }
     *     
     */
    public UetTagTrackingStatus getTrackingStatus() {
        return trackingStatus;
    }

    /**
     * Sets the value of the trackingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UetTagTrackingStatus }
     *     
     */
    public void setTrackingStatus(UetTagTrackingStatus value) {
        this.trackingStatus = value;
    }

}
