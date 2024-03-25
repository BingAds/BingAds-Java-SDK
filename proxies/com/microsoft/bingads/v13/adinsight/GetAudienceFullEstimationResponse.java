
package com.microsoft.bingads.v13.adinsight;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EstImpression" type="{https://bingads.microsoft.com/AdInsight/v13}RangeResultOfDecimalRoundedResult" minOccurs="0"/>
 *         <element name="EstAudienceSize" type="{https://bingads.microsoft.com/AdInsight/v13}RangeResultOfDecimalRoundedResult" minOccurs="0"/>
 *         <element name="EstClick" type="{https://bingads.microsoft.com/AdInsight/v13}RangeResultOfDecimalRoundedResult" minOccurs="0"/>
 *         <element name="EstSpend" type="{https://bingads.microsoft.com/AdInsight/v13}RangeResultOfDecimalRoundedResult" minOccurs="0"/>
 *         <element name="EstCostPerEvent" type="{https://bingads.microsoft.com/AdInsight/v13}RangeResultOfDecimalRoundedResult" minOccurs="0"/>
 *         <element name="EstCTR" type="{https://bingads.microsoft.com/AdInsight/v13}RangeResultOfdouble" minOccurs="0"/>
 *         <element name="SuggestedBid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="SuggestedBudget" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="EventsLostToBid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="EventsLostToBudget" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="EstReachAudienceSize" type="{https://bingads.microsoft.com/AdInsight/v13}DecimalRoundedResult" minOccurs="0"/>
 *         <element name="EstReachImpression" type="{https://bingads.microsoft.com/AdInsight/v13}DecimalRoundedResult" minOccurs="0"/>
 *         <element name="Currency" type="{https://bingads.microsoft.com/AdInsight/v13}Currency" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "estImpression",
    "estAudienceSize",
    "estClick",
    "estSpend",
    "estCostPerEvent",
    "estCTR",
    "suggestedBid",
    "suggestedBudget",
    "eventsLostToBid",
    "eventsLostToBudget",
    "estReachAudienceSize",
    "estReachImpression",
    "currency"
})
@XmlRootElement(name = "GetAudienceFullEstimationResponse")
public class GetAudienceFullEstimationResponse {

    @XmlElement(name = "EstImpression", nillable = true)
    protected RangeResultOfDecimalRoundedResult estImpression;
    @XmlElement(name = "EstAudienceSize", nillable = true)
    protected RangeResultOfDecimalRoundedResult estAudienceSize;
    @XmlElement(name = "EstClick", nillable = true)
    protected RangeResultOfDecimalRoundedResult estClick;
    @XmlElement(name = "EstSpend", nillable = true)
    protected RangeResultOfDecimalRoundedResult estSpend;
    @XmlElement(name = "EstCostPerEvent", nillable = true)
    protected RangeResultOfDecimalRoundedResult estCostPerEvent;
    @XmlElement(name = "EstCTR", nillable = true)
    protected RangeResultOfdouble estCTR;
    @XmlElement(name = "SuggestedBid", nillable = true)
    protected BigDecimal suggestedBid;
    @XmlElement(name = "SuggestedBudget", nillable = true)
    protected BigDecimal suggestedBudget;
    @XmlElement(name = "EventsLostToBid", nillable = true)
    protected Integer eventsLostToBid;
    @XmlElement(name = "EventsLostToBudget", nillable = true)
    protected Integer eventsLostToBudget;
    @XmlElement(name = "EstReachAudienceSize", nillable = true)
    protected DecimalRoundedResult estReachAudienceSize;
    @XmlElement(name = "EstReachImpression", nillable = true)
    protected DecimalRoundedResult estReachImpression;
    @XmlElement(name = "Currency", nillable = true)
    @XmlSchemaType(name = "string")
    protected Currency currency;

    /**
     * Gets the value of the estImpression property.
     * 
     * @return
     *     possible object is
     *     {@link RangeResultOfDecimalRoundedResult }
     *     
     */
    public RangeResultOfDecimalRoundedResult getEstImpression() {
        return estImpression;
    }

    /**
     * Sets the value of the estImpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeResultOfDecimalRoundedResult }
     *     
     */
    public void setEstImpression(RangeResultOfDecimalRoundedResult value) {
        this.estImpression = value;
    }

