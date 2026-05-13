
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
 *         <element name="UngroupedAccounts" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfUngroupedAccount" minOccurs="0"/>
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
    "ungroupedAccounts"
})
@XmlRootElement(name = "GetUngroupedAccountsResponse")
public class GetUngroupedAccountsResponse {

    @XmlElement(name = "UngroupedAccounts", nillable = true)
    protected ArrayOfUngroupedAccount ungroupedAccounts;

    /**
     * Gets the value of the ungroupedAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUngroupedAccount }
     *     
     */
    public ArrayOfUngroupedAccount getUngroupedAccounts() {
        return ungroupedAccounts;
    }

    /**
     * Sets the value of the ungroupedAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUngroupedAccount }
     *     
     */
    public void setUngroupedAccounts(ArrayOfUngroupedAccount value) {
        this.ungroupedAccounts = value;
    }

}
