
package com.microsoft.bingads.optimizer;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CampaignBudgetLandscape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignBudgetLandscape">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}Opportunity">
 *       &lt;sequence>
 *         &lt;element name="BaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BudgetPoints" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}ArrayOfBudgetPoint" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignBudgetLandscape", propOrder = {
    "baseDate",
    "budgetPoints",
    "campaignId"
})
public class CampaignBudgetLandscape
    extends Opportunity
{

    @XmlElement(name = "BaseDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar baseDate;
    @XmlElement(name = "BudgetPoints", nillable = true)
    protected ArrayOfBudgetPoint budgetPoints;
    @XmlElement(name = "CampaignId")
    protected Long campaignId;

    /**
     * Gets the value of the baseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getBaseDate() {
        return baseDate;
    }

    /**
     * Sets the value of the baseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseDate(Calendar value) {
        this.baseDate = value;
    }

    /**
     * Gets the value of the budgetPoints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBudgetPoint }
     *     
     */
    public ArrayOfBudgetPoint getBudgetPoints() {
        return budgetPoints;
    }

    /**
     * Sets the value of the budgetPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBudgetPoint }
     *     
     */
    public void setBudgetPoints(ArrayOfBudgetPoint value) {
        this.budgetPoints = value;
    }

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignId(Long value) {
        this.campaignId = value;
    }

}
