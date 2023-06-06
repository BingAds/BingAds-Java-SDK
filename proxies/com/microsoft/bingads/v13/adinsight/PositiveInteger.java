
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for positiveInteger simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="positiveInteger">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *     &lt;minInclusive value="1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positiveInteger", namespace = "http://www.w3.org/2001/XMLSchema", propOrder = {
    "value"
})
public class PositiveInteger {

    @XmlValue
    @XmlSchemaType(name = "positiveInteger")
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
