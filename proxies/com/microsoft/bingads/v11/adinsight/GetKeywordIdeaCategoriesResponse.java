
package com.microsoft.bingads.v11.adinsight;

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
 *         &lt;element name="KeywordIdeaCategories" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}ArrayOfKeywordIdeaCategory" minOccurs="0"/>
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
    "keywordIdeaCategories"
})
@XmlRootElement(name = "GetKeywordIdeaCategoriesResponse", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11")
public class GetKeywordIdeaCategoriesResponse {

    @XmlElement(name = "KeywordIdeaCategories", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected ArrayOfKeywordIdeaCategory keywordIdeaCategories;

    /**
     * Gets the value of the keywordIdeaCategories property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordIdeaCategory }
     *     
     */
    public ArrayOfKeywordIdeaCategory getKeywordIdeaCategories() {
        return keywordIdeaCategories;
    }

    /**
     * Sets the value of the keywordIdeaCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordIdeaCategory }
     *     
     */
    public void setKeywordIdeaCategories(ArrayOfKeywordIdeaCategory value) {
        this.keywordIdeaCategories = value;
    }

}
