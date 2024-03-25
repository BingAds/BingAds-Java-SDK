
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Entities" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfApplyRecommendationEntity" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entities"
})
@XmlRootElement(name = "ApplyRecommendationsRequest")
public class ApplyRecommendationsRequest {

    @XmlElement(name = "Entities", nillable = true)
    protected ArrayOfApplyRecommendationEntity entities;

    /**
     * Gets the value of the entities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfApplyRecommendationEntity }
     *     
     */
    public ArrayOfApplyRecommendationEntity getEntities() {
        return entities;
    }

    /**
     * Sets the value of the entities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfApplyRecommendationEntity }
     *     
     */
    public void setEntities(ArrayOfApplyRecommendationEntity value) {
        this.entities = value;
    }

}
