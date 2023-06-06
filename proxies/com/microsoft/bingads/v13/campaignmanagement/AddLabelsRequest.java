
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
 *         <element name="Labels" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfLabel" minOccurs="0"/>
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
    "labels"
})
@XmlRootElement(name = "AddLabelsRequest")
public class AddLabelsRequest {

    @XmlElement(name = "Labels", nillable = true)
    protected ArrayOfLabel labels;

    /**
     * Gets the value of the labels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLabel }
     *     
     */
    public ArrayOfLabel getLabels() {
        return labels;
    }

    /**
     * Sets the value of the labels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLabel }
     *     
     */
    public void setLabels(ArrayOfLabel value) {
        this.labels = value;
    }

}
