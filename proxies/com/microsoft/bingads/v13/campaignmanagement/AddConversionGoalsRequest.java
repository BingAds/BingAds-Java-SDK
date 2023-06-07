
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ConversionGoals" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfConversionGoal" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conversionGoals"
})
@XmlRootElement(name = "AddConversionGoalsRequest")
public class AddConversionGoalsRequest {

    @XmlElement(name = "ConversionGoals", nillable = true)
    protected ArrayOfConversionGoal conversionGoals;

    /**
     * Gets the value of the conversionGoals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConversionGoal }
     *     
     */
    public ArrayOfConversionGoal getConversionGoals() {
        return conversionGoals;
    }

    /**
     * Sets the value of the conversionGoals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConversionGoal }
     *     
     */
    public void setConversionGoals(ArrayOfConversionGoal value) {
        this.conversionGoals = value;
    }

}
