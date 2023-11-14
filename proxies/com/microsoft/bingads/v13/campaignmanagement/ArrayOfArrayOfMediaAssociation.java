
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfArrayOfMediaAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfArrayOfMediaAssociation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ArrayOfMediaAssociation" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfMediaAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfMediaAssociation", propOrder = {
    "arrayOfMediaAssociations"
})
public class ArrayOfArrayOfMediaAssociation {

    @XmlElement(name = "ArrayOfMediaAssociation", nillable = true)
    protected List<ArrayOfMediaAssociation> arrayOfMediaAssociations;
    public ArrayOfArrayOfMediaAssociation()
    {
      this.arrayOfMediaAssociations = new ArrayList<ArrayOfMediaAssociation>();
    }
    @JsonCreator
    public ArrayOfArrayOfMediaAssociation(List<ArrayOfMediaAssociation> arrayofmediaassociations)
    {
      this.arrayOfMediaAssociations = arrayofmediaassociations;
    }

    /**
     * Gets the value of the arrayOfMediaAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the arrayOfMediaAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfMediaAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfMediaAssociation }
     * 
     * 
     * @return
     *     The value of the arrayOfMediaAssociations property.
     */
    public List<ArrayOfMediaAssociation> getArrayOfMediaAssociations() {
        if (arrayOfMediaAssociations == null) {
            arrayOfMediaAssociations = new ArrayList<>();
        }
        return this.arrayOfMediaAssociations;
    }

}
