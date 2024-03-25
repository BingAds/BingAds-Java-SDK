
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeResultOfdouble complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RangeResultOfdouble">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="High" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Low" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeResultOfdouble", propOrder = {
    "high",
    "low"
})
public class RangeResultOfdouble {

    @XmlElement(name = "High")
    protected Double high;
    @XmlElement(name = "Low")
    protected Double low;

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHigh(Double value) {
        this.high = value;
    }

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLow(Double value) {
        this.low = value;
    }

}
