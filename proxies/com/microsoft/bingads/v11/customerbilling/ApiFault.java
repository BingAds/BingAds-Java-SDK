
package com.microsoft.bingads.v11.customerbilling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApiFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiFault">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adapi.microsoft.com}ApplicationFault">
 *       &lt;sequence>
 *         &lt;element name="OperationErrors" type="{https://bingads.microsoft.com/Customer/v11/Exception}ArrayOfOperationError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiFault", namespace = "https://bingads.microsoft.com/Customer/v11/Exception", propOrder = {
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
