
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AudienceCondition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Audiences" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAudienceConditionItem" minOccurs="0"/>
 *         <element name="IsPrimary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceCondition", propOrder = {
    "audiences",
    "isPrimary"
})
public class AudienceCondition {

    @XmlElement(name = "Audiences", nillable = true)
    protected ArrayOfAudienceConditionItem audiences;
    @XmlElement(name = "IsPrimary")
    protected Boolean isPrimary;

    /**
     * Gets the value of the audiences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAudienceConditionItem }
     *     
     */
    public ArrayOfAudienceConditionItem getAudiences() {
        return audiences;
    }

    /**
     * Sets the value of the audiences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAudienceConditionItem }
     *     
     */
    public void setAudiences(ArrayOfAudienceConditionItem value) {
        this.audiences = value;
    }

    /**
     * Gets the value of the isPrimary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets the value of the isPrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimary(Boolean value) {
        this.isPrimary = value;
    }

}
