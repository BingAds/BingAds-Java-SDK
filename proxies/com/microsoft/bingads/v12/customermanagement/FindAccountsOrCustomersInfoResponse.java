
package com.microsoft.bingads.v12.customermanagement;

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
 *         &lt;element name="AccountInfoWithCustomerData" type="{https://bingads.microsoft.com/Customer/v12/Entities}ArrayOfAccountInfoWithCustomerData" minOccurs="0"/>
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
    "accountInfoWithCustomerData"
})
@XmlRootElement(name = "FindAccountsOrCustomersInfoResponse")
public class FindAccountsOrCustomersInfoResponse {

    @XmlElement(name = "AccountInfoWithCustomerData", nillable = true)
    protected ArrayOfAccountInfoWithCustomerData accountInfoWithCustomerData;

    /**
     * Gets the value of the accountInfoWithCustomerData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountInfoWithCustomerData }
     *     
     */
    public ArrayOfAccountInfoWithCustomerData getAccountInfoWithCustomerData() {
        return accountInfoWithCustomerData;
    }

    /**
     * Sets the value of the accountInfoWithCustomerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountInfoWithCustomerData }
     *     
     */
    public void setAccountInfoWithCustomerData(ArrayOfAccountInfoWithCustomerData value) {
        this.accountInfoWithCustomerData = value;
    }

}
