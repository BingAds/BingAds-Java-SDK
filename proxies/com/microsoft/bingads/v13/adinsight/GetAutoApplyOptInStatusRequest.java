
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
 *         &lt;element name="RecommendationTypesInputs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
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
    "recommendationTypesInputs"
})
@XmlRootElement(name = "GetAutoApplyOptInStatusRequest")
public class GetAutoApplyOptInStatusRequest {

    @XmlElement(name = "RecommendationTypesInputs", nillable = true)
    protected ArrayOfstring recommendationTypesInputs;

    /**
     * Gets the value of the recommendationTypesInputs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getRecommendationTypesInputs() {
        return recommendationTypesInputs;
    }

    /**
     * Sets the value of the recommendationTypesInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setRecommendationTypesInputs(ArrayOfstring value) {
        this.recommendationTypesInputs = value;
    }

}
