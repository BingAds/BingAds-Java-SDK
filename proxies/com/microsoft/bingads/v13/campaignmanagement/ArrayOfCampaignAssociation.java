
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfCampaignAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCampaignAssociation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CampaignAssociation" type="{https://bingads.microsoft.com/CampaignManagement/v13}CampaignAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampaignAssociation", propOrder = {
    "campaignAssociations"
})
public class ArrayOfCampaignAssociation {

    @XmlElement(name = "CampaignAssociation", nillable = true)
    protected List<CampaignAssociation> campaignAssociations;
    public ArrayOfCampaignAssociation()
    {
      this.campaignAssociations = new ArrayList<CampaignAssociation>();
    }
    @JsonCreator
    public ArrayOfCampaignAssociation(List<CampaignAssociation> campaignassociations)
    {
      this.campaignAssociations = campaignassociations;
    }

    /**
     * Gets the value of the campaignAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the campaignAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignAssociation }
     * 
     * 
     * @return
     *     The value of the campaignAssociations property.
     */
    public List<CampaignAssociation> getCampaignAssociations() {
        if (campaignAssociations == null) {
            campaignAssociations = new ArrayList<>();
        }
        return this.campaignAssociations;
    }

}
