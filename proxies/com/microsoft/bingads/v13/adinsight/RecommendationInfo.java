
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecommendationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecommendationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecommendationHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecommendationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
