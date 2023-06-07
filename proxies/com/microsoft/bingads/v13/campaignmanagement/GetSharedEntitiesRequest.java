
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="SharedEntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SharedEntityScope" type="{https://bingads.microsoft.com/CampaignManagement/v13}EntityScope" minOccurs="0"/>
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
    "sharedEntityType",
    "sharedEntityScope"
})
@XmlRootElement(name = "GetSharedEntitiesRequest")
public class GetSharedEntitiesRequest {

    @XmlElement(name = "SharedEntityType", nillable = true)
    protected String sharedEntityType;
    @XmlElement(name = "SharedEntityScope", nillable = true)
    @XmlSchemaType(name = "string")
    protected EntityScope sharedEntityScope;

    /**
     * Gets the value of the sharedEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedEntityType() {
        return sharedEntityType;
    }

    /**
     * Sets the value of the sharedEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedEntityType(String value) {
        this.sharedEntityType = value;
    }

    /**
     * Gets the value of the sharedEntityScope property.
     * 
     * @return
     *     possible object is
     *     {@link EntityScope }
     *     
     */
    public EntityScope getSharedEntityScope() {
        return sharedEntityScope;
    }

    /**
     * Sets the value of the sharedEntityScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityScope }
     *     
     */
    public void setSharedEntityScope(EntityScope value) {
        this.sharedEntityScope = value;
    }

}
