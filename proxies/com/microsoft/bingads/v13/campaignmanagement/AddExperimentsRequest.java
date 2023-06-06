
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Experiments" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfExperiment" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "experiments"
})
@XmlRootElement(name = "AddExperimentsRequest")
public class AddExperimentsRequest {

    @XmlElement(name = "Experiments", nillable = true)
    protected ArrayOfExperiment experiments;

    /**
     * Gets the value of the experiments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExperiment }
     *     
     */
    public ArrayOfExperiment getExperiments() {
        return experiments;
    }

    /**
     * Sets the value of the experiments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExperiment }
     *     
     */
    public void setExperiments(ArrayOfExperiment value) {
        this.experiments = value;
    }

}
