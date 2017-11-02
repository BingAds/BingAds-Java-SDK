
package com.microsoft.bingads.v11.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ENTITY simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="ENTITY">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
