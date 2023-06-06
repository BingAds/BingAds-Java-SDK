
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
 *         <element name="Accounts" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfAdvertiserAccount" minOccurs="0"/>
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
    "accounts"
})
@XmlRootElement(name = "SearchAccountsResponse")
public class SearchAccountsResponse {

    @XmlElement(name = "Accounts", nillable = true)
    protected ArrayOfAdvertiserAccount accounts;

    /**
     * Gets the value of the accounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdvertiserAccount }
     *     
     */
    public ArrayOfAdvertiserAccount getAccounts() {
        return accounts;
    }

    /**
     * Sets the value of the accounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdvertiserAccount }
     *     
     */
    public void setAccounts(ArrayOfAdvertiserAccount value) {
        this.accounts = value;
    }

}
