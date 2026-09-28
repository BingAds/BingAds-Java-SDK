
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReachOptimizationGoalSetting complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>{@code
 * <complexType name="ReachOptimizationGoalSetting">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       <sequence>
 *         <element name="OptimizationGoal" type="{https://bingads.microsoft.com/CampaignManagement/v13}ReachOptimizationGoal" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReachOptimizationGoalSetting", propOrder = {
    "optimizationGoal"
})
public class ReachOptimizationGoalSetting
    extends Setting
{
    public ReachOptimizationGoalSetting() {
        this.type = "ReachOptimizationGoalSetting";
    }

    @XmlElement(name = "OptimizationGoal", nillable = true)
    @XmlSchemaType(name = "string")
    protected ReachOptimizationGoal optimizationGoal;

    /**
     * Gets the value of the optimizationGoal property.
     *
     * @return
     *     possible object is
     *     {@link ReachOptimizationGoal }
     *
     */
    public ReachOptimizationGoal getOptimizationGoal() {
        return optimizationGoal;
    }

    /**
     * Sets the value of the optimizationGoal property.
     *
     * @param value
     *     allowed object is
     *     {@link ReachOptimizationGoal }
     *
     */
    public void setOptimizationGoal(ReachOptimizationGoal value) {
        this.optimizationGoal = value;
    }

}
