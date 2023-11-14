
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfCustomerAccountShare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCustomerAccountShare">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CustomerAccountShare" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomerAccountShare" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomerAccountShare", propOrder = {
    "customerAccountShares"
})
public class ArrayOfCustomerAccountShare {

    @XmlElement(name = "CustomerAccountShare", nillable = true)
    protected List<CustomerAccountShare> customerAccountShares;
    public ArrayOfCustomerAccountShare()
    {
      this.customerAccountShares = new ArrayList<CustomerAccountShare>();
    }
    @JsonCreator
    public ArrayOfCustomerAccountShare(List<CustomerAccountShare> customeraccountshares)
    {
      this.customerAccountShares = customeraccountshares;
    }

    /**
     * Gets the value of the customerAccountShares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the customerAccountShares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerAccountShares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAccountShare }
     * 
     * 
     * @return
     *     The value of the customerAccountShares property.
     */
    public List<CustomerAccountShare> getCustomerAccountShares() {
        if (customerAccountShares == null) {
            customerAccountShares = new ArrayList<>();
        }
        return this.customerAccountShares;
    }

}
