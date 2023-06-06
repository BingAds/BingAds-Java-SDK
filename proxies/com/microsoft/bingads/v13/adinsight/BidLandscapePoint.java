
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BidLandscapePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BidLandscapePoint">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Bid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Clicks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Impressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="TopImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CurrencyCode" type="{https://bingads.microsoft.com/AdInsight/v13}CurrencyCode" minOccurs="0"/>
 *         <element name="Cost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
@XmlType(name = "BidLandscapePoint", propOrder = {
    "bid",
    "clicks",
    "impressions",
    "topImpressions",
    "currencyCode",
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
    @XmlElement(name = "CurrencyCode")
    @XmlSchemaType(name = "string")
    protected CurrencyCode currencyCode;
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
