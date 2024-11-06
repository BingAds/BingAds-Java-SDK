
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfEstimatedBidAndTraffic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfEstimatedBidAndTraffic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EstimatedBidAndTraffic" type="{https://bingads.microsoft.com/AdInsight/v13}EstimatedBidAndTraffic" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEstimatedBidAndTraffic", propOrder = {
    "estimatedBidAndTraffics"
})
public class ArrayOfEstimatedBidAndTraffic {

    @XmlElement(name = "EstimatedBidAndTraffic", nillable = true)
    protected List<EstimatedBidAndTraffic> estimatedBidAndTraffics;
    public ArrayOfEstimatedBidAndTraffic()
    {
      this.estimatedBidAndTraffics = new ArrayList<EstimatedBidAndTraffic>();
    }
    @JsonCreator
    public ArrayOfEstimatedBidAndTraffic(List<EstimatedBidAndTraffic> estimatedbidandtraffics)
    {
      this.estimatedBidAndTraffics = estimatedbidandtraffics;
    }

    /**
     * Gets the value of the estimatedBidAndTraffics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the estimatedBidAndTraffics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedBidAndTraffics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedBidAndTraffic }
     * 
     * 
     * @return
     *     The value of the estimatedBidAndTraffics property.
     */
    public List<EstimatedBidAndTraffic> getEstimatedBidAndTraffics() {
        if (estimatedBidAndTraffics == null) {
            estimatedBidAndTraffics = new ArrayList<>();
        }
        return this.estimatedBidAndTraffics;
    }

}
