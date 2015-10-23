
package com.microsoft.bingads.v10.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdExtensionEditorialReasonCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdExtensionEditorialReasonCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdExtensionEditorialReasonCollection" type="{https://bingads.microsoft.com/CampaignManagement/v10}AdExtensionEditorialReasonCollection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdExtensionEditorialReasonCollection", propOrder = {
    "adExtensionEditorialReasonCollections"
})
public class ArrayOfAdExtensionEditorialReasonCollection {

    @XmlElement(name = "AdExtensionEditorialReasonCollection", nillable = true)
    protected List<AdExtensionEditorialReasonCollection> adExtensionEditorialReasonCollections;

    /**
     * Gets the value of the adExtensionEditorialReasonCollections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adExtensionEditorialReasonCollections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdExtensionEditorialReasonCollections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdExtensionEditorialReasonCollection }
     * 
     * 
     */
    public List<AdExtensionEditorialReasonCollection> getAdExtensionEditorialReasonCollections() {
        if (adExtensionEditorialReasonCollections == null) {
            adExtensionEditorialReasonCollections = new ArrayList<AdExtensionEditorialReasonCollection>();
        }
        return this.adExtensionEditorialReasonCollections;
    }

}
