
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfCampaignEstimator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCampaignEstimator">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CampaignEstimator" type="{https://bingads.microsoft.com/AdInsight/v13}CampaignEstimator" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampaignEstimator", propOrder = {
    "campaignEstimators"
})
public class ArrayOfCampaignEstimator {

    @XmlElement(name = "CampaignEstimator", nillable = true)
    protected List<CampaignEstimator> campaignEstimators;
    public ArrayOfCampaignEstimator()
    {
      this.campaignEstimators = new ArrayList<CampaignEstimator>();
    }
    @JsonCreator
    public ArrayOfCampaignEstimator(List<CampaignEstimator> campaignestimators)
    {
      this.campaignEstimators = campaignestimators;
    }

    /**
     * Gets the value of the campaignEstimators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the campaignEstimators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignEstimators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignEstimator }
     * 
     * 
     * @return
     *     The value of the campaignEstimators property.
     */
    public List<CampaignEstimator> getCampaignEstimators() {
        if (campaignEstimators == null) {
            campaignEstimators = new ArrayList<>();
        }
        return this.campaignEstimators;
    }

}
