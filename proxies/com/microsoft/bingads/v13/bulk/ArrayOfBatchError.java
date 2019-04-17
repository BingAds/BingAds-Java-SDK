
package com.microsoft.bingads.v13.bulk;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBatchError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBatchError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BatchError" type="{https://bingads.microsoft.com/CampaignManagement/v13}BatchError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBatchError", propOrder = {
    "batchErrors"
})
public class ArrayOfBatchError {

    @XmlElement(name = "BatchError", nillable = true)
    protected List<BatchError> batchErrors;

    /**
     * Gets the value of the batchErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchError }
     * 
     * 
     */
    public List<BatchError> getBatchErrors() {
        if (batchErrors == null) {
            batchErrors = new ArrayList<BatchError>();
        }
        return this.batchErrors;
    }

}
