
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdGroupEstimator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdGroupEstimator">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdGroupEstimator" type="{https://bingads.microsoft.com/AdInsight/v13}AdGroupEstimator" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdGroupEstimator", propOrder = {
    "adGroupEstimators"
})
public class ArrayOfAdGroupEstimator {

    @XmlElement(name = "AdGroupEstimator", nillable = true)
    protected List<AdGroupEstimator> adGroupEstimators;

    /**
     * Gets the value of the adGroupEstimators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adGroupEstimators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdGroupEstimators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupEstimator }
     * 
     * 
     * @return
     *     The value of the adGroupEstimators property.
     */
    public List<AdGroupEstimator> getAdGroupEstimators() {
        if (adGroupEstimators == null) {
            adGroupEstimators = new ArrayList<>();
        }
        return this.adGroupEstimators;
    }

}
