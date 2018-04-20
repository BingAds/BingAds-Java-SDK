
package com.microsoft.bingads.v12.campaignmanagement;

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
 *         &lt;element name="OfflineConversions" type="{https://bingads.microsoft.com/CampaignManagement/v12}ArrayOfOfflineConversion" minOccurs="0"/>
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
    "offlineConversions"
})
@XmlRootElement(name = "ApplyOfflineConversionsRequest")
public class ApplyOfflineConversionsRequest {

    @XmlElement(name = "OfflineConversions", nillable = true)
    protected ArrayOfOfflineConversion offlineConversions;

    /**
     * Gets the value of the offlineConversions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfflineConversion }
     *     
     */
    public ArrayOfOfflineConversion getOfflineConversions() {
        return offlineConversions;
    }

    /**
     * Sets the value of the offlineConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfflineConversion }
     *     
     */
    public void setOfflineConversions(ArrayOfOfflineConversion value) {
        this.offlineConversions = value;
    }

}
