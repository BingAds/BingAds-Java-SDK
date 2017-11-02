
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConversionGoals" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfConversionGoal" minOccurs="0"/>
 *         &lt;element name="PartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfBatchError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conversionGoals",
    "partialErrors"
})
@XmlRootElement(name = "GetConversionGoalsByIdsResponse")
public class GetConversionGoalsByIdsResponse {

    @XmlElement(name = "ConversionGoals", nillable = true)
    protected ArrayOfConversionGoal conversionGoals;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

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

    /**
     * Gets the value of the partialErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public ArrayOfBatchError getPartialErrors() {
        return partialErrors;
    }

    /**
     * Sets the value of the partialErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public void setPartialErrors(ArrayOfBatchError value) {
        this.partialErrors = value;
    }

}
