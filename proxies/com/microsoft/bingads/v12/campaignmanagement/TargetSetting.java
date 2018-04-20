
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v12}Setting">
 *       &lt;sequence>
 *         &lt;element name="Details" type="{https://bingads.microsoft.com/CampaignManagement/v12}ArrayOfTargetSettingDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetSetting", propOrder = {
    "details"
})
public class TargetSetting
    extends Setting
{

    @XmlElement(name = "Details", nillable = true)
    protected ArrayOfTargetSettingDetail details;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTargetSettingDetail }
     *     
     */
    public ArrayOfTargetSettingDetail getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTargetSettingDetail }
     *     
     */
    public void setDetails(ArrayOfTargetSettingDetail value) {
        this.details = value;
    }

}
