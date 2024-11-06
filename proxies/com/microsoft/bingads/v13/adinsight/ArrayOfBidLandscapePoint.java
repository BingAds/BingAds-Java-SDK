
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfBidLandscapePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfBidLandscapePoint">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BidLandscapePoint" type="{https://bingads.microsoft.com/AdInsight/v13}BidLandscapePoint" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBidLandscapePoint", propOrder = {
    "bidLandscapePoints"
})
public class ArrayOfBidLandscapePoint {

    @XmlElement(name = "BidLandscapePoint", nillable = true)
    protected List<BidLandscapePoint> bidLandscapePoints;
    public ArrayOfBidLandscapePoint()
    {
      this.bidLandscapePoints = new ArrayList<BidLandscapePoint>();
    }
    @JsonCreator
    public ArrayOfBidLandscapePoint(List<BidLandscapePoint> bidlandscapepoints)
    {
      this.bidLandscapePoints = bidlandscapepoints;
    }

    /**
     * Gets the value of the bidLandscapePoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bidLandscapePoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBidLandscapePoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BidLandscapePoint }
     * 
     * 
     * @return
     *     The value of the bidLandscapePoints property.
     */
    public List<BidLandscapePoint> getBidLandscapePoints() {
        if (bidLandscapePoints == null) {
            bidLandscapePoints = new ArrayList<>();
        }
        return this.bidLandscapePoints;
    }

}
