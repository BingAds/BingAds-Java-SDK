
package com.microsoft.bingads.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCampaignNegativeKeywords complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCampaignNegativeKeywords">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampaignNegativeKeywords" type="{https://bingads.microsoft.com/CampaignManagement/v9}CampaignNegativeKeywords" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampaignNegativeKeywords", propOrder = {
    "campaignNegativeKeywords"
})
public class ArrayOfCampaignNegativeKeywords {

    @XmlElement(name = "CampaignNegativeKeywords", nillable = true)
    protected List<CampaignNegativeKeywords> campaignNegativeKeywords;

    /**
     * Gets the value of the campaignNegativeKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignNegativeKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignNegativeKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignNegativeKeywords }
     * 
     * 
     */
    public List<CampaignNegativeKeywords> getCampaignNegativeKeywords() {
        if (campaignNegativeKeywords == null) {
            campaignNegativeKeywords = new ArrayList<CampaignNegativeKeywords>();
        }
        return this.campaignNegativeKeywords;
    }

}
