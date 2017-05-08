
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrlGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrlGoal">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v11}ConversionGoal">
 *       &lt;sequence>
 *         &lt;element name="UrlExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UrlOperator" type="{https://bingads.microsoft.com/CampaignManagement/v11}ExpressionOperator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
