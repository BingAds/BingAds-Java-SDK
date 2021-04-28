
package com.microsoft.bingads.v13.customerbilling;

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
 *         &lt;element name="InsertionOrder" type="{https://bingads.microsoft.com/Customer/v13/Entities}InsertionOrder" minOccurs="0"/>
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
    "insertionOrder"
})
@XmlRootElement(name = "UpdateInsertionOrderRequest")
public class UpdateInsertionOrderRequest {

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
