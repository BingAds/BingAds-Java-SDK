
package com.microsoft.bingads.v13.adinsight;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for dateOnly simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <simpleType name="dateOnly">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *     <pattern value="([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateOnly", namespace = "http://schemas.microsoft.com/2003/10/Serialization/", propOrder = {
    "value"
})
public class DateOnly {

    @XmlValue
    protected XMLGregorianCalendar value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

}
