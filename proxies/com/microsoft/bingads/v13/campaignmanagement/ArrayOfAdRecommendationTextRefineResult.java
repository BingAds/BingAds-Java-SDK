
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdRecommendationTextRefineResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdRecommendationTextRefineResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdRecommendationTextRefineResult" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationTextRefineResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdRecommendationTextRefineResult", propOrder = {
    "adRecommendationTextRefineResults"
})
public class ArrayOfAdRecommendationTextRefineResult {

    @XmlElement(name = "AdRecommendationTextRefineResult", nillable = true)
    protected List<AdRecommendationTextRefineResult> adRecommendationTextRefineResults;
    public ArrayOfAdRecommendationTextRefineResult()
    {
      this.adRecommendationTextRefineResults = new ArrayList<AdRecommendationTextRefineResult>();
    }
    @JsonCreator
    public ArrayOfAdRecommendationTextRefineResult(List<AdRecommendationTextRefineResult> adrecommendationtextrefineresults)
    {
      this.adRecommendationTextRefineResults = adrecommendationtextrefineresults;
    }

    /**
     * Gets the value of the adRecommendationTextRefineResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adRecommendationTextRefineResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdRecommendationTextRefineResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdRecommendationTextRefineResult }
     * 
     * 
     * @return
     *     The value of the adRecommendationTextRefineResults property.
     */
    public List<AdRecommendationTextRefineResult> getAdRecommendationTextRefineResults() {
        if (adRecommendationTextRefineResults == null) {
            adRecommendationTextRefineResults = new ArrayList<>();
        }
        return this.adRecommendationTextRefineResults;
    }

}
