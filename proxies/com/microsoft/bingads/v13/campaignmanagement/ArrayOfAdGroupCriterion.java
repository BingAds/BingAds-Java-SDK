
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdGroupCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdGroupCriterion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdGroupCriterion" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdGroupCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdGroupCriterion", propOrder = {
    "adGroupCriterions"
})
public class ArrayOfAdGroupCriterion {

    @XmlElement(name = "AdGroupCriterion", nillable = true)
    protected List<AdGroupCriterion> adGroupCriterions;
    public ArrayOfAdGroupCriterion()
    {
      this.adGroupCriterions = new ArrayList<AdGroupCriterion>();
    }
    @JsonCreator
    public ArrayOfAdGroupCriterion(List<AdGroupCriterion> adgroupcriterions)
    {
      this.adGroupCriterions = adgroupcriterions;
    }

    /**
     * Gets the value of the adGroupCriterions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adGroupCriterions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdGroupCriterions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupCriterion }
     * 
     * 
     * @return
     *     The value of the adGroupCriterions property.
     */
    public List<AdGroupCriterion> getAdGroupCriterions() {
        if (adGroupCriterions == null) {
            adGroupCriterions = new ArrayList<>();
        }
        return this.adGroupCriterions;
    }

}
