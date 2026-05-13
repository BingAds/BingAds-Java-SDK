
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
 *         <element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="BillingGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="AccountsToAdd" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
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
    "billingGroupId",
    "accountsToAdd"
})
@XmlRootElement(name = "UpdateBillingGroupAccountsRequest")
public class UpdateBillingGroupAccountsRequest {

    @XmlElement(name = "CustomerId")
    protected Long customerId;
    @XmlElement(name = "BillingGroupId")
    protected Long billingGroupId;
    @XmlElement(name = "AccountsToAdd", nillable = true)
    protected ArrayOflong accountsToAdd;

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
     * Gets the value of the billingGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillingGroupId() {
        return billingGroupId;
    }

    /**
     * Sets the value of the billingGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillingGroupId(Long value) {
        this.billingGroupId = value;
    }

    /**
     * Gets the value of the accountsToAdd property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getAccountsToAdd() {
        return accountsToAdd;
    }

    /**
     * Sets the value of the accountsToAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setAccountsToAdd(ArrayOflong value) {
        this.accountsToAdd = value;
    }

}
