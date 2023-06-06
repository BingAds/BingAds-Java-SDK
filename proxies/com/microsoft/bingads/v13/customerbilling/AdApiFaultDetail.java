
package com.microsoft.bingads.v13.customerbilling;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdApiFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdApiFaultDetail">
 *   <complexContent>
 *     <extension base="{https://adapi.microsoft.com}ApplicationFault">
 *       <sequence>
 *         <element name="Errors" type="{https://adapi.microsoft.com}ArrayOfAdApiError" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdApiFaultDetail", namespace = "https://adapi.microsoft.com", propOrder = {
    "errors"
})
public class AdApiFaultDetail
    extends ApplicationFault
{

    @XmlElement(name = "Errors", nillable = true)
    protected ArrayOfAdApiError errors;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdApiError }
     *     
     */
    public ArrayOfAdApiError getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdApiError }
     *     
     */
    public void setErrors(ArrayOfAdApiError value) {
        this.errors = value;
    }

}
