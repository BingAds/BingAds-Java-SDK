
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOnlineConversionAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOnlineConversionAdjustment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OnlineConversionAdjustment" type="{https://bingads.microsoft.com/CampaignManagement/v13}OnlineConversionAdjustment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOnlineConversionAdjustment", propOrder = {
    "onlineConversionAdjustments"
})
public class ArrayOfOnlineConversionAdjustment {

    @XmlElement(name = "OnlineConversionAdjustment", nillable = true)
    protected List<OnlineConversionAdjustment> onlineConversionAdjustments;

    /**
     * Gets the value of the onlineConversionAdjustments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onlineConversionAdjustments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnlineConversionAdjustments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnlineConversionAdjustment }
     * 
     * 
     */
    public List<OnlineConversionAdjustment> getOnlineConversionAdjustments() {
        if (onlineConversionAdjustments == null) {
            onlineConversionAdjustments = new ArrayList<OnlineConversionAdjustment>();
        }
        return this.onlineConversionAdjustments;
    }

}
