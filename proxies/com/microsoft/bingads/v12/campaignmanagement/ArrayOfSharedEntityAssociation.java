
package com.microsoft.bingads.v12.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSharedEntityAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSharedEntityAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SharedEntityAssociation" type="{https://bingads.microsoft.com/CampaignManagement/v12}SharedEntityAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSharedEntityAssociation", propOrder = {
    "sharedEntityAssociations"
})
public class ArrayOfSharedEntityAssociation {

    @XmlElement(name = "SharedEntityAssociation", nillable = true)
    protected List<SharedEntityAssociation> sharedEntityAssociations;

    /**
     * Gets the value of the sharedEntityAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedEntityAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedEntityAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SharedEntityAssociation }
     * 
     * 
     */
    public List<SharedEntityAssociation> getSharedEntityAssociations() {
        if (sharedEntityAssociations == null) {
            sharedEntityAssociations = new ArrayList<SharedEntityAssociation>();
        }
        return this.sharedEntityAssociations;
    }

}
