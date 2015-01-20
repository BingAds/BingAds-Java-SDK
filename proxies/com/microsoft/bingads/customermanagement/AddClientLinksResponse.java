
package com.microsoft.bingads.customermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperationErrors" type="{https://bingads.microsoft.com/Customer/v9/Exception}ArrayOfOperationError" minOccurs="0"/>
 *         &lt;element name="PartialErrors" type="{https://bingads.microsoft.com/Customer/v9/Exception}ArrayOfArrayOfOperationError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operationErrors",
    "partialErrors"
})
@XmlRootElement(name = "AddClientLinksResponse")
public class AddClientLinksResponse {

    @XmlElement(name = "OperationErrors", nillable = true)
    protected ArrayOfOperationError operationErrors;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfArrayOfOperationError partialErrors;

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
