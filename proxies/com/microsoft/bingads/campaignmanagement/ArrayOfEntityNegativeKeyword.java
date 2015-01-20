
package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEntityNegativeKeyword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEntityNegativeKeyword">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityNegativeKeyword" type="{https://bingads.microsoft.com/CampaignManagement/v9}EntityNegativeKeyword" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEntityNegativeKeyword", propOrder = {
    "entityNegativeKeywords"
})
public class ArrayOfEntityNegativeKeyword {

    @XmlElement(name = "EntityNegativeKeyword", nillable = true)
    protected List<EntityNegativeKeyword> entityNegativeKeywords;

    /**
     * Gets the value of the entityNegativeKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityNegativeKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityNegativeKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityNegativeKeyword }
     * 
     * 
     */
    public List<EntityNegativeKeyword> getEntityNegativeKeywords() {
        if (entityNegativeKeywords == null) {
            entityNegativeKeywords = new ArrayList<EntityNegativeKeyword>();
        }
        return this.entityNegativeKeywords;
    }

}
