
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
 *         <element name="AdGroupCriterions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdGroupCriterion" minOccurs="0"/>
 *         <element name="CriterionType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdGroupCriterionType" minOccurs="0"/>
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
    "adGroupCriterions",
    "criterionType"
})
@XmlRootElement(name = "AddAdGroupCriterionsRequest")
public class AddAdGroupCriterionsRequest {

    @XmlElement(name = "AdGroupCriterions", nillable = true)
    protected ArrayOfAdGroupCriterion adGroupCriterions;
    @XmlElement(name = "CriterionType", type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
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
