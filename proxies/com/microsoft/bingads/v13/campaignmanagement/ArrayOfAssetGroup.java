
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAssetGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAssetGroup">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssetGroup" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssetGroup", propOrder = {
    "assetGroups"
})
public class ArrayOfAssetGroup {

    @XmlElement(name = "AssetGroup", nillable = true)
    protected List<AssetGroup> assetGroups;
    public ArrayOfAssetGroup()
    {
      this.assetGroups = new ArrayList<AssetGroup>();
    }
    @JsonCreator
    public ArrayOfAssetGroup(List<AssetGroup> assetgroups)
    {
      this.assetGroups = assetgroups;
    }

    /**
     * Gets the value of the assetGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assetGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetGroup }
     * 
     * 
     * @return
     *     The value of the assetGroups property.
     */
    public List<AssetGroup> getAssetGroups() {
        if (assetGroups == null) {
            assetGroups = new ArrayList<>();
        }
        return this.assetGroups;
    }

}
