
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
 *         &lt;element name="KeywordEstimatedPositions" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeywordEstimatedPosition" minOccurs="0"/>
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
    "keywordEstimatedPositions"
})
@XmlRootElement(name = "GetEstimatedPositionByKeywordsResponse")
public class GetEstimatedPositionByKeywordsResponse {

    @XmlElement(name = "KeywordEstimatedPositions", nillable = true)
    protected ArrayOfKeywordEstimatedPosition keywordEstimatedPositions;

    /**
     * Gets the value of the keywordEstimatedPositions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordEstimatedPosition }
     *     
     */
    public ArrayOfKeywordEstimatedPosition getKeywordEstimatedPositions() {
        return keywordEstimatedPositions;
    }

    /**
     * Sets the value of the keywordEstimatedPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordEstimatedPosition }
     *     
     */
    public void setKeywordEstimatedPositions(ArrayOfKeywordEstimatedPosition value) {
        this.keywordEstimatedPositions = value;
    }

}
