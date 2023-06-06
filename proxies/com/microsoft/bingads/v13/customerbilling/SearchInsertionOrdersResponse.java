
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
 *         <element name="InsertionOrders" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfInsertionOrder" minOccurs="0"/>
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
    "insertionOrders"
})
@XmlRootElement(name = "SearchInsertionOrdersResponse")
public class SearchInsertionOrdersResponse {

    @XmlElement(name = "InsertionOrders", nillable = true)
    protected ArrayOfInsertionOrder insertionOrders;

    /**
     * Gets the value of the insertionOrders property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInsertionOrder }
     *     
     */
    public ArrayOfInsertionOrder getInsertionOrders() {
        return insertionOrders;
    }

    /**
     * Sets the value of the insertionOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInsertionOrder }
     *     
     */
    public void setInsertionOrders(ArrayOfInsertionOrder value) {
        this.insertionOrders = value;
    }

}
