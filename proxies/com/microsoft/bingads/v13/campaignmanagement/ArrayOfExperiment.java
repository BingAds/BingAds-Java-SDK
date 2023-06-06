
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExperiment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfExperiment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Experiment" type="{https://bingads.microsoft.com/CampaignManagement/v13}Experiment" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExperiment", propOrder = {
    "experiments"
})
public class ArrayOfExperiment {

    @XmlElement(name = "Experiment", nillable = true)
    protected List<Experiment> experiments;

    /**
     * Gets the value of the experiments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the experiments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperiments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Experiment }
     * 
     * 
     * @return
     *     The value of the experiments property.
     */
    public List<Experiment> getExperiments() {
        if (experiments == null) {
            experiments = new ArrayList<>();
        }
        return this.experiments;
    }

}
