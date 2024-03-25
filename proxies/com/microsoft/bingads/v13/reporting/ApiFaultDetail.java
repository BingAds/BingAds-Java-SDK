
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApiFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ApiFaultDetail">
 *   <complexContent>
 *     <extension base="{https://adapi.microsoft.com}ApplicationFault">
 *       <sequence>
 *         <element name="BatchErrors" type="{https://bingads.microsoft.com/Reporting/v13}ArrayOfBatchError" minOccurs="0"/>
 *         <element name="OperationErrors" type="{https://bingads.microsoft.com/Reporting/v13}ArrayOfOperationError" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiFaultDetail", propOrder = {
    "batchErrors",
    "operationErrors"
})
public class ApiFaultDetail
    extends ApplicationFault
{
    public ApiFaultDetail() {
      this.type = "ApiFaultDetail";
    }

    @XmlElement(name = "BatchErrors", nillable = true)
    protected ArrayOfBatchError batchErrors;
    @XmlElement(name = "OperationErrors", nillable = true)
    protected ArrayOfOperationError operationErrors;

    /**
     * Gets the value of the batchErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public ArrayOfBatchError getBatchErrors() {
        return batchErrors;
    }

    /**
     * Sets the value of the batchErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public void setBatchErrors(ArrayOfBatchError value) {
        this.batchErrors = value;
    }

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
