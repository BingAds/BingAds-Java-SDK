
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberRuleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberRuleItem">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}RuleItem">
 *       &lt;sequence>
 *         &lt;element name="Operand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Operator" type="{https://bingads.microsoft.com/CampaignManagement/v13}NumberOperator" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberRuleItem", propOrder = {
    "operand",
    "operator",
    "value"
})
public class NumberRuleItem
    extends RuleItem
{

    @XmlElement(name = "Operand", nillable = true)
    protected String operand;
    @XmlElement(name = "Operator")
    @XmlSchemaType(name = "string")
    protected NumberOperator operator;
    @XmlElement(name = "Value", nillable = true)
    protected String value;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperand(String value) {
        this.operand = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOperator }
     *     
     */
    public NumberOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOperator }
     *     
     */
    public void setOperator(NumberOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
