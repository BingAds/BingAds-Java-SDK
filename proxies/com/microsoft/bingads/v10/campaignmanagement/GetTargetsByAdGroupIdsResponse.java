
package com.microsoft.bingads.v10.campaignmanagement;

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
 *         &lt;element name="PartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v10}ArrayOfBatchError" minOccurs="0"/>
 *         &lt;element name="Targets" type="{https://bingads.microsoft.com/CampaignManagement/v10}ArrayOfTarget" minOccurs="0"/>
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
    "partialErrors",
    "targets"
})
@XmlRootElement(name = "GetTargetsByAdGroupIdsResponse")
public class GetTargetsByAdGroupIdsResponse {

    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;
    @XmlElement(name = "Targets", nillable = true)
    protected ArrayOfTarget targets;

    /**
     * Gets the value of the partialErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public ArrayOfBatchError getPartialErrors() {
        return partialErrors;
    }

    /**
     * Sets the value of the partialErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public void setPartialErrors(ArrayOfBatchError value) {
        this.partialErrors = value;
    }

    /**
     * Gets the value of the targets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTarget }
     *     
     */
    public ArrayOfTarget getTargets() {
        return targets;
    }

    /**
     * Sets the value of the targets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTarget }
     *     
     */
    public void setTargets(ArrayOfTarget value) {
        this.targets = value;
    }

}
