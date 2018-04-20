
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceAdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceAdExtension">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v12}AdExtension">
 *       &lt;sequence>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceExtensionType" type="{https://bingads.microsoft.com/CampaignManagement/v12}PriceExtensionType"/>
 *         &lt;element name="TableRows" type="{https://bingads.microsoft.com/CampaignManagement/v12}ArrayOfPriceTableRow" minOccurs="0"/>
 *         &lt;element name="TrackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UrlCustomParameters" type="{https://bingads.microsoft.com/CampaignManagement/v12}CustomParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceAdExtension", propOrder = {
    "language",
    "priceExtensionType",
    "tableRows",
    "trackingUrlTemplate",
    "urlCustomParameters"
})
public class PriceAdExtension
    extends AdExtension
{

    @XmlElement(name = "Language", nillable = true)
    protected String language;
    @XmlElement(name = "PriceExtensionType", required = true)
    @XmlSchemaType(name = "string")
    protected PriceExtensionType priceExtensionType;
    @XmlElement(name = "TableRows", nillable = true)
    protected ArrayOfPriceTableRow tableRows;
    @XmlElement(name = "TrackingUrlTemplate", nillable = true)
    protected String trackingUrlTemplate;
    @XmlElement(name = "UrlCustomParameters", nillable = true)
    protected CustomParameters urlCustomParameters;

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
     * Gets the value of the priceExtensionType property.
     * 
     * @return
     *     possible object is
     *     {@link PriceExtensionType }
     *     
     */
    public PriceExtensionType getPriceExtensionType() {
        return priceExtensionType;
    }

    /**
     * Sets the value of the priceExtensionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceExtensionType }
     *     
     */
    public void setPriceExtensionType(PriceExtensionType value) {
        this.priceExtensionType = value;
    }

    /**
     * Gets the value of the tableRows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPriceTableRow }
     *     
     */
    public ArrayOfPriceTableRow getTableRows() {
        return tableRows;
    }

    /**
     * Sets the value of the tableRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPriceTableRow }
     *     
     */
    public void setTableRows(ArrayOfPriceTableRow value) {
        this.tableRows = value;
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
