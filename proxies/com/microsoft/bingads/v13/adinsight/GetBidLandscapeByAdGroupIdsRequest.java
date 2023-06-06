
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element name="AdGroupBidLandscapeInputs" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfAdGroupBidLandscapeInput" minOccurs="0"/>
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
    "adGroupBidLandscapeInputs"
})
@XmlRootElement(name = "GetBidLandscapeByAdGroupIdsRequest")
public class GetBidLandscapeByAdGroupIdsRequest {

    @XmlElement(name = "AdGroupBidLandscapeInputs", nillable = true)
    protected ArrayOfAdGroupBidLandscapeInput adGroupBidLandscapeInputs;

    /**
     * Gets the value of the adGroupBidLandscapeInputs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdGroupBidLandscapeInput }
     *     
     */
    public ArrayOfAdGroupBidLandscapeInput getAdGroupBidLandscapeInputs() {
        return adGroupBidLandscapeInputs;
    }

    /**
     * Sets the value of the adGroupBidLandscapeInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdGroupBidLandscapeInput }
     *     
     */
    public void setAdGroupBidLandscapeInputs(ArrayOfAdGroupBidLandscapeInput value) {
        this.adGroupBidLandscapeInputs = value;
    }

}
