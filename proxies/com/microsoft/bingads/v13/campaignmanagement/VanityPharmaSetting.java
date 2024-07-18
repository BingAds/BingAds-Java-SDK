
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VanityPharmaSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VanityPharmaSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="DisplayUrlMode" type="{https://bingads.microsoft.com/CampaignManagement/v13}VanityPharmaDisplayUrlMode" minOccurs="0"/>
 *         <element name="WebsiteDescription" type="{https://bingads.microsoft.com/CampaignManagement/v13}VanityPharmaWebsiteDescription" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VanityPharmaSetting", propOrder = {
    "displayUrlMode",
    "websiteDescription"
})
public class VanityPharmaSetting
    extends Setting
{
    public VanityPharmaSetting() {
      this.type = "VanityPharmaSetting";
    }

    @XmlElement(name = "DisplayUrlMode", nillable = true)
    @XmlSchemaType(name = "string")
    protected VanityPharmaDisplayUrlMode displayUrlMode;
    @XmlElement(name = "WebsiteDescription", nillable = true)
    @XmlSchemaType(name = "string")
    protected VanityPharmaWebsiteDescription websiteDescription;

    /**
     * Gets the value of the displayUrlMode property.
     * 
     * @return
     *     possible object is
     *     {@link VanityPharmaDisplayUrlMode }
     *     
     */
    public VanityPharmaDisplayUrlMode getDisplayUrlMode() {
        return displayUrlMode;
    }

    /**
     * Sets the value of the displayUrlMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VanityPharmaDisplayUrlMode }
     *     
     */
    public void setDisplayUrlMode(VanityPharmaDisplayUrlMode value) {
        this.displayUrlMode = value;
    }

    /**
     * Gets the value of the websiteDescription property.
     * 
     * @return
     *     possible object is
     *     {@link VanityPharmaWebsiteDescription }
     *     
     */
    public VanityPharmaWebsiteDescription getWebsiteDescription() {
        return websiteDescription;
    }

    /**
     * Sets the value of the websiteDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link VanityPharmaWebsiteDescription }
     *     
     */
    public void setWebsiteDescription(VanityPharmaWebsiteDescription value) {
        this.websiteDescription = value;
    }

}
