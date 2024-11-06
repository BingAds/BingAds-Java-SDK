
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordRecommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordRecommendation">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}RecommendationBase">
 *       <sequence>
 *         <element name="Competition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="MatchType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="MonthlySearches" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="SuggestedBid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="SuggestedKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordRecommendation", propOrder = {
    "competition",
    "matchType",
    "monthlySearches",
    "suggestedBid",
    "suggestedKeyword"
})
public class KeywordRecommendation
    extends RecommendationBase
{
    public KeywordRecommendation() {
      this.type = RecommendationType.fromValue("KeywordRecommendation");
    }

    @XmlElement(name = "Competition")
    protected Double competition;
    @XmlElement(name = "MatchType")
    protected Integer matchType;
    @XmlElement(name = "MonthlySearches")
    protected Long monthlySearches;
    @XmlElement(name = "SuggestedBid")
    protected Double suggestedBid;
    @XmlElement(name = "SuggestedKeyword", nillable = true)
    protected String suggestedKeyword;

    /**
     * Gets the value of the competition property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCompetition() {
        return competition;
    }

    /**
     * Sets the value of the competition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCompetition(Double value) {
        this.competition = value;
    }

    /**
     * Gets the value of the matchType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMatchType() {
        return matchType;
    }

    /**
     * Sets the value of the matchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMatchType(Integer value) {
        this.matchType = value;
    }

    /**
     * Gets the value of the monthlySearches property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMonthlySearches() {
        return monthlySearches;
    }

    /**
     * Sets the value of the monthlySearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMonthlySearches(Long value) {
        this.monthlySearches = value;
    }

    /**
     * Gets the value of the suggestedBid property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSuggestedBid() {
        return suggestedBid;
    }

    /**
     * Sets the value of the suggestedBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSuggestedBid(Double value) {
        this.suggestedBid = value;
    }

    /**
     * Gets the value of the suggestedKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedKeyword() {
        return suggestedKeyword;
    }

    /**
     * Sets the value of the suggestedKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedKeyword(String value) {
        this.suggestedKeyword = value;
    }

}
