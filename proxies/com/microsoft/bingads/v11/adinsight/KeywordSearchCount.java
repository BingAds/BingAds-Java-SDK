
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordSearchCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordSearchCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchCountsByAttributes" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}ArrayOfSearchCountsByAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
