
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportedFontsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SupportedFontsData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SupportedFonts" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfSupportedFont" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportedFontsData", propOrder = {
    "supportedFonts"
})
public class SupportedFontsData {

    @XmlElement(name = "SupportedFonts", nillable = true)
    protected ArrayOfSupportedFont supportedFonts;

    /**
     * Gets the value of the supportedFonts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupportedFont }
     *     
     */
    public ArrayOfSupportedFont getSupportedFonts() {
        return supportedFonts;
    }

    /**
     * Sets the value of the supportedFonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupportedFont }
     *     
     */
    public void setSupportedFonts(ArrayOfSupportedFont value) {
        this.supportedFonts = value;
    }

}
