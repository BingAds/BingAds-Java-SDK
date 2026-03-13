
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerListUserData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomerListUserData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcceptCustomerMatchTerm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ActionType" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomerListActionType"/>
 *         <element name="AudienceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="CustomerListItemSubType" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomerListItemSubType"/>
 *         <element name="CustomerListItems" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerListUserData", propOrder = {
    "acceptCustomerMatchTerm",
    "actionType",
    "audienceId",
    "customerListItemSubType",
    "customerListItems"
})
public class CustomerListUserData {

    @XmlElement(name = "AcceptCustomerMatchTerm", nillable = true)
    protected Boolean acceptCustomerMatchTerm;
    @XmlElement(name = "ActionType", required = true)
    @XmlSchemaType(name = "string")
    protected CustomerListActionType actionType;
    @XmlElement(name = "AudienceId")
    protected long audienceId;
    @XmlElement(name = "CustomerListItemSubType", required = true)
    @XmlSchemaType(name = "string")
    protected CustomerListItemSubType customerListItemSubType;
    @XmlElement(name = "CustomerListItems", required = true, nillable = true)
    protected ArrayOfstring customerListItems;

    /**
     * Gets the value of the acceptCustomerMatchTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAcceptCustomerMatchTerm() {
        return acceptCustomerMatchTerm;
    }

    /**
     * Sets the value of the acceptCustomerMatchTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptCustomerMatchTerm(Boolean value) {
        this.acceptCustomerMatchTerm = value;
    }

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
     * Gets the value of the audienceId property.
     * 
     */
    public long getAudienceId() {
        return audienceId;
    }

    /**
     * Sets the value of the audienceId property.
     * 
     */
    public void setAudienceId(long value) {
        this.audienceId = value;
    }

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
     * Gets the value of the customerListItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getCustomerListItems() {
        return customerListItems;
    }

    /**
     * Sets the value of the customerListItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setCustomerListItems(ArrayOfstring value) {
        this.customerListItems = value;
    }

}
