
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdRecommendationTextRefineOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdRecommendationTextRefineOperation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdRecommendationTextRefineOperation" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationTextRefineOperation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdRecommendationTextRefineOperation", propOrder = {
    "adRecommendationTextRefineOperations"
})
public class ArrayOfAdRecommendationTextRefineOperation {

    @XmlElement(name = "AdRecommendationTextRefineOperation", nillable = true)
    protected List<AdRecommendationTextRefineOperation> adRecommendationTextRefineOperations;
    public ArrayOfAdRecommendationTextRefineOperation()
    {
      this.adRecommendationTextRefineOperations = new ArrayList<AdRecommendationTextRefineOperation>();
    }
    @JsonCreator
    public ArrayOfAdRecommendationTextRefineOperation(List<AdRecommendationTextRefineOperation> adrecommendationtextrefineoperations)
    {
      this.adRecommendationTextRefineOperations = adrecommendationtextrefineoperations;
    }

    /**
     * Gets the value of the adRecommendationTextRefineOperations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adRecommendationTextRefineOperations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdRecommendationTextRefineOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdRecommendationTextRefineOperation }
     * 
     * 
     * @return
     *     The value of the adRecommendationTextRefineOperations property.
     */
    public List<AdRecommendationTextRefineOperation> getAdRecommendationTextRefineOperations() {
        if (adRecommendationTextRefineOperations == null) {
            adRecommendationTextRefineOperations = new ArrayList<>();
        }
        return this.adRecommendationTextRefineOperations;
    }

}
