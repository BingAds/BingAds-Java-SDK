
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfRecommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfRecommendation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Recommendation" type="{https://bingads.microsoft.com/AdInsight/v13}Recommendation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecommendation", propOrder = {
    "recommendations"
})
public class ArrayOfRecommendation {

    @XmlElement(name = "Recommendation", nillable = true)
    protected List<Recommendation> recommendations;
    public ArrayOfRecommendation()
    {
      this.recommendations = new ArrayList<Recommendation>();
    }
    @JsonCreator
    public ArrayOfRecommendation(List<Recommendation> recommendations)
    {
      this.recommendations = recommendations;
    }

    /**
     * Gets the value of the recommendations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the recommendations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Recommendation }
     * 
     * 
     * @return
     *     The value of the recommendations property.
     */
    public List<Recommendation> getRecommendations() {
        if (recommendations == null) {
            recommendations = new ArrayList<>();
        }
        return this.recommendations;
    }

}
