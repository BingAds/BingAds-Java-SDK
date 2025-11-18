
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfDeviceEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDeviceEnum">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DeviceEnum" type="{https://bingads.microsoft.com/AdInsight/v13}DeviceEnum" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDeviceEnum", propOrder = {
    "deviceEna"
})
public class ArrayOfDeviceEnum {

    @XmlElement(name = "DeviceEnum")
    @XmlSchemaType(name = "string")
    protected List<DeviceEnum> deviceEna;
    public ArrayOfDeviceEnum()
    {
      this.deviceEna = new ArrayList<DeviceEnum>();
    }
    @JsonCreator
    public ArrayOfDeviceEnum(List<DeviceEnum> deviceenums)
    {
      this.deviceEna = deviceenums;
    }

    /**
     * Gets the value of the deviceEna property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the deviceEna property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceEna().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceEnum }
     * 
     * 
     * @return
     *     The value of the deviceEna property.
     */
    public List<DeviceEnum> getDeviceEna() {
        if (deviceEna == null) {
            deviceEna = new ArrayList<>();
        }
        return this.deviceEna;
    }

}
