
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfEditorialReasonCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfEditorialReasonCollection">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EditorialReasonCollection" type="{https://bingads.microsoft.com/CampaignManagement/v13}EditorialReasonCollection" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEditorialReasonCollection", propOrder = {
    "editorialReasonCollections"
})
public class ArrayOfEditorialReasonCollection {

    @XmlElement(name = "EditorialReasonCollection", nillable = true)
    protected List<EditorialReasonCollection> editorialReasonCollections;
    public ArrayOfEditorialReasonCollection()
    {
      this.editorialReasonCollections = new ArrayList<EditorialReasonCollection>();
    }
    @JsonCreator
    public ArrayOfEditorialReasonCollection(List<EditorialReasonCollection> editorialreasoncollections)
    {
      this.editorialReasonCollections = editorialreasoncollections;
    }

    /**
     * Gets the value of the editorialReasonCollections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the editorialReasonCollections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditorialReasonCollections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EditorialReasonCollection }
     * 
     * 
     * @return
     *     The value of the editorialReasonCollections property.
     */
    public List<EditorialReasonCollection> getEditorialReasonCollections() {
        if (editorialReasonCollections == null) {
            editorialReasonCollections = new ArrayList<>();
        }
        return this.editorialReasonCollections;
    }

}
