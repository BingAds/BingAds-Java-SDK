
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CampaignCriterions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfCampaignCriterion" minOccurs="0"/>
 *         <element name="CriterionType" type="{https://bingads.microsoft.com/CampaignManagement/v13}CampaignCriterionType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "campaignCriterions",
    "criterionType"
})
@XmlRootElement(name = "AddCampaignCriterionsRequest")
public class AddCampaignCriterionsRequest {

    @XmlElement(name = "CampaignCriterions", nillable = true)
    protected ArrayOfCampaignCriterion campaignCriterions;
    @XmlElement(name = "CriterionType", type = String.class)
    @XmlJavaTypeAdapter(Adapter19 .class)
    protected Collection<CampaignCriterionType> criterionType;

    /**
     * Gets the value of the campaignCriterions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaignCriterion }
     *     
     */
    public ArrayOfCampaignCriterion getCampaignCriterions() {
        return campaignCriterions;
    }

    /**
     * Sets the value of the campaignCriterions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaignCriterion }
     *     
     */
    public void setCampaignCriterions(ArrayOfCampaignCriterion value) {
        this.campaignCriterions = value;
    }

    /**
     * Gets the value of the criterionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<CampaignCriterionType> getCriterionType() {
        return criterionType;
    }

    /**
     * Sets the value of the criterionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterionType(Collection<CampaignCriterionType> value) {
        this.criterionType = value;
    }

}
