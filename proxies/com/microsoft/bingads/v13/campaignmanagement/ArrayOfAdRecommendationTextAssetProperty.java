
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdRecommendationTextAssetProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdRecommendationTextAssetProperty">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdRecommendationTextAssetProperty" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationTextAssetProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdRecommendationTextAssetProperty", propOrder = {
    "adRecommendationTextAssetProperties"
})
public class ArrayOfAdRecommendationTextAssetProperty {

    @XmlElement(name = "AdRecommendationTextAssetProperty", nillable = true)
    protected List<AdRecommendationTextAssetProperty> adRecommendationTextAssetProperties;
    public ArrayOfAdRecommendationTextAssetProperty()
    {
      this.adRecommendationTextAssetProperties = new ArrayList<AdRecommendationTextAssetProperty>();
    }
    @JsonCreator
    public ArrayOfAdRecommendationTextAssetProperty(List<AdRecommendationTextAssetProperty> adrecommendationtextassetpropertys)
    {
      this.adRecommendationTextAssetProperties = adrecommendationtextassetpropertys;
    }

    /**
     * Gets the value of the adRecommendationTextAssetProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adRecommendationTextAssetProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdRecommendationTextAssetProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdRecommendationTextAssetProperty }
     * 
     * 
     * @return
     *     The value of the adRecommendationTextAssetProperties property.
     */
    public List<AdRecommendationTextAssetProperty> getAdRecommendationTextAssetProperties() {
        if (adRecommendationTextAssetProperties == null) {
            adRecommendationTextAssetProperties = new ArrayList<>();
        }
        return this.adRecommendationTextAssetProperties;
    }

}
