
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfLabelAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfLabelAssociation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LabelAssociation" type="{https://bingads.microsoft.com/CampaignManagement/v13}LabelAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLabelAssociation", propOrder = {
    "labelAssociations"
})
public class ArrayOfLabelAssociation {

    @XmlElement(name = "LabelAssociation", nillable = true)
    protected List<LabelAssociation> labelAssociations;
    public ArrayOfLabelAssociation()
    {
      this.labelAssociations = new ArrayList<LabelAssociation>();
    }
    @JsonCreator
    public ArrayOfLabelAssociation(List<LabelAssociation> labelassociations)
    {
      this.labelAssociations = labelassociations;
    }

    /**
     * Gets the value of the labelAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the labelAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelAssociation }
     * 
     * 
     * @return
     *     The value of the labelAssociations property.
     */
    public List<LabelAssociation> getLabelAssociations() {
        if (labelAssociations == null) {
            labelAssociations = new ArrayList<>();
        }
        return this.labelAssociations;
    }

}
