
package com.microsoft.bingads.v10.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdExtensionAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdExtensionAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdExtensionAssociation" type="{https://bingads.microsoft.com/CampaignManagement/v10}AdExtensionAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdExtensionAssociation", propOrder = {
    "adExtensionAssociations"
})
public class ArrayOfAdExtensionAssociation {

    @XmlElement(name = "AdExtensionAssociation", nillable = true)
    protected List<AdExtensionAssociation> adExtensionAssociations;

    /**
     * Gets the value of the adExtensionAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adExtensionAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdExtensionAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdExtensionAssociation }
     * 
     * 
     */
    public List<AdExtensionAssociation> getAdExtensionAssociations() {
        if (adExtensionAssociations == null) {
            adExtensionAssociations = new ArrayList<AdExtensionAssociation>();
        }
        return this.adExtensionAssociations;
    }

}
