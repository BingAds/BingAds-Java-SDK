
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExtensionAssociationCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdExtensionAssociationCollection">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdExtensionAssociations" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdExtensionAssociation" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdExtensionAssociationCollection", propOrder = {
    "adExtensionAssociations"
})
public class AdExtensionAssociationCollection {

    @XmlElement(name = "AdExtensionAssociations", nillable = true)
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
