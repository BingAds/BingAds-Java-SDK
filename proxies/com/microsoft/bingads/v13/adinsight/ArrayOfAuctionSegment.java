
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfAuctionSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAuctionSegment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuctionSegment" type="{https://bingads.microsoft.com/AdInsight/v13}AuctionSegment" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAuctionSegment", propOrder = {
    "auctionSegments"
})
public class ArrayOfAuctionSegment {

    @XmlElement(name = "AuctionSegment")
    @XmlSchemaType(name = "string")
    protected List<AuctionSegment> auctionSegments;
    public ArrayOfAuctionSegment()
    {
      this.auctionSegments = new ArrayList<AuctionSegment>();
    }
    @JsonCreator
    public ArrayOfAuctionSegment(List<AuctionSegment> auctionsegments)
    {
      this.auctionSegments = auctionsegments;
    }

    /**
     * Gets the value of the auctionSegments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the auctionSegments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuctionSegments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuctionSegment }
     * 
     * 
     * @return
     *     The value of the auctionSegments property.
     */
    public List<AuctionSegment> getAuctionSegments() {
        if (auctionSegments == null) {
            auctionSegments = new ArrayList<>();
        }
        return this.auctionSegments;
    }

}
