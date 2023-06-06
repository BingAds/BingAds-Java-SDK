
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="ListItems" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfSharedListItem" minOccurs="0"/>
 *         &lt;element name="SharedList" type="{https://bingads.microsoft.com/CampaignManagement/v13}SharedList" minOccurs="0"/>
 *         &lt;element name="SharedEntityScope" type="{https://bingads.microsoft.com/CampaignManagement/v13}EntityScope" minOccurs="0"/>
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
    "listItems",
    "sharedList",
    "sharedEntityScope"
})
@XmlRootElement(name = "AddListItemsToSharedListRequest")
public class AddListItemsToSharedListRequest {

    @XmlElement(name = "ListItems", nillable = true)
    protected ArrayOfSharedListItem listItems;
    @XmlElement(name = "SharedList", nillable = true)
    protected SharedList sharedList;
    @XmlElement(name = "SharedEntityScope", nillable = true)
    @XmlSchemaType(name = "string")
    protected EntityScope sharedEntityScope;

    /**
     * Gets the value of the listItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSharedListItem }
     *     
     */
    public ArrayOfSharedListItem getListItems() {
        return listItems;
    }

    /**
     * Sets the value of the listItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSharedListItem }
     *     
     */
    public void setListItems(ArrayOfSharedListItem value) {
        this.listItems = value;
    }

    /**
     * Gets the value of the sharedList property.
     * 
     * @return
     *     possible object is
     *     {@link SharedList }
     *     
     */
    public SharedList getSharedList() {
        return sharedList;
    }

    /**
     * Sets the value of the sharedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedList }
     *     
     */
    public void setSharedList(SharedList value) {
        this.sharedList = value;
    }

    /**
     * Gets the value of the sharedEntityScope property.
     * 
     * @return
     *     possible object is
     *     {@link EntityScope }
     *     
     */
    public EntityScope getSharedEntityScope() {
        return sharedEntityScope;
    }

    /**
     * Sets the value of the sharedEntityScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityScope }
     *     
     */
    public void setSharedEntityScope(EntityScope value) {
        this.sharedEntityScope = value;
    }

}
