
package com.microsoft.bingads.v13.campaignmanagement;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewCustomerAcquisitionGoalSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NewCustomerAcquisitionGoalSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="AdditionalConversionValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="NewCustomerAcquisitionBidOnlyMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="NewCustomerAcquisitionGoalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewCustomerAcquisitionGoalSetting", propOrder = {
    "additionalConversionValue",
    "newCustomerAcquisitionBidOnlyMode",
    "newCustomerAcquisitionGoalId"
})
public class NewCustomerAcquisitionGoalSetting
    extends Setting
{
    public NewCustomerAcquisitionGoalSetting() {
      this.type = "NewCustomerAcquisitionGoalSetting";
    }

    @XmlElement(name = "AdditionalConversionValue", nillable = true)
    protected BigDecimal additionalConversionValue;
    @XmlElement(name = "NewCustomerAcquisitionBidOnlyMode", nillable = true)
    protected Boolean newCustomerAcquisitionBidOnlyMode;
    @XmlElement(name = "NewCustomerAcquisitionGoalId", nillable = true)
    protected Long newCustomerAcquisitionGoalId;

    /**
     * Gets the value of the additionalConversionValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdditionalConversionValue() {
        return additionalConversionValue;
    }

    /**
     * Sets the value of the additionalConversionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdditionalConversionValue(BigDecimal value) {
        this.additionalConversionValue = value;
    }

    /**
     * Gets the value of the newCustomerAcquisitionBidOnlyMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNewCustomerAcquisitionBidOnlyMode() {
        return newCustomerAcquisitionBidOnlyMode;
    }

    /**
     * Sets the value of the newCustomerAcquisitionBidOnlyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewCustomerAcquisitionBidOnlyMode(Boolean value) {
        this.newCustomerAcquisitionBidOnlyMode = value;
    }

    /**
     * Gets the value of the newCustomerAcquisitionGoalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNewCustomerAcquisitionGoalId() {
        return newCustomerAcquisitionGoalId;
    }

    /**
     * Sets the value of the newCustomerAcquisitionGoalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNewCustomerAcquisitionGoalId(Long value) {
        this.newCustomerAcquisitionGoalId = value;
    }

}
