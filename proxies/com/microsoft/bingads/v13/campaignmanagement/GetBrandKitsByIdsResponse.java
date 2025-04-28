
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
 *         <element name="BrandKits" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBrandKit" minOccurs="0"/>
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
    "brandKits",
    "partialErrors"
})
@XmlRootElement(name = "GetBrandKitsByIdsResponse")
public class GetBrandKitsByIdsResponse {

    @XmlElement(name = "BrandKits", nillable = true)
    protected ArrayOfBrandKit brandKits;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

    /**
     * Gets the value of the brandKits property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBrandKit }
     *     
     */
    public ArrayOfBrandKit getBrandKits() {
        return brandKits;
    }

    /**
     * Sets the value of the brandKits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBrandKit }
     *     
     */
    public void setBrandKits(ArrayOfBrandKit value) {
        this.brandKits = value;
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
