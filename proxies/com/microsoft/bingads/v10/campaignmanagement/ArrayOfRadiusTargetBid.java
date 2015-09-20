
package com.microsoft.bingads.v10.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRadiusTargetBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRadiusTargetBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RadiusTargetBid" type="{https://bingads.microsoft.com/CampaignManagement/v10}RadiusTargetBid" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRadiusTargetBid", propOrder = {
    "radiusTargetBids"
})
public class ArrayOfRadiusTargetBid {

    @XmlElement(name = "RadiusTargetBid", nillable = true)
    protected List<RadiusTargetBid> radiusTargetBids;

    /**
     * Gets the value of the radiusTargetBids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radiusTargetBids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadiusTargetBids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RadiusTargetBid }
     * 
     * 
     */
    public List<RadiusTargetBid> getRadiusTargetBids() {
        if (radiusTargetBids == null) {
            radiusTargetBids = new ArrayList<RadiusTargetBid>();
        }
        return this.radiusTargetBids;
    }

}
