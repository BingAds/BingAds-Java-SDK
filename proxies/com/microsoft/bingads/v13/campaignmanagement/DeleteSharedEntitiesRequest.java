
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
 *         <element name="SharedEntities" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfSharedEntity" minOccurs="0"/>
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
    "sharedEntities",
    "sharedEntityScope"
})
@XmlRootElement(name = "DeleteSharedEntitiesRequest")
public class DeleteSharedEntitiesRequest {

    @XmlElement(name = "SharedEntities", nillable = true)
    protected ArrayOfSharedEntity sharedEntities;
    @XmlElement(name = "SharedEntityScope", nillable = true)
    @XmlSchemaType(name = "string")
    protected EntityScope sharedEntityScope;

    /**
     * Gets the value of the sharedEntities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSharedEntity }
     *     
     */
    public ArrayOfSharedEntity getSharedEntities() {
        return sharedEntities;
    }

    /**
     * Sets the value of the sharedEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSharedEntity }
     *     
     */
    public void setSharedEntities(ArrayOfSharedEntity value) {
        this.sharedEntities = value;
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
