
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="TimeInterval" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}TimeInterval" minOccurs="0"/>
 *         &lt;element name="TargetAdPosition" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}AdPosition" minOccurs="0"/>
 *         &lt;element name="MatchTypes" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}ArrayOfMatchType" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublisherCountries" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
    "timeInterval",
    "targetAdPosition",
    "matchTypes",
    "language",
    "publisherCountries",
    "devices"
})
@XmlRootElement(name = "GetHistoricalKeywordPerformanceRequest", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11")
public class GetHistoricalKeywordPerformanceRequest {

    @XmlElement(name = "Keywords", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected ArrayOfstring keywords;
    @XmlElement(name = "TimeInterval", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    @XmlSchemaType(name = "string")
    protected TimeInterval timeInterval;
    @XmlElement(name = "TargetAdPosition", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    @XmlSchemaType(name = "string")
    protected AdPosition targetAdPosition;
    @XmlElement(name = "MatchTypes", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected ArrayOfMatchType matchTypes;
    @XmlElement(name = "Language", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected String language;
    @XmlElement(name = "PublisherCountries", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected ArrayOfstring publisherCountries;
    @XmlElement(name = "Devices", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
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
     * Gets the value of the timeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getTimeInterval() {
        return timeInterval;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setTimeInterval(TimeInterval value) {
        this.timeInterval = value;
    }

    /**
     * Gets the value of the targetAdPosition property.
     * 
     * @return
     *     possible object is
     *     {@link AdPosition }
     *     
     */
    public AdPosition getTargetAdPosition() {
        return targetAdPosition;
    }

    /**
     * Sets the value of the targetAdPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdPosition }
     *     
     */
    public void setTargetAdPosition(AdPosition value) {
        this.targetAdPosition = value;
    }

    /**
     * Gets the value of the matchTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMatchType }
     *     
     */
    public ArrayOfMatchType getMatchTypes() {
        return matchTypes;
    }

    /**
     * Sets the value of the matchTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMatchType }
     *     
     */
    public void setMatchTypes(ArrayOfMatchType value) {
        this.matchTypes = value;
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
