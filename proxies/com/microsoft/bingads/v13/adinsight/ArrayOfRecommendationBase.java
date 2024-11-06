
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfRecommendationBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfRecommendationBase">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RecommendationBase" type="{https://bingads.microsoft.com/AdInsight/v13}RecommendationBase" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecommendationBase", propOrder = {
    "recommendationBases"
})
public class ArrayOfRecommendationBase {

    @XmlElement(name = "RecommendationBase", nillable = true)
    protected List<RecommendationBase> recommendationBases;
    public ArrayOfRecommendationBase()
    {
      this.recommendationBases = new ArrayList<RecommendationBase>();
    }
    @JsonCreator
    public ArrayOfRecommendationBase(List<RecommendationBase> recommendationbases)
    {
      this.recommendationBases = recommendationbases;
    }

    /**
     * Gets the value of the recommendationBases property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the recommendationBases property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendationBases().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecommendationBase }
     * 
     * 
     * @return
     *     The value of the recommendationBases property.
     */
    public List<RecommendationBase> getRecommendationBases() {
        if (recommendationBases == null) {
            recommendationBases = new ArrayList<>();
        }
        return this.recommendationBases;
    }

}
