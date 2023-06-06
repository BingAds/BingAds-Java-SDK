
package com.microsoft.bingads.v13.campaignmanagement;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EventGoal">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoal">
 *       <sequence>
 *         <element name="ActionExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ActionOperator" type="{https://bingads.microsoft.com/CampaignManagement/v13}ExpressionOperator" minOccurs="0"/>
 *         <element name="CategoryExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CategoryOperator" type="{https://bingads.microsoft.com/CampaignManagement/v13}ExpressionOperator" minOccurs="0"/>
 *         <element name="LabelExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="LabelOperator" type="{https://bingads.microsoft.com/CampaignManagement/v13}ExpressionOperator" minOccurs="0"/>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="ValueOperator" type="{https://bingads.microsoft.com/CampaignManagement/v13}ValueOperator" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventGoal", propOrder = {
    "actionExpression",
    "actionOperator",
    "categoryExpression",
    "categoryOperator",
    "labelExpression",
    "labelOperator",
    "value",
    "valueOperator"
})
public class EventGoal
    extends ConversionGoal
{

    @XmlElement(name = "ActionExpression", nillable = true)
    protected String actionExpression;
    @XmlElement(name = "ActionOperator", nillable = true)
    @XmlSchemaType(name = "string")
    protected ExpressionOperator actionOperator;
    @XmlElement(name = "CategoryExpression", nillable = true)
    protected String categoryExpression;
    @XmlElement(name = "CategoryOperator", nillable = true)
    @XmlSchemaType(name = "string")
    protected ExpressionOperator categoryOperator;
    @XmlElement(name = "LabelExpression", nillable = true)
    protected String labelExpression;
    @XmlElement(name = "LabelOperator", nillable = true)
    @XmlSchemaType(name = "string")
    protected ExpressionOperator labelOperator;
    @XmlElement(name = "Value", nillable = true)
    protected BigDecimal value;
    @XmlElement(name = "ValueOperator", nillable = true)
    @XmlSchemaType(name = "string")
    protected ValueOperator valueOperator;

    /**
     * Gets the value of the actionExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionExpression() {
        return actionExpression;
    }

    /**
     * Sets the value of the actionExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionExpression(String value) {
        this.actionExpression = value;
    }

    /**
     * Gets the value of the actionOperator property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionOperator }
     *     
     */
    public ExpressionOperator getActionOperator() {
        return actionOperator;
    }

    /**
     * Sets the value of the actionOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionOperator }
     *     
     */
    public void setActionOperator(ExpressionOperator value) {
        this.actionOperator = value;
    }

    /**
     * Gets the value of the categoryExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryExpression() {
        return categoryExpression;
    }

    /**
     * Sets the value of the categoryExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryExpression(String value) {
        this.categoryExpression = value;
    }

    /**
     * Gets the value of the categoryOperator property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionOperator }
     *     
     */
    public ExpressionOperator getCategoryOperator() {
        return categoryOperator;
    }

    /**
     * Sets the value of the categoryOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionOperator }
     *     
     */
    public void setCategoryOperator(ExpressionOperator value) {
        this.categoryOperator = value;
    }

    /**
     * Gets the value of the labelExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelExpression() {
        return labelExpression;
    }

    /**
     * Sets the value of the labelExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelExpression(String value) {
        this.labelExpression = value;
    }

    /**
     * Gets the value of the labelOperator property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionOperator }
     *     
     */
    public ExpressionOperator getLabelOperator() {
        return labelOperator;
    }

    /**
     * Sets the value of the labelOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionOperator }
     *     
     */
    public void setLabelOperator(ExpressionOperator value) {
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
     *     {@link ValueOperator }
     *     
     */
    public ValueOperator getValueOperator() {
        return valueOperator;
    }

    /**
     * Sets the value of the valueOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueOperator }
     *     
     */
    public void setValueOperator(ValueOperator value) {
        this.valueOperator = value;
    }

}
