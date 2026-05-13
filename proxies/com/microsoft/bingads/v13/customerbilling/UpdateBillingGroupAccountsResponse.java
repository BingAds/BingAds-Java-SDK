
package com.microsoft.bingads.v13.customerbilling;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PartialErrors" type="{https://bingads.microsoft.com/Customer/v13/Exception}ArrayOfArrayOfOperationError" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "partialErrors"
})
@XmlRootElement(name = "UpdateBillingGroupAccountsResponse")
public class UpdateBillingGroupAccountsResponse {

    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfArrayOfOperationError partialErrors;

    /**
     * Gets the value of the partialErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfOperationError }
     *     
     */
    public ArrayOfArrayOfOperationError getPartialErrors() {
        return partialErrors;
    }

    /**
     * Sets the value of the partialErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfOperationError }
     *     
     */
    public void setPartialErrors(ArrayOfArrayOfOperationError value) {
        this.partialErrors = value;
    }

}
