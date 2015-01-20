
package com.microsoft.bingads.optimizer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBidOpportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBidOpportunity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidOpportunity" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}BidOpportunity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBidOpportunity", propOrder = {
    "bidOpportunities"
})
public class ArrayOfBidOpportunity {

    @XmlElement(name = "BidOpportunity", nillable = true)
    protected List<BidOpportunity> bidOpportunities;

    /**
     * Gets the value of the bidOpportunities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bidOpportunities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBidOpportunities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BidOpportunity }
     * 
     * 
     */
    public List<BidOpportunity> getBidOpportunities() {
        if (bidOpportunities == null) {
            bidOpportunities = new ArrayList<BidOpportunity>();
        }
        return this.bidOpportunities;
    }

}
