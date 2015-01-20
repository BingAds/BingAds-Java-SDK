
package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAgeTargetBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAgeTargetBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgeTargetBid" type="{https://bingads.microsoft.com/CampaignManagement/v9}AgeTargetBid" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAgeTargetBid", propOrder = {
    "ageTargetBids"
})
public class ArrayOfAgeTargetBid {

    @XmlElement(name = "AgeTargetBid", nillable = true)
    protected List<AgeTargetBid> ageTargetBids;

    /**
     * Gets the value of the ageTargetBids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ageTargetBids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgeTargetBids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgeTargetBid }
     * 
     * 
     */
    public List<AgeTargetBid> getAgeTargetBids() {
        if (ageTargetBids == null) {
            ageTargetBids = new ArrayList<AgeTargetBid>();
        }
        return this.ageTargetBids;
    }

}
