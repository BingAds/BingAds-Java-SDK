
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectionOfGenderEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SelectionOfGenderEnum">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Includes" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfGenderEnum" minOccurs="0"/>
 *         <element name="Excludes" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfGenderEnum" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionOfGenderEnum", propOrder = {
    "includes",
    "excludes"
})
public class SelectionOfGenderEnum {

    @XmlElement(name = "Includes", nillable = true)
    protected ArrayOfGenderEnum includes;
    @XmlElement(name = "Excludes", nillable = true)
    protected ArrayOfGenderEnum excludes;

    /**
     * Gets the value of the includes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGenderEnum }
     *     
     */
    public ArrayOfGenderEnum getIncludes() {
        return includes;
    }

    /**
     * Sets the value of the includes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGenderEnum }
     *     
     */
    public void setIncludes(ArrayOfGenderEnum value) {
        this.includes = value;
    }

    /**
     * Gets the value of the excludes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGenderEnum }
     *     
     */
    public ArrayOfGenderEnum getExcludes() {
        return excludes;
    }

    /**
     * Sets the value of the excludes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGenderEnum }
     *     
     */
    public void setExcludes(ArrayOfGenderEnum value) {
        this.excludes = value;
    }

}
