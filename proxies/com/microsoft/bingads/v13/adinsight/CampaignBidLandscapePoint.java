
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignBidLandscapePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CampaignBidLandscapePoint">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Bid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="TargetCpa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="TargetRoas" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Clicks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Impressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="TopImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CurrencyCode" type="{https://bingads.microsoft.com/AdInsight/v13}CurrencyCode" minOccurs="0"/>
 *         <element name="Cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Conversions" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ConversionValues" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="MarginalCPC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignBidLandscapePoint", propOrder = {
    "bid",
    "targetCpa",
    "targetRoas",
    "clicks",
    "impressions",
    "topImpressions",
    "currencyCode",
    "cost",
    "conversions",
    "conversionValues",
    "marginalCPC"
})
public class CampaignBidLandscapePoint {

    @XmlElement(name = "Bid", nillable = true)
    protected Double bid;
    @XmlElement(name = "TargetCpa", nillable = true)
    protected Double targetCpa;
    @XmlElement(name = "TargetRoas", nillable = true)
    protected Double targetRoas;
    @XmlElement(name = "Clicks", nillable = true)
    protected Double clicks;
    @XmlElement(name = "Impressions", nillable = true)
    protected Long impressions;
    @XmlElement(name = "TopImpressions", nillable = true)
    protected Long topImpressions;
    @XmlElement(name = "CurrencyCode")
    @XmlSchemaType(name = "string")
    protected CurrencyCode currencyCode;
    @XmlElement(name = "Cost", nillable = true)
    protected Double cost;
    @XmlElement(name = "Conversions", nillable = true)
    protected Double conversions;
    @XmlElement(name = "ConversionValues", nillable = true)
    protected Double conversionValues;
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
     * Gets the value of the targetCpa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTargetCpa() {
        return targetCpa;
    }

    /**
     * Sets the value of the targetCpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTargetCpa(Double value) {
        this.targetCpa = value;
    }

    /**
     * Gets the value of the targetRoas property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTargetRoas() {
        return targetRoas;
    }

    /**
     * Sets the value of the targetRoas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTargetRoas(Double value) {
        this.targetRoas = value;
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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrencyCode(CurrencyCode value) {
        this.currencyCode = value;
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
     * Gets the value of the conversions property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConversions() {
        return conversions;
    }

    /**
     * Sets the value of the conversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConversions(Double value) {
        this.conversions = value;
    }

    /**
     * Gets the value of the conversionValues property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConversionValues() {
        return conversionValues;
    }

    /**
     * Sets the value of the conversionValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConversionValues(Double value) {
        this.conversionValues = value;
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
