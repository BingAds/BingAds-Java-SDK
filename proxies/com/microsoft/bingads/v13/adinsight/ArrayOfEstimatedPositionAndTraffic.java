
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEstimatedPositionAndTraffic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEstimatedPositionAndTraffic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstimatedPositionAndTraffic" type="{https://bingads.microsoft.com/AdInsight/v13}EstimatedPositionAndTraffic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedPositionAndTraffics property.
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
     */
    public List<EstimatedPositionAndTraffic> getEstimatedPositionAndTraffics() {
        if (estimatedPositionAndTraffics == null) {
            estimatedPositionAndTraffics = new ArrayList<EstimatedPositionAndTraffic>();
        }
        return this.estimatedPositionAndTraffics;
    }

}
