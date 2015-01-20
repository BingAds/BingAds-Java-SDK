
package com.microsoft.bingads.optimizer;

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
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OpportunityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="OpportunityModifiers" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}ArrayOfOpportunityModifier" minOccurs="0"/>
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
    "accountId",
    "opportunityKeys",
    "opportunityModifiers"
})
@XmlRootElement(name = "ApplyOpportunitiesRequest", namespace = "https://bingads.microsoft.com/Optimizer/v9")
public class ApplyOpportunitiesRequest {

    @XmlElement(name = "AccountId", namespace = "https://bingads.microsoft.com/Optimizer/v9")
    protected Long accountId;
    @XmlElement(name = "OpportunityKeys", namespace = "https://bingads.microsoft.com/Optimizer/v9", nillable = true)
    protected ArrayOfstring opportunityKeys;
    @XmlElement(name = "OpportunityModifiers", namespace = "https://bingads.microsoft.com/Optimizer/v9", nillable = true)
    protected ArrayOfOpportunityModifier opportunityModifiers;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the opportunityKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getOpportunityKeys() {
        return opportunityKeys;
    }

    /**
     * Sets the value of the opportunityKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setOpportunityKeys(ArrayOfstring value) {
        this.opportunityKeys = value;
    }

    /**
     * Gets the value of the opportunityModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOpportunityModifier }
     *     
     */
    public ArrayOfOpportunityModifier getOpportunityModifiers() {
        return opportunityModifiers;
    }

    /**
     * Sets the value of the opportunityModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOpportunityModifier }
     *     
     */
    public void setOpportunityModifiers(ArrayOfOpportunityModifier value) {
        this.opportunityModifiers = value;
    }

}
