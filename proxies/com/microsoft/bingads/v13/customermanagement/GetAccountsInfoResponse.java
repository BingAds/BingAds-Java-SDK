
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
 *         <element name="AccountsInfo" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfAccountInfo" minOccurs="0"/>
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
