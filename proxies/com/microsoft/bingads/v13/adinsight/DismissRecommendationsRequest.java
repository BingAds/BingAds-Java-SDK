
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
 *         <element name="Entities" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfDismissRecommendationEntity" minOccurs="0"/>
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
@XmlRootElement(name = "DismissRecommendationsRequest")
public class DismissRecommendationsRequest {

    @XmlElement(name = "Entities", nillable = true)
    protected ArrayOfDismissRecommendationEntity entities;

    /**
     * Gets the value of the entities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDismissRecommendationEntity }
     *     
     */
    public ArrayOfDismissRecommendationEntity getEntities() {
        return entities;
    }

    /**
     * Sets the value of the entities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDismissRecommendationEntity }
     *     
     */
    public void setEntities(ArrayOfDismissRecommendationEntity value) {
        this.entities = value;
    }

}
