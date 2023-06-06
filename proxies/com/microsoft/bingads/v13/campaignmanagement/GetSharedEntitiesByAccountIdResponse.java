
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
 *         <element name="SharedEntities" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfSharedEntity" minOccurs="0"/>
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
    "sharedEntities"
})
@XmlRootElement(name = "GetSharedEntitiesByAccountIdResponse")
public class GetSharedEntitiesByAccountIdResponse {

    @XmlElement(name = "SharedEntities", nillable = true)
    protected ArrayOfSharedEntity sharedEntities;

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

}
