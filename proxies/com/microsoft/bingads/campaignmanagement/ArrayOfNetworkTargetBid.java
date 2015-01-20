
package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNetworkTargetBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNetworkTargetBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetworkTargetBid" type="{https://bingads.microsoft.com/CampaignManagement/v9}NetworkTargetBid" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNetworkTargetBid", propOrder = {
    "networkTargetBids"
})
public class ArrayOfNetworkTargetBid {

    @XmlElement(name = "NetworkTargetBid", nillable = true)
    protected List<NetworkTargetBid> networkTargetBids;

    /**
     * Gets the value of the networkTargetBids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkTargetBids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkTargetBids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkTargetBid }
     * 
     * 
     */
    public List<NetworkTargetBid> getNetworkTargetBids() {
        if (networkTargetBids == null) {
            networkTargetBids = new ArrayList<NetworkTargetBid>();
        }
        return this.networkTargetBids;
    }

}
