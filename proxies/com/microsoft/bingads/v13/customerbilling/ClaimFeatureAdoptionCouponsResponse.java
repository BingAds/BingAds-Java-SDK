
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
 *         <element name="ClaimedDateByAccountId" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOflongdateTime" minOccurs="0"/>
 *         <element name="OperationErrors" type="{https://bingads.microsoft.com/Customer/v13/Exception}ArrayOfOperationError" minOccurs="0"/>
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
    "claimedDateByAccountId",
    "operationErrors",
    "partialErrors"
})
@XmlRootElement(name = "ClaimFeatureAdoptionCouponsResponse")
public class ClaimFeatureAdoptionCouponsResponse {

    @XmlElement(name = "ClaimedDateByAccountId", nillable = true)
    protected ArrayOfKeyValuePairOflongdateTime claimedDateByAccountId;
    @XmlElement(name = "OperationErrors", nillable = true)
    protected ArrayOfOperationError operationErrors;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfArrayOfOperationError partialErrors;

    /**
     * Gets the value of the claimedDateByAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValuePairOflongdateTime }
     *     
     */
    public ArrayOfKeyValuePairOflongdateTime getClaimedDateByAccountId() {
        return claimedDateByAccountId;
    }

    /**
     * Sets the value of the claimedDateByAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePairOflongdateTime }
     *     
     */
    public void setClaimedDateByAccountId(ArrayOfKeyValuePairOflongdateTime value) {
        this.claimedDateByAccountId = value;
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
