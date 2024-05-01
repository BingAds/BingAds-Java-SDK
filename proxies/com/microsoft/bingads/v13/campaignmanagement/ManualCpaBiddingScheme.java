
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManualCpaBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ManualCpaBiddingScheme">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}BiddingScheme">
 *       <sequence>
 *         <element name="ManualCpi" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualCpaBiddingScheme", propOrder = {
    "manualCpi"
})
public class ManualCpaBiddingScheme
    extends BiddingScheme
{
    public ManualCpaBiddingScheme() {
      this.type = "ManualCpaBiddingScheme";
    }

    @XmlElement(name = "ManualCpi", nillable = true)
    protected Double manualCpi;

    /**
     * Gets the value of the manualCpi property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getManualCpi() {
        return manualCpi;
    }

    /**
     * Sets the value of the manualCpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setManualCpi(Double value) {
        this.manualCpi = value;
    }

}
