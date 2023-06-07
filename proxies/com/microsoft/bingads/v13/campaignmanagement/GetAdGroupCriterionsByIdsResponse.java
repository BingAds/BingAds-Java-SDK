
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
    "adGroupCriterions"
})
@XmlRootElement(name = "GetAdGroupCriterionsByIdsResponse")
public class GetAdGroupCriterionsByIdsResponse {

    @XmlElement(name = "AdGroupCriterions", nillable = true)
    protected ArrayOfAdGroupCriterion adGroupCriterions;

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

}
