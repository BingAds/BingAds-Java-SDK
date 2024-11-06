
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeviceSearchParameter">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter">
 *       <sequence>
 *         <element name="Device" type="{https://bingads.microsoft.com/AdInsight/v13}DeviceCriterion" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceSearchParameter", propOrder = {
    "device"
})
public class DeviceSearchParameter
    extends SearchParameter
{
    public DeviceSearchParameter() {
      this.type = "DeviceSearchParameter";
    }

    @XmlElement(name = "Device", nillable = true)
    protected DeviceCriterion device;

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceCriterion }
     *     
     */
    public DeviceCriterion getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceCriterion }
     *     
     */
    public void setDevice(DeviceCriterion value) {
        this.device = value;
    }

}
