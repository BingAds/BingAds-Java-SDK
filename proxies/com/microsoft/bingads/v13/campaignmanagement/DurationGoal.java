
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DurationGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DurationGoal">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoal">
 *       <sequence>
 *         <element name="MinimumDurationInSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DurationGoal", propOrder = {
    "minimumDurationInSeconds"
})
public class DurationGoal
    extends ConversionGoal
{

    @XmlElement(name = "MinimumDurationInSeconds", nillable = true)
    protected Integer minimumDurationInSeconds;

    /**
     * Gets the value of the minimumDurationInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumDurationInSeconds() {
        return minimumDurationInSeconds;
    }

    /**
     * Sets the value of the minimumDurationInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumDurationInSeconds(Integer value) {
        this.minimumDurationInSeconds = value;
    }

}
