
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
 *         &lt;element name="AdExtensions" type="{https://bingads.microsoft.com/CampaignManagement/v10}ArrayOfAdExtension" minOccurs="0"/>
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
    "adExtensions"
})
@XmlRootElement(name = "GetAdExtensionsByIdsResponse")
public class GetAdExtensionsByIdsResponse {

    @XmlElement(name = "AdExtensions", nillable = true)
    protected ArrayOfAdExtension adExtensions;

    /**
     * Gets the value of the adExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdExtension }
     *     
     */
    public ArrayOfAdExtension getAdExtensions() {
        return adExtensions;
    }

    /**
     * Sets the value of the adExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdExtension }
     *     
     */
    public void setAdExtensions(ArrayOfAdExtension value) {
        this.adExtensions = value;
    }

}
