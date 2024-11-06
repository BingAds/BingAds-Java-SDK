
package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfBatchError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfBatchError">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BatchError" type="{https://bingads.microsoft.com/Customer/v13/Exception}BatchError" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBatchError", namespace = "https://bingads.microsoft.com/Customer/v13/Exception", propOrder = {
    "batchErrors"
})
public class ArrayOfBatchError {

    @XmlElement(name = "BatchError", nillable = true)
    protected List<BatchError> batchErrors;
    public ArrayOfBatchError()
    {
      this.batchErrors = new ArrayList<BatchError>();
    }
    @JsonCreator
    public ArrayOfBatchError(List<BatchError> batcherrors)
    {
      this.batchErrors = batcherrors;
    }

    /**
     * Gets the value of the batchErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the batchErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchError }
     * 
     * 
     * @return
     *     The value of the batchErrors property.
     */
    public List<BatchError> getBatchErrors() {
        if (batchErrors == null) {
            batchErrors = new ArrayList<>();
        }
        return this.batchErrors;
    }

}
