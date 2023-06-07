
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordAndConfidence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordAndConfidence">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SuggestedKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ConfidenceScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordAndConfidence", propOrder = {
    "suggestedKeyword",
    "confidenceScore"
})
public class KeywordAndConfidence {

    @XmlElement(name = "SuggestedKeyword", nillable = true)
    protected String suggestedKeyword;
    @XmlElement(name = "ConfidenceScore")
    protected Double confidenceScore;

    /**
     * Gets the value of the suggestedKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedKeyword() {
        return suggestedKeyword;
    }

    /**
     * Sets the value of the suggestedKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedKeyword(String value) {
        this.suggestedKeyword = value;
    }

    /**
     * Gets the value of the confidenceScore property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConfidenceScore() {
        return confidenceScore;
    }

    /**
     * Sets the value of the confidenceScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConfidenceScore(Double value) {
        this.confidenceScore = value;
    }

}
