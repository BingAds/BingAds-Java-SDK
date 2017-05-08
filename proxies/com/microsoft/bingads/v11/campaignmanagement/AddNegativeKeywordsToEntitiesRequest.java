
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
 *         &lt;element name="EntityNegativeKeywords" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfEntityNegativeKeyword" minOccurs="0"/>
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
