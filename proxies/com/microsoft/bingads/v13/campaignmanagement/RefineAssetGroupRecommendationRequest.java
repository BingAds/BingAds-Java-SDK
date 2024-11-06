
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
 *         <element name="AssetGroup" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetGroup" minOccurs="0"/>
 *         <element name="TextRefineOperations" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdRecommendationTextRefineOperation" minOccurs="0"/>
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
    "assetGroup",
    "textRefineOperations"
})
@XmlRootElement(name = "RefineAssetGroupRecommendationRequest")
public class RefineAssetGroupRecommendationRequest {

    @XmlElement(name = "AssetGroup", nillable = true)
    protected AssetGroup assetGroup;
    @XmlElement(name = "TextRefineOperations", nillable = true)
    protected ArrayOfAdRecommendationTextRefineOperation textRefineOperations;

    /**
     * Gets the value of the assetGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AssetGroup }
     *     
     */
    public AssetGroup getAssetGroup() {
        return assetGroup;
    }

    /**
     * Sets the value of the assetGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetGroup }
     *     
     */
    public void setAssetGroup(AssetGroup value) {
        this.assetGroup = value;
    }

    /**
     * Gets the value of the textRefineOperations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdRecommendationTextRefineOperation }
     *     
     */
    public ArrayOfAdRecommendationTextRefineOperation getTextRefineOperations() {
        return textRefineOperations;
    }

    /**
     * Sets the value of the textRefineOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdRecommendationTextRefineOperation }
     *     
     */
    public void setTextRefineOperations(ArrayOfAdRecommendationTextRefineOperation value) {
        this.textRefineOperations = value;
    }

}
