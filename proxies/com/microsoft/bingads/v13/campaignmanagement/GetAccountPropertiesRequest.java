
package com.microsoft.bingads.v13.campaignmanagement;

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
 *         <element name="AccountPropertyNames" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAccountPropertyName" minOccurs="0"/>
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
    "accountPropertyNames"
})
@XmlRootElement(name = "GetAccountPropertiesRequest")
public class GetAccountPropertiesRequest {

    @XmlElement(name = "AccountPropertyNames", nillable = true)
    protected ArrayOfAccountPropertyName accountPropertyNames;

    /**
     * Gets the value of the accountPropertyNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountPropertyName }
     *     
     */
    public ArrayOfAccountPropertyName getAccountPropertyNames() {
        return accountPropertyNames;
    }

    /**
     * Sets the value of the accountPropertyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountPropertyName }
     *     
     */
    public void setAccountPropertyNames(ArrayOfAccountPropertyName value) {
        this.accountPropertyNames = value;
    }

}
