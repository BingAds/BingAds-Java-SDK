
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordCategoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordCategoryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeywordCategories" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeywordCategory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordCategoryResult", propOrder = {
    "keyword",
    "keywordCategories"
})
public class KeywordCategoryResult {

    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "KeywordCategories", nillable = true)
    protected ArrayOfKeywordCategory keywordCategories;

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
     * Gets the value of the keywordCategories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordCategory }
     *     
     */
    public ArrayOfKeywordCategory getKeywordCategories() {
        return keywordCategories;
    }

    /**
     * Sets the value of the keywordCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordCategory }
     *     
     */
    public void setKeywordCategories(ArrayOfKeywordCategory value) {
        this.keywordCategories = value;
    }

}
