
package com.microsoft.bingads.v13.customerbilling;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ENTITY simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <simpleType name="ENTITY">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ENTITY", namespace = "http://www.w3.org/2001/XMLSchema", propOrder = {
    "value"
})
public class ENTITY {

    @XmlValue
    @XmlSchemaType(name = "ENTITY")
    protected NCName value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link NCName }
     *     
     */
    public NCName getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link NCName }
     *     
     */
    public void setValue(NCName value) {
        this.value = value;
    }

}
