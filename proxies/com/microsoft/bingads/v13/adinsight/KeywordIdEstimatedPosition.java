
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordIdEstimatedPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordIdEstimatedPosition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="KeywordEstimatedPosition" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordEstimatedPosition" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordIdEstimatedPosition", propOrder = {
    "keywordId",
    "keywordEstimatedPosition"
})
public class KeywordIdEstimatedPosition {

    @XmlElement(name = "KeywordId")
    protected Long keywordId;
    @XmlElement(name = "KeywordEstimatedPosition", nillable = true)
    protected KeywordEstimatedPosition keywordEstimatedPosition;

    /**
     * Gets the value of the keywordId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeywordId() {
        return keywordId;
    }

    /**
     * Sets the value of the keywordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeywordId(Long value) {
        this.keywordId = value;
    }

    /**
     * Gets the value of the keywordEstimatedPosition property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordEstimatedPosition }
     *     
     */
    public KeywordEstimatedPosition getKeywordEstimatedPosition() {
        return keywordEstimatedPosition;
    }

    /**
     * Sets the value of the keywordEstimatedPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordEstimatedPosition }
     *     
     */
    public void setKeywordEstimatedPosition(KeywordEstimatedPosition value) {
        this.keywordEstimatedPosition = value;
    }

}
