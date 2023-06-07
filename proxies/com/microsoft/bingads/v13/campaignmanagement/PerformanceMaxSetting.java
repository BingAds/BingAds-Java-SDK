
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerformanceMaxSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PerformanceMaxSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="FinalUrlExpansionOptOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceMaxSetting", propOrder = {
    "finalUrlExpansionOptOut"
})
public class PerformanceMaxSetting
    extends Setting
{

    @XmlElement(name = "FinalUrlExpansionOptOut")
    protected Boolean finalUrlExpansionOptOut;

    /**
     * Gets the value of the finalUrlExpansionOptOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFinalUrlExpansionOptOut() {
        return finalUrlExpansionOptOut;
    }

    /**
     * Sets the value of the finalUrlExpansionOptOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalUrlExpansionOptOut(Boolean value) {
        this.finalUrlExpansionOptOut = value;
    }

}
