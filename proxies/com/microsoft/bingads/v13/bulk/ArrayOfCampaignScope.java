
package com.microsoft.bingads.v13.bulk;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfCampaignScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCampaignScope">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CampaignScope" type="{https://bingads.microsoft.com/CampaignManagement/v13}CampaignScope" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public ArrayOfCampaignScope()
    {
      this.campaignScopes = new ArrayList<CampaignScope>();
    }
    @JsonCreator
    public ArrayOfCampaignScope(List<CampaignScope> campaignscopes)
    {
      this.campaignScopes = campaignscopes;
    }

    /**
     * Gets the value of the campaignScopes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the campaignScopes property.
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
     * @return
     *     The value of the campaignScopes property.
     */
    public List<CampaignScope> getCampaignScopes() {
        if (campaignScopes == null) {
            campaignScopes = new ArrayList<>();
        }
        return this.campaignScopes;
    }

}
