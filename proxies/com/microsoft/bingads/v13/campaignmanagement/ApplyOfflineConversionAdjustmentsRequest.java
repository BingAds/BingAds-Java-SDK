
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfflineConversionAdjustments" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfOfflineConversionAdjustment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "offlineConversionAdjustments"
})
@XmlRootElement(name = "ApplyOfflineConversionAdjustmentsRequest")
public class ApplyOfflineConversionAdjustmentsRequest {

    @XmlElement(name = "OfflineConversionAdjustments", nillable = true)
    protected ArrayOfOfflineConversionAdjustment offlineConversionAdjustments;

    /**
     * Gets the value of the offlineConversionAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfflineConversionAdjustment }
     *     
     */
    public ArrayOfOfflineConversionAdjustment getOfflineConversionAdjustments() {
        return offlineConversionAdjustments;
    }

    /**
     * Sets the value of the offlineConversionAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfflineConversionAdjustment }
     *     
     */
    public void setOfflineConversionAdjustments(ArrayOfOfflineConversionAdjustment value) {
        this.offlineConversionAdjustments = value;
    }

}
