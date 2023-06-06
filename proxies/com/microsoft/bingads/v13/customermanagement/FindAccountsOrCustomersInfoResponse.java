
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
 *         <element name="AccountInfoWithCustomerData" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfAccountInfoWithCustomerData" minOccurs="0"/>
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
