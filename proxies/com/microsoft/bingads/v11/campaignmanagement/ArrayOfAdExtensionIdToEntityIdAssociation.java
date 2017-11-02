
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdExtensionIdToEntityIdAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdExtensionIdToEntityIdAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdExtensionIdToEntityIdAssociation" type="{https://bingads.microsoft.com/CampaignManagement/v11}AdExtensionIdToEntityIdAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdExtensionIdToEntityIdAssociation", propOrder = {
    "adExtensionIdToEntityIdAssociations"
})
public class ArrayOfAdExtensionIdToEntityIdAssociation {

    @XmlElement(name = "AdExtensionIdToEntityIdAssociation", nillable = true)
    protected List<AdExtensionIdToEntityIdAssociation> adExtensionIdToEntityIdAssociations;

    /**
     * Gets the value of the adExtensionIdToEntityIdAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adExtensionIdToEntityIdAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdExtensionIdToEntityIdAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdExtensionIdToEntityIdAssociation }
     * 
     * 
     */
    public List<AdExtensionIdToEntityIdAssociation> getAdExtensionIdToEntityIdAssociations() {
        if (adExtensionIdToEntityIdAssociations == null) {
            adExtensionIdToEntityIdAssociations = new ArrayList<AdExtensionIdToEntityIdAssociation>();
        }
        return this.adExtensionIdToEntityIdAssociations;
    }

}