    /**
     * Gets the value of the estAudienceSize property.
     * 
     * @return
     *     possible object is
     *     {@link RangeResultOfDecimalRoundedResult }
     *     
     */
    public RangeResultOfDecimalRoundedResult getEstAudienceSize() {
        return estAudienceSize;
    }

    /**
     * Sets the value of the estAudienceSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeResultOfDecimalRoundedResult }
     *     
     */
    public void setEstAudienceSize(RangeResultOfDecimalRoundedResult value) {
        this.estAudienceSize = value;
    }

    /**
     * Gets the value of the estClick property.
     * 
     * @return
     *     possible object is
     *     {@link RangeResultOfDecimalRoundedResult }
     *     
     */
    public RangeResultOfDecimalRoundedResult getEstClick() {
        return estClick;
    }

    /**
     * Sets the value of the estClick property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeResultOfDecimalRoundedResult }
     *     
     */
    public void setEstClick(RangeResultOfDecimalRoundedResult value) {
        this.estClick = value;
    }

    /**
     * Gets the value of the estSpend property.
     * 
     * @return
     *     possible object is
     *     {@link RangeResultOfDecimalRoundedResult }
     *     
     */
    public RangeResultOfDecimalRoundedResult getEstSpend() {
        return estSpend;
    }

    /**
     * Sets the value of the estSpend property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeResultOfDecimalRoundedResult }
     *     
     */
    public void setEstSpend(RangeResultOfDecimalRoundedResult value) {
        this.estSpend = value;
    }

    /**
     * Gets the value of the estCostPerEvent property.
     * 
     * @return
     *     possible object is
     *     {@link RangeResultOfDecimalRoundedResult }
     *     
     */
    public RangeResultOfDecimalRoundedResult getEstCostPerEvent() {
        return estCostPerEvent;
    }

    /**
     * Sets the value of the estCostPerEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeResultOfDecimalRoundedResult }
     *     
     */
    public void setEstCostPerEvent(RangeResultOfDecimalRoundedResult value) {
        this.estCostPerEvent = value;
    }

    /**
     * Gets the value of the estCTR property.
     * 
     * @return
     *     possible object is
     *     {@link RangeResultOfdouble }
     *     
     */
    public RangeResultOfdouble getEstCTR() {
        return estCTR;
    }

    /**
     * Sets the value of the estCTR property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeResultOfdouble }
     *     
     */
    public void setEstCTR(RangeResultOfdouble value) {
        this.estCTR = value;
    }

    /**
     * Gets the value of the suggestedBid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuggestedBid() {
        return suggestedBid;
    }

    /**
     * Sets the value of the suggestedBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuggestedBid(BigDecimal value) {
        this.suggestedBid = value;
    }

    /**
     * Gets the value of the suggestedBudget property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuggestedBudget() {
        return suggestedBudget;
    }

    /**
     * Sets the value of the suggestedBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuggestedBudget(BigDecimal value) {
        this.suggestedBudget = value;
    }

    /**
     * Gets the value of the eventsLostToBid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEventsLostToBid() {
        return eventsLostToBid;
    }

    /**
     * Sets the value of the eventsLostToBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEventsLostToBid(Integer value) {
        this.eventsLostToBid = value;
    }

    /**
     * Gets the value of the eventsLostToBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEventsLostToBudget() {
        return eventsLostToBudget;
    }

    /**
     * Sets the value of the eventsLostToBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEventsLostToBudget(Integer value) {
        this.eventsLostToBudget = value;
    }

    /**
     * Gets the value of the estReachAudienceSize property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalRoundedResult }
     *     
     */
    public DecimalRoundedResult getEstReachAudienceSize() {
        return estReachAudienceSize;
    }

    /**
     * Sets the value of the estReachAudienceSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalRoundedResult }
     *     
     */
    public void setEstReachAudienceSize(DecimalRoundedResult value) {
        this.estReachAudienceSize = value;
    }

    /**
     * Gets the value of the estReachImpression property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalRoundedResult }
     *     
     */
    public DecimalRoundedResult getEstReachImpression() {
        return estReachImpression;
    }

    /**
     * Sets the value of the estReachImpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalRoundedResult }
     *     
     */
    public void setEstReachImpression(DecimalRoundedResult value) {
        this.estReachImpression = value;
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

}
