
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdRecommendationMediaRefineResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdRecommendationMediaRefineResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdRecommendationMediaRefineResult" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationMediaRefineResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdRecommendationMediaRefineResult", propOrder = {
    "adRecommendationMediaRefineResults"
})
public class ArrayOfAdRecommendationMediaRefineResult {

    @XmlElement(name = "AdRecommendationMediaRefineResult", nillable = true)
    protected List<AdRecommendationMediaRefineResult> adRecommendationMediaRefineResults;
    public ArrayOfAdRecommendationMediaRefineResult()
    {
      this.adRecommendationMediaRefineResults = new ArrayList<AdRecommendationMediaRefineResult>();
    }
    @JsonCreator
    public ArrayOfAdRecommendationMediaRefineResult(List<AdRecommendationMediaRefineResult> adrecommendationmediarefineresults)
    {
      this.adRecommendationMediaRefineResults = adrecommendationmediarefineresults;
    }

    /**
     * Gets the value of the adRecommendationMediaRefineResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adRecommendationMediaRefineResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdRecommendationMediaRefineResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdRecommendationMediaRefineResult }
     * 
     * 
     * @return
     *     The value of the adRecommendationMediaRefineResults property.
     */
    public List<AdRecommendationMediaRefineResult> getAdRecommendationMediaRefineResults() {
        if (adRecommendationMediaRefineResults == null) {
            adRecommendationMediaRefineResults = new ArrayList<>();
        }
        return this.adRecommendationMediaRefineResults;
    }

}
