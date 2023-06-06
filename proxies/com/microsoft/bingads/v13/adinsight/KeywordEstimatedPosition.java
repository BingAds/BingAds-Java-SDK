
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordEstimatedPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordEstimatedPosition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EstimatedPositions" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfEstimatedPositionAndTraffic" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordEstimatedPosition", propOrder = {
    "keyword",
    "estimatedPositions"
})
public class KeywordEstimatedPosition {

    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "EstimatedPositions", nillable = true)
    protected ArrayOfEstimatedPositionAndTraffic estimatedPositions;

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the estimatedPositions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEstimatedPositionAndTraffic }
     *     
     */
    public ArrayOfEstimatedPositionAndTraffic getEstimatedPositions() {
        return estimatedPositions;
    }

    /**
     * Sets the value of the estimatedPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEstimatedPositionAndTraffic }
     *     
     */
    public void setEstimatedPositions(ArrayOfEstimatedPositionAndTraffic value) {
        this.estimatedPositions = value;
    }

}
