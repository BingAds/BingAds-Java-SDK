
package com.microsoft.bingads.optimizer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCampaignBudgetLandscape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCampaignBudgetLandscape">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampaignBudgetLandscape" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}CampaignBudgetLandscape" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampaignBudgetLandscape", propOrder = {
    "campaignBudgetLandscapes"
})
public class ArrayOfCampaignBudgetLandscape {

    @XmlElement(name = "CampaignBudgetLandscape", nillable = true)
    protected List<CampaignBudgetLandscape> campaignBudgetLandscapes;

    /**
     * Gets the value of the campaignBudgetLandscapes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignBudgetLandscapes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignBudgetLandscapes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignBudgetLandscape }
     * 
     * 
     */
    public List<CampaignBudgetLandscape> getCampaignBudgetLandscapes() {
        if (campaignBudgetLandscapes == null) {
            campaignBudgetLandscapes = new ArrayList<CampaignBudgetLandscape>();
        }
        return this.campaignBudgetLandscapes;
    }

}
