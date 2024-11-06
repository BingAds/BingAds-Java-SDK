
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoveConflictingNegativeKeywordRecommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RemoveConflictingNegativeKeywordRecommendation">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}RecommendationBase">
 *       <sequence>
 *         <element name="NegativeKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NegativeKeywordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="NegativeKeywordListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NegativeKeywordMatchType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="NegativeKeywordSharedListId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveConflictingNegativeKeywordRecommendation", propOrder = {
    "negativeKeyword",
    "negativeKeywordId",
    "negativeKeywordListName",
    "negativeKeywordMatchType",
    "negativeKeywordSharedListId",
    "source"
})
public class RemoveConflictingNegativeKeywordRecommendation
    extends RecommendationBase
{
    public RemoveConflictingNegativeKeywordRecommendation() {
      this.type = RecommendationType.fromValue("RemoveConflictingNegativeKeywordRecommendation");
    }

    @XmlElement(name = "NegativeKeyword", nillable = true)
    protected String negativeKeyword;
    @XmlElement(name = "NegativeKeywordId")
    protected Long negativeKeywordId;
    @XmlElement(name = "NegativeKeywordListName", nillable = true)
    protected String negativeKeywordListName;
    @XmlElement(name = "NegativeKeywordMatchType")
    protected Integer negativeKeywordMatchType;
    @XmlElement(name = "NegativeKeywordSharedListId", nillable = true)
    protected Long negativeKeywordSharedListId;
    @XmlElement(name = "Source", nillable = true)
    protected String source;

    /**
     * Gets the value of the negativeKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeKeyword() {
        return negativeKeyword;
    }

    /**
     * Sets the value of the negativeKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeKeyword(String value) {
        this.negativeKeyword = value;
    }

    /**
     * Gets the value of the negativeKeywordId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNegativeKeywordId() {
        return negativeKeywordId;
    }

    /**
     * Sets the value of the negativeKeywordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNegativeKeywordId(Long value) {
        this.negativeKeywordId = value;
    }

    /**
     * Gets the value of the negativeKeywordListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeKeywordListName() {
        return negativeKeywordListName;
    }

    /**
     * Sets the value of the negativeKeywordListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeKeywordListName(String value) {
        this.negativeKeywordListName = value;
    }

    /**
     * Gets the value of the negativeKeywordMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNegativeKeywordMatchType() {
        return negativeKeywordMatchType;
    }

    /**
     * Sets the value of the negativeKeywordMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNegativeKeywordMatchType(Integer value) {
        this.negativeKeywordMatchType = value;
    }

    /**
     * Gets the value of the negativeKeywordSharedListId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNegativeKeywordSharedListId() {
        return negativeKeywordSharedListId;
    }

    /**
     * Sets the value of the negativeKeywordSharedListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNegativeKeywordSharedListId(Long value) {
        this.negativeKeywordSharedListId = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
