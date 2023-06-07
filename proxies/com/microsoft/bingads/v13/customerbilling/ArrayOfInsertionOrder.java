
package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInsertionOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfInsertionOrder">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InsertionOrder" type="{https://bingads.microsoft.com/Customer/v13/Entities}InsertionOrder" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInsertionOrder", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "insertionOrders"
})
public class ArrayOfInsertionOrder {

    @XmlElement(name = "InsertionOrder", nillable = true)
    protected List<InsertionOrder> insertionOrders;

    /**
     * Gets the value of the insertionOrders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the insertionOrders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsertionOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsertionOrder }
     * 
     * 
     * @return
     *     The value of the insertionOrders property.
     */
    public List<InsertionOrder> getInsertionOrders() {
        if (insertionOrders == null) {
            insertionOrders = new ArrayList<>();
        }
        return this.insertionOrders;
    }

}
