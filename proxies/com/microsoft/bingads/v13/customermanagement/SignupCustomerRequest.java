
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
 *         <element name="Customer" type="{https://bingads.microsoft.com/Customer/v13/Entities}Customer" minOccurs="0"/>
 *         <element name="Account" type="{https://bingads.microsoft.com/Customer/v13/Entities}AdvertiserAccount" minOccurs="0"/>
 *         <element name="ParentCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="UserInvitation" type="{https://bingads.microsoft.com/Customer/v13/Entities}UserInvitation" minOccurs="0"/>
 *         <element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="User" type="{https://bingads.microsoft.com/Customer/v13/Entities}User" minOccurs="0"/>
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
    "customer",
    "account",
    "parentCustomerId",
    "userInvitation",
    "userId",
    "user"
})
@XmlRootElement(name = "SignupCustomerRequest")
public class SignupCustomerRequest {

    @XmlElement(name = "Customer", nillable = true)
    protected Customer customer;
    @XmlElement(name = "Account", nillable = true)
    protected AdvertiserAccount account;
    @XmlElement(name = "ParentCustomerId", nillable = true)
    protected Long parentCustomerId;
    @XmlElement(name = "UserInvitation", nillable = true)
    protected UserInvitation userInvitation;
    @XmlElement(name = "UserId", nillable = true)
    protected Long userId;
    @XmlElement(name = "User", nillable = true)
    protected User user;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertiserAccount }
     *     
     */
    public AdvertiserAccount getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertiserAccount }
     *     
     */
    public void setAccount(AdvertiserAccount value) {
        this.account = value;
    }

    /**
     * Gets the value of the parentCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentCustomerId() {
        return parentCustomerId;
    }

    /**
     * Sets the value of the parentCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentCustomerId(Long value) {
        this.parentCustomerId = value;
    }

    /**
     * Gets the value of the userInvitation property.
     * 
     * @return
     *     possible object is
     *     {@link UserInvitation }
     *     
     */
    public UserInvitation getUserInvitation() {
        return userInvitation;
    }

    /**
     * Sets the value of the userInvitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInvitation }
     *     
     */
    public void setUserInvitation(UserInvitation value) {
        this.userInvitation = value;
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

}
