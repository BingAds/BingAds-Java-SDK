
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdGroupBidLandscape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdGroupBidLandscape">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdGroupBidLandscape" type="{https://bingads.microsoft.com/AdInsight/v13}AdGroupBidLandscape" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdGroupBidLandscape", propOrder = {
    "adGroupBidLandscapes"
})
public class ArrayOfAdGroupBidLandscape {

    @XmlElement(name = "AdGroupBidLandscape", nillable = true)
    protected List<AdGroupBidLandscape> adGroupBidLandscapes;
    public ArrayOfAdGroupBidLandscape()
    {
      this.adGroupBidLandscapes = new ArrayList<AdGroupBidLandscape>();
    }
    @JsonCreator
    public ArrayOfAdGroupBidLandscape(List<AdGroupBidLandscape> adgroupbidlandscapes)
    {
      this.adGroupBidLandscapes = adgroupbidlandscapes;
    }

    /**
     * Gets the value of the adGroupBidLandscapes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adGroupBidLandscapes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdGroupBidLandscapes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupBidLandscape }
     * 
     * 
     * @return
     *     The value of the adGroupBidLandscapes property.
     */
    public List<AdGroupBidLandscape> getAdGroupBidLandscapes() {
        if (adGroupBidLandscapes == null) {
            adGroupBidLandscapes = new ArrayList<>();
        }
        return this.adGroupBidLandscapes;
    }

}
