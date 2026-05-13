
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImpressionTrackingSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ImpressionTrackingSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="ImpressionTrackingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpressionTrackingSetting", propOrder = {
    "impressionTrackingUrl"
})
public class ImpressionTrackingSetting
    extends Setting
{
    public ImpressionTrackingSetting() {
      this.type = "ImpressionTrackingSetting";
    }

    @XmlElement(name = "ImpressionTrackingUrl", nillable = true)
    protected String impressionTrackingUrl;

    /**
     * Gets the value of the impressionTrackingUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpressionTrackingUrl() {
        return impressionTrackingUrl;
    }

    /**
     * Sets the value of the impressionTrackingUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpressionTrackingUrl(String value) {
        this.impressionTrackingUrl = value;
    }

}
