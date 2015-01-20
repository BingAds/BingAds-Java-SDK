
package com.microsoft.bingads.customerbilling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for char simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="char">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "char", namespace = "http://schemas.microsoft.com/2003/10/Serialization/", propOrder = {
    "value"
})
public class Char {

    @XmlValue
    protected int value;

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

}
