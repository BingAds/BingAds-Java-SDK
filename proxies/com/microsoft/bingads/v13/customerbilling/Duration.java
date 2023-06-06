
package com.microsoft.bingads.v13.customerbilling;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for duration simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <simpleType name="duration">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}duration">
 *     <pattern value="\-?P(\d*D)?(T(\d*H)?(\d*M)?(\d*(\.\d*)?S)?)?"/>
 *     <minInclusive value="-P10675199DT2H48M5.4775808S"/>
 *     <maxInclusive value="P10675199DT2H48M5.4775807S"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "duration", namespace = "http://schemas.microsoft.com/2003/10/Serialization/", propOrder = {
    "value"
})
public class Duration {

    @XmlValue
    protected javax.xml.datatype.Duration value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.Duration }
     *     
     */
    public javax.xml.datatype.Duration getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.Duration }
     *     
     */
    public void setValue(javax.xml.datatype.Duration value) {
        this.value = value;
    }

}
