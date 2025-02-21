
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
 *         <element name="NewCustomerAcquisitionGoals" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfNewCustomerAcquisitionGoal" minOccurs="0"/>
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
    "newCustomerAcquisitionGoals"
})
@XmlRootElement(name = "UpdateNewCustomerAcquisitionGoalsRequest")
public class UpdateNewCustomerAcquisitionGoalsRequest {

    @XmlElement(name = "NewCustomerAcquisitionGoals", nillable = true)
    protected ArrayOfNewCustomerAcquisitionGoal newCustomerAcquisitionGoals;

    /**
     * Gets the value of the newCustomerAcquisitionGoals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNewCustomerAcquisitionGoal }
     *     
     */
    public ArrayOfNewCustomerAcquisitionGoal getNewCustomerAcquisitionGoals() {
        return newCustomerAcquisitionGoals;
    }

    /**
     * Sets the value of the newCustomerAcquisitionGoals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNewCustomerAcquisitionGoal }
     *     
     */
    public void setNewCustomerAcquisitionGoals(ArrayOfNewCustomerAcquisitionGoal value) {
        this.newCustomerAcquisitionGoals = value;
    }

}
