
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectionOfAgeEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SelectionOfAgeEnum">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Includes" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfAgeEnum" minOccurs="0"/>
 *         <element name="Excludes" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfAgeEnum" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionOfAgeEnum", propOrder = {
    "includes",
    "excludes"
})
public class SelectionOfAgeEnum {

    @XmlElement(name = "Includes", nillable = true)
    protected ArrayOfAgeEnum includes;
    @XmlElement(name = "Excludes", nillable = true)
    protected ArrayOfAgeEnum excludes;

    /**
     * Gets the value of the includes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgeEnum }
     *     
     */
    public ArrayOfAgeEnum getIncludes() {
        return includes;
    }

    /**
     * Sets the value of the includes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgeEnum }
     *     
     */
    public void setIncludes(ArrayOfAgeEnum value) {
        this.includes = value;
    }

    /**
     * Gets the value of the excludes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgeEnum }
     *     
     */
    public ArrayOfAgeEnum getExcludes() {
        return excludes;
    }

    /**
     * Sets the value of the excludes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgeEnum }
     *     
     */
    public void setExcludes(ArrayOfAgeEnum value) {
        this.excludes = value;
    }

}
