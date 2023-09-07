
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallToActionSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CallToActionSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="AutomatedCallToActionOptOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallToActionSetting", propOrder = {
    "automatedCallToActionOptOut"
})
public class CallToActionSetting
    extends Setting
{

    @XmlElement(name = "AutomatedCallToActionOptOut", nillable = true)
    protected Boolean automatedCallToActionOptOut;

    /**
     * Gets the value of the automatedCallToActionOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutomatedCallToActionOptOut() {
        return automatedCallToActionOptOut;
    }

    /**
     * Sets the value of the automatedCallToActionOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomatedCallToActionOptOut(Boolean value) {
        this.automatedCallToActionOptOut = value;
    }

}
