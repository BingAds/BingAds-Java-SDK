
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
 *         <element name="RuleIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="Status" type="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionValueRuleStatus" minOccurs="0"/>
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
    "ruleIds",
    "status"
})
@XmlRootElement(name = "UpdateConversionValueRulesStatusRequest")
public class UpdateConversionValueRulesStatusRequest {

    @XmlElement(name = "RuleIds", nillable = true)
    protected ArrayOflong ruleIds;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected ConversionValueRuleStatus status;

    /**
     * Gets the value of the ruleIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getRuleIds() {
        return ruleIds;
    }

    /**
     * Sets the value of the ruleIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setRuleIds(ArrayOflong value) {
        this.ruleIds = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionValueRuleStatus }
     *     
     */
    public ConversionValueRuleStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionValueRuleStatus }
     *     
     */
    public void setStatus(ConversionValueRuleStatus value) {
        this.status = value;
    }

}
