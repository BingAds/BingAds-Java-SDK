
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryClickCoverageReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CategoryClickCoverageReportFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CountryCode" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="L1Vertical" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="L2Vertical" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="L3Vertical" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryClickCoverageReportFilter", propOrder = {
    "countryCode",
    "l1Vertical",
    "l2Vertical",
    "l3Vertical"
})
public class CategoryClickCoverageReportFilter {

    @XmlElement(name = "CountryCode", nillable = true)
    protected ArrayOfstring countryCode;
    @XmlElement(name = "L1Vertical", nillable = true)
    protected ArrayOfstring l1Vertical;
    @XmlElement(name = "L2Vertical", nillable = true)
    protected ArrayOfstring l2Vertical;
    @XmlElement(name = "L3Vertical", nillable = true)
    protected ArrayOfstring l3Vertical;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setCountryCode(ArrayOfstring value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the l1Vertical property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getL1Vertical() {
        return l1Vertical;
    }

    /**
     * Sets the value of the l1Vertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setL1Vertical(ArrayOfstring value) {
        this.l1Vertical = value;
    }

    /**
     * Gets the value of the l2Vertical property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getL2Vertical() {
        return l2Vertical;
    }

    /**
     * Sets the value of the l2Vertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setL2Vertical(ArrayOfstring value) {
        this.l2Vertical = value;
    }

    /**
     * Gets the value of the l3Vertical property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getL3Vertical() {
        return l3Vertical;
    }

    /**
     * Sets the value of the l3Vertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setL3Vertical(ArrayOfstring value) {
        this.l3Vertical = value;
    }

}
