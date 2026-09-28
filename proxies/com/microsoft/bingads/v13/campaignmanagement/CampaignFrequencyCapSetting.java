
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignFrequencyCapSetting complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="CampaignFrequencyCapSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="CapValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="TimeGranularity" type="{https://bingads.microsoft.com/CampaignManagement/v13}FrequencyCapTimeGranularity" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignFrequencyCapSetting", propOrder = {
    "capValue",
    "timeGranularity"
})
public class CampaignFrequencyCapSetting
    extends Setting
{
    public CampaignFrequencyCapSetting() {
        this.type = "CampaignFrequencyCapSetting";
    }

    @XmlElement(name = "CapValue")
    protected Integer capValue;
    @XmlElement(name = "TimeGranularity")
    @XmlSchemaType(name = "string")
    protected FrequencyCapTimeGranularity timeGranularity;

    /**
     * Gets the value of the capValue property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getCapValue() {
        return capValue;
    }

    /**
     * Sets the value of the capValue property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setCapValue(Integer value) {
        this.capValue = value;
    }

    /**
     * Gets the value of the timeGranularity property.
     *
     * @return
     *     possible object is
     *     {@link FrequencyCapTimeGranularity }
     *
     */
    public FrequencyCapTimeGranularity getTimeGranularity() {
        return timeGranularity;
    }

    /**
     * Sets the value of the timeGranularity property.
     *
     * @param value
     *     allowed object is
     *     {@link FrequencyCapTimeGranularity }
     *
     */
    public void setTimeGranularity(FrequencyCapTimeGranularity value) {
        this.timeGranularity = value;
    }

}
