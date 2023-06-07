
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
 *         <element name="AccountProperties" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAccountProperty" minOccurs="0"/>
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
    "accountProperties"
})
@XmlRootElement(name = "SetAccountPropertiesRequest")
public class SetAccountPropertiesRequest {

    @XmlElement(name = "AccountProperties", nillable = true)
    protected ArrayOfAccountProperty accountProperties;

    /**
     * Gets the value of the accountProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountProperty }
     *     
     */
    public ArrayOfAccountProperty getAccountProperties() {
        return accountProperties;
    }

    /**
     * Sets the value of the accountProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountProperty }
     *     
     */
    public void setAccountProperties(ArrayOfAccountProperty value) {
        this.accountProperties = value;
    }

}
