
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdRecommendationTextSuggestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdRecommendationTextSuggestion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdRecommendationTextSuggestion" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationTextSuggestion" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdRecommendationTextSuggestion", propOrder = {
    "adRecommendationTextSuggestions"
})
public class ArrayOfAdRecommendationTextSuggestion {

    @XmlElement(name = "AdRecommendationTextSuggestion", nillable = true)
    protected List<AdRecommendationTextSuggestion> adRecommendationTextSuggestions;
    public ArrayOfAdRecommendationTextSuggestion()
    {
      this.adRecommendationTextSuggestions = new ArrayList<AdRecommendationTextSuggestion>();
    }
    @JsonCreator
    public ArrayOfAdRecommendationTextSuggestion(List<AdRecommendationTextSuggestion> adrecommendationtextsuggestions)
    {
      this.adRecommendationTextSuggestions = adrecommendationtextsuggestions;
    }

    /**
     * Gets the value of the adRecommendationTextSuggestions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adRecommendationTextSuggestions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdRecommendationTextSuggestions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdRecommendationTextSuggestion }
     * 
     * 
     * @return
     *     The value of the adRecommendationTextSuggestions property.
     */
    public List<AdRecommendationTextSuggestion> getAdRecommendationTextSuggestions() {
        if (adRecommendationTextSuggestions == null) {
            adRecommendationTextSuggestions = new ArrayList<>();
        }
        return this.adRecommendationTextSuggestions;
    }

}
