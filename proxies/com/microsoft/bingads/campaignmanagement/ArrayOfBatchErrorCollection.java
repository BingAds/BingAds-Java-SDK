
package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBatchErrorCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBatchErrorCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BatchErrorCollection" type="{https://bingads.microsoft.com/CampaignManagement/v9}BatchErrorCollection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBatchErrorCollection", propOrder = {
    "batchErrorCollections"
})
public class ArrayOfBatchErrorCollection {

    @XmlElement(name = "BatchErrorCollection", nillable = true)
    protected List<BatchErrorCollection> batchErrorCollections;

    /**
     * Gets the value of the batchErrorCollections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchErrorCollections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchErrorCollections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchErrorCollection }
     * 
     * 
     */
    public List<BatchErrorCollection> getBatchErrorCollections() {
        if (batchErrorCollections == null) {
            batchErrorCollections = new ArrayList<BatchErrorCollection>();
        }
        return this.batchErrorCollections;
    }

}
