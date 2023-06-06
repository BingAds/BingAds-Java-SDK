
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordSuggestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordSuggestion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SuggestionsAndConfidence" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeywordAndConfidence" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordSuggestion", propOrder = {
    "keyword",
    "suggestionsAndConfidence"
})
public class KeywordSuggestion {

    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "SuggestionsAndConfidence", nillable = true)
    protected ArrayOfKeywordAndConfidence suggestionsAndConfidence;

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
     * Gets the value of the suggestionsAndConfidence property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordAndConfidence }
     *     
     */
    public ArrayOfKeywordAndConfidence getSuggestionsAndConfidence() {
        return suggestionsAndConfidence;
    }

    /**
     * Sets the value of the suggestionsAndConfidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordAndConfidence }
     *     
     */
    public void setSuggestionsAndConfidence(ArrayOfKeywordAndConfidence value) {
        this.suggestionsAndConfidence = value;
    }

}
