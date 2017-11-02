
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExtensionAssociationCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdExtensionAssociationCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdExtensionAssociations" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfAdExtensionAssociation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdExtensionAssociationCollection", propOrder = {
    "adExtensionAssociations"
})
public class AdExtensionAssociationCollection {

    @XmlElement(name = "AdExtensionAssociations", required = true, nillable = true)
    protected ArrayOfAdExtensionAssociation adExtensionAssociations;

    /**
     * Gets the value of the adExtensionAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdExtensionAssociation }
     *     
     */
    public ArrayOfAdExtensionAssociation getAdExtensionAssociations() {
        return adExtensionAssociations;
    }

    /**
     * Sets the value of the adExtensionAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdExtensionAssociation }
     *     
     */
    public void setAdExtensionAssociations(ArrayOfAdExtensionAssociation value) {
        this.adExtensionAssociations = value;
    }

}
