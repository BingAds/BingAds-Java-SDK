
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfSharedListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfSharedListItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SharedListItem" type="{https://bingads.microsoft.com/CampaignManagement/v13}SharedListItem" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSharedListItem", propOrder = {
    "sharedListItems"
})
public class ArrayOfSharedListItem {

    @XmlElement(name = "SharedListItem", nillable = true)
    protected List<SharedListItem> sharedListItems;
    public ArrayOfSharedListItem()
    {
      this.sharedListItems = new ArrayList<SharedListItem>();
    }
    @JsonCreator
    public ArrayOfSharedListItem(List<SharedListItem> sharedlistitems)
    {
      this.sharedListItems = sharedlistitems;
    }

    /**
     * Gets the value of the sharedListItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sharedListItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedListItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharedListItem }
     * 
     * 
     * @return
     *     The value of the sharedListItems property.
     */
    public List<SharedListItem> getSharedListItems() {
        if (sharedListItems == null) {
            sharedListItems = new ArrayList<>();
        }
        return this.sharedListItems;
    }

}
