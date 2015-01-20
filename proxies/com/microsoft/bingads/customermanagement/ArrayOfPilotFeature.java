
package com.microsoft.bingads.customermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPilotFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPilotFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PilotFeature" type="{https://bingads.microsoft.com/Customer/v9/Entities}PilotFeature" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPilotFeature", namespace = "https://bingads.microsoft.com/Customer/v9/Entities", propOrder = {
    "pilotFeatures"
})
public class ArrayOfPilotFeature {

    @XmlElement(name = "PilotFeature")
    protected List<PilotFeature> pilotFeatures;

    /**
     * Gets the value of the pilotFeatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pilotFeatures property.
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
     */
    public List<PilotFeature> getPilotFeatures() {
        if (pilotFeatures == null) {
            pilotFeatures = new ArrayList<PilotFeature>();
        }
        return this.pilotFeatures;
    }

}
