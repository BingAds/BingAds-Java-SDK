
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="TargetPositionForAds" type="{https://bingads.microsoft.com/AdInsight/v13}TargetAdPosition" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keywordIds",
    "targetPositionForAds"
})
@XmlRootElement(name = "GetEstimatedBidByKeywordIdsRequest")
public class GetEstimatedBidByKeywordIdsRequest {

    @XmlElement(name = "KeywordIds", nillable = true)
    protected ArrayOflong keywordIds;
    @XmlElement(name = "TargetPositionForAds")
    @XmlSchemaType(name = "string")
    protected TargetAdPosition targetPositionForAds;

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
     * Gets the value of the targetPositionForAds property.
     * 
     * @return
     *     possible object is
     *     {@link TargetAdPosition }
     *     
     */
    public TargetAdPosition getTargetPositionForAds() {
        return targetPositionForAds;
    }

    /**
     * Sets the value of the targetPositionForAds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetAdPosition }
     *     
     */
    public void setTargetPositionForAds(TargetAdPosition value) {
        this.targetPositionForAds = value;
    }

}
