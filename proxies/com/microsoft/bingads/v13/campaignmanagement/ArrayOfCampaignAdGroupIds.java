
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCampaignAdGroupIds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCampaignAdGroupIds">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CampaignAdGroupIds" type="{https://bingads.microsoft.com/CampaignManagement/v13}CampaignAdGroupIds" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the campaignAdGroupIds property.
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
     * @return
     *     The value of the campaignAdGroupIds property.
     */
    public List<CampaignAdGroupIds> getCampaignAdGroupIds() {
        if (campaignAdGroupIds == null) {
            campaignAdGroupIds = new ArrayList<>();
        }
        return this.campaignAdGroupIds;
    }

}
