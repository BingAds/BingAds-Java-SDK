
package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdExtensionEditorialReason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdExtensionEditorialReason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdExtensionEditorialReason" type="{https://bingads.microsoft.com/CampaignManagement/v9}AdExtensionEditorialReason" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdExtensionEditorialReason", propOrder = {
    "adExtensionEditorialReasons"
})
public class ArrayOfAdExtensionEditorialReason {

    @XmlElement(name = "AdExtensionEditorialReason", nillable = true)
    protected List<AdExtensionEditorialReason> adExtensionEditorialReasons;

    /**
     * Gets the value of the adExtensionEditorialReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adExtensionEditorialReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdExtensionEditorialReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdExtensionEditorialReason }
     * 
     * 
     */
    public List<AdExtensionEditorialReason> getAdExtensionEditorialReasons() {
        if (adExtensionEditorialReasons == null) {
            adExtensionEditorialReasons = new ArrayList<AdExtensionEditorialReason>();
        }
        return this.adExtensionEditorialReasons;
    }

}
