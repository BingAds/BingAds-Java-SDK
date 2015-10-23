
package com.microsoft.bingads.v10.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGenderTargetBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGenderTargetBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GenderTargetBid" type="{https://bingads.microsoft.com/CampaignManagement/v10}GenderTargetBid" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGenderTargetBid", propOrder = {
    "genderTargetBids"
})
public class ArrayOfGenderTargetBid {

    @XmlElement(name = "GenderTargetBid", nillable = true)
    protected List<GenderTargetBid> genderTargetBids;

    /**
     * Gets the value of the genderTargetBids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genderTargetBids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenderTargetBids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenderTargetBid }
     * 
     * 
     */
    public List<GenderTargetBid> getGenderTargetBids() {
        if (genderTargetBids == null) {
            genderTargetBids = new ArrayList<GenderTargetBid>();
        }
        return this.genderTargetBids;
    }

}
