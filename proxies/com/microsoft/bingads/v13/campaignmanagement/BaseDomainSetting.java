
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseDomainSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BaseDomainSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="BaseDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseDomainSetting", propOrder = {
    "baseDomain"
})
public class BaseDomainSetting
    extends Setting
{
    public BaseDomainSetting() {
      this.type = "BaseDomainSetting";
    }

    @XmlElement(name = "BaseDomain", nillable = true)
    protected String baseDomain;

    /**
     * Gets the value of the baseDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseDomain() {
        return baseDomain;
    }

    /**
     * Sets the value of the baseDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDomain(String value) {
        this.baseDomain = value;
    }

}
