
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordIdea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordIdea">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="AdGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AdImpressionShare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Competition" type="{https://bingads.microsoft.com/AdInsight/v13}CompetitionLevel" minOccurs="0"/>
 *         <element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MonthlySearchCounts" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="Relevance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Source" type="{https://bingads.microsoft.com/AdInsight/v13}SourceType" minOccurs="0"/>
 *         <element name="SuggestedBid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordIdea", propOrder = {
    "adGroupId",
    "adGroupName",
    "adImpressionShare",
    "competition",
    "keyword",
    "monthlySearchCounts",
    "relevance",
    "source",
    "suggestedBid"
})
public class KeywordIdea {

    @XmlElement(name = "AdGroupId", nillable = true)
    protected Long adGroupId;
    @XmlElement(name = "AdGroupName", nillable = true)
    protected String adGroupName;
    @XmlElement(name = "AdImpressionShare", nillable = true)
    protected Double adImpressionShare;
    @XmlElement(name = "Competition", nillable = true)
    @XmlSchemaType(name = "string")
    protected CompetitionLevel competition;
    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "MonthlySearchCounts", nillable = true)
    protected ArrayOflong monthlySearchCounts;
    @XmlElement(name = "Relevance", nillable = true)
    protected Double relevance;
    @XmlElement(name = "Source", nillable = true)
    @XmlSchemaType(name = "string")
    protected SourceType source;
    @XmlElement(name = "SuggestedBid", nillable = true)
    protected Double suggestedBid;

    /**
     * Gets the value of the adGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the value of the adGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdGroupId(Long value) {
        this.adGroupId = value;
    }

    /**
     * Gets the value of the adGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdGroupName() {
        return adGroupName;
    }

    /**
     * Sets the value of the adGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdGroupName(String value) {
        this.adGroupName = value;
    }

    /**
     * Gets the value of the adImpressionShare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdImpressionShare() {
        return adImpressionShare;
    }

    /**
     * Sets the value of the adImpressionShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdImpressionShare(Double value) {
        this.adImpressionShare = value;
    }

    /**
     * Gets the value of the competition property.
     * 
     * @return
     *     possible object is
     *     {@link CompetitionLevel }
     *     
     */
    public CompetitionLevel getCompetition() {
        return competition;
    }

    /**
     * Sets the value of the competition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompetitionLevel }
     *     
     */
    public void setCompetition(CompetitionLevel value) {
        this.competition = value;
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
     * Gets the value of the monthlySearchCounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getMonthlySearchCounts() {
        return monthlySearchCounts;
    }

    /**
     * Sets the value of the monthlySearchCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setMonthlySearchCounts(ArrayOflong value) {
        this.monthlySearchCounts = value;
    }

    /**
     * Gets the value of the relevance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRelevance() {
        return relevance;
    }

    /**
     * Sets the value of the relevance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRelevance(Double value) {
        this.relevance = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SourceType }
     *     
     */
    public SourceType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setSource(SourceType value) {
        this.source = value;
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

}
