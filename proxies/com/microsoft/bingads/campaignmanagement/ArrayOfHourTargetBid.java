
package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHourTargetBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHourTargetBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HourTargetBid" type="{https://bingads.microsoft.com/CampaignManagement/v9}HourTargetBid" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHourTargetBid", propOrder = {
    "hourTargetBids"
})
public class ArrayOfHourTargetBid {

    @XmlElement(name = "HourTargetBid", nillable = true)
    protected List<HourTargetBid> hourTargetBids;

    /**
     * Gets the value of the hourTargetBids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hourTargetBids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHourTargetBids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HourTargetBid }
     * 
     * 
     */
    public List<HourTargetBid> getHourTargetBids() {
        if (hourTargetBids == null) {
            hourTargetBids = new ArrayList<HourTargetBid>();
        }
        return this.hourTargetBids;
    }

}
