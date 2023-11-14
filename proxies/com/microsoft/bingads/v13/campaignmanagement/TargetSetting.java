
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TargetSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="Details" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfTargetSettingDetail" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public TargetSetting() {
      this.type = "TargetSetting";
    }

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
