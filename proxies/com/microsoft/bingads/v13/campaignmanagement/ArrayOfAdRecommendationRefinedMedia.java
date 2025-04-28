
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdRecommendationRefinedMedia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdRecommendationRefinedMedia">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdRecommendationRefinedMedia" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationRefinedMedia" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdRecommendationRefinedMedia", propOrder = {
    "adRecommendationRefinedMedias"
})
public class ArrayOfAdRecommendationRefinedMedia {

    @XmlElement(name = "AdRecommendationRefinedMedia", nillable = true)
    protected List<AdRecommendationRefinedMedia> adRecommendationRefinedMedias;
    public ArrayOfAdRecommendationRefinedMedia()
    {
      this.adRecommendationRefinedMedias = new ArrayList<AdRecommendationRefinedMedia>();
    }
    @JsonCreator
    public ArrayOfAdRecommendationRefinedMedia(List<AdRecommendationRefinedMedia> adrecommendationrefinedmedias)
    {
      this.adRecommendationRefinedMedias = adrecommendationrefinedmedias;
    }

    /**
     * Gets the value of the adRecommendationRefinedMedias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adRecommendationRefinedMedias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdRecommendationRefinedMedias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdRecommendationRefinedMedia }
     * 
     * 
     * @return
     *     The value of the adRecommendationRefinedMedias property.
     */
    public List<AdRecommendationRefinedMedia> getAdRecommendationRefinedMedias() {
        if (adRecommendationRefinedMedias == null) {
            adRecommendationRefinedMedias = new ArrayList<>();
        }
        return this.adRecommendationRefinedMedias;
    }

}
