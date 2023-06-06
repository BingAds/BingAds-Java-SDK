
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecommendationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RecommendationInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RecommendationHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RecommendationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecommendationInfo", propOrder = {
    "recommendationHash",
    "recommendationId"
})
@XmlSeeAlso({
    RSARecommendationInfo.class
})
public class RecommendationInfo {

    @XmlElement(name = "RecommendationHash", nillable = true)
    protected String recommendationHash;
    @XmlElement(name = "RecommendationId", nillable = true)
    protected String recommendationId;

    /**
     * Gets the value of the recommendationHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendationHash() {
        return recommendationHash;
    }

    /**
     * Sets the value of the recommendationHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendationHash(String value) {
        this.recommendationHash = value;
    }

    /**
     * Gets the value of the recommendationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendationId() {
        return recommendationId;
    }

    /**
     * Sets the value of the recommendationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendationId(String value) {
        this.recommendationId = value;
    }

}
