
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OnlineConversionAdjustments" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfOnlineConversionAdjustment" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "onlineConversionAdjustments"
})
@XmlRootElement(name = "ApplyOnlineConversionAdjustmentsRequest")
public class ApplyOnlineConversionAdjustmentsRequest {

    @XmlElement(name = "OnlineConversionAdjustments", nillable = true)
    protected ArrayOfOnlineConversionAdjustment onlineConversionAdjustments;

    /**
     * Gets the value of the onlineConversionAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOnlineConversionAdjustment }
     *     
     */
    public ArrayOfOnlineConversionAdjustment getOnlineConversionAdjustments() {
        return onlineConversionAdjustments;
    }

    /**
     * Sets the value of the onlineConversionAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOnlineConversionAdjustment }
     *     
     */
    public void setOnlineConversionAdjustments(ArrayOfOnlineConversionAdjustment value) {
        this.onlineConversionAdjustments = value;
    }

}
