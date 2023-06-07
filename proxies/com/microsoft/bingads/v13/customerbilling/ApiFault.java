
package com.microsoft.bingads.v13.customerbilling;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApiFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ApiFault">
 *   <complexContent>
 *     <extension base="{https://adapi.microsoft.com}ApplicationFault">
 *       <sequence>
 *         <element name="OperationErrors" type="{https://bingads.microsoft.com/Customer/v13/Exception}ArrayOfOperationError" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiFault", namespace = "https://bingads.microsoft.com/Customer/v13/Exception", propOrder = {
    "operationErrors"
})
@XmlSeeAlso({
    ApiBatchFault.class
})
public class ApiFault
    extends ApplicationFault
{

    @XmlElement(name = "OperationErrors", nillable = true)
    protected ArrayOfOperationError operationErrors;

    /**
     * Gets the value of the operationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOperationError }
     *     
     */
    public ArrayOfOperationError getOperationErrors() {
        return operationErrors;
    }

    /**
     * Sets the value of the operationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOperationError }
     *     
     */
    public void setOperationErrors(ArrayOfOperationError value) {
        this.operationErrors = value;
    }

}
