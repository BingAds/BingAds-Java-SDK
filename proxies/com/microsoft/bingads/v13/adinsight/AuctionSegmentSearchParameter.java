
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuctionSegmentSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuctionSegmentSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="Segment" type="{https://bingads.microsoft.com/AdInsight/v13}AuctionSegment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
