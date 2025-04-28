
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdRecommendationImageRefineOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdRecommendationImageRefineOperation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdRecommendationImageRefineOperation" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationImageRefineOperation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdRecommendationImageRefineOperation", propOrder = {
    "adRecommendationImageRefineOperations"
})
public class ArrayOfAdRecommendationImageRefineOperation {

    @XmlElement(name = "AdRecommendationImageRefineOperation", nillable = true)
    protected List<AdRecommendationImageRefineOperation> adRecommendationImageRefineOperations;
    public ArrayOfAdRecommendationImageRefineOperation()
    {
      this.adRecommendationImageRefineOperations = new ArrayList<AdRecommendationImageRefineOperation>();
    }
    @JsonCreator
    public ArrayOfAdRecommendationImageRefineOperation(List<AdRecommendationImageRefineOperation> adrecommendationimagerefineoperations)
    {
      this.adRecommendationImageRefineOperations = adrecommendationimagerefineoperations;
    }

    /**
     * Gets the value of the adRecommendationImageRefineOperations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adRecommendationImageRefineOperations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdRecommendationImageRefineOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdRecommendationImageRefineOperation }
     * 
     * 
     * @return
     *     The value of the adRecommendationImageRefineOperations property.
     */
    public List<AdRecommendationImageRefineOperation> getAdRecommendationImageRefineOperations() {
        if (adRecommendationImageRefineOperations == null) {
            adRecommendationImageRefineOperations = new ArrayList<>();
        }
        return this.adRecommendationImageRefineOperations;
    }

}
