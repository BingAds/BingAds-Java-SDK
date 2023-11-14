
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAssetGroupEditorialReason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAssetGroupEditorialReason">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssetGroupEditorialReason" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetGroupEditorialReason" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssetGroupEditorialReason", propOrder = {
    "assetGroupEditorialReasons"
})
public class ArrayOfAssetGroupEditorialReason {

    @XmlElement(name = "AssetGroupEditorialReason", nillable = true)
    protected List<AssetGroupEditorialReason> assetGroupEditorialReasons;
    public ArrayOfAssetGroupEditorialReason()
    {
      this.assetGroupEditorialReasons = new ArrayList<AssetGroupEditorialReason>();
    }
    @JsonCreator
    public ArrayOfAssetGroupEditorialReason(List<AssetGroupEditorialReason> assetgroupeditorialreasons)
    {
      this.assetGroupEditorialReasons = assetgroupeditorialreasons;
    }

    /**
     * Gets the value of the assetGroupEditorialReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assetGroupEditorialReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetGroupEditorialReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetGroupEditorialReason }
     * 
     * 
     * @return
     *     The value of the assetGroupEditorialReasons property.
     */
    public List<AssetGroupEditorialReason> getAssetGroupEditorialReasons() {
        if (assetGroupEditorialReasons == null) {
            assetGroupEditorialReasons = new ArrayList<>();
        }
        return this.assetGroupEditorialReasons;
    }

}
