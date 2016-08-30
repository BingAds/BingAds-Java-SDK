
package com.microsoft.bingads.v10.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sample complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sample">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdDisplayUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LandingPageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sample", propOrder = {
    "adDescription",
    "adDisplayUrl",
    "adTitle",
    "landingPageUrl",
    "searchQuery"
})
public class Sample {

    @XmlElement(name = "AdDescription", nillable = true)
    protected String adDescription;
    @XmlElement(name = "AdDisplayUrl", nillable = true)
    protected String adDisplayUrl;
    @XmlElement(name = "AdTitle", nillable = true)
    protected String adTitle;
    @XmlElement(name = "LandingPageUrl", nillable = true)
    protected String landingPageUrl;
    @XmlElement(name = "SearchQuery", nillable = true)
    protected String searchQuery;

    /**
     * Gets the value of the adDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdDescription() {
        return adDescription;
    }

    /**
     * Sets the value of the adDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdDescription(String value) {
        this.adDescription = value;
    }

    /**
     * Gets the value of the adDisplayUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdDisplayUrl() {
        return adDisplayUrl;
    }

    /**
     * Sets the value of the adDisplayUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdDisplayUrl(String value) {
        this.adDisplayUrl = value;
    }

    /**
     * Gets the value of the adTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdTitle() {
        return adTitle;
    }

    /**
     * Sets the value of the adTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdTitle(String value) {
        this.adTitle = value;
    }

    /**
     * Gets the value of the landingPageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandingPageUrl() {
        return landingPageUrl;
    }

    /**
     * Sets the value of the landingPageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandingPageUrl(String value) {
        this.landingPageUrl = value;
    }

    /**
     * Gets the value of the searchQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchQuery() {
        return searchQuery;
    }

    /**
     * Sets the value of the searchQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchQuery(String value) {
        this.searchQuery = value;
    }

}
