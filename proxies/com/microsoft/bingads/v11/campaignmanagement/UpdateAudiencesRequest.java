
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
 *         &lt;element name="Audiences" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfAudience" minOccurs="0"/>
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
    "audiences"
})
@XmlRootElement(name = "UpdateAudiencesRequest")
public class UpdateAudiencesRequest {

    @XmlElement(name = "Audiences", nillable = true)
    protected ArrayOfAudience audiences;

    /**
     * Gets the value of the audiences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAudience }
     *     
     */
    public ArrayOfAudience getAudiences() {
        return audiences;
    }

    /**
     * Sets the value of the audiences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAudience }
     *     
     */
    public void setAudiences(ArrayOfAudience value) {
        this.audiences = value;
    }

}
