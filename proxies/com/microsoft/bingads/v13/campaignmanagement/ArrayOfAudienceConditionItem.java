
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAudienceConditionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAudienceConditionItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AudienceConditionItem" type="{https://bingads.microsoft.com/CampaignManagement/v13}AudienceConditionItem" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAudienceConditionItem", propOrder = {
    "audienceConditionItems"
})
public class ArrayOfAudienceConditionItem {

    @XmlElement(name = "AudienceConditionItem", nillable = true)
    protected List<AudienceConditionItem> audienceConditionItems;
    public ArrayOfAudienceConditionItem()
    {
      this.audienceConditionItems = new ArrayList<AudienceConditionItem>();
    }
    @JsonCreator
    public ArrayOfAudienceConditionItem(List<AudienceConditionItem> audienceconditionitems)
    {
      this.audienceConditionItems = audienceconditionitems;
    }

    /**
     * Gets the value of the audienceConditionItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the audienceConditionItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceConditionItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudienceConditionItem }
     * 
     * 
     * @return
     *     The value of the audienceConditionItems property.
     */
    public List<AudienceConditionItem> getAudienceConditionItems() {
        if (audienceConditionItems == null) {
            audienceConditionItems = new ArrayList<>();
        }
        return this.audienceConditionItems;
    }

}
