
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAssetGroupSearchTheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAssetGroupSearchTheme">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssetGroupSearchTheme" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetGroupSearchTheme" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssetGroupSearchTheme", propOrder = {
    "assetGroupSearchThemes"
})
public class ArrayOfAssetGroupSearchTheme {

    @XmlElement(name = "AssetGroupSearchTheme", nillable = true)
    protected List<AssetGroupSearchTheme> assetGroupSearchThemes;
    public ArrayOfAssetGroupSearchTheme()
    {
      this.assetGroupSearchThemes = new ArrayList<AssetGroupSearchTheme>();
    }
    @JsonCreator
    public ArrayOfAssetGroupSearchTheme(List<AssetGroupSearchTheme> assetgroupsearchthemes)
    {
      this.assetGroupSearchThemes = assetgroupsearchthemes;
    }

    /**
     * Gets the value of the assetGroupSearchThemes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assetGroupSearchThemes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetGroupSearchThemes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetGroupSearchTheme }
     * 
     * 
     * @return
     *     The value of the assetGroupSearchThemes property.
     */
    public List<AssetGroupSearchTheme> getAssetGroupSearchThemes() {
        if (assetGroupSearchThemes == null) {
            assetGroupSearchThemes = new ArrayList<>();
        }
        return this.assetGroupSearchThemes;
    }

}
