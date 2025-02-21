
package com.microsoft.bingads.v13.campaignmanagement;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewCustomerAcquisitionGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NewCustomerAcquisitionGoal">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdditionalValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="Audiences" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAudienceIdName" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewCustomerAcquisitionGoal", propOrder = {
    "additionalValue",
    "audiences",
    "id"
})
public class NewCustomerAcquisitionGoal {

    @XmlElement(name = "AdditionalValue", nillable = true)
    protected BigDecimal additionalValue;
    @XmlElement(name = "Audiences", nillable = true)
    protected ArrayOfAudienceIdName audiences;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;

    /**
     * Gets the value of the additionalValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdditionalValue() {
        return additionalValue;
    }

    /**
     * Sets the value of the additionalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdditionalValue(BigDecimal value) {
        this.additionalValue = value;
    }

    /**
     * Gets the value of the audiences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAudienceIdName }
     *     
     */
    public ArrayOfAudienceIdName getAudiences() {
        return audiences;
    }

    /**
     * Sets the value of the audiences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAudienceIdName }
     *     
     */
    public void setAudiences(ArrayOfAudienceIdName value) {
        this.audiences = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

}
