
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdRecommendationCustomizedProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdRecommendationCustomizedProperty">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdRecommendationCustomizedProperty" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationCustomizedProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdRecommendationCustomizedProperty", propOrder = {
    "adRecommendationCustomizedProperties"
})
public class ArrayOfAdRecommendationCustomizedProperty {

    @XmlElement(name = "AdRecommendationCustomizedProperty", nillable = true)
    protected List<AdRecommendationCustomizedProperty> adRecommendationCustomizedProperties;
    public ArrayOfAdRecommendationCustomizedProperty()
    {
      this.adRecommendationCustomizedProperties = new ArrayList<AdRecommendationCustomizedProperty>();
    }
    @JsonCreator
    public ArrayOfAdRecommendationCustomizedProperty(List<AdRecommendationCustomizedProperty> adrecommendationcustomizedpropertys)
    {
      this.adRecommendationCustomizedProperties = adrecommendationcustomizedpropertys;
    }

    /**
     * Gets the value of the adRecommendationCustomizedProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adRecommendationCustomizedProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdRecommendationCustomizedProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdRecommendationCustomizedProperty }
     * 
     * 
     * @return
     *     The value of the adRecommendationCustomizedProperties property.
     */
    public List<AdRecommendationCustomizedProperty> getAdRecommendationCustomizedProperties() {
        if (adRecommendationCustomizedProperties == null) {
            adRecommendationCustomizedProperties = new ArrayList<>();
        }
        return this.adRecommendationCustomizedProperties;
    }

}
