
package com.microsoft.bingads.v11.campaignmanagement;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomEventsRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomEventsRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11}RemarketingRule">
 *       &lt;sequence>
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActionOperator" type="{https://bingads.microsoft.com/CampaignManagement/v11}StringOperator" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryOperator" type="{https://bingads.microsoft.com/CampaignManagement/v11}StringOperator" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LabelOperator" type="{https://bingads.microsoft.com/CampaignManagement/v11}StringOperator" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ValueOperator" type="{https://bingads.microsoft.com/CampaignManagement/v11}NumberOperator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomEventsRule", namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11", propOrder = {
    "action",
    "actionOperator",
    "category",
    "categoryOperator",
    "label",
    "labelOperator",
    "value",
    "valueOperator"
})
public class CustomEventsRule
    extends RemarketingRule
{

    @XmlElement(name = "Action", nillable = true)
    protected String action;
    @XmlElement(name = "ActionOperator")
    @XmlSchemaType(name = "string")
    protected StringOperator actionOperator;
    @XmlElement(name = "Category", nillable = true)
    protected String category;
    @XmlElement(name = "CategoryOperator")
    @XmlSchemaType(name = "string")
    protected StringOperator categoryOperator;
    @XmlElement(name = "Label", nillable = true)
    protected String label;
    @XmlElement(name = "LabelOperator")
    @XmlSchemaType(name = "string")
    protected StringOperator labelOperator;
    @XmlElement(name = "Value", nillable = true)
    protected BigDecimal value;
    @XmlElement(name = "ValueOperator")
    @XmlSchemaType(name = "string")
    protected NumberOperator valueOperator;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the actionOperator property.
     * 
     * @return
     *     possible object is
     *     {@link StringOperator }
     *     
     */
    public StringOperator getActionOperator() {
        return actionOperator;
    }

    /**
     * Sets the value of the actionOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOperator }
     *     
     */
    public void setActionOperator(StringOperator value) {
        this.actionOperator = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the categoryOperator property.
     * 
     * @return
     *     possible object is
     *     {@link StringOperator }
     *     
     */
    public StringOperator getCategoryOperator() {
        return categoryOperator;
    }

    /**
     * Sets the value of the categoryOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOperator }
     *     
     */
    public void setCategoryOperator(StringOperator value) {
        this.categoryOperator = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the labelOperator property.
     * 
     * @return
     *     possible object is
     *     {@link StringOperator }
     *     
     */
    public StringOperator getLabelOperator() {
        return labelOperator;
    }

    /**
     * Sets the value of the labelOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOperator }
     *     
     */
    public void setLabelOperator(StringOperator value) {
        this.labelOperator = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueOperator property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOperator }
     *     
     */
    public NumberOperator getValueOperator() {
        return valueOperator;
    }

    /**
     * Sets the value of the valueOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOperator }
     *     
     */
    public void setValueOperator(NumberOperator value) {
        this.valueOperator = value;
    }

}
