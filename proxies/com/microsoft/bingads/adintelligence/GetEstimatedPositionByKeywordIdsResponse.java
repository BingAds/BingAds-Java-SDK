
package com.microsoft.bingads.adintelligence;

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
 *         &lt;element name="KeywordEstimatedPositions" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}ArrayOfKeywordIdEstimatedPosition" minOccurs="0"/>
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
    "keywordEstimatedPositions"
})
@XmlRootElement(name = "GetEstimatedPositionByKeywordIdsResponse", namespace = "https://bingads.microsoft.com/AdIntelligence/v9")
public class GetEstimatedPositionByKeywordIdsResponse {

    @XmlElement(name = "KeywordEstimatedPositions", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    protected ArrayOfKeywordIdEstimatedPosition keywordEstimatedPositions;

    /**
     * Gets the value of the keywordEstimatedPositions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordIdEstimatedPosition }
     *     
     */
    public ArrayOfKeywordIdEstimatedPosition getKeywordEstimatedPositions() {
        return keywordEstimatedPositions;
    }

    /**
     * Sets the value of the keywordEstimatedPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordIdEstimatedPosition }
     *     
     */
    public void setKeywordEstimatedPositions(ArrayOfKeywordIdEstimatedPosition value) {
        this.keywordEstimatedPositions = value;
    }

}
