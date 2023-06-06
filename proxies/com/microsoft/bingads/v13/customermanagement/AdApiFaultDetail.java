
package com.microsoft.bingads.v13.customermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdApiFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdApiFaultDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adapi.microsoft.com}ApplicationFault">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{https://adapi.microsoft.com}ArrayOfAdApiError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
