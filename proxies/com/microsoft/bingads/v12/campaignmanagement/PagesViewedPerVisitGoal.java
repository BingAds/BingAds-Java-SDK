
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagesViewedPerVisitGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PagesViewedPerVisitGoal">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v12}ConversionGoal">
 *       &lt;sequence>
 *         &lt;element name="MinimumPagesViewed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagesViewedPerVisitGoal", propOrder = {
    "minimumPagesViewed"
})
public class PagesViewedPerVisitGoal
    extends ConversionGoal
{

    @XmlElement(name = "MinimumPagesViewed", nillable = true)
    protected Integer minimumPagesViewed;

    /**
     * Gets the value of the minimumPagesViewed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumPagesViewed() {
        return minimumPagesViewed;
    }

    /**
     * Sets the value of the minimumPagesViewed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumPagesViewed(Integer value) {
        this.minimumPagesViewed = value;
    }

}
