
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AudienceGroupAssetGroupAssociations" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAudienceGroupAssetGroupAssociation" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "audienceGroupAssetGroupAssociations"
})
@XmlRootElement(name = "DeleteAudienceGroupAssetGroupAssociationsRequest")
public class DeleteAudienceGroupAssetGroupAssociationsRequest {

    @XmlElement(name = "AudienceGroupAssetGroupAssociations", nillable = true)
    protected ArrayOfAudienceGroupAssetGroupAssociation audienceGroupAssetGroupAssociations;

    /**
     * Gets the value of the audienceGroupAssetGroupAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAudienceGroupAssetGroupAssociation }
     *     
     */
    public ArrayOfAudienceGroupAssetGroupAssociation getAudienceGroupAssetGroupAssociations() {
        return audienceGroupAssetGroupAssociations;
    }

    /**
     * Sets the value of the audienceGroupAssetGroupAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAudienceGroupAssetGroupAssociation }
     *     
     */
    public void setAudienceGroupAssetGroupAssociations(ArrayOfAudienceGroupAssetGroupAssociation value) {
        this.audienceGroupAssetGroupAssociations = value;
    }

}
