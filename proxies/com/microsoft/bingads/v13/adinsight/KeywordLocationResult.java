
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordLocationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordLocationResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="KeywordLocations" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeywordLocation" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordLocationResult", propOrder = {
    "keyword",
    "keywordLocations"
})
public class KeywordLocationResult {

    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "KeywordLocations", nillable = true)
    protected ArrayOfKeywordLocation keywordLocations;

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
     * Gets the value of the keywordLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordLocation }
     *     
     */
    public ArrayOfKeywordLocation getKeywordLocations() {
        return keywordLocations;
    }

    /**
     * Sets the value of the keywordLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordLocation }
     *     
     */
    public void setKeywordLocations(ArrayOfKeywordLocation value) {
        this.keywordLocations = value;
    }

}
