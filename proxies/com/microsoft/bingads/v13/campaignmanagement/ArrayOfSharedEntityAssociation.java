
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfSharedEntityAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfSharedEntityAssociation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SharedEntityAssociation" type="{https://bingads.microsoft.com/CampaignManagement/v13}SharedEntityAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSharedEntityAssociation", propOrder = {
    "sharedEntityAssociations"
})
public class ArrayOfSharedEntityAssociation {

    @XmlElement(name = "SharedEntityAssociation", nillable = true)
    protected List<SharedEntityAssociation> sharedEntityAssociations;
    public ArrayOfSharedEntityAssociation()
    {
      this.sharedEntityAssociations = new ArrayList<SharedEntityAssociation>();
    }
    @JsonCreator
    public ArrayOfSharedEntityAssociation(List<SharedEntityAssociation> sharedentityassociations)
    {
      this.sharedEntityAssociations = sharedentityassociations;
    }

    /**
     * Gets the value of the sharedEntityAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sharedEntityAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedEntityAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharedEntityAssociation }
     * 
     * 
     * @return
     *     The value of the sharedEntityAssociations property.
     */
    public List<SharedEntityAssociation> getSharedEntityAssociations() {
        if (sharedEntityAssociations == null) {
            sharedEntityAssociations = new ArrayList<>();
        }
        return this.sharedEntityAssociations;
    }

}
