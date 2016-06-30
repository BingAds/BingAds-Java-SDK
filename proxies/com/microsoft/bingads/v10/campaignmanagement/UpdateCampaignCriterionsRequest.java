
package com.microsoft.bingads.v10.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampaignCriterions" type="{https://bingads.microsoft.com/CampaignManagement/v10}ArrayOfCampaignCriterion" minOccurs="0"/>
 *         &lt;element name="CriterionType" type="{https://bingads.microsoft.com/CampaignManagement/v10}CampaignCriterionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "campaignCriterions",
    "criterionType"
})
@XmlRootElement(name = "UpdateCampaignCriterionsRequest")
public class UpdateCampaignCriterionsRequest {

    @XmlElement(name = "CampaignCriterions", nillable = true)
    protected ArrayOfCampaignCriterion campaignCriterions;
    @XmlElement(name = "CriterionType", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anySimpleType")
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
