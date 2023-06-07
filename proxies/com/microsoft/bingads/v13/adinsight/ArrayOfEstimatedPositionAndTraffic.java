
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEstimatedPositionAndTraffic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfEstimatedPositionAndTraffic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EstimatedPositionAndTraffic" type="{https://bingads.microsoft.com/AdInsight/v13}EstimatedPositionAndTraffic" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEstimatedPositionAndTraffic", propOrder = {
    "estimatedPositionAndTraffics"
})
public class ArrayOfEstimatedPositionAndTraffic {

    @XmlElement(name = "EstimatedPositionAndTraffic", nillable = true)
    protected List<EstimatedPositionAndTraffic> estimatedPositionAndTraffics;

    /**
     * Gets the value of the estimatedPositionAndTraffics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the estimatedPositionAndTraffics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedPositionAndTraffics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedPositionAndTraffic }
     * 
     * 
     * @return
     *     The value of the estimatedPositionAndTraffics property.
     */
    public List<EstimatedPositionAndTraffic> getEstimatedPositionAndTraffics() {
        if (estimatedPositionAndTraffics == null) {
            estimatedPositionAndTraffics = new ArrayList<>();
        }
        return this.estimatedPositionAndTraffics;
    }

}
