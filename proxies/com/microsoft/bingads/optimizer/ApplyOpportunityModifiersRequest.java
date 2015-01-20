
package com.microsoft.bingads.optimizer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Action" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}OpportunityAction" minOccurs="0"/>
 *         &lt;element name="Opportunities" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}ArrayOfOpportunityModifier" minOccurs="0"/>
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
    "action",
    "opportunities"
})
@XmlRootElement(name = "ApplyOpportunityModifiersRequest", namespace = "https://bingads.microsoft.com/Optimizer/v9")
public class ApplyOpportunityModifiersRequest {

    @XmlElement(name = "AccountId", namespace = "https://bingads.microsoft.com/Optimizer/v9")
    protected Long accountId;
    @XmlElement(name = "Action", namespace = "https://bingads.microsoft.com/Optimizer/v9")
    @XmlSchemaType(name = "string")
    protected OpportunityAction action;
    @XmlElement(name = "Opportunities", namespace = "https://bingads.microsoft.com/Optimizer/v9", nillable = true)
    protected ArrayOfOpportunityModifier opportunities;

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
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunityAction }
     *     
     */
    public OpportunityAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunityAction }
     *     
     */
    public void setAction(OpportunityAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the opportunities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOpportunityModifier }
     *     
     */
    public ArrayOfOpportunityModifier getOpportunities() {
        return opportunities;
    }

    /**
     * Sets the value of the opportunities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOpportunityModifier }
     *     
     */
    public void setOpportunities(ArrayOfOpportunityModifier value) {
        this.opportunities = value;
    }

}
