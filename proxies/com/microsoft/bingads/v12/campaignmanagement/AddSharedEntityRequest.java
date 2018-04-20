
package com.microsoft.bingads.v12.campaignmanagement;

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
 *         &lt;element name="SharedEntity" type="{https://bingads.microsoft.com/CampaignManagement/v12}SharedEntity" minOccurs="0"/>
 *         &lt;element name="ListItems" type="{https://bingads.microsoft.com/CampaignManagement/v12}ArrayOfSharedListItem" minOccurs="0"/>
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
    "sharedEntity",
    "listItems"
})
@XmlRootElement(name = "AddSharedEntityRequest")
public class AddSharedEntityRequest {

    @XmlElement(name = "SharedEntity", nillable = true)
    protected SharedEntity sharedEntity;
    @XmlElement(name = "ListItems", nillable = true)
    protected ArrayOfSharedListItem listItems;

    /**
     * Gets the value of the sharedEntity property.
     * 
     * @return
     *     possible object is
     *     {@link SharedEntity }
     *     
     */
    public SharedEntity getSharedEntity() {
        return sharedEntity;
    }

    /**
     * Sets the value of the sharedEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedEntity }
     *     
     */
    public void setSharedEntity(SharedEntity value) {
        this.sharedEntity = value;
    }

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

}
