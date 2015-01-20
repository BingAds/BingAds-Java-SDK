
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordPerformance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordPerformance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AverageCpc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Impressions" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}Scale" minOccurs="0"/>
 *         &lt;element name="BidDensity" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}Scale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordPerformance", propOrder = {
    "keyword",
    "averageCpc",
    "impressions",
    "bidDensity"
})
public class KeywordPerformance {

    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "AverageCpc")
    protected Double averageCpc;
    @XmlElement(name = "Impressions", nillable = true)
    @XmlSchemaType(name = "string")
    protected Scale impressions;
    @XmlElement(name = "BidDensity", nillable = true)
    @XmlSchemaType(name = "string")
    protected Scale bidDensity;

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
     * Gets the value of the averageCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageCpc() {
        return averageCpc;
    }

    /**
     * Sets the value of the averageCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageCpc(Double value) {
        this.averageCpc = value;
    }

    /**
     * Gets the value of the impressions property.
     * 
     * @return
     *     possible object is
     *     {@link Scale }
     *     
     */
    public Scale getImpressions() {
        return impressions;
    }

    /**
     * Sets the value of the impressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Scale }
     *     
     */
    public void setImpressions(Scale value) {
        this.impressions = value;
    }

    /**
     * Gets the value of the bidDensity property.
     * 
     * @return
     *     possible object is
     *     {@link Scale }
     *     
     */
    public Scale getBidDensity() {
        return bidDensity;
    }

    /**
     * Sets the value of the bidDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Scale }
     *     
     */
    public void setBidDensity(Scale value) {
        this.bidDensity = value;
    }

}
