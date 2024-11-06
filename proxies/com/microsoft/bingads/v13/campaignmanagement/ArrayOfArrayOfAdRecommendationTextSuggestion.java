
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfArrayOfAdRecommendationTextSuggestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfArrayOfAdRecommendationTextSuggestion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ArrayOfAdRecommendationTextSuggestion" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdRecommendationTextSuggestion" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfAdRecommendationTextSuggestion", propOrder = {
    "arrayOfAdRecommendationTextSuggestions"
})
public class ArrayOfArrayOfAdRecommendationTextSuggestion {

    @XmlElement(name = "ArrayOfAdRecommendationTextSuggestion", nillable = true)
    protected List<ArrayOfAdRecommendationTextSuggestion> arrayOfAdRecommendationTextSuggestions;
    public ArrayOfArrayOfAdRecommendationTextSuggestion()
    {
      this.arrayOfAdRecommendationTextSuggestions = new ArrayList<ArrayOfAdRecommendationTextSuggestion>();
    }
    @JsonCreator
    public ArrayOfArrayOfAdRecommendationTextSuggestion(List<ArrayOfAdRecommendationTextSuggestion> arrayofadrecommendationtextsuggestions)
    {
      this.arrayOfAdRecommendationTextSuggestions = arrayofadrecommendationtextsuggestions;
    }

    /**
     * Gets the value of the arrayOfAdRecommendationTextSuggestions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the arrayOfAdRecommendationTextSuggestions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfAdRecommendationTextSuggestions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAdRecommendationTextSuggestion }
     * 
     * 
     * @return
     *     The value of the arrayOfAdRecommendationTextSuggestions property.
     */
    public List<ArrayOfAdRecommendationTextSuggestion> getArrayOfAdRecommendationTextSuggestions() {
        if (arrayOfAdRecommendationTextSuggestions == null) {
            arrayOfAdRecommendationTextSuggestions = new ArrayList<>();
        }
        return this.arrayOfAdRecommendationTextSuggestions;
    }

}
