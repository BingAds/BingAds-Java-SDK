
package com.microsoft.bingads.adintelligence;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeywordIdEstimatedBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeywordIdEstimatedBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeywordIdEstimatedBid" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}KeywordIdEstimatedBid" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordIdEstimatedBid", propOrder = {
    "keywordIdEstimatedBids"
})
public class ArrayOfKeywordIdEstimatedBid {

    @XmlElement(name = "KeywordIdEstimatedBid", nillable = true)
    protected List<KeywordIdEstimatedBid> keywordIdEstimatedBids;

    /**
     * Gets the value of the keywordIdEstimatedBids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordIdEstimatedBids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordIdEstimatedBids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordIdEstimatedBid }
     * 
     * 
     */
    public List<KeywordIdEstimatedBid> getKeywordIdEstimatedBids() {
        if (keywordIdEstimatedBids == null) {
            keywordIdEstimatedBids = new ArrayList<KeywordIdEstimatedBid>();
        }
        return this.keywordIdEstimatedBids;
    }

}
