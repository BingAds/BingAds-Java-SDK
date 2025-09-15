
package com.microsoft.bingads.v13.adinsight;

import java.math.BigDecimal;
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
 *         <element name="EstAudienceSize" type="{https://bingads.microsoft.com/AdInsight/v13}DecimalRoundedResult" minOccurs="0"/>
 *         <element name="EstImpression" type="{https://bingads.microsoft.com/AdInsight/v13}DecimalRoundedResult" minOccurs="0"/>
 *         <element name="IsImpressionTooSpecific" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsPrivacyCheckPassed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="SuggestedBid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="Currency" type="{https://bingads.microsoft.com/AdInsight/v13}Currency" minOccurs="0"/>
 *         <element name="Breakdowns" type="{https://bingads.microsoft.com/AdInsight/v13}Breakdowns" minOccurs="0"/>
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
    "estAudienceSize",
    "estImpression",
    "isImpressionTooSpecific",
    "isPrivacyCheckPassed",
    "suggestedBid",
    "currency",
    "breakdowns"
})
@XmlRootElement(name = "GetAudienceBreakdownResponse")
public class GetAudienceBreakdownResponse {

    @XmlElement(name = "EstAudienceSize", nillable = true)
    protected DecimalRoundedResult estAudienceSize;
    @XmlElement(name = "EstImpression", nillable = true)
    protected DecimalRoundedResult estImpression;
    @XmlElement(name = "IsImpressionTooSpecific", nillable = true)
    protected Boolean isImpressionTooSpecific;
    @XmlElement(name = "IsPrivacyCheckPassed", nillable = true)
    protected Boolean isPrivacyCheckPassed;
    @XmlElement(name = "SuggestedBid", nillable = true)
    protected BigDecimal suggestedBid;
    @XmlElement(name = "Currency", nillable = true)
    @XmlSchemaType(name = "string")
    protected Currency currency;
    @XmlElement(name = "Breakdowns", nillable = true)
    protected Breakdowns breakdowns;

    /**
     * Gets the value of the estAudienceSize property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalRoundedResult }
     *     
     */
    public DecimalRoundedResult getEstAudienceSize() {
        return estAudienceSize;
    }

    /**
     * Sets the value of the estAudienceSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalRoundedResult }
     *     
     */
    public void setEstAudienceSize(DecimalRoundedResult value) {
        this.estAudienceSize = value;
    }

    /**
     * Gets the value of the estImpression property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalRoundedResult }
     *     
     */
    public DecimalRoundedResult getEstImpression() {
        return estImpression;
    }

    /**
     * Sets the value of the estImpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalRoundedResult }
     *     
     */
    public void setEstImpression(DecimalRoundedResult value) {
        this.estImpression = value;
    }

    /**
     * Gets the value of the isImpressionTooSpecific property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsImpressionTooSpecific() {
        return isImpressionTooSpecific;
    }

    /**
     * Sets the value of the isImpressionTooSpecific property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsImpressionTooSpecific(Boolean value) {
        this.isImpressionTooSpecific = value;
    }

    /**
     * Gets the value of the isPrivacyCheckPassed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsPrivacyCheckPassed() {
        return isPrivacyCheckPassed;
    }

    /**
     * Sets the value of the isPrivacyCheckPassed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrivacyCheckPassed(Boolean value) {
        this.isPrivacyCheckPassed = value;
    }

    /**
     * Gets the value of the suggestedBid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuggestedBid() {
        return suggestedBid;
    }

    /**
     * Sets the value of the suggestedBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuggestedBid(BigDecimal value) {
        this.suggestedBid = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the breakdowns property.
     * 
     * @return
     *     possible object is
     *     {@link Breakdowns }
     *     
     */
    public Breakdowns getBreakdowns() {
        return breakdowns;
    }

    /**
     * Sets the value of the breakdowns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Breakdowns }
     *     
     */
    public void setBreakdowns(Breakdowns value) {
        this.breakdowns = value;
    }

}
