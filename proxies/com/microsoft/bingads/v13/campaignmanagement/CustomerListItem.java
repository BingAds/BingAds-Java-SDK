
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomerListItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CustomerListItemSubType" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomerListItemSubType" minOccurs="0"/>
 *         <element name="ItemValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerListItem", propOrder = {
    "customerListItemSubType",
    "itemValue"
})
public class CustomerListItem {

    @XmlElement(name = "CustomerListItemSubType")
    @XmlSchemaType(name = "string")
    protected CustomerListItemSubType customerListItemSubType;
    @XmlElement(name = "ItemValue", nillable = true)
    protected String itemValue;

    /**
     * Gets the value of the customerListItemSubType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerListItemSubType }
     *     
     */
    public CustomerListItemSubType getCustomerListItemSubType() {
        return customerListItemSubType;
    }

    /**
     * Sets the value of the customerListItemSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerListItemSubType }
     *     
     */
    public void setCustomerListItemSubType(CustomerListItemSubType value) {
        this.customerListItemSubType = value;
    }

    /**
     * Gets the value of the itemValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemValue() {
        return itemValue;
    }

    /**
     * Sets the value of the itemValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemValue(String value) {
        this.itemValue = value;
    }

}
