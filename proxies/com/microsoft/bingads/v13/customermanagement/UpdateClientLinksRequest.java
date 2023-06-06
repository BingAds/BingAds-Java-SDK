
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
 *         <element name="ClientLinks" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfClientLink" minOccurs="0"/>
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
