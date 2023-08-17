
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RSARecommendationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RSARecommendationInfo">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}RecommendationInfo">
 *       <sequence>
 *         <element name="AdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSARecommendationInfo", propOrder = {
    "adId"
})
public class RSARecommendationInfo
    extends RecommendationInfo
{

    @XmlElement(name = "AdId", nillable = true)
    protected Long adId;

    /**
     * Gets the value of the adId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdId() {
        return adId;
    }

    /**
     * Sets the value of the adId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdId(Long value) {
        this.adId = value;
    }

}
