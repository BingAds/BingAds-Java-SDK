
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyMeasurementSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ThirdPartyMeasurementSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="Details" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyMeasurementSetting", propOrder = {
    "details"
})
public class ThirdPartyMeasurementSetting
    extends Setting
{
    public ThirdPartyMeasurementSetting() {
      this.type = "ThirdPartyMeasurementSetting";
    }

    @XmlElement(name = "Details", nillable = true)
    protected ArrayOfArrayOfKeyValuePairOfstringstring details;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfKeyValuePairOfstringstring }
     *     
     */
    public ArrayOfArrayOfKeyValuePairOfstringstring getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfKeyValuePairOfstringstring }
     *     
     */
    public void setDetails(ArrayOfArrayOfKeyValuePairOfstringstring value) {
        this.details = value;
    }

}
