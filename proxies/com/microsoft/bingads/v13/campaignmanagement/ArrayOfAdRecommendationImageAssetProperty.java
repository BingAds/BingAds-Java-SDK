
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdRecommendationImageAssetProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdRecommendationImageAssetProperty">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdRecommendationImageAssetProperty" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationImageAssetProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdRecommendationImageAssetProperty", propOrder = {
    "adRecommendationImageAssetProperties"
})
public class ArrayOfAdRecommendationImageAssetProperty {

    @XmlElement(name = "AdRecommendationImageAssetProperty", nillable = true)
    protected List<AdRecommendationImageAssetProperty> adRecommendationImageAssetProperties;
    public ArrayOfAdRecommendationImageAssetProperty()
    {
      this.adRecommendationImageAssetProperties = new ArrayList<AdRecommendationImageAssetProperty>();
    }
    @JsonCreator
    public ArrayOfAdRecommendationImageAssetProperty(List<AdRecommendationImageAssetProperty> adrecommendationimageassetpropertys)
    {
      this.adRecommendationImageAssetProperties = adrecommendationimageassetpropertys;
    }

    /**
     * Gets the value of the adRecommendationImageAssetProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adRecommendationImageAssetProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdRecommendationImageAssetProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdRecommendationImageAssetProperty }
     * 
     * 
     * @return
     *     The value of the adRecommendationImageAssetProperties property.
     */
    public List<AdRecommendationImageAssetProperty> getAdRecommendationImageAssetProperties() {
        if (adRecommendationImageAssetProperties == null) {
            adRecommendationImageAssetProperties = new ArrayList<>();
        }
        return this.adRecommendationImageAssetProperties;
    }

}
