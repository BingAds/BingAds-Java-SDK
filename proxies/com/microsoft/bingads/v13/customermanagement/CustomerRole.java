
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomerRole">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RoleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="AccountIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="LinkedAccountIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="CustomerLinkPermission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRole", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "roleId",
    "customerId",
    "accountIds",
    "linkedAccountIds",
    "customerLinkPermission"
})
public class CustomerRole {

    @XmlElement(name = "RoleId")
    protected Integer roleId;
    @XmlElement(name = "CustomerId")
    protected Long customerId;
    @XmlElement(name = "AccountIds", nillable = true)
    protected ArrayOflong accountIds;
    @XmlElement(name = "LinkedAccountIds", nillable = true)
    protected ArrayOflong linkedAccountIds;
    @XmlElement(name = "CustomerLinkPermission", nillable = true)
    protected String customerLinkPermission;

    /**
     * Gets the value of the roleId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * Sets the value of the roleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoleId(Integer value) {
        this.roleId = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the accountIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getAccountIds() {
        return accountIds;
    }

    /**
     * Sets the value of the accountIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setAccountIds(ArrayOflong value) {
        this.accountIds = value;
    }

    /**
     * Gets the value of the linkedAccountIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getLinkedAccountIds() {
        return linkedAccountIds;
    }

    /**
     * Sets the value of the linkedAccountIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setLinkedAccountIds(ArrayOflong value) {
        this.linkedAccountIds = value;
    }

    /**
     * Gets the value of the customerLinkPermission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLinkPermission() {
        return customerLinkPermission;
    }

    /**
     * Sets the value of the customerLinkPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLinkPermission(String value) {
        this.customerLinkPermission = value;
    }

}
