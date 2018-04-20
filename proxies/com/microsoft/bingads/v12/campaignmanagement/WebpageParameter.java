
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebpageParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebpageParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Conditions" type="{https://bingads.microsoft.com/CampaignManagement/v12}ArrayOfWebpageCondition" minOccurs="0"/>
 *         &lt;element name="CriterionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebpageParameter", propOrder = {
    "conditions",
    "criterionName"
})
public class WebpageParameter {

    @XmlElement(name = "Conditions", nillable = true)
    protected ArrayOfWebpageCondition conditions;
    @XmlElement(name = "CriterionName", nillable = true)
    protected String criterionName;

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWebpageCondition }
     *     
     */
    public ArrayOfWebpageCondition getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWebpageCondition }
     *     
     */
    public void setConditions(ArrayOfWebpageCondition value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the criterionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriterionName() {
        return criterionName;
    }

    /**
     * Sets the value of the criterionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterionName(String value) {
        this.criterionName = value;
    }

}
