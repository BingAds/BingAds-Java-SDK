
package com.microsoft.bingads.v13.customermanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfPilotFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfPilotFeature">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PilotFeature" type="{https://bingads.microsoft.com/Customer/v13/Entities}PilotFeature" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPilotFeature", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "pilotFeatures"
})
public class ArrayOfPilotFeature {

    @XmlElement(name = "PilotFeature")
    protected List<PilotFeature> pilotFeatures;
    public ArrayOfPilotFeature()
    {
      this.pilotFeatures = new ArrayList<PilotFeature>();
    }
    @JsonCreator
    public ArrayOfPilotFeature(List<PilotFeature> pilotfeatures)
    {
      this.pilotFeatures = pilotfeatures;
    }

    /**
     * Gets the value of the pilotFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pilotFeatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPilotFeatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PilotFeature }
     * 
     * 
     * @return
     *     The value of the pilotFeatures property.
     */
    public List<PilotFeature> getPilotFeatures() {
        if (pilotFeatures == null) {
            pilotFeatures = new ArrayList<>();
        }
        return this.pilotFeatures;
    }

}
