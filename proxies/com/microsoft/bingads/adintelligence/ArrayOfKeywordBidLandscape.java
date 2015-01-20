
package com.microsoft.bingads.adintelligence;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeywordBidLandscape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeywordBidLandscape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeywordBidLandscape" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}KeywordBidLandscape" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordBidLandscape", propOrder = {
    "keywordBidLandscapes"
})
public class ArrayOfKeywordBidLandscape {

    @XmlElement(name = "KeywordBidLandscape", nillable = true)
    protected List<KeywordBidLandscape> keywordBidLandscapes;

    /**
     * Gets the value of the keywordBidLandscapes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordBidLandscapes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordBidLandscapes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordBidLandscape }
     * 
     * 
     */
    public List<KeywordBidLandscape> getKeywordBidLandscapes() {
        if (keywordBidLandscapes == null) {
            keywordBidLandscapes = new ArrayList<KeywordBidLandscape>();
        }
        return this.keywordBidLandscapes;
    }

}
