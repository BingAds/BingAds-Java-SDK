
package com.microsoft.bingads.v12.customerbilling;

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
 *         &lt;element name="InsertionOrders" type="{https://bingads.microsoft.com/Customer/v12/Entities}ArrayOfInsertionOrder" minOccurs="0"/>
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
