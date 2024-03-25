
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecimalRoundedResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DecimalRoundedResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Unit" type="{https://bingads.microsoft.com/AdInsight/v13}ScaleUnit" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecimalRoundedResult", propOrder = {
    "value",
    "unit"
})
public class DecimalRoundedResult {

    @XmlElement(name = "Value", nillable = true)
    protected Double value;
    @XmlElement(name = "Unit", nillable = true)
    @XmlSchemaType(name = "string")
    protected ScaleUnit unit;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link ScaleUnit }
     *     
     */
    public ScaleUnit getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleUnit }
     *     
     */
    public void setUnit(ScaleUnit value) {
        this.unit = value;
    }

}
