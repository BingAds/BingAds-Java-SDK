
package com.microsoft.bingads.v12.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSharedListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSharedListItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SharedListItem" type="{https://bingads.microsoft.com/CampaignManagement/v12}SharedListItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSharedListItem", propOrder = {
    "sharedListItems"
})
public class ArrayOfSharedListItem {

    @XmlElement(name = "SharedListItem", nillable = true)
    protected List<SharedListItem> sharedListItems;

    /**
     * Gets the value of the sharedListItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedListItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedListItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharedListItem }
     * 
     * 
     */
    public List<SharedListItem> getSharedListItems() {
        if (sharedListItems == null) {
            sharedListItems = new ArrayList<SharedListItem>();
        }
        return this.sharedListItems;
    }

}
