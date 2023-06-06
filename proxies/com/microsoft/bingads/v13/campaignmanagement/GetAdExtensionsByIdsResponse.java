
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
 *         <element name="AdExtensions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdExtension" minOccurs="0"/>
 *         <element name="PartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBatchError" minOccurs="0"/>
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
    "adExtensions",
    "partialErrors"
})
@XmlRootElement(name = "GetAdExtensionsByIdsResponse")
public class GetAdExtensionsByIdsResponse {

    @XmlElement(name = "AdExtensions", nillable = true)
    protected ArrayOfAdExtension adExtensions;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

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

}
