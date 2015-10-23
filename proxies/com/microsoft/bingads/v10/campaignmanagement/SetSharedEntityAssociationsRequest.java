
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
 *         &lt;element name="Associations" type="{https://bingads.microsoft.com/CampaignManagement/v10}ArrayOfSharedEntityAssociation" minOccurs="0"/>
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
    "associations"
})
@XmlRootElement(name = "SetSharedEntityAssociationsRequest")
public class SetSharedEntityAssociationsRequest {

    @XmlElement(name = "Associations", nillable = true)
    protected ArrayOfSharedEntityAssociation associations;

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSharedEntityAssociation }
     *     
     */
    public ArrayOfSharedEntityAssociation getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSharedEntityAssociation }
     *     
     */
    public void setAssociations(ArrayOfSharedEntityAssociation value) {
        this.associations = value;
    }

}
