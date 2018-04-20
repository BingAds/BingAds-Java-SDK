
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
 *         &lt;element name="PublisherCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Device" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxLocations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "publisherCountry",
    "device",
    "level",
    "parentCountry",
    "maxLocations"
})
@XmlRootElement(name = "GetKeywordLocationsRequest", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12")
public class GetKeywordLocationsRequest {

    @XmlElement(name = "Keywords", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected ArrayOfstring keywords;
    @XmlElement(name = "Language", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected String language;
    @XmlElement(name = "PublisherCountry", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected String publisherCountry;
    @XmlElement(name = "Device", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected ArrayOfstring device;
    @XmlElement(name = "Level", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected Integer level;
    @XmlElement(name = "ParentCountry", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected String parentCountry;
    @XmlElement(name = "MaxLocations", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected Integer maxLocations;

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
     * Gets the value of the publisherCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherCountry() {
        return publisherCountry;
    }

    /**
     * Sets the value of the publisherCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherCountry(String value) {
        this.publisherCountry = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setDevice(ArrayOfstring value) {
        this.device = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLevel(Integer value) {
        this.level = value;
    }

    /**
     * Gets the value of the parentCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCountry() {
        return parentCountry;
    }

    /**
     * Sets the value of the parentCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCountry(String value) {
        this.parentCountry = value;
    }

    /**
     * Gets the value of the maxLocations property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLocations() {
        return maxLocations;
    }

    /**
     * Sets the value of the maxLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLocations(Integer value) {
        this.maxLocations = value;
    }

}
