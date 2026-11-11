
package com.microsoft.bingads.v13.reporting;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for timeOnly simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <simpleType name="timeOnly">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}time">
 *     <pattern value="([01][0-9]|2[0-3]):([0-5][0-9])(:([0-5][0-9])(\.[0-9]{1,7})?)?"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "timeOnly", namespace = "http://schemas.microsoft.com/2003/10/Serialization/", propOrder = {
    "value"
})
public class TimeOnly {

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
