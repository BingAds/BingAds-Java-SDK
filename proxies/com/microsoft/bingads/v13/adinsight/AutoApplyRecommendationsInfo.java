
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoApplyRecommendationsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AutoApplyRecommendationsInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AAROptInStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="RecommendationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoApplyRecommendationsInfo", propOrder = {
    "aarOptInStatus",
    "recommendationType"
})
public class AutoApplyRecommendationsInfo {

    @XmlElement(name = "AAROptInStatus")
    protected Boolean aarOptInStatus;
    @XmlElement(name = "RecommendationType", nillable = true)
    protected String recommendationType;

    /**
     * Gets the value of the aarOptInStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAAROptInStatus() {
        return aarOptInStatus;
    }

    /**
     * Sets the value of the aarOptInStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAAROptInStatus(Boolean value) {
        this.aarOptInStatus = value;
    }

    /**
     * Gets the value of the recommendationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendationType() {
        return recommendationType;
    }

    /**
     * Sets the value of the recommendationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendationType(String value) {
        this.recommendationType = value;
    }

}
