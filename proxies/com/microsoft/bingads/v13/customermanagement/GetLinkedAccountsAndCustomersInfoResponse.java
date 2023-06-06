
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
 *         &lt;element name="AccountsInfo" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfAccountInfo" minOccurs="0"/>
 *         &lt;element name="CustomersInfo" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfCustomerInfo" minOccurs="0"/>
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
    "accountsInfo",
    "customersInfo"
})
@XmlRootElement(name = "GetLinkedAccountsAndCustomersInfoResponse")
public class GetLinkedAccountsAndCustomersInfoResponse {

    @XmlElement(name = "AccountsInfo", nillable = true)
    protected ArrayOfAccountInfo accountsInfo;
    @XmlElement(name = "CustomersInfo", nillable = true)
    protected ArrayOfCustomerInfo customersInfo;

    /**
     * Gets the value of the accountsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountInfo }
     *     
     */
    public ArrayOfAccountInfo getAccountsInfo() {
        return accountsInfo;
    }

    /**
     * Sets the value of the accountsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountInfo }
     *     
     */
    public void setAccountsInfo(ArrayOfAccountInfo value) {
        this.accountsInfo = value;
    }

    /**
     * Gets the value of the customersInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomerInfo }
     *     
     */
    public ArrayOfCustomerInfo getCustomersInfo() {
        return customersInfo;
    }

    /**
     * Sets the value of the customersInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomerInfo }
     *     
     */
    public void setCustomersInfo(ArrayOfCustomerInfo value) {
        this.customersInfo = value;
    }

}
