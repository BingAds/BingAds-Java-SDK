
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallAdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CallAdExtension">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtension">
 *       <sequence>
 *         <element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsCallOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsCallTrackingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RequireTollFreeTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallAdExtension", propOrder = {
    "countryCode",
    "isCallOnly",
    "isCallTrackingEnabled",
    "phoneNumber",
    "requireTollFreeTrackingNumber"
})
public class CallAdExtension
    extends AdExtension
{
    public CallAdExtension() {
      this.type = "CallAdExtension";
    }

    @XmlElement(name = "CountryCode", nillable = true)
    protected String countryCode;
    @XmlElement(name = "IsCallOnly", nillable = true)
    protected Boolean isCallOnly;
    @XmlElement(name = "IsCallTrackingEnabled", nillable = true)
    protected Boolean isCallTrackingEnabled;
    @XmlElement(name = "PhoneNumber", nillable = true)
    protected String phoneNumber;
    @XmlElement(name = "RequireTollFreeTrackingNumber", nillable = true)
    protected Boolean requireTollFreeTrackingNumber;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the isCallOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsCallOnly() {
        return isCallOnly;
    }

    /**
     * Sets the value of the isCallOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCallOnly(Boolean value) {
        this.isCallOnly = value;
    }

    /**
     * Gets the value of the isCallTrackingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsCallTrackingEnabled() {
        return isCallTrackingEnabled;
    }

    /**
     * Sets the value of the isCallTrackingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCallTrackingEnabled(Boolean value) {
        this.isCallTrackingEnabled = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the requireTollFreeTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRequireTollFreeTrackingNumber() {
        return requireTollFreeTrackingNumber;
    }

    /**
     * Sets the value of the requireTollFreeTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireTollFreeTrackingNumber(Boolean value) {
        this.requireTollFreeTrackingNumber = value;
    }

}
