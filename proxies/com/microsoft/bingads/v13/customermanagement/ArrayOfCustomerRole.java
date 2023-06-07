
package com.microsoft.bingads.v13.customermanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCustomerRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCustomerRole">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CustomerRole" type="{https://bingads.microsoft.com/Customer/v13/Entities}CustomerRole" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomerRole", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "customerRoles"
})
public class ArrayOfCustomerRole {

    @XmlElement(name = "CustomerRole", nillable = true)
    protected List<CustomerRole> customerRoles;

    /**
     * Gets the value of the customerRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the customerRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerRole }
     * 
     * 
     * @return
     *     The value of the customerRoles property.
     */
    public List<CustomerRole> getCustomerRoles() {
        if (customerRoles == null) {
            customerRoles = new ArrayList<>();
        }
        return this.customerRoles;
    }

}
