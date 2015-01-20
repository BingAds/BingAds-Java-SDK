
package com.microsoft.bingads.customermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArrayOfOperationError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfOperationError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfOperationError" type="{https://bingads.microsoft.com/Customer/v9/Exception}ArrayOfOperationError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfOperationError", namespace = "https://bingads.microsoft.com/Customer/v9/Exception", propOrder = {
    "arrayOfOperationErrors"
})
public class ArrayOfArrayOfOperationError {

    @XmlElement(name = "ArrayOfOperationError", nillable = true)
    protected List<ArrayOfOperationError> arrayOfOperationErrors;

    /**
     * Gets the value of the arrayOfOperationErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfOperationErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfOperationErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOperationError }
     * 
     * 
     */
    public List<ArrayOfOperationError> getArrayOfOperationErrors() {
        if (arrayOfOperationErrors == null) {
            arrayOfOperationErrors = new ArrayList<ArrayOfOperationError>();
        }
        return this.arrayOfOperationErrors;
    }

}
