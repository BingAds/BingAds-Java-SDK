
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
 *         <element name="AdExtensionIdentities" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdExtensionIdentity" minOccurs="0"/>
 *         <element name="NestedPartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBatchErrorCollection" minOccurs="0"/>
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
    "adExtensionIdentities",
    "nestedPartialErrors"
})
@XmlRootElement(name = "AddAdExtensionsResponse")
public class AddAdExtensionsResponse {

    @XmlElement(name = "AdExtensionIdentities", nillable = true)
    protected ArrayOfAdExtensionIdentity adExtensionIdentities;
    @XmlElement(name = "NestedPartialErrors", nillable = true)
    protected ArrayOfBatchErrorCollection nestedPartialErrors;

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

    /**
     * Gets the value of the nestedPartialErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchErrorCollection }
     *     
     */
    public ArrayOfBatchErrorCollection getNestedPartialErrors() {
        return nestedPartialErrors;
    }

    /**
     * Sets the value of the nestedPartialErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchErrorCollection }
     *     
     */
    public void setNestedPartialErrors(ArrayOfBatchErrorCollection value) {
        this.nestedPartialErrors = value;
    }

}
