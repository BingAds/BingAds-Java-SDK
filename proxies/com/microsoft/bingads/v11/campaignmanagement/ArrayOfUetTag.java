
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUetTag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUetTag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UetTag" type="{https://bingads.microsoft.com/CampaignManagement/v11}UetTag" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUetTag", propOrder = {
    "uetTags"
})
public class ArrayOfUetTag {

    @XmlElement(name = "UetTag", nillable = true)
    protected List<UetTag> uetTags;

    /**
     * Gets the value of the uetTags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uetTags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUetTags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UetTag }
     * 
     * 
     */
    public List<UetTag> getUetTags() {
        if (uetTags == null) {
            uetTags = new ArrayList<UetTag>();
        }
        return this.uetTags;
    }

}
