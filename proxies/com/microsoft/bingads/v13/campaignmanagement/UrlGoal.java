
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrlGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UrlGoal">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoal">
 *       <sequence>
 *         <element name="UrlExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UrlOperator" type="{https://bingads.microsoft.com/CampaignManagement/v13}ExpressionOperator" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrlGoal", propOrder = {
    "urlExpression",
    "urlOperator"
})
public class UrlGoal
    extends ConversionGoal
{

    @XmlElement(name = "UrlExpression", nillable = true)
    protected String urlExpression;
    @XmlElement(name = "UrlOperator", nillable = true)
    @XmlSchemaType(name = "string")
    protected ExpressionOperator urlOperator;

    /**
     * Gets the value of the urlExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlExpression() {
        return urlExpression;
    }

    /**
     * Sets the value of the urlExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlExpression(String value) {
        this.urlExpression = value;
    }

    /**
     * Gets the value of the urlOperator property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionOperator }
     *     
     */
    public ExpressionOperator getUrlOperator() {
        return urlOperator;
    }

    /**
     * Sets the value of the urlOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionOperator }
     *     
     */
    public void setUrlOperator(ExpressionOperator value) {
        this.urlOperator = value;
    }

}
