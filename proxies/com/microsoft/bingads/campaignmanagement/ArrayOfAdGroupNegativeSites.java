
package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdGroupNegativeSites complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdGroupNegativeSites">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdGroupNegativeSites" type="{https://bingads.microsoft.com/CampaignManagement/v9}AdGroupNegativeSites" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdGroupNegativeSites", propOrder = {
    "adGroupNegativeSites"
})
public class ArrayOfAdGroupNegativeSites {

    @XmlElement(name = "AdGroupNegativeSites", nillable = true)
    protected List<AdGroupNegativeSites> adGroupNegativeSites;

    /**
     * Gets the value of the adGroupNegativeSites property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adGroupNegativeSites property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdGroupNegativeSites().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupNegativeSites }
     * 
     * 
     */
    public List<AdGroupNegativeSites> getAdGroupNegativeSites() {
        if (adGroupNegativeSites == null) {
            adGroupNegativeSites = new ArrayList<AdGroupNegativeSites>();
        }
        return this.adGroupNegativeSites;
    }

}
