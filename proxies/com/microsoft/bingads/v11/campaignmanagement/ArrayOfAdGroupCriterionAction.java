
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdGroupCriterionAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdGroupCriterionAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdGroupCriterionAction" type="{https://bingads.microsoft.com/CampaignManagement/v11}AdGroupCriterionAction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdGroupCriterionAction", propOrder = {
    "adGroupCriterionActions"
})
public class ArrayOfAdGroupCriterionAction {

    @XmlElement(name = "AdGroupCriterionAction", nillable = true)
    protected List<AdGroupCriterionAction> adGroupCriterionActions;

    /**
     * Gets the value of the adGroupCriterionActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adGroupCriterionActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdGroupCriterionActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupCriterionAction }
     * 
     * 
     */
    public List<AdGroupCriterionAction> getAdGroupCriterionActions() {
        if (adGroupCriterionActions == null) {
            adGroupCriterionActions = new ArrayList<AdGroupCriterionAction>();
        }
        return this.adGroupCriterionActions;
    }

}
