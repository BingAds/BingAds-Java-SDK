
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAssetGroupUrlTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAssetGroupUrlTarget">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssetGroupUrlTarget" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetGroupUrlTarget" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssetGroupUrlTarget", propOrder = {
    "assetGroupUrlTargets"
})
public class ArrayOfAssetGroupUrlTarget {

    @XmlElement(name = "AssetGroupUrlTarget", nillable = true)
    protected List<AssetGroupUrlTarget> assetGroupUrlTargets;
    public ArrayOfAssetGroupUrlTarget()
    {
      this.assetGroupUrlTargets = new ArrayList<AssetGroupUrlTarget>();
    }
    @JsonCreator
    public ArrayOfAssetGroupUrlTarget(List<AssetGroupUrlTarget> assetgroupurltargets)
    {
      this.assetGroupUrlTargets = assetgroupurltargets;
    }

    /**
     * Gets the value of the assetGroupUrlTargets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assetGroupUrlTargets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetGroupUrlTargets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetGroupUrlTarget }
     * 
     * 
     * @return
     *     The value of the assetGroupUrlTargets property.
     */
    public List<AssetGroupUrlTarget> getAssetGroupUrlTargets() {
        if (assetGroupUrlTargets == null) {
            assetGroupUrlTargets = new ArrayList<>();
        }
        return this.assetGroupUrlTargets;
    }

}
