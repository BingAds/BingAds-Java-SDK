
package com.microsoft.bingads.adintelligence;

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
 *         &lt;element name="KeywordIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="MaxBid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "keywordIds",
    "maxBid"
})
@XmlRootElement(name = "GetEstimatedPositionByKeywordIdsRequest", namespace = "https://bingads.microsoft.com/AdIntelligence/v9")
public class GetEstimatedPositionByKeywordIdsRequest {

    @XmlElement(name = "KeywordIds", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    protected ArrayOflong keywordIds;
    @XmlElement(name = "MaxBid", namespace = "https://bingads.microsoft.com/AdIntelligence/v9")
    protected Double maxBid;

    /**
     * Gets the value of the keywordIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getKeywordIds() {
        return keywordIds;
    }

    /**
     * Sets the value of the keywordIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setKeywordIds(ArrayOflong value) {
        this.keywordIds = value;
    }

    /**
     * Gets the value of the maxBid property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxBid() {
        return maxBid;
    }

    /**
     * Sets the value of the maxBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxBid(Double value) {
        this.maxBid = value;
    }

}
