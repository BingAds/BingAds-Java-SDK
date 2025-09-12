
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationBreakdown complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LocationBreakdown">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}Breakdown">
 *       <sequence>
 *         <element name="Info" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfLocationInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationBreakdown", propOrder = {
    "info"
})
public class LocationBreakdown
    extends Breakdown
{
    public LocationBreakdown() {
      this.type = "LocationBreakdown";
    }

    @XmlElement(name = "Info", nillable = true)
    protected ArrayOfLocationInfo info;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocationInfo }
     *     
     */
    public ArrayOfLocationInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocationInfo }
     *     
     */
    public void setInfo(ArrayOfLocationInfo value) {
        this.info = value;
    }

}
