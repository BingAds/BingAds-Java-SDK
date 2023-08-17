
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfCampaignCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCampaignCriterion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CampaignCriterion" type="{https://bingads.microsoft.com/CampaignManagement/v13}CampaignCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampaignCriterion", propOrder = {
    "campaignCriterions"
})
public class ArrayOfCampaignCriterion {

    @XmlElement(name = "CampaignCriterion", nillable = true)
    protected List<CampaignCriterion> campaignCriterions;
    public ArrayOfCampaignCriterion()
    {
      this.campaignCriterions = new ArrayList<CampaignCriterion>();
    }
    @JsonCreator
    public ArrayOfCampaignCriterion(List<CampaignCriterion> campaigncriterions)
    {
      this.campaignCriterions = campaigncriterions;
    }

    /**
     * Gets the value of the campaignCriterions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the campaignCriterions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignCriterions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignCriterion }
     * 
     * 
     * @return
     *     The value of the campaignCriterions property.
     */
    public List<CampaignCriterion> getCampaignCriterions() {
        if (campaignCriterions == null) {
            campaignCriterions = new ArrayList<>();
        }
        return this.campaignCriterions;
    }

}
