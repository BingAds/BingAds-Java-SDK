
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCampaignAdGroupIds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCampaignAdGroupIds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampaignAdGroupIds" type="{https://bingads.microsoft.com/CampaignManagement/v13}CampaignAdGroupIds" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampaignAdGroupIds", propOrder = {
    "campaignAdGroupIds"
})
public class ArrayOfCampaignAdGroupIds {

    @XmlElement(name = "CampaignAdGroupIds", nillable = true)
    protected List<CampaignAdGroupIds> campaignAdGroupIds;

    /**
     * Gets the value of the campaignAdGroupIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignAdGroupIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignAdGroupIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignAdGroupIds }
     * 
     * 
     */
    public List<CampaignAdGroupIds> getCampaignAdGroupIds() {
        if (campaignAdGroupIds == null) {
            campaignAdGroupIds = new ArrayList<CampaignAdGroupIds>();
        }
        return this.campaignAdGroupIds;
    }

}
