
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordLocationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordLocationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Device" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeywordLocations" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}ArrayOfKeywordLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordLocationResult", propOrder = {
    "keyword",
    "device",
    "keywordLocations"
})
public class KeywordLocationResult {

    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "Device", nillable = true)
    protected String device;
    @XmlElement(name = "KeywordLocations", nillable = true)
    protected ArrayOfKeywordLocation keywordLocations;

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

    /**
     * Gets the value of the keywordLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordLocation }
     *     
     */
    public ArrayOfKeywordLocation getKeywordLocations() {
        return keywordLocations;
    }

    /**
     * Sets the value of the keywordLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordLocation }
     *     
     */
    public void setKeywordLocations(ArrayOfKeywordLocation value) {
        this.keywordLocations = value;
    }

}
