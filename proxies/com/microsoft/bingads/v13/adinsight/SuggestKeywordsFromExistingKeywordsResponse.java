
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeywordSuggestions" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeywordSuggestion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keywordSuggestions"
})
@XmlRootElement(name = "SuggestKeywordsFromExistingKeywordsResponse")
public class SuggestKeywordsFromExistingKeywordsResponse {

    @XmlElement(name = "KeywordSuggestions", nillable = true)
    protected ArrayOfKeywordSuggestion keywordSuggestions;

    /**
     * Gets the value of the keywordSuggestions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordSuggestion }
     *     
     */
    public ArrayOfKeywordSuggestion getKeywordSuggestions() {
        return keywordSuggestions;
    }

    /**
     * Sets the value of the keywordSuggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordSuggestion }
     *     
     */
    public void setKeywordSuggestions(ArrayOfKeywordSuggestion value) {
        this.keywordSuggestions = value;
    }

}
