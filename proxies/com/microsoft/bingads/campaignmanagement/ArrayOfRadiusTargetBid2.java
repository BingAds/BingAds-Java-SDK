
package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRadiusTargetBid2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRadiusTargetBid2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RadiusTargetBid2" type="{https://bingads.microsoft.com/CampaignManagement/v9}RadiusTargetBid2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRadiusTargetBid2", propOrder = {
    "radiusTargetBid2S"
})
public class ArrayOfRadiusTargetBid2 {

    @XmlElement(name = "RadiusTargetBid2", nillable = true)
    protected List<RadiusTargetBid2> radiusTargetBid2S;

    /**
     * Gets the value of the radiusTargetBid2S property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radiusTargetBid2S property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadiusTargetBid2s().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RadiusTargetBid2 }
     * 
     * 
     */
    public List<RadiusTargetBid2> getRadiusTargetBid2s() {
        if (radiusTargetBid2S == null) {
            radiusTargetBid2S = new ArrayList<RadiusTargetBid2>();
        }
        return this.radiusTargetBid2S;
    }

}
