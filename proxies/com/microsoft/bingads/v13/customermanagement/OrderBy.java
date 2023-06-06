
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderBy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OrderBy">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Field" type="{https://bingads.microsoft.com/Customer/v13/Entities}OrderByField" minOccurs="0"/>
 *         <element name="Order" type="{https://bingads.microsoft.com/Customer/v13/Entities}SortOrder" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderBy", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "field",
    "order"
})
public class OrderBy {

    @XmlElement(name = "Field")
    @XmlSchemaType(name = "string")
    protected OrderByField field;
    @XmlElement(name = "Order")
    @XmlSchemaType(name = "string")
    protected SortOrder order;

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link OrderByField }
     *     
     */
    public OrderByField getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderByField }
     *     
     */
    public void setField(OrderByField value) {
        this.field = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrder }
     *     
     */
    public SortOrder getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrder }
     *     
     */
    public void setOrder(SortOrder value) {
        this.order = value;
    }

}
