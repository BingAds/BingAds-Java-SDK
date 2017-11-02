
package com.microsoft.bingads.v11.campaignmanagement;

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
 *         &lt;element name="AccountPropertyNames" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfAccountPropertyName" minOccurs="0"/>
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
