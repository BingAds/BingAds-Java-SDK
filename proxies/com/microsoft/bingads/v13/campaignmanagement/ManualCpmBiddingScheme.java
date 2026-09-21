
package com.microsoft.bingads.v13.campaignmanagement;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManualCpmBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ManualCpmBiddingScheme">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}BiddingScheme">
 *       <sequence>
 *         <element name="MaxCpm" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualCpmBiddingScheme", propOrder = {
    "maxCpm"
})
public class ManualCpmBiddingScheme
    extends BiddingScheme
{
    public ManualCpmBiddingScheme() {
      this.type = "ManualCpm";
    }

    @XmlElement(name = "MaxCpm", nillable = true)
    protected BigDecimal maxCpm;

    /**
     * Gets the value of the maxCpm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxCpm() {
        return maxCpm;
    }

    /**
     * Sets the value of the maxCpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxCpm(BigDecimal value) {
        this.maxCpm = value;
    }

}
