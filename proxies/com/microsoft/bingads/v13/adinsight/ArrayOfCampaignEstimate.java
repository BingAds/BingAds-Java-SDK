
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfCampaignEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCampaignEstimate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CampaignEstimate" type="{https://bingads.microsoft.com/AdInsight/v13}CampaignEstimate" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampaignEstimate", propOrder = {
    "campaignEstimates"
})
public class ArrayOfCampaignEstimate {

    @XmlElement(name = "CampaignEstimate", nillable = true)
    protected List<CampaignEstimate> campaignEstimates;
    public ArrayOfCampaignEstimate()
    {
      this.campaignEstimates = new ArrayList<CampaignEstimate>();
    }
    @JsonCreator
    public ArrayOfCampaignEstimate(List<CampaignEstimate> campaignestimates)
    {
      this.campaignEstimates = campaignestimates;
    }

    /**
     * Gets the value of the campaignEstimates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the campaignEstimates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignEstimates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignEstimate }
     * 
     * 
     * @return
     *     The value of the campaignEstimates property.
     */
    public List<CampaignEstimate> getCampaignEstimates() {
        if (campaignEstimates == null) {
            campaignEstimates = new ArrayList<>();
        }
        return this.campaignEstimates;
    }

}
