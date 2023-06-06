
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisclaimerSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisclaimerSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       &lt;sequence>
 *         &lt;element name="DisclaimerAdsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisclaimerSetting", propOrder = {
    "disclaimerAdsEnabled"
})
public class DisclaimerSetting
    extends Setting
{

    @XmlElement(name = "DisclaimerAdsEnabled")
    protected Boolean disclaimerAdsEnabled;

    /**
     * Gets the value of the disclaimerAdsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDisclaimerAdsEnabled() {
        return disclaimerAdsEnabled;
    }

    /**
     * Sets the value of the disclaimerAdsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisclaimerAdsEnabled(Boolean value) {
        this.disclaimerAdsEnabled = value;
    }

}
