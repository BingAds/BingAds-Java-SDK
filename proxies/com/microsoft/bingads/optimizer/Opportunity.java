
package com.microsoft.bingads.optimizer;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Opportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Opportunity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OpportunityKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opportunity", propOrder = {
    "expirationDate",
    "opportunityKey"
})
@XmlSeeAlso({
    BidOpportunity.class,
    BroadMatchOpportunity.class,
    BudgetOpportunity.class,
    KeywordOpportunity.class,
    CampaignBudgetLandscape.class
})
public class Opportunity {

    @XmlElement(name = "ExpirationDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar expirationDate;
    @XmlElement(name = "OpportunityKey", nillable = true)
    protected String opportunityKey;

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(Calendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the opportunityKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityKey() {
        return opportunityKey;
    }

    /**
     * Sets the value of the opportunityKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityKey(String value) {
        this.opportunityKey = value;
    }

}
