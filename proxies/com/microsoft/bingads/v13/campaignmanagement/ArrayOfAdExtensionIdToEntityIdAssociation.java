
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdExtensionIdToEntityIdAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdExtensionIdToEntityIdAssociation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdExtensionIdToEntityIdAssociation" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtensionIdToEntityIdAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdExtensionIdToEntityIdAssociation", propOrder = {
    "adExtensionIdToEntityIdAssociations"
})
public class ArrayOfAdExtensionIdToEntityIdAssociation {

    @XmlElement(name = "AdExtensionIdToEntityIdAssociation", nillable = true)
    protected List<AdExtensionIdToEntityIdAssociation> adExtensionIdToEntityIdAssociations;
    public ArrayOfAdExtensionIdToEntityIdAssociation()
    {
      this.adExtensionIdToEntityIdAssociations = new ArrayList<AdExtensionIdToEntityIdAssociation>();
    }
    @JsonCreator
    public ArrayOfAdExtensionIdToEntityIdAssociation(List<AdExtensionIdToEntityIdAssociation> adextensionidtoentityidassociations)
    {
      this.adExtensionIdToEntityIdAssociations = adextensionidtoentityidassociations;
    }

    /**
     * Gets the value of the adExtensionIdToEntityIdAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adExtensionIdToEntityIdAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdExtensionIdToEntityIdAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdExtensionIdToEntityIdAssociation }
     * 
     * 
     * @return
     *     The value of the adExtensionIdToEntityIdAssociations property.
     */
    public List<AdExtensionIdToEntityIdAssociation> getAdExtensionIdToEntityIdAssociations() {
        if (adExtensionIdToEntityIdAssociations == null) {
            adExtensionIdToEntityIdAssociations = new ArrayList<>();
        }
        return this.adExtensionIdToEntityIdAssociations;
    }

}
