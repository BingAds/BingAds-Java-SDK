
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordSearchCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordSearchCount">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SearchCountsByAttributes" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfSearchCountsByAttributes" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordSearchCount", propOrder = {
    "keyword",
    "searchCountsByAttributes"
})
public class KeywordSearchCount {

    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "SearchCountsByAttributes", nillable = true)
    protected ArrayOfSearchCountsByAttributes searchCountsByAttributes;

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
     * Gets the value of the searchCountsByAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchCountsByAttributes }
     *     
     */
    public ArrayOfSearchCountsByAttributes getSearchCountsByAttributes() {
        return searchCountsByAttributes;
    }

    /**
     * Sets the value of the searchCountsByAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchCountsByAttributes }
     *     
     */
    public void setSearchCountsByAttributes(ArrayOfSearchCountsByAttributes value) {
        this.searchCountsByAttributes = value;
    }

}
