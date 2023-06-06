
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebpageCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="WebpageCondition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Argument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Operand" type="{https://bingads.microsoft.com/CampaignManagement/v13}WebpageConditionOperand" minOccurs="0"/>
 *         <element name="Operator" type="{https://bingads.microsoft.com/CampaignManagement/v13}WebpageConditionOperator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebpageCondition", propOrder = {
    "argument",
    "operand",
    "operator"
})
public class WebpageCondition {

    @XmlElement(name = "Argument", nillable = true)
    protected String argument;
    @XmlElement(name = "Operand")
    @XmlSchemaType(name = "string")
    protected WebpageConditionOperand operand;
    @XmlElement(name = "Operator", nillable = true)
    @XmlSchemaType(name = "string")
    protected WebpageConditionOperator operator;

    /**
     * Gets the value of the argument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgument() {
        return argument;
    }

    /**
     * Sets the value of the argument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgument(String value) {
        this.argument = value;
    }

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link WebpageConditionOperand }
     *     
     */
    public WebpageConditionOperand getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebpageConditionOperand }
     *     
     */
    public void setOperand(WebpageConditionOperand value) {
        this.operand = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link WebpageConditionOperator }
     *     
     */
    public WebpageConditionOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebpageConditionOperator }
     *     
     */
    public void setOperator(WebpageConditionOperator value) {
        this.operator = value;
    }

}
