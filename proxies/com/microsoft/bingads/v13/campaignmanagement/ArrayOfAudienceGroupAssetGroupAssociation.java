
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAudienceGroupAssetGroupAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAudienceGroupAssetGroupAssociation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AudienceGroupAssetGroupAssociation" type="{https://bingads.microsoft.com/CampaignManagement/v13}AudienceGroupAssetGroupAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAudienceGroupAssetGroupAssociation", propOrder = {
    "audienceGroupAssetGroupAssociations"
})
public class ArrayOfAudienceGroupAssetGroupAssociation {

    @XmlElement(name = "AudienceGroupAssetGroupAssociation", nillable = true)
    protected List<AudienceGroupAssetGroupAssociation> audienceGroupAssetGroupAssociations;
    public ArrayOfAudienceGroupAssetGroupAssociation()
    {
      this.audienceGroupAssetGroupAssociations = new ArrayList<AudienceGroupAssetGroupAssociation>();
    }
    @JsonCreator
    public ArrayOfAudienceGroupAssetGroupAssociation(List<AudienceGroupAssetGroupAssociation> audiencegroupassetgroupassociations)
    {
      this.audienceGroupAssetGroupAssociations = audiencegroupassetgroupassociations;
    }

    /**
     * Gets the value of the audienceGroupAssetGroupAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the audienceGroupAssetGroupAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudienceGroupAssetGroupAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudienceGroupAssetGroupAssociation }
     * 
     * 
     * @return
     *     The value of the audienceGroupAssetGroupAssociations property.
     */
    public List<AudienceGroupAssetGroupAssociation> getAudienceGroupAssetGroupAssociations() {
        if (audienceGroupAssetGroupAssociations == null) {
            audienceGroupAssetGroupAssociations = new ArrayList<>();
        }
        return this.audienceGroupAssetGroupAssociations;
    }

}
