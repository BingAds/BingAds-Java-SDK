
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeResultOfDecimalRoundedResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RangeResultOfDecimalRoundedResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="High" type="{https://bingads.microsoft.com/AdInsight/v13}DecimalRoundedResult" minOccurs="0"/>
 *         <element name="Low" type="{https://bingads.microsoft.com/AdInsight/v13}DecimalRoundedResult" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeResultOfDecimalRoundedResult", propOrder = {
    "high",
    "low"
})
public class RangeResultOfDecimalRoundedResult {

    @XmlElement(name = "High", nillable = true)
    protected DecimalRoundedResult high;
    @XmlElement(name = "Low", nillable = true)
    protected DecimalRoundedResult low;

    /**
     * Gets the value of the high property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalRoundedResult }
     *     
     */
    public DecimalRoundedResult getHigh() {
        return high;
    }

    /**
     * Sets the value of the high property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalRoundedResult }
     *     
     */
    public void setHigh(DecimalRoundedResult value) {
        this.high = value;
    }

    /**
     * Gets the value of the low property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalRoundedResult }
     *     
     */
    public DecimalRoundedResult getLow() {
        return low;
    }

    /**
     * Sets the value of the low property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalRoundedResult }
     *     
     */
    public void setLow(DecimalRoundedResult value) {
        this.low = value;
    }

}
