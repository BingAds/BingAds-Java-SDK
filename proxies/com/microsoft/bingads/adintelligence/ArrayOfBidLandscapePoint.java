
package com.microsoft.bingads.adintelligence;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBidLandscapePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBidLandscapePoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidLandscapePoint" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}BidLandscapePoint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBidLandscapePoint", propOrder = {
    "bidLandscapePoints"
})
public class ArrayOfBidLandscapePoint {

    @XmlElement(name = "BidLandscapePoint", nillable = true)
    protected List<BidLandscapePoint> bidLandscapePoints;

    /**
     * Gets the value of the bidLandscapePoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bidLandscapePoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBidLandscapePoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BidLandscapePoint }
     * 
     * 
     */
    public List<BidLandscapePoint> getBidLandscapePoints() {
        if (bidLandscapePoints == null) {
            bidLandscapePoints = new ArrayList<BidLandscapePoint>();
        }
        return this.bidLandscapePoints;
    }

}
