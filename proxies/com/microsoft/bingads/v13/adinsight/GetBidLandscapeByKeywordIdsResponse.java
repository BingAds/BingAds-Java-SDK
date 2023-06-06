
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
 *         <element name="BidLandscape" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeywordBidLandscape" minOccurs="0"/>
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
    "bidLandscape"
})
@XmlRootElement(name = "GetBidLandscapeByKeywordIdsResponse")
public class GetBidLandscapeByKeywordIdsResponse {

    @XmlElement(name = "BidLandscape", nillable = true)
    protected ArrayOfKeywordBidLandscape bidLandscape;

    /**
     * Gets the value of the bidLandscape property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordBidLandscape }
     *     
     */
    public ArrayOfKeywordBidLandscape getBidLandscape() {
        return bidLandscape;
    }

    /**
     * Sets the value of the bidLandscape property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordBidLandscape }
     *     
     */
    public void setBidLandscape(ArrayOfKeywordBidLandscape value) {
        this.bidLandscape = value;
    }

}
