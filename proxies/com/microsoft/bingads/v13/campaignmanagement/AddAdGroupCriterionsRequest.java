
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="AdGroupCriterions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdGroupCriterion" minOccurs="0"/>
 *         &lt;element name="CriterionType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdGroupCriterionType" minOccurs="0"/>
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
    "adGroupCriterions",
    "criterionType"
})
@XmlRootElement(name = "AddAdGroupCriterionsRequest")
public class AddAdGroupCriterionsRequest {

    @XmlElement(name = "AdGroupCriterions", nillable = true)
    protected ArrayOfAdGroupCriterion adGroupCriterions;
    @XmlElement(name = "CriterionType", type = String.class)
    @XmlJavaTypeAdapter(Adapter11 .class)
    protected Collection<AdGroupCriterionType> criterionType;

    /**
     * Gets the value of the adGroupCriterions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdGroupCriterion }
     *     
     */
    public ArrayOfAdGroupCriterion getAdGroupCriterions() {
        return adGroupCriterions;
    }

    /**
     * Sets the value of the adGroupCriterions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdGroupCriterion }
     *     
     */
    public void setAdGroupCriterions(ArrayOfAdGroupCriterion value) {
        this.adGroupCriterions = value;
    }

    /**
     * Gets the value of the criterionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdGroupCriterionType> getCriterionType() {
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
    public void setCriterionType(Collection<AdGroupCriterionType> value) {
        this.criterionType = value;
    }

}
