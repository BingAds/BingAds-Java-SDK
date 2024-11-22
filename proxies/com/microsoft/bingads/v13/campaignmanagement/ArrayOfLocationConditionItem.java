
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfLocationConditionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfLocationConditionItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LocationConditionItem" type="{https://bingads.microsoft.com/CampaignManagement/v13}LocationConditionItem" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLocationConditionItem", propOrder = {
    "locationConditionItems"
})
public class ArrayOfLocationConditionItem {

    @XmlElement(name = "LocationConditionItem", nillable = true)
    protected List<LocationConditionItem> locationConditionItems;
    public ArrayOfLocationConditionItem()
    {
      this.locationConditionItems = new ArrayList<LocationConditionItem>();
    }
    @JsonCreator
    public ArrayOfLocationConditionItem(List<LocationConditionItem> locationconditionitems)
    {
      this.locationConditionItems = locationconditionitems;
    }

    /**
     * Gets the value of the locationConditionItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the locationConditionItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationConditionItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationConditionItem }
     * 
     * 
     * @return
     *     The value of the locationConditionItems property.
     */
    public List<LocationConditionItem> getLocationConditionItems() {
        if (locationConditionItems == null) {
            locationConditionItems = new ArrayList<>();
        }
        return this.locationConditionItems;
    }

}
