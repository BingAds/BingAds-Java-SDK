
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SitelinkAdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SitelinkAdExtension">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtension">
 *       <sequence>
 *         <element name="Description1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Description2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DestinationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DisplayText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FinalAppUrls" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAppUrl" minOccurs="0"/>
 *         <element name="FinalMobileUrls" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="FinalUrlSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FinalUrls" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="TrackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UrlCustomParameters" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomParameters" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SitelinkAdExtension", propOrder = {
    "description1",
    "description2",
    "destinationUrl",
    "displayText",
    "finalAppUrls",
    "finalMobileUrls",
    "finalUrlSuffix",
    "finalUrls",
    "trackingUrlTemplate",
    "urlCustomParameters"
})
public class SitelinkAdExtension
    extends AdExtension
{
    public SitelinkAdExtension() {
      this.type = "SitelinkAdExtension";
    }

    @XmlElement(name = "Description1", nillable = true)
    protected String description1;
    @XmlElement(name = "Description2", nillable = true)
    protected String description2;
    @XmlElement(name = "DestinationUrl", nillable = true)
    protected String destinationUrl;
    @XmlElement(name = "DisplayText", nillable = true)
    protected String displayText;
    @XmlElement(name = "FinalAppUrls", nillable = true)
    protected ArrayOfAppUrl finalAppUrls;
    @XmlElement(name = "FinalMobileUrls", nillable = true)
    protected ArrayOfstring finalMobileUrls;
    @XmlElement(name = "FinalUrlSuffix", nillable = true)
    protected String finalUrlSuffix;
    @XmlElement(name = "FinalUrls", nillable = true)
    protected ArrayOfstring finalUrls;
    @XmlElement(name = "TrackingUrlTemplate", nillable = true)
    protected String trackingUrlTemplate;
    @XmlElement(name = "UrlCustomParameters", nillable = true)
    protected CustomParameters urlCustomParameters;

    /**
     * Gets the value of the description1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription1() {
        return description1;
    }

    /**
     * Sets the value of the description1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription1(String value) {
        this.description1 = value;
    }

    /**
     * Gets the value of the description2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription2() {
        return description2;
    }

    /**
     * Sets the value of the description2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription2(String value) {
        this.description2 = value;
    }

    /**
     * Gets the value of the destinationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    /**
     * Sets the value of the destinationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUrl(String value) {
        this.destinationUrl = value;
    }

    /**
     * Gets the value of the displayText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Sets the value of the displayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayText(String value) {
        this.displayText = value;
    }

    /**
     * Gets the value of the finalAppUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAppUrl }
     *     
     */
    public ArrayOfAppUrl getFinalAppUrls() {
        return finalAppUrls;
    }

    /**
     * Sets the value of the finalAppUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAppUrl }
     *     
     */
    public void setFinalAppUrls(ArrayOfAppUrl value) {
        this.finalAppUrls = value;
    }

    /**
     * Gets the value of the finalMobileUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getFinalMobileUrls() {
        return finalMobileUrls;
    }

    /**
     * Sets the value of the finalMobileUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setFinalMobileUrls(ArrayOfstring value) {
        this.finalMobileUrls = value;
    }

    /**
     * Gets the value of the finalUrlSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalUrlSuffix() {
        return finalUrlSuffix;
    }

    /**
     * Sets the value of the finalUrlSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalUrlSuffix(String value) {
        this.finalUrlSuffix = value;
    }

    /**
     * Gets the value of the finalUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getFinalUrls() {
        return finalUrls;
    }

    /**
     * Sets the value of the finalUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setFinalUrls(ArrayOfstring value) {
        this.finalUrls = value;
    }

    /**
     * Gets the value of the trackingUrlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }

    /**
     * Sets the value of the trackingUrlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingUrlTemplate(String value) {
        this.trackingUrlTemplate = value;
    }

    /**
     * Gets the value of the urlCustomParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CustomParameters }
     *     
     */
    public CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }

    /**
     * Sets the value of the urlCustomParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomParameters }
     *     
     */
    public void setUrlCustomParameters(CustomParameters value) {
        this.urlCustomParameters = value;
    }

}
