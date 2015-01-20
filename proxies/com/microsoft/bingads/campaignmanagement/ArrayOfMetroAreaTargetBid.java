
package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMetroAreaTargetBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMetroAreaTargetBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetroAreaTargetBid" type="{https://bingads.microsoft.com/CampaignManagement/v9}MetroAreaTargetBid" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMetroAreaTargetBid", propOrder = {
    "metroAreaTargetBids"
})
public class ArrayOfMetroAreaTargetBid {

    @XmlElement(name = "MetroAreaTargetBid", nillable = true)
    protected List<MetroAreaTargetBid> metroAreaTargetBids;

    /**
     * Gets the value of the metroAreaTargetBids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metroAreaTargetBids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetroAreaTargetBids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetroAreaTargetBid }
     * 
     * 
     */
    public List<MetroAreaTargetBid> getMetroAreaTargetBids() {
        if (metroAreaTargetBids == null) {
            metroAreaTargetBids = new ArrayList<MetroAreaTargetBid>();
        }
        return this.metroAreaTargetBids;
    }

}
