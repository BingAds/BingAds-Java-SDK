
package com.microsoft.bingads.adintelligence;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdGroupBidLandscape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdGroupBidLandscape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdGroupBidLandscape" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}AdGroupBidLandscape" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdGroupBidLandscape", propOrder = {
    "adGroupBidLandscapes"
})
public class ArrayOfAdGroupBidLandscape {

    @XmlElement(name = "AdGroupBidLandscape", nillable = true)
    protected List<AdGroupBidLandscape> adGroupBidLandscapes;

    /**
     * Gets the value of the adGroupBidLandscapes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adGroupBidLandscapes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdGroupBidLandscapes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupBidLandscape }
     * 
     * 
     */
    public List<AdGroupBidLandscape> getAdGroupBidLandscapes() {
        if (adGroupBidLandscapes == null) {
            adGroupBidLandscapes = new ArrayList<AdGroupBidLandscape>();
        }
        return this.adGroupBidLandscapes;
    }

}
