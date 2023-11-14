
package com.microsoft.bingads.v13.campaignmanagement;
import java.util.Collections;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagesViewedPerVisitGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PagesViewedPerVisitGoal">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoal">
 *       <sequence>
 *         <element name="MinimumPagesViewed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public PagesViewedPerVisitGoal() {
      this.type = Collections.singletonList(ConversionGoalType.fromValue("PagesViewedPerVisit"));
    }

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
