
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Breakdowns complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Breakdowns">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Age" type="{https://bingads.microsoft.com/AdInsight/v13}Breakdown" minOccurs="0"/>
 *         <element name="Device" type="{https://bingads.microsoft.com/AdInsight/v13}Breakdown" minOccurs="0"/>
 *         <element name="Gender" type="{https://bingads.microsoft.com/AdInsight/v13}Breakdown" minOccurs="0"/>
 *         <element name="InMarket" type="{https://bingads.microsoft.com/AdInsight/v13}Breakdown" minOccurs="0"/>
 *         <element name="Industry" type="{https://bingads.microsoft.com/AdInsight/v13}Breakdown" minOccurs="0"/>
 *         <element name="JobFunction" type="{https://bingads.microsoft.com/AdInsight/v13}Breakdown" minOccurs="0"/>
 *         <element name="LocationCountry" type="{https://bingads.microsoft.com/AdInsight/v13}LocationBreakdown" minOccurs="0"/>
 *         <element name="Location" type="{https://bingads.microsoft.com/AdInsight/v13}LocationBreakdown" minOccurs="0"/>
 *         <element name="LocationSubGeography" type="{https://bingads.microsoft.com/AdInsight/v13}LocationBreakdown" minOccurs="0"/>
 *         <element name="LocationMetroArea" type="{https://bingads.microsoft.com/AdInsight/v13}LocationBreakdown" minOccurs="0"/>
 *         <element name="LocationCity" type="{https://bingads.microsoft.com/AdInsight/v13}LocationBreakdown" minOccurs="0"/>
 *         <element name="LocationPostalCode" type="{https://bingads.microsoft.com/AdInsight/v13}LocationBreakdown" minOccurs="0"/>
 *         <element name="LocationCounty" type="{https://bingads.microsoft.com/AdInsight/v13}LocationBreakdown" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Breakdowns", propOrder = {
    "age",
    "device",
    "gender",
    "inMarket",
    "industry",
    "jobFunction",
    "locationCountry",
    "location",
    "locationSubGeography",
    "locationMetroArea",
    "locationCity",
    "locationPostalCode",
    "locationCounty"
})
public class Breakdowns {

    @XmlElement(name = "Age", nillable = true)
    protected Breakdown age;
    @XmlElement(name = "Device", nillable = true)
    protected Breakdown device;
    @XmlElement(name = "Gender", nillable = true)
    protected Breakdown gender;
    @XmlElement(name = "InMarket", nillable = true)
    protected Breakdown inMarket;
    @XmlElement(name = "Industry", nillable = true)
    protected Breakdown industry;
    @XmlElement(name = "JobFunction", nillable = true)
    protected Breakdown jobFunction;
    @XmlElement(name = "LocationCountry", nillable = true)
    protected LocationBreakdown locationCountry;
    @XmlElement(name = "Location", nillable = true)
    protected LocationBreakdown location;
    @XmlElement(name = "LocationSubGeography", nillable = true)
    protected LocationBreakdown locationSubGeography;
    @XmlElement(name = "LocationMetroArea", nillable = true)
    protected LocationBreakdown locationMetroArea;
    @XmlElement(name = "LocationCity", nillable = true)
    protected LocationBreakdown locationCity;
    @XmlElement(name = "LocationPostalCode", nillable = true)
    protected LocationBreakdown locationPostalCode;
    @XmlElement(name = "LocationCounty", nillable = true)
    protected LocationBreakdown locationCounty;

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Breakdown }
     *     
     */
    public Breakdown getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Breakdown }
     *     
     */
    public void setAge(Breakdown value) {
        this.age = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link Breakdown }
     *     
     */
    public Breakdown getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link Breakdown }
     *     
     */
    public void setDevice(Breakdown value) {
        this.device = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Breakdown }
     *     
     */
    public Breakdown getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Breakdown }
     *     
     */
    public void setGender(Breakdown value) {
        this.gender = value;
    }

    /**
     * Gets the value of the inMarket property.
     * 
     * @return
     *     possible object is
     *     {@link Breakdown }
     *     
     */
    public Breakdown getInMarket() {
        return inMarket;
    }

    /**
     * Sets the value of the inMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Breakdown }
     *     
     */
    public void setInMarket(Breakdown value) {
        this.inMarket = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link Breakdown }
     *     
     */
    public Breakdown getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Breakdown }
     *     
     */
    public void setIndustry(Breakdown value) {
        this.industry = value;
    }

    /**
     * Gets the value of the jobFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Breakdown }
     *     
     */
    public Breakdown getJobFunction() {
        return jobFunction;
    }

    /**
     * Sets the value of the jobFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Breakdown }
     *     
     */
    public void setJobFunction(Breakdown value) {
        this.jobFunction = value;
    }

    /**
     * Gets the value of the locationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link LocationBreakdown }
     *     
     */
    public LocationBreakdown getLocationCountry() {
        return locationCountry;
    }

    /**
     * Sets the value of the locationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationBreakdown }
     *     
     */
    public void setLocationCountry(LocationBreakdown value) {
        this.locationCountry = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationBreakdown }
     *     
     */
    public LocationBreakdown getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationBreakdown }
     *     
     */
    public void setLocation(LocationBreakdown value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationSubGeography property.
     * 
     * @return
     *     possible object is
     *     {@link LocationBreakdown }
     *     
     */
    public LocationBreakdown getLocationSubGeography() {
        return locationSubGeography;
    }

    /**
     * Sets the value of the locationSubGeography property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationBreakdown }
     *     
     */
    public void setLocationSubGeography(LocationBreakdown value) {
        this.locationSubGeography = value;
    }

    /**
     * Gets the value of the locationMetroArea property.
     * 
     * @return
     *     possible object is
     *     {@link LocationBreakdown }
     *     
     */
    public LocationBreakdown getLocationMetroArea() {
        return locationMetroArea;
    }

    /**
     * Sets the value of the locationMetroArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationBreakdown }
     *     
     */
    public void setLocationMetroArea(LocationBreakdown value) {
        this.locationMetroArea = value;
    }

    /**
     * Gets the value of the locationCity property.
     * 
     * @return
     *     possible object is
     *     {@link LocationBreakdown }
     *     
     */
    public LocationBreakdown getLocationCity() {
        return locationCity;
    }

    /**
     * Sets the value of the locationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationBreakdown }
     *     
     */
    public void setLocationCity(LocationBreakdown value) {
        this.locationCity = value;
    }

    /**
     * Gets the value of the locationPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link LocationBreakdown }
     *     
     */
    public LocationBreakdown getLocationPostalCode() {
        return locationPostalCode;
    }

    /**
     * Sets the value of the locationPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationBreakdown }
     *     
     */
    public void setLocationPostalCode(LocationBreakdown value) {
        this.locationPostalCode = value;
    }

    /**
     * Gets the value of the locationCounty property.
     * 
     * @return
     *     possible object is
     *     {@link LocationBreakdown }
     *     
     */
    public LocationBreakdown getLocationCounty() {
        return locationCounty;
    }

    /**
     * Sets the value of the locationCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationBreakdown }
     *     
     */
    public void setLocationCounty(LocationBreakdown value) {
        this.locationCounty = value;
    }

}
