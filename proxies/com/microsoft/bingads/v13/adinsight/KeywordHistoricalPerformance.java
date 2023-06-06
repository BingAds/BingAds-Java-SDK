
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordHistoricalPerformance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordHistoricalPerformance">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="KeywordKPIs" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeywordKPI" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordHistoricalPerformance", propOrder = {
    "keyword",
    "keywordKPIs"
})
public class KeywordHistoricalPerformance {

    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "KeywordKPIs", nillable = true)
    protected ArrayOfKeywordKPI keywordKPIs;

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
     * Gets the value of the keywordKPIs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordKPI }
     *     
     */
    public ArrayOfKeywordKPI getKeywordKPIs() {
        return keywordKPIs;
    }

    /**
     * Sets the value of the keywordKPIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordKPI }
     *     
     */
    public void setKeywordKPIs(ArrayOfKeywordKPI value) {
        this.keywordKPIs = value;
    }

}
