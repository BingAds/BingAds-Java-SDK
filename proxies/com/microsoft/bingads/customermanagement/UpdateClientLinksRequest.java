
package com.microsoft.bingads.customermanagement;

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
 *         &lt;element name="ClientLinks" type="{https://bingads.microsoft.com/Customer/v9/Entities}ArrayOfClientLink" minOccurs="0"/>
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
    "clientLinks"
})
@XmlRootElement(name = "UpdateClientLinksRequest")
public class UpdateClientLinksRequest {

    @XmlElement(name = "ClientLinks", nillable = true)
    protected ArrayOfClientLink clientLinks;

    /**
     * Gets the value of the clientLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClientLink }
     *     
     */
    public ArrayOfClientLink getClientLinks() {
        return clientLinks;
    }

    /**
     * Sets the value of the clientLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClientLink }
     *     
     */
    public void setClientLinks(ArrayOfClientLink value) {
        this.clientLinks = value;
    }

}
