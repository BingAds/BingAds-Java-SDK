
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfCampaignBidLandscape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCampaignBidLandscape">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CampaignBidLandscape" type="{https://bingads.microsoft.com/AdInsight/v13}CampaignBidLandscape" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampaignBidLandscape", propOrder = {
    "campaignBidLandscapes"
})
public class ArrayOfCampaignBidLandscape {

    @XmlElement(name = "CampaignBidLandscape", nillable = true)
    protected List<CampaignBidLandscape> campaignBidLandscapes;
    public ArrayOfCampaignBidLandscape()
    {
      this.campaignBidLandscapes = new ArrayList<CampaignBidLandscape>();
    }
    @JsonCreator
    public ArrayOfCampaignBidLandscape(List<CampaignBidLandscape> campaignbidlandscapes)
    {
      this.campaignBidLandscapes = campaignbidlandscapes;
    }

    /**
     * Gets the value of the campaignBidLandscapes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the campaignBidLandscapes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignBidLandscapes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignBidLandscape }
     * 
     * 
     * @return
     *     The value of the campaignBidLandscapes property.
     */
    public List<CampaignBidLandscape> getCampaignBidLandscapes() {
        if (campaignBidLandscapes == null) {
            campaignBidLandscapes = new ArrayList<>();
        }
        return this.campaignBidLandscapes;
    }

}
