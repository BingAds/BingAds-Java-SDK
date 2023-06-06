
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for NCName simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="NCName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *     &lt;pattern value="[\i-[:]][\c-[:]]*"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NCName", namespace = "http://www.w3.org/2001/XMLSchema", propOrder = {
    "value"
})
public class NCName {

    @XmlValue
    @XmlSchemaType(name = "NCName")
    protected Name value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setValue(Name value) {
        this.value = value;
    }

}
