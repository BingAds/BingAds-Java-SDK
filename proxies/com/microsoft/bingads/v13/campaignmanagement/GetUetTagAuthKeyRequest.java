
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
 *         <element name="UetTagId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "uetTagId"
})
@XmlRootElement(name = "GetUetTagAuthKeyRequest")
public class GetUetTagAuthKeyRequest {

    @XmlElement(name = "UetTagId")
    protected Long uetTagId;

    /**
     * Gets the value of the uetTagId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUetTagId() {
        return uetTagId;
    }

    /**
     * Sets the value of the uetTagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUetTagId(Long value) {
        this.uetTagId = value;
    }

}
