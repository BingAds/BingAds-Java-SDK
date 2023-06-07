
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ListItems" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfSharedListItem" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listItems"
})
@XmlRootElement(name = "GetListItemsBySharedListResponse")
public class GetListItemsBySharedListResponse {

    @XmlElement(name = "ListItems", nillable = true)
    protected ArrayOfSharedListItem listItems;

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
