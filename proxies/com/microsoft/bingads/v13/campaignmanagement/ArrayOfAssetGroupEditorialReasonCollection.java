
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAssetGroupEditorialReasonCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAssetGroupEditorialReasonCollection">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssetGroupEditorialReasonCollection" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetGroupEditorialReasonCollection" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssetGroupEditorialReasonCollection", propOrder = {
    "assetGroupEditorialReasonCollections"
})
public class ArrayOfAssetGroupEditorialReasonCollection {

    @XmlElement(name = "AssetGroupEditorialReasonCollection", nillable = true)
    protected List<AssetGroupEditorialReasonCollection> assetGroupEditorialReasonCollections;
    public ArrayOfAssetGroupEditorialReasonCollection()
    {
      this.assetGroupEditorialReasonCollections = new ArrayList<AssetGroupEditorialReasonCollection>();
    }
    @JsonCreator
    public ArrayOfAssetGroupEditorialReasonCollection(List<AssetGroupEditorialReasonCollection> assetgroupeditorialreasoncollections)
    {
      this.assetGroupEditorialReasonCollections = assetgroupeditorialreasoncollections;
    }

    /**
     * Gets the value of the assetGroupEditorialReasonCollections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assetGroupEditorialReasonCollections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetGroupEditorialReasonCollections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetGroupEditorialReasonCollection }
     * 
     * 
     * @return
     *     The value of the assetGroupEditorialReasonCollections property.
     */
    public List<AssetGroupEditorialReasonCollection> getAssetGroupEditorialReasonCollections() {
        if (assetGroupEditorialReasonCollections == null) {
            assetGroupEditorialReasonCollections = new ArrayList<>();
        }
        return this.assetGroupEditorialReasonCollections;
    }

}
