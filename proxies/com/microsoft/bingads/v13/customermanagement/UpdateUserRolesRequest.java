
package com.microsoft.bingads.v13.customermanagement;

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
 *         <element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="NewRoleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="NewAccountIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="NewCustomerIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="DeleteRoleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="DeleteAccountIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="DeleteCustomerIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
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
    "customerId",
    "userId",
    "newRoleId",
    "newAccountIds",
    "newCustomerIds",
    "deleteRoleId",
    "deleteAccountIds",
    "deleteCustomerIds"
})
@XmlRootElement(name = "UpdateUserRolesRequest")
public class UpdateUserRolesRequest {

    @XmlElement(name = "CustomerId")
    protected Long customerId;
    @XmlElement(name = "UserId")
    protected Long userId;
    @XmlElement(name = "NewRoleId", nillable = true)
    protected Integer newRoleId;
    @XmlElement(name = "NewAccountIds", nillable = true)
    protected ArrayOflong newAccountIds;
    @XmlElement(name = "NewCustomerIds", nillable = true)
    protected ArrayOflong newCustomerIds;
    @XmlElement(name = "DeleteRoleId", nillable = true)
    protected Integer deleteRoleId;
    @XmlElement(name = "DeleteAccountIds", nillable = true)
    protected ArrayOflong deleteAccountIds;
    @XmlElement(name = "DeleteCustomerIds", nillable = true)
    protected ArrayOflong deleteCustomerIds;

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
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the newRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewRoleId() {
        return newRoleId;
    }

    /**
     * Sets the value of the newRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewRoleId(Integer value) {
        this.newRoleId = value;
    }

    /**
     * Gets the value of the newAccountIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getNewAccountIds() {
        return newAccountIds;
    }

    /**
     * Sets the value of the newAccountIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setNewAccountIds(ArrayOflong value) {
        this.newAccountIds = value;
    }

    /**
     * Gets the value of the newCustomerIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getNewCustomerIds() {
        return newCustomerIds;
    }

    /**
     * Sets the value of the newCustomerIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setNewCustomerIds(ArrayOflong value) {
        this.newCustomerIds = value;
    }

    /**
     * Gets the value of the deleteRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeleteRoleId() {
        return deleteRoleId;
    }

    /**
     * Sets the value of the deleteRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeleteRoleId(Integer value) {
        this.deleteRoleId = value;
    }

    /**
     * Gets the value of the deleteAccountIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getDeleteAccountIds() {
        return deleteAccountIds;
    }

    /**
     * Sets the value of the deleteAccountIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setDeleteAccountIds(ArrayOflong value) {
        this.deleteAccountIds = value;
    }

    /**
     * Gets the value of the deleteCustomerIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getDeleteCustomerIds() {
        return deleteCustomerIds;
    }

    /**
     * Sets the value of the deleteCustomerIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setDeleteCustomerIds(ArrayOflong value) {
        this.deleteCustomerIds = value;
    }

}
