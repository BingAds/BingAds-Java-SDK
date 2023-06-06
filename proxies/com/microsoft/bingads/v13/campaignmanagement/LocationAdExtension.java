
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationAdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LocationAdExtension">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtension">
 *       <sequence>
 *         <element name="Address" type="{https://bingads.microsoft.com/CampaignManagement/v13}Address" minOccurs="0"/>
 *         <element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="GeoCodeStatus" type="{https://bingads.microsoft.com/CampaignManagement/v13}BusinessGeoCodeStatus" minOccurs="0"/>
 *         <element name="GeoPoint" type="{https://bingads.microsoft.com/CampaignManagement/v13}GeoPoint" minOccurs="0"/>
 *         <element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationAdExtension", propOrder = {
    "address",
    "companyName",
    "geoCodeStatus",
    "geoPoint",
    "phoneNumber"
})
public class LocationAdExtension
    extends AdExtension
{

    @XmlElement(name = "Address", nillable = true)
    protected Address address;
    @XmlElement(name = "CompanyName", nillable = true)
    protected String companyName;
    @XmlElement(name = "GeoCodeStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected BusinessGeoCodeStatus geoCodeStatus;
    @XmlElement(name = "GeoPoint", nillable = true)
    protected GeoPoint geoPoint;
    @XmlElement(name = "PhoneNumber", nillable = true)
    protected String phoneNumber;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the geoCodeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessGeoCodeStatus }
     *     
     */
    public BusinessGeoCodeStatus getGeoCodeStatus() {
        return geoCodeStatus;
    }

    /**
     * Sets the value of the geoCodeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessGeoCodeStatus }
     *     
     */
    public void setGeoCodeStatus(BusinessGeoCodeStatus value) {
        this.geoCodeStatus = value;
    }

    /**
     * Gets the value of the geoPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeoPoint }
     *     
     */
    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    /**
     * Sets the value of the geoPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoPoint }
     *     
     */
    public void setGeoPoint(GeoPoint value) {
        this.geoPoint = value;
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

}
