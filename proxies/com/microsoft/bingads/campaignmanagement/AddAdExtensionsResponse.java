
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
 *         &lt;element name="AdExtensionIdentities" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfAdExtensionIdentity" minOccurs="0"/>
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
    "adExtensionIdentities"
})
@XmlRootElement(name = "AddAdExtensionsResponse")
public class AddAdExtensionsResponse {

    @XmlElement(name = "AdExtensionIdentities", nillable = true)
    protected ArrayOfAdExtensionIdentity adExtensionIdentities;

    /**
     * Gets the value of the adExtensionIdentities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdExtensionIdentity }
     *     
     */
    public ArrayOfAdExtensionIdentity getAdExtensionIdentities() {
        return adExtensionIdentities;
    }

    /**
     * Sets the value of the adExtensionIdentities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdExtensionIdentity }
     *     
     */
    public void setAdExtensionIdentities(ArrayOfAdExtensionIdentity value) {
        this.adExtensionIdentities = value;
    }

}
