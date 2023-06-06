
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordDemographicResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordDemographicResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="KeywordDemographics" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeywordDemographic" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordDemographicResult", propOrder = {
    "keyword",
    "keywordDemographics"
})
public class KeywordDemographicResult {

    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "KeywordDemographics", nillable = true)
    protected ArrayOfKeywordDemographic keywordDemographics;

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
     * Gets the value of the keywordDemographics property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordDemographic }
     *     
     */
    public ArrayOfKeywordDemographic getKeywordDemographics() {
        return keywordDemographics;
    }

    /**
     * Sets the value of the keywordDemographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordDemographic }
     *     
     */
    public void setKeywordDemographics(ArrayOfKeywordDemographic value) {
        this.keywordDemographics = value;
    }

}
