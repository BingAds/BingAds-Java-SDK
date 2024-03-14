
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfCampaign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCampaign">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Campaign" type="{https://bingads.microsoft.com/CampaignManagement/v13}Campaign" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampaign", propOrder = {
    "campaigns"
})
public class ArrayOfCampaign {

    @XmlElement(name = "Campaign", nillable = true)
    protected List<Campaign> campaigns;
    public ArrayOfCampaign()
    {
      this.campaigns = new ArrayList<Campaign>();
    }
    @JsonCreator
    public ArrayOfCampaign(List<Campaign> campaigns)
    {
      this.campaigns = campaigns;
    }

    /**
     * Gets the value of the campaigns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the campaigns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaigns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Campaign }
     * 
     * 
     * @return
     *     The value of the campaigns property.
     */
    public List<Campaign> getCampaigns() {
        if (campaigns == null) {
            campaigns = new ArrayList<>();
        }
        return this.campaigns;
    }

}
