
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCampaignReportScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCampaignReportScope">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CampaignReportScope" type="{https://bingads.microsoft.com/Reporting/v13}CampaignReportScope" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampaignReportScope", propOrder = {
    "campaignReportScopes"
})
public class ArrayOfCampaignReportScope {

    @XmlElement(name = "CampaignReportScope", nillable = true)
    protected List<CampaignReportScope> campaignReportScopes;

    /**
     * Gets the value of the campaignReportScopes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the campaignReportScopes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignReportScopes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignReportScope }
     * 
     * 
     * @return
     *     The value of the campaignReportScopes property.
     */
    public List<CampaignReportScope> getCampaignReportScopes() {
        if (campaignReportScopes == null) {
            campaignReportScopes = new ArrayList<>();
        }
        return this.campaignReportScopes;
    }

}
