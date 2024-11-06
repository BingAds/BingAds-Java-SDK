
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfRecommendationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfRecommendationInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RecommendationInfo" type="{https://bingads.microsoft.com/AdInsight/v13}RecommendationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecommendationInfo", propOrder = {
    "recommendationInfos"
})
public class ArrayOfRecommendationInfo {

    @XmlElement(name = "RecommendationInfo", nillable = true)
    protected List<RecommendationInfo> recommendationInfos;
    public ArrayOfRecommendationInfo()
    {
      this.recommendationInfos = new ArrayList<RecommendationInfo>();
    }
    @JsonCreator
    public ArrayOfRecommendationInfo(List<RecommendationInfo> recommendationinfos)
    {
      this.recommendationInfos = recommendationinfos;
    }

    /**
     * Gets the value of the recommendationInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the recommendationInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendationInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecommendationInfo }
     * 
     * 
     * @return
     *     The value of the recommendationInfos property.
     */
    public List<RecommendationInfo> getRecommendationInfos() {
        if (recommendationInfos == null) {
            recommendationInfos = new ArrayList<>();
        }
        return this.recommendationInfos;
    }

}
