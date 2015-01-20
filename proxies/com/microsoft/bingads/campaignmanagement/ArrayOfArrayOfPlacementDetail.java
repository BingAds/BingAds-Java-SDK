
package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArrayOfPlacementDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfPlacementDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrayOfPlacementDetail" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfPlacementDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfPlacementDetail", propOrder = {
    "arrayOfPlacementDetails"
})
public class ArrayOfArrayOfPlacementDetail {

    @XmlElement(name = "ArrayOfPlacementDetail", nillable = true)
    protected List<ArrayOfPlacementDetail> arrayOfPlacementDetails;

    /**
     * Gets the value of the arrayOfPlacementDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfPlacementDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfPlacementDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfPlacementDetail }
     * 
     * 
     */
    public List<ArrayOfPlacementDetail> getArrayOfPlacementDetails() {
        if (arrayOfPlacementDetails == null) {
            arrayOfPlacementDetails = new ArrayList<ArrayOfPlacementDetail>();
        }
        return this.arrayOfPlacementDetails;
    }

}
