
package com.microsoft.bingads.v10.adinsight;

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
 *         &lt;element name="KeywordLocationResult" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity}ArrayOfKeywordLocationResult" minOccurs="0"/>
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
    "keywordLocationResult"
})
@XmlRootElement(name = "GetKeywordLocationsResponse", namespace = "Microsoft.Advertiser.AdInsight.Api.Service")
public class GetKeywordLocationsResponse {

    @XmlElement(name = "KeywordLocationResult", namespace = "Microsoft.Advertiser.AdInsight.Api.Service", nillable = true)
    protected ArrayOfKeywordLocationResult keywordLocationResult;

    /**
     * Gets the value of the keywordLocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordLocationResult }
     *     
     */
    public ArrayOfKeywordLocationResult getKeywordLocationResult() {
        return keywordLocationResult;
    }

    /**
     * Sets the value of the keywordLocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordLocationResult }
     *     
     */
    public void setKeywordLocationResult(ArrayOfKeywordLocationResult value) {
        this.keywordLocationResult = value;
    }

}
