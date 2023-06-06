
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
 *         <element name="InsertionOrder" type="{https://bingads.microsoft.com/Customer/v13/Entities}InsertionOrder" minOccurs="0"/>
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
    "insertionOrder"
})
@XmlRootElement(name = "AddInsertionOrderRequest")
public class AddInsertionOrderRequest {

    @XmlElement(name = "InsertionOrder", nillable = true)
    protected InsertionOrder insertionOrder;

    /**
     * Gets the value of the insertionOrder property.
     * 
     * @return
     *     possible object is
     *     {@link InsertionOrder }
     *     
     */
    public InsertionOrder getInsertionOrder() {
        return insertionOrder;
    }

    /**
     * Sets the value of the insertionOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertionOrder }
     *     
     */
    public void setInsertionOrder(InsertionOrder value) {
        this.insertionOrder = value;
    }

}
