
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfIdCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfIdCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdCollection" type="{https://bingads.microsoft.com/CampaignManagement/v13}IdCollection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIdCollection", propOrder = {
    "idCollections"
})
public class ArrayOfIdCollection {

    @XmlElement(name = "IdCollection", nillable = true)
    protected List<IdCollection> idCollections;

    /**
     * Gets the value of the idCollections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idCollections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdCollections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdCollection }
     * 
     * 
     */
    public List<IdCollection> getIdCollections() {
        if (idCollections == null) {
            idCollections = new ArrayList<IdCollection>();
        }
        return this.idCollections;
    }

}
