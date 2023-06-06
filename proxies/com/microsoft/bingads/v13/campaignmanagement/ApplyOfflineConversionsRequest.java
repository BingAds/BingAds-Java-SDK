
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
 *         <element name="OfflineConversions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfOfflineConversion" minOccurs="0"/>
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
