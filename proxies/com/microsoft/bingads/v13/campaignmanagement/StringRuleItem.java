
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StringRuleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StringRuleItem">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}RuleItem">
 *       <sequence>
 *         <element name="Operand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Operator" type="{https://bingads.microsoft.com/CampaignManagement/v13}StringOperator" minOccurs="0"/>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringRuleItem", propOrder = {
    "operand",
    "operator",
    "value"
})
public class StringRuleItem
    extends RuleItem
{
    public StringRuleItem() {
      this.type = "String";
    }

    @XmlElement(name = "Operand", nillable = true)
    protected String operand;
    @XmlElement(name = "Operator")
    @XmlSchemaType(name = "string")
    protected StringOperator operator;
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
     *     {@link StringOperator }
     *     
     */
    public StringOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringOperator }
     *     
     */
    public void setOperator(StringOperator value) {
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
