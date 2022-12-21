
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Recommendations" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfRecommendation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recommendations"
})
@XmlRootElement(name = "GetRecommendationsResponse")
public class GetRecommendationsResponse {

    @XmlElement(name = "Recommendations", nillable = true)
    protected ArrayOfRecommendation recommendations;

    /**
     * Gets the value of the recommendations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecommendation }
     *     
     */
    public ArrayOfRecommendation getRecommendations() {
        return recommendations;
    }

    /**
     * Sets the value of the recommendations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecommendation }
     *     
     */
    public void setRecommendations(ArrayOfRecommendation value) {
        this.recommendations = value;
    }

}
