
package com.microsoft.bingads.v10.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPostalCodeTargetBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPostalCodeTargetBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostalCodeTargetBid" type="{https://bingads.microsoft.com/CampaignManagement/v10}PostalCodeTargetBid" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPostalCodeTargetBid", propOrder = {
    "postalCodeTargetBids"
})
public class ArrayOfPostalCodeTargetBid {

    @XmlElement(name = "PostalCodeTargetBid", nillable = true)
    protected List<PostalCodeTargetBid> postalCodeTargetBids;

    /**
     * Gets the value of the postalCodeTargetBids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalCodeTargetBids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalCodeTargetBids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalCodeTargetBid }
     * 
     * 
     */
    public List<PostalCodeTargetBid> getPostalCodeTargetBids() {
        if (postalCodeTargetBids == null) {
            postalCodeTargetBids = new ArrayList<PostalCodeTargetBid>();
        }
        return this.postalCodeTargetBids;
    }

}
