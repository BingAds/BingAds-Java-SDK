
package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDayTargetBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDayTargetBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DayTargetBid" type="{https://bingads.microsoft.com/CampaignManagement/v9}DayTargetBid" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDayTargetBid", propOrder = {
    "dayTargetBids"
})
public class ArrayOfDayTargetBid {

    @XmlElement(name = "DayTargetBid", nillable = true)
    protected List<DayTargetBid> dayTargetBids;

    /**
     * Gets the value of the dayTargetBids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayTargetBids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayTargetBids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayTargetBid }
     * 
     * 
     */
    public List<DayTargetBid> getDayTargetBids() {
        if (dayTargetBids == null) {
            dayTargetBids = new ArrayList<DayTargetBid>();
        }
        return this.dayTargetBids;
    }

}
