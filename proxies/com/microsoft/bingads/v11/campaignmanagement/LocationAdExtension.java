
package com.microsoft.bingads.v11.campaignmanagement;

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
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v11}AdExtension">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{https://bingads.microsoft.com/CampaignManagement/v11}Address"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GeoCodeStatus" type="{https://bingads.microsoft.com/CampaignManagement/v11}BusinessGeoCodeStatus" minOccurs="0"/>
 *         &lt;element name="GeoPoint" type="{https://bingads.microsoft.com/CampaignManagement/v11}GeoPoint" minOccurs="0"/>
 *         &lt;element name="IconMediaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ImageMediaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "iconMediaId",
    "imageMediaId",
    "phoneNumber"
})
public class LocationAdExtension
    extends AdExtension
{

    @XmlElement(name = "Address", required = true, nillable = true)
    protected Address address;
    @XmlElement(name = "CompanyName", required = true, nillable = true)
    protected String companyName;
    @XmlElement(name = "GeoCodeStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected BusinessGeoCodeStatus geoCodeStatus;
    @XmlElement(name = "GeoPoint", nillable = true)
    protected GeoPoint geoPoint;
    @XmlElement(name = "IconMediaId", nillable = true)
    protected Long iconMediaId;
    @XmlElement(name = "ImageMediaId", nillable = true)
    protected Long imageMediaId;
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
     * Gets the value of the iconMediaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIconMediaId() {
        return iconMediaId;
    }

    /**
     * Sets the value of the iconMediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIconMediaId(Long value) {
        this.iconMediaId = value;
    }

    /**
     * Gets the value of the imageMediaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImageMediaId() {
        return imageMediaId;
    }

    /**
     * Sets the value of the imageMediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImageMediaId(Long value) {
        this.imageMediaId = value;
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
