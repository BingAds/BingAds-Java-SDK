
package com.microsoft.bingads.v13.customermanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfOperationError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfOperationError">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OperationError" type="{https://bingads.microsoft.com/Customer/v13/Exception}OperationError" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOperationError", namespace = "https://bingads.microsoft.com/Customer/v13/Exception", propOrder = {
    "operationErrors"
})
public class ArrayOfOperationError {

    @XmlElement(name = "OperationError", nillable = true)
    protected List<OperationError> operationErrors;
    public ArrayOfOperationError()
    {
      this.operationErrors = new ArrayList<OperationError>();
    }
    @JsonCreator
    public ArrayOfOperationError(List<OperationError> operationerrors)
    {
      this.operationErrors = operationerrors;
    }

    /**
     * Gets the value of the operationErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the operationErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationError }
     * 
     * 
     * @return
     *     The value of the operationErrors property.
     */
    public List<OperationError> getOperationErrors() {
        if (operationErrors == null) {
            operationErrors = new ArrayList<>();
        }
        return this.operationErrors;
    }

}
