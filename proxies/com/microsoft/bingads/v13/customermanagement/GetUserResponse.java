
package com.microsoft.bingads.v13.customermanagement;

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
 *         &lt;element name="User" type="{https://bingads.microsoft.com/Customer/v13/Entities}User" minOccurs="0"/>
 *         &lt;element name="CustomerRoles" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfCustomerRole" minOccurs="0"/>
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
    "user",
    "customerRoles"
})
@XmlRootElement(name = "GetUserResponse")
public class GetUserResponse {

    @XmlElement(name = "User", nillable = true)
    protected User user;
    @XmlElement(name = "CustomerRoles", nillable = true)
    protected ArrayOfCustomerRole customerRoles;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the customerRoles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomerRole }
     *     
     */
    public ArrayOfCustomerRole getCustomerRoles() {
        return customerRoles;
    }

    /**
     * Sets the value of the customerRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomerRole }
     *     
     */
    public void setCustomerRoles(ArrayOfCustomerRole value) {
        this.customerRoles = value;
    }

}
