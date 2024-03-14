
package com.microsoft.bingads.v13.campaignmanagement;
import java.util.Collections;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomerList">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Audience">
 *       <sequence>
 *         <element name="ActionType" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomerListActionType" minOccurs="0"/>
 *         <element name="CustomerListItems" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfCustomerListItem" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerList", propOrder = {
    "actionType",
    "customerListItems"
})
public class CustomerList
    extends Audience
{
    public CustomerList() {
      this.type = Collections.singletonList(AudienceType.fromValue("CustomerList"));
    }

    @XmlElement(name = "ActionType", nillable = true)
    @XmlSchemaType(name = "string")
    protected CustomerListActionType actionType;
    @XmlElement(name = "CustomerListItems", nillable = true)
    protected ArrayOfCustomerListItem customerListItems;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerListActionType }
     *     
     */
    public CustomerListActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerListActionType }
     *     
     */
    public void setActionType(CustomerListActionType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the customerListItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomerListItem }
     *     
     */
    public ArrayOfCustomerListItem getCustomerListItems() {
        return customerListItems;
    }

    /**
     * Sets the value of the customerListItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomerListItem }
     *     
     */
    public void setCustomerListItems(ArrayOfCustomerListItem value) {
        this.customerListItems = value;
    }

}
