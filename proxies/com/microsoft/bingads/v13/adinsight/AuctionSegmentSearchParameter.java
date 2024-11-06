
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuctionSegmentSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AuctionSegmentSearchParameter">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter">
 *       <sequence>
 *         <element name="Segment" type="{https://bingads.microsoft.com/AdInsight/v13}AuctionSegment" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionSegmentSearchParameter", propOrder = {
    "segment"
})
public class AuctionSegmentSearchParameter
    extends SearchParameter
{
    public AuctionSegmentSearchParameter() {
      this.type = "AuctionSegmentSearchParameter";
    }

    @XmlElement(name = "Segment")
    @XmlSchemaType(name = "string")
    protected AuctionSegment segment;

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionSegment }
     *     
     */
    public AuctionSegment getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionSegment }
     *     
     */
    public void setSegment(AuctionSegment value) {
        this.segment = value;
    }

}
