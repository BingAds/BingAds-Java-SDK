
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdGroupCriterionAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdGroupCriterionAction">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdGroupCriterionAction" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdGroupCriterionAction" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public ArrayOfAdGroupCriterionAction()
    {
      this.adGroupCriterionActions = new ArrayList<AdGroupCriterionAction>();
    }
    @JsonCreator
    public ArrayOfAdGroupCriterionAction(List<AdGroupCriterionAction> adgroupcriterionactions)
    {
      this.adGroupCriterionActions = adgroupcriterionactions;
    }

    /**
     * Gets the value of the adGroupCriterionActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adGroupCriterionActions property.
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
     * @return
     *     The value of the adGroupCriterionActions property.
     */
    public List<AdGroupCriterionAction> getAdGroupCriterionActions() {
        if (adGroupCriterionActions == null) {
            adGroupCriterionActions = new ArrayList<>();
        }
        return this.adGroupCriterionActions;
    }

}
