
package com.microsoft.bingads.adintelligence;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAuctionInsightAvailableChildrenDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAuctionInsightAvailableChildrenDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuctionInsightAvailableChildrenDetail" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}AuctionInsightAvailableChildrenDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAuctionInsightAvailableChildrenDetail", propOrder = {
    "auctionInsightAvailableChildrenDetails"
})
public class ArrayOfAuctionInsightAvailableChildrenDetail {

    @XmlElement(name = "AuctionInsightAvailableChildrenDetail", nillable = true)
    protected List<AuctionInsightAvailableChildrenDetail> auctionInsightAvailableChildrenDetails;

    /**
     * Gets the value of the auctionInsightAvailableChildrenDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auctionInsightAvailableChildrenDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuctionInsightAvailableChildrenDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuctionInsightAvailableChildrenDetail }
     * 
     * 
     */
    public List<AuctionInsightAvailableChildrenDetail> getAuctionInsightAvailableChildrenDetails() {
        if (auctionInsightAvailableChildrenDetails == null) {
            auctionInsightAvailableChildrenDetails = new ArrayList<AuctionInsightAvailableChildrenDetail>();
        }
        return this.auctionInsightAvailableChildrenDetails;
    }

}
