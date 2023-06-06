
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationIntentCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LocationIntentCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="IntentOption" type="{https://bingads.microsoft.com/CampaignManagement/v13}IntentOption" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
