
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Parameters" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfCustomParameter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomParameters", propOrder = {
    "parameters"
})
public class CustomParameters {

    @XmlElement(name = "Parameters", nillable = true)
    protected ArrayOfCustomParameter parameters;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomParameter }
     *     
     */
    public ArrayOfCustomParameter getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomParameter }
     *     
     */
    public void setParameters(ArrayOfCustomParameter value) {
        this.parameters = value;
    }

}
