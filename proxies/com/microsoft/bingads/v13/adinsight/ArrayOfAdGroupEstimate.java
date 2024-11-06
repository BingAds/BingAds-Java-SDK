
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdGroupEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdGroupEstimate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdGroupEstimate" type="{https://bingads.microsoft.com/AdInsight/v13}AdGroupEstimate" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdGroupEstimate", propOrder = {
    "adGroupEstimates"
})
public class ArrayOfAdGroupEstimate {

    @XmlElement(name = "AdGroupEstimate", nillable = true)
    protected List<AdGroupEstimate> adGroupEstimates;
    public ArrayOfAdGroupEstimate()
    {
      this.adGroupEstimates = new ArrayList<AdGroupEstimate>();
    }
    @JsonCreator
    public ArrayOfAdGroupEstimate(List<AdGroupEstimate> adgroupestimates)
    {
      this.adGroupEstimates = adgroupestimates;
    }

    /**
     * Gets the value of the adGroupEstimates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adGroupEstimates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdGroupEstimates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupEstimate }
     * 
     * 
     * @return
     *     The value of the adGroupEstimates property.
     */
    public List<AdGroupEstimate> getAdGroupEstimates() {
        if (adGroupEstimates == null) {
            adGroupEstimates = new ArrayList<>();
        }
        return this.adGroupEstimates;
    }

}
