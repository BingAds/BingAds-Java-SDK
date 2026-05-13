
package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfBillingGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfBillingGroup">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BillingGroup" type="{https://bingads.microsoft.com/Customer/v13/Entities}BillingGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBillingGroup", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "billingGroups"
})
public class ArrayOfBillingGroup {

    @XmlElement(name = "BillingGroup", nillable = true)
    protected List<BillingGroup> billingGroups;
    public ArrayOfBillingGroup()
    {
      this.billingGroups = new ArrayList<BillingGroup>();
    }
    @JsonCreator
    public ArrayOfBillingGroup(List<BillingGroup> billinggroups)
    {
      this.billingGroups = billinggroups;
    }

    /**
     * Gets the value of the billingGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the billingGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingGroup }
     * 
     * 
     * @return
     *     The value of the billingGroups property.
     */
    public List<BillingGroup> getBillingGroups() {
        if (billingGroups == null) {
            billingGroups = new ArrayList<>();
        }
        return this.billingGroups;
    }

}
