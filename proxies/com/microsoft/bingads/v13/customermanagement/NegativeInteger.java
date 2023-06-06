
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for negativeInteger simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <simpleType name="negativeInteger">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}nonPositiveInteger">
 *     <maxInclusive value="-1"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "negativeInteger", namespace = "http://www.w3.org/2001/XMLSchema", propOrder = {
    "value"
})
public class NegativeInteger {

    @XmlValue
    @XmlSchemaType(name = "negativeInteger")
    protected NonPositiveInteger value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link NonPositiveInteger }
     *     
     */
    public NonPositiveInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonPositiveInteger }
     *     
     */
    public void setValue(NonPositiveInteger value) {
        this.value = value;
    }

}
