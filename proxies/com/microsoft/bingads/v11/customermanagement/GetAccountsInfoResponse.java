
package com.microsoft.bingads.v11.customermanagement;

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
 *         &lt;element name="AccountsInfo" type="{https://bingads.microsoft.com/Customer/v11/Entities}ArrayOfAccountInfo" minOccurs="0"/>
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
    "accountsInfo"
})
@XmlRootElement(name = "GetAccountsInfoResponse")
public class GetAccountsInfoResponse {

    @XmlElement(name = "AccountsInfo", nillable = true)
    protected ArrayOfAccountInfo accountsInfo;

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

}
