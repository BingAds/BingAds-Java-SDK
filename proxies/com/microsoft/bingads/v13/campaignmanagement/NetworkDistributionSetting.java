
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkDistributionSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NetworkDistributionSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="NetworkOption" type="{https://bingads.microsoft.com/CampaignManagement/v13}Network" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkDistributionSetting", propOrder = {
    "networkOption"
})
public class NetworkDistributionSetting
    extends Setting
{
    public NetworkDistributionSetting() {
      this.type = "NetworkDistributionSetting";
    }

    @XmlElement(name = "NetworkOption", nillable = true)
    @XmlSchemaType(name = "string")
    protected Network networkOption;

    /**
     * Gets the value of the networkOption property.
     * 
     * @return
     *     possible object is
     *     {@link Network }
     *     
     */
    public Network getNetworkOption() {
        return networkOption;
    }

    /**
     * Sets the value of the networkOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Network }
     *     
     */
    public void setNetworkOption(Network value) {
        this.networkOption = value;
    }

}
