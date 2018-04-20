
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationAdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationAdExtension">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v12}AdExtension">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{https://bingads.microsoft.com/CampaignManagement/v12}Address" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GeoCodeStatus" type="{https://bingads.microsoft.com/CampaignManagement/v12}BusinessGeoCodeStatus" minOccurs="0"/>
 *         &lt;element name="GeoPoint" type="{https://bingads.microsoft.com/CampaignManagement/v12}GeoPoint" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
