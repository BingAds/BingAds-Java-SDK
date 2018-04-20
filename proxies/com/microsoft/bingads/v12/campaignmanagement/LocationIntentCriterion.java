
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationIntentCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationIntentCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v12}Criterion">
 *       &lt;sequence>
 *         &lt;element name="IntentOption" type="{https://bingads.microsoft.com/CampaignManagement/v12}IntentOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationIntentCriterion", propOrder = {
    "intentOption"
})
public class LocationIntentCriterion
    extends Criterion
{

    @XmlElement(name = "IntentOption", nillable = true)
    @XmlSchemaType(name = "string")
    protected IntentOption intentOption;

    /**
     * Gets the value of the intentOption property.
     * 
     * @return
     *     possible object is
     *     {@link IntentOption }
     *     
     */
    public IntentOption getIntentOption() {
        return intentOption;
    }

    /**
     * Sets the value of the intentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntentOption }
     *     
     */
    public void setIntentOption(IntentOption value) {
        this.intentOption = value;
    }

}
