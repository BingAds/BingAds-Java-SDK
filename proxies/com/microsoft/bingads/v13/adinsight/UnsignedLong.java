
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for unsignedLong simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <simpleType name="unsignedLong">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *     <maxInclusive value="18446744073709551615"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unsignedLong", namespace = "http://www.w3.org/2001/XMLSchema", propOrder = {
    "value"
})
public class UnsignedLong {

    @XmlValue
    @XmlSchemaType(name = "unsignedLong")
    protected NonNegativeInteger value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger }
     *     
     */
    public NonNegativeInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger }
     *     
     */
    public void setValue(NonNegativeInteger value) {
        this.value = value;
    }

}
