
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
 *         <element name="EstImpressionByType" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfDecimalRoundedRangeResultByType" minOccurs="0"/>
 *         <element name="EstClickByType" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfDecimalRoundedRangeResultByType" minOccurs="0"/>
 *         <element name="EstSpendByType" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfDecimalRoundedRangeResultByType" minOccurs="0"/>
 *         <element name="EstCostPerEventByType" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfDecimalRoundedRangeResultByType" minOccurs="0"/>
 *         <element name="EstCPCByType" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfDecimalRoundedRangeResultByType" minOccurs="0"/>
 *         <element name="EstViewByType" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfDecimalRoundedRangeResultByType" minOccurs="0"/>
 *         <element name="EstCTRByType" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfRangeResultByTypeOfdouble" minOccurs="0"/>
 *         <element name="EstReachImpressionByType" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfDecimalRoundedByType" minOccurs="0"/>
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
    "currency",
    "estImpressionByType",
    "estClickByType",
    "estSpendByType",
    "estCostPerEventByType",
    "estCPCByType",
    "estViewByType",
    "estCTRByType",
    "estReachImpressionByType"
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
    @XmlElement(name = "EstImpressionByType", nillable = true)
    protected ArrayOfDecimalRoundedRangeResultByType estImpressionByType;
    @XmlElement(name = "EstClickByType", nillable = true)
    protected ArrayOfDecimalRoundedRangeResultByType estClickByType;
    @XmlElement(name = "EstSpendByType", nillable = true)
    protected ArrayOfDecimalRoundedRangeResultByType estSpendByType;
    @XmlElement(name = "EstCostPerEventByType", nillable = true)
    protected ArrayOfDecimalRoundedRangeResultByType estCostPerEventByType;
    @XmlElement(name = "EstCPCByType", nillable = true)
    protected ArrayOfDecimalRoundedRangeResultByType estCPCByType;
    @XmlElement(name = "EstViewByType", nillable = true)
    protected ArrayOfDecimalRoundedRangeResultByType estViewByType;
    @XmlElement(name = "EstCTRByType", nillable = true)
    protected ArrayOfRangeResultByTypeOfdouble estCTRByType;
    @XmlElement(name = "EstReachImpressionByType", nillable = true)
    protected ArrayOfDecimalRoundedByType estReachImpressionByType;

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

    /**
     * Gets the value of the estImpressionByType property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecimalRoundedRangeResultByType }
     *     
     */
    public ArrayOfDecimalRoundedRangeResultByType getEstImpressionByType() {
        return estImpressionByType;
    }

    /**
     * Sets the value of the estImpressionByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecimalRoundedRangeResultByType }
     *     
     */
    public void setEstImpressionByType(ArrayOfDecimalRoundedRangeResultByType value) {
        this.estImpressionByType = value;
    }

    /**
     * Gets the value of the estClickByType property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecimalRoundedRangeResultByType }
     *     
     */
    public ArrayOfDecimalRoundedRangeResultByType getEstClickByType() {
        return estClickByType;
    }

    /**
     * Sets the value of the estClickByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecimalRoundedRangeResultByType }
     *     
     */
    public void setEstClickByType(ArrayOfDecimalRoundedRangeResultByType value) {
        this.estClickByType = value;
    }

    /**
     * Gets the value of the estSpendByType property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecimalRoundedRangeResultByType }
     *     
     */
    public ArrayOfDecimalRoundedRangeResultByType getEstSpendByType() {
        return estSpendByType;
    }

    /**
     * Sets the value of the estSpendByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecimalRoundedRangeResultByType }
     *     
     */
    public void setEstSpendByType(ArrayOfDecimalRoundedRangeResultByType value) {
        this.estSpendByType = value;
    }

    /**
     * Gets the value of the estCostPerEventByType property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecimalRoundedRangeResultByType }
     *     
     */
    public ArrayOfDecimalRoundedRangeResultByType getEstCostPerEventByType() {
        return estCostPerEventByType;
    }

    /**
     * Sets the value of the estCostPerEventByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecimalRoundedRangeResultByType }
     *     
     */
    public void setEstCostPerEventByType(ArrayOfDecimalRoundedRangeResultByType value) {
        this.estCostPerEventByType = value;
    }

    /**
     * Gets the value of the estCPCByType property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecimalRoundedRangeResultByType }
     *     
     */
    public ArrayOfDecimalRoundedRangeResultByType getEstCPCByType() {
        return estCPCByType;
    }

    /**
     * Sets the value of the estCPCByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecimalRoundedRangeResultByType }
     *     
     */
    public void setEstCPCByType(ArrayOfDecimalRoundedRangeResultByType value) {
        this.estCPCByType = value;
    }

    /**
     * Gets the value of the estViewByType property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecimalRoundedRangeResultByType }
     *     
     */
    public ArrayOfDecimalRoundedRangeResultByType getEstViewByType() {
        return estViewByType;
    }

    /**
     * Sets the value of the estViewByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecimalRoundedRangeResultByType }
     *     
     */
    public void setEstViewByType(ArrayOfDecimalRoundedRangeResultByType value) {
        this.estViewByType = value;
    }

    /**
     * Gets the value of the estCTRByType property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRangeResultByTypeOfdouble }
     *     
     */
    public ArrayOfRangeResultByTypeOfdouble getEstCTRByType() {
        return estCTRByType;
    }

    /**
     * Sets the value of the estCTRByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRangeResultByTypeOfdouble }
     *     
     */
    public void setEstCTRByType(ArrayOfRangeResultByTypeOfdouble value) {
        this.estCTRByType = value;
    }

    /**
     * Gets the value of the estReachImpressionByType property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDecimalRoundedByType }
     *     
     */
    public ArrayOfDecimalRoundedByType getEstReachImpressionByType() {
        return estReachImpressionByType;
    }

    /**
     * Sets the value of the estReachImpressionByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDecimalRoundedByType }
     *     
     */
    public void setEstReachImpressionByType(ArrayOfDecimalRoundedByType value) {
        this.estReachImpressionByType = value;
    }

}
