
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DeviceCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeviceCondition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DeviceTypes" type="{https://bingads.microsoft.com/CampaignManagement/v13}DeviceType" minOccurs="0"/>
 *         <element name="IsPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceCondition", propOrder = {
    "deviceTypes",
    "isPrimary"
})
public class DeviceCondition {

    @XmlElement(name = "DeviceTypes", type = String.class)
    @XmlJavaTypeAdapter(Adapter30 .class)
    protected Collection<DeviceType> deviceTypes;
    @XmlElement(name = "IsPrimary")
    protected Boolean isPrimary;

    /**
     * Gets the value of the deviceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<DeviceType> getDeviceTypes() {
        return deviceTypes;
    }

    /**
     * Sets the value of the deviceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceTypes(Collection<DeviceType> value) {
        this.deviceTypes = value;
    }

    /**
     * Gets the value of the isPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets the value of the isPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimary(Boolean value) {
        this.isPrimary = value;
    }

}
