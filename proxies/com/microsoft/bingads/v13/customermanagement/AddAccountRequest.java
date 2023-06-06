
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
 *         <element name="Account" type="{https://bingads.microsoft.com/Customer/v13/Entities}AdvertiserAccount" minOccurs="0"/>
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
    "account"
})
@XmlRootElement(name = "AddAccountRequest")
public class AddAccountRequest {

    @XmlElement(name = "Account", nillable = true)
    protected AdvertiserAccount account;

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

}
