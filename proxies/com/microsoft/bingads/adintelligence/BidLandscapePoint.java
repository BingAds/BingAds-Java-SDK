
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidLandscapePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidLandscapePoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Clicks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Impressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TopImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}Currency" minOccurs="0"/>
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MarginalCPC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidLandscapePoint", propOrder = {
    "bid",
    "clicks",
    "impressions",
    "topImpressions",
    "currency",
    "cost",
    "marginalCPC"
})
public class BidLandscapePoint {

    @XmlElement(name = "Bid")
    protected Double bid;
    @XmlElement(name = "Clicks", nillable = true)
    protected Double clicks;
    @XmlElement(name = "Impressions")
    protected Long impressions;
    @XmlElement(name = "TopImpressions", nillable = true)
    protected Long topImpressions;
    @XmlElement(name = "Currency")
    @XmlSchemaType(name = "string")
    protected Currency currency;
    @XmlElement(name = "Cost", nillable = true)
    protected Double cost;
    @XmlElement(name = "MarginalCPC", nillable = true)
    protected Double marginalCPC;

    /**
     * Gets the value of the bid property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBid() {
        return bid;
    }

    /**
     * Sets the value of the bid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBid(Double value) {
        this.bid = value;
    }

    /**
     * Gets the value of the clicks property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClicks() {
        return clicks;
    }

    /**
     * Sets the value of the clicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClicks(Double value) {
        this.clicks = value;
    }

    /**
     * Gets the value of the impressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImpressions() {
        return impressions;
    }

    /**
     * Sets the value of the impressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImpressions(Long value) {
        this.impressions = value;
    }

    /**
     * Gets the value of the topImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTopImpressions() {
        return topImpressions;
    }

    /**
     * Sets the value of the topImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTopImpressions(Long value) {
        this.topImpressions = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCost(Double value) {
        this.cost = value;
    }

    /**
     * Gets the value of the marginalCPC property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMarginalCPC() {
        return marginalCPC;
    }

    /**
     * Sets the value of the marginalCPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMarginalCPC(Double value) {
        this.marginalCPC = value;
    }

}
