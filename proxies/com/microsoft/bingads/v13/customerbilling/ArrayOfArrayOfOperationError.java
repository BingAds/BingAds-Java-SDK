
package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArrayOfOperationError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfArrayOfOperationError">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ArrayOfOperationError" type="{https://bingads.microsoft.com/Customer/v13/Exception}ArrayOfOperationError" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfOperationError", namespace = "https://bingads.microsoft.com/Customer/v13/Exception", propOrder = {
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
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the arrayOfOperationErrors property.
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
     * @return
     *     The value of the arrayOfOperationErrors property.
     */
    public List<ArrayOfOperationError> getArrayOfOperationErrors() {
        if (arrayOfOperationErrors == null) {
            arrayOfOperationErrors = new ArrayList<>();
        }
        return this.arrayOfOperationErrors;
    }

}
