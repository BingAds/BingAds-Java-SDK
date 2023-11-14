
package com.microsoft.bingads.v13.campaignmanagement;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomEventsRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomEventsRule">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}RemarketingRule">
 *       <sequence>
 *         <element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ActionOperator" type="{https://bingads.microsoft.com/CampaignManagement/v13}StringOperator" minOccurs="0"/>
 *         <element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CategoryOperator" type="{https://bingads.microsoft.com/CampaignManagement/v13}StringOperator" minOccurs="0"/>
 *         <element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="LabelOperator" type="{https://bingads.microsoft.com/CampaignManagement/v13}StringOperator" minOccurs="0"/>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="ValueOperator" type="{https://bingads.microsoft.com/CampaignManagement/v13}NumberOperator" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomEventsRule", propOrder = {
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
    public CustomEventsRule() {
      this.type = "CustomEvents";
    }

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
