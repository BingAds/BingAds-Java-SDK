
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
 *         <element name="EntityNegativeKeywords" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfEntityNegativeKeyword" minOccurs="0"/>
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
    "entityNegativeKeywords"
})
@XmlRootElement(name = "AddNegativeKeywordsToEntitiesRequest")
public class AddNegativeKeywordsToEntitiesRequest {

    @XmlElement(name = "EntityNegativeKeywords", nillable = true)
    protected ArrayOfEntityNegativeKeyword entityNegativeKeywords;

    /**
     * Gets the value of the entityNegativeKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityNegativeKeyword }
     *     
     */
    public ArrayOfEntityNegativeKeyword getEntityNegativeKeywords() {
        return entityNegativeKeywords;
    }

    /**
     * Sets the value of the entityNegativeKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityNegativeKeyword }
     *     
     */
    public void setEntityNegativeKeywords(ArrayOfEntityNegativeKeyword value) {
        this.entityNegativeKeywords = value;
    }

}
