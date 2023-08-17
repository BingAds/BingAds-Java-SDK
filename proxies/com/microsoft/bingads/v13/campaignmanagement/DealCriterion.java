
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DealCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DealCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="DealId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealCriterion", propOrder = {
    "dealId"
})
public class DealCriterion
    extends Criterion
{
    public DealCriterion() {
      this.type = "DealCriterion";
    }

    @XmlElement(name = "DealId")
    protected Long dealId;

    /**
     * Gets the value of the dealId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the dealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDealId(Long value) {
        this.dealId = value;
    }

}
