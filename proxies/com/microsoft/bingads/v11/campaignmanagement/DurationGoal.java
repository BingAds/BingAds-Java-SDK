
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DurationGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DurationGoal">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v11}ConversionGoal">
 *       &lt;sequence>
 *         &lt;element name="MinimumDurationInSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
