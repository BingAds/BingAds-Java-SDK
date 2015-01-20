
package com.microsoft.bingads.campaignmanagement;

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
 *         &lt;element name="Targets" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfTarget2" minOccurs="0"/>
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
    "targets"
})
@XmlRootElement(name = "UpdateTargetsInLibrary2Request")
public class UpdateTargetsInLibrary2Request {

    @XmlElement(name = "Targets", nillable = true)
    protected ArrayOfTarget2 targets;

    /**
     * Gets the value of the targets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTarget2 }
     *     
     */
    public ArrayOfTarget2 getTargets() {
        return targets;
    }

    /**
     * Sets the value of the targets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTarget2 }
     *     
     */
    public void setTargets(ArrayOfTarget2 value) {
        this.targets = value;
    }

}
