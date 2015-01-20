
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v9}Criterion">
 *       &lt;sequence>
 *         &lt;element name="Conditions" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfProductCondition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "conditions"
})
public class Product
    extends Criterion
{

    @XmlElement(name = "Conditions", nillable = true)
    protected ArrayOfProductCondition conditions;

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductCondition }
     *     
     */
    public ArrayOfProductCondition getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductCondition }
     *     
     */
    public void setConditions(ArrayOfProductCondition value) {
        this.conditions = value;
    }

}
