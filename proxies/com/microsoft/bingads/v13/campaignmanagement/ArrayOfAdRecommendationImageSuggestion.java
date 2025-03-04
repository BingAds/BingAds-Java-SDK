
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdRecommendationImageSuggestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdRecommendationImageSuggestion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdRecommendationImageSuggestion" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationImageSuggestion" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdRecommendationImageSuggestion", propOrder = {
    "adRecommendationImageSuggestions"
})
public class ArrayOfAdRecommendationImageSuggestion {

    @XmlElement(name = "AdRecommendationImageSuggestion", nillable = true)
    protected List<AdRecommendationImageSuggestion> adRecommendationImageSuggestions;
    public ArrayOfAdRecommendationImageSuggestion()
    {
      this.adRecommendationImageSuggestions = new ArrayList<AdRecommendationImageSuggestion>();
    }
    @JsonCreator
    public ArrayOfAdRecommendationImageSuggestion(List<AdRecommendationImageSuggestion> adrecommendationimagesuggestions)
    {
      this.adRecommendationImageSuggestions = adrecommendationimagesuggestions;
    }

    /**
     * Gets the value of the adRecommendationImageSuggestions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adRecommendationImageSuggestions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdRecommendationImageSuggestions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdRecommendationImageSuggestion }
     * 
     * 
     * @return
     *     The value of the adRecommendationImageSuggestions property.
     */
    public List<AdRecommendationImageSuggestion> getAdRecommendationImageSuggestions() {
        if (adRecommendationImageSuggestions == null) {
            adRecommendationImageSuggestions = new ArrayList<>();
        }
        return this.adRecommendationImageSuggestions;
    }

}
