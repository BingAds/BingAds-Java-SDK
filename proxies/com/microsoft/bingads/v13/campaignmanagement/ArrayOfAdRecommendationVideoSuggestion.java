
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdRecommendationVideoSuggestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdRecommendationVideoSuggestion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdRecommendationVideoSuggestion" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationVideoSuggestion" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdRecommendationVideoSuggestion", propOrder = {
    "adRecommendationVideoSuggestions"
})
public class ArrayOfAdRecommendationVideoSuggestion {

    @XmlElement(name = "AdRecommendationVideoSuggestion", nillable = true)
    protected List<AdRecommendationVideoSuggestion> adRecommendationVideoSuggestions;
    public ArrayOfAdRecommendationVideoSuggestion()
    {
      this.adRecommendationVideoSuggestions = new ArrayList<AdRecommendationVideoSuggestion>();
    }
    @JsonCreator
    public ArrayOfAdRecommendationVideoSuggestion(List<AdRecommendationVideoSuggestion> adrecommendationvideosuggestions)
    {
      this.adRecommendationVideoSuggestions = adrecommendationvideosuggestions;
    }

    /**
     * Gets the value of the adRecommendationVideoSuggestions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adRecommendationVideoSuggestions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdRecommendationVideoSuggestions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdRecommendationVideoSuggestion }
     * 
     * 
     * @return
     *     The value of the adRecommendationVideoSuggestions property.
     */
    public List<AdRecommendationVideoSuggestion> getAdRecommendationVideoSuggestions() {
        if (adRecommendationVideoSuggestions == null) {
            adRecommendationVideoSuggestions = new ArrayList<>();
        }
        return this.adRecommendationVideoSuggestions;
    }

}
