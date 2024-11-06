
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UseBroadMatchKeywordRecommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UseBroadMatchKeywordRecommendation">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}RecommendationBase">
 *       <sequence>
 *         <element name="CurrentMatchType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CurrentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="KeywordOrderItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="SuggestedBid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="SuggestedMatchType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="SuggestedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseBroadMatchKeywordRecommendation", propOrder = {
    "currentMatchType",
    "currentStatus",
    "keyword",
    "keywordOrderItemId",
    "suggestedBid",
    "suggestedMatchType",
    "suggestedStatus"
})
public class UseBroadMatchKeywordRecommendation
    extends RecommendationBase
{
    public UseBroadMatchKeywordRecommendation() {
      this.type = RecommendationType.fromValue("UseBroadMatchKeywordRecommendation");
    }

    @XmlElement(name = "CurrentMatchType")
    protected Integer currentMatchType;
    @XmlElement(name = "CurrentStatus", nillable = true)
    protected String currentStatus;
    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "KeywordOrderItemId")
    protected Long keywordOrderItemId;
    @XmlElement(name = "SuggestedBid")
    protected Double suggestedBid;
    @XmlElement(name = "SuggestedMatchType")
    protected Integer suggestedMatchType;
    @XmlElement(name = "SuggestedStatus", nillable = true)
    protected String suggestedStatus;

    /**
     * Gets the value of the currentMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentMatchType() {
        return currentMatchType;
    }

    /**
     * Sets the value of the currentMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentMatchType(Integer value) {
        this.currentMatchType = value;
    }

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatus(String value) {
        this.currentStatus = value;
    }

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
     * Gets the value of the keywordOrderItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeywordOrderItemId() {
        return keywordOrderItemId;
    }

    /**
     * Sets the value of the keywordOrderItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeywordOrderItemId(Long value) {
        this.keywordOrderItemId = value;
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
     * Gets the value of the suggestedMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuggestedMatchType() {
        return suggestedMatchType;
    }

    /**
     * Sets the value of the suggestedMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuggestedMatchType(Integer value) {
        this.suggestedMatchType = value;
    }

    /**
     * Gets the value of the suggestedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedStatus() {
        return suggestedStatus;
    }

    /**
     * Sets the value of the suggestedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedStatus(String value) {
        this.suggestedStatus = value;
    }

}
