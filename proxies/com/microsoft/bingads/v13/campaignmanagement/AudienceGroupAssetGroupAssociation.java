
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceGroupAssetGroupAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AudienceGroupAssetGroupAssociation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssetGroupId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="AudienceGroupId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceGroupAssetGroupAssociation", propOrder = {
    "assetGroupId",
    "audienceGroupId"
})
public class AudienceGroupAssetGroupAssociation {

    @XmlElement(name = "AssetGroupId")
    protected long assetGroupId;
    @XmlElement(name = "AudienceGroupId")
    protected long audienceGroupId;

    /**
     * Gets the value of the assetGroupId property.
     * 
     */
    public long getAssetGroupId() {
        return assetGroupId;
    }

    /**
     * Sets the value of the assetGroupId property.
     * 
     */
    public void setAssetGroupId(long value) {
        this.assetGroupId = value;
    }

    /**
     * Gets the value of the audienceGroupId property.
     * 
     */
    public long getAudienceGroupId() {
        return audienceGroupId;
    }

    /**
     * Sets the value of the audienceGroupId property.
     * 
     */
    public void setAudienceGroupId(long value) {
        this.audienceGroupId = value;
    }

}
