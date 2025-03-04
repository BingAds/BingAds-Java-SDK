
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfNewCustomerAcquisitionGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfNewCustomerAcquisitionGoal">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NewCustomerAcquisitionGoal" type="{https://bingads.microsoft.com/CampaignManagement/v13}NewCustomerAcquisitionGoal" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNewCustomerAcquisitionGoal", propOrder = {
    "newCustomerAcquisitionGoals"
})
public class ArrayOfNewCustomerAcquisitionGoal {

    @XmlElement(name = "NewCustomerAcquisitionGoal", nillable = true)
    protected List<NewCustomerAcquisitionGoal> newCustomerAcquisitionGoals;
    public ArrayOfNewCustomerAcquisitionGoal()
    {
      this.newCustomerAcquisitionGoals = new ArrayList<NewCustomerAcquisitionGoal>();
    }
    @JsonCreator
    public ArrayOfNewCustomerAcquisitionGoal(List<NewCustomerAcquisitionGoal> newcustomeracquisitiongoals)
    {
      this.newCustomerAcquisitionGoals = newcustomeracquisitiongoals;
    }

    /**
     * Gets the value of the newCustomerAcquisitionGoals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the newCustomerAcquisitionGoals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewCustomerAcquisitionGoals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewCustomerAcquisitionGoal }
     * 
     * 
     * @return
     *     The value of the newCustomerAcquisitionGoals property.
     */
    public List<NewCustomerAcquisitionGoal> getNewCustomerAcquisitionGoals() {
        if (newCustomerAcquisitionGoals == null) {
            newCustomerAcquisitionGoals = new ArrayList<>();
        }
        return this.newCustomerAcquisitionGoals;
    }

}
