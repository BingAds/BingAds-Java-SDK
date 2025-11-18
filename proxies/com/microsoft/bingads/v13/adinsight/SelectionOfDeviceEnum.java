
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectionOfDeviceEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SelectionOfDeviceEnum">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Includes" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfDeviceEnum" minOccurs="0"/>
 *         <element name="Excludes" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfDeviceEnum" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionOfDeviceEnum", propOrder = {
    "includes",
    "excludes"
})
public class SelectionOfDeviceEnum {

    @XmlElement(name = "Includes", nillable = true)
    protected ArrayOfDeviceEnum includes;
    @XmlElement(name = "Excludes", nillable = true)
    protected ArrayOfDeviceEnum excludes;

    /**
     * Gets the value of the includes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeviceEnum }
     *     
     */
    public ArrayOfDeviceEnum getIncludes() {
        return includes;
    }

    /**
     * Sets the value of the includes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeviceEnum }
     *     
     */
    public void setIncludes(ArrayOfDeviceEnum value) {
        this.includes = value;
    }

    /**
     * Gets the value of the excludes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeviceEnum }
     *     
     */
    public ArrayOfDeviceEnum getExcludes() {
        return excludes;
    }

    /**
     * Sets the value of the excludes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeviceEnum }
     *     
     */
    public void setExcludes(ArrayOfDeviceEnum value) {
        this.excludes = value;
    }

}
