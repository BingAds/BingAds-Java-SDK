
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCampaignConversionGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCampaignConversionGoal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampaignConversionGoal" type="{https://bingads.microsoft.com/CampaignManagement/v13}CampaignConversionGoal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampaignConversionGoal", propOrder = {
    "campaignConversionGoals"
})
public class ArrayOfCampaignConversionGoal {

    @XmlElement(name = "CampaignConversionGoal", nillable = true)
    protected List<CampaignConversionGoal> campaignConversionGoals;

    /**
     * Gets the value of the campaignConversionGoals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignConversionGoals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignConversionGoals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignConversionGoal }
     * 
     * 
     */
    public List<CampaignConversionGoal> getCampaignConversionGoals() {
        if (campaignConversionGoals == null) {
            campaignConversionGoals = new ArrayList<CampaignConversionGoal>();
        }
        return this.campaignConversionGoals;
    }

}
