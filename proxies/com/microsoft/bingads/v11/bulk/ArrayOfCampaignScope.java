
package com.microsoft.bingads.v11.bulk;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCampaignScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCampaignScope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampaignScope" type="{https://bingads.microsoft.com/CampaignManagement/v11}CampaignScope" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampaignScope", propOrder = {
    "campaignScopes"
})
public class ArrayOfCampaignScope {

    @XmlElement(name = "CampaignScope", nillable = true)
    protected List<CampaignScope> campaignScopes;

    /**
     * Gets the value of the campaignScopes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignScopes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignScopes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignScope }
     * 
     * 
     */
    public List<CampaignScope> getCampaignScopes() {
        if (campaignScopes == null) {
            campaignScopes = new ArrayList<CampaignScope>();
        }
        return this.campaignScopes;
    }

}
