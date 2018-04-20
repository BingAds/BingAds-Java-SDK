
package com.microsoft.bingads.v12.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Keywords" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublisherCountries" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V12.Entity}DayMonthAndYear" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V12.Entity}DayMonthAndYear" minOccurs="0"/>
 *         &lt;element name="TimePeriodRollup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Devices" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keywords",
    "language",
    "publisherCountries",
    "startDate",
    "endDate",
    "timePeriodRollup",
    "devices"
})
@XmlRootElement(name = "GetHistoricalSearchCountRequest", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12")
public class GetHistoricalSearchCountRequest {

    @XmlElement(name = "Keywords", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected ArrayOfstring keywords;
    @XmlElement(name = "Language", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected String language;
    @XmlElement(name = "PublisherCountries", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected ArrayOfstring publisherCountries;
    @XmlElement(name = "StartDate", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected DayMonthAndYear startDate;
    @XmlElement(name = "EndDate", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected DayMonthAndYear endDate;
    @XmlElement(name = "TimePeriodRollup", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected String timePeriodRollup;
    @XmlElement(name = "Devices", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected ArrayOfstring devices;

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setKeywords(ArrayOfstring value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the publisherCountries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getPublisherCountries() {
        return publisherCountries;
    }

    /**
     * Sets the value of the publisherCountries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setPublisherCountries(ArrayOfstring value) {
        this.publisherCountries = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DayMonthAndYear }
     *     
     */
    public DayMonthAndYear getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayMonthAndYear }
     *     
     */
    public void setStartDate(DayMonthAndYear value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link DayMonthAndYear }
     *     
     */
    public DayMonthAndYear getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayMonthAndYear }
     *     
     */
    public void setEndDate(DayMonthAndYear value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the timePeriodRollup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimePeriodRollup() {
        return timePeriodRollup;
    }

    /**
     * Sets the value of the timePeriodRollup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimePeriodRollup(String value) {
        this.timePeriodRollup = value;
    }

    /**
     * Gets the value of the devices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getDevices() {
        return devices;
    }

    /**
     * Sets the value of the devices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setDevices(ArrayOfstring value) {
        this.devices = value;
    }

}
