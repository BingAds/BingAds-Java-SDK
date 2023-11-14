
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfCustomerAccountShareAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCustomerAccountShareAssociation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CustomerAccountShareAssociation" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomerAccountShareAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomerAccountShareAssociation", propOrder = {
    "customerAccountShareAssociations"
})
public class ArrayOfCustomerAccountShareAssociation {

    @XmlElement(name = "CustomerAccountShareAssociation", nillable = true)
    protected List<CustomerAccountShareAssociation> customerAccountShareAssociations;
    public ArrayOfCustomerAccountShareAssociation()
    {
      this.customerAccountShareAssociations = new ArrayList<CustomerAccountShareAssociation>();
    }
    @JsonCreator
    public ArrayOfCustomerAccountShareAssociation(List<CustomerAccountShareAssociation> customeraccountshareassociations)
    {
      this.customerAccountShareAssociations = customeraccountshareassociations;
    }

    /**
     * Gets the value of the customerAccountShareAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the customerAccountShareAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerAccountShareAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAccountShareAssociation }
     * 
     * 
     * @return
     *     The value of the customerAccountShareAssociations property.
     */
    public List<CustomerAccountShareAssociation> getCustomerAccountShareAssociations() {
        if (customerAccountShareAssociations == null) {
            customerAccountShareAssociations = new ArrayList<>();
        }
        return this.customerAccountShareAssociations;
    }

}
