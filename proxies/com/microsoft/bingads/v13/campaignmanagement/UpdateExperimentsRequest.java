
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Experiments" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfExperiment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "experiments"
})
@XmlRootElement(name = "UpdateExperimentsRequest")
public class UpdateExperimentsRequest {

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
