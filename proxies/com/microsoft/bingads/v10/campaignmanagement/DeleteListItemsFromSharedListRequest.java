
package com.microsoft.bingads.v10.campaignmanagement;

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
 *         &lt;element name="ListItemIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="SharedList" type="{https://bingads.microsoft.com/CampaignManagement/v10}SharedList" minOccurs="0"/>
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
    "listItemIds",
    "sharedList"
})
@XmlRootElement(name = "DeleteListItemsFromSharedListRequest")
public class DeleteListItemsFromSharedListRequest {

    @XmlElement(name = "ListItemIds", nillable = true)
    protected ArrayOflong listItemIds;
    @XmlElement(name = "SharedList", nillable = true)
    protected SharedList sharedList;

    /**
     * Gets the value of the listItemIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getListItemIds() {
        return listItemIds;
    }

    /**
     * Sets the value of the listItemIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setListItemIds(ArrayOflong value) {
        this.listItemIds = value;
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

}
