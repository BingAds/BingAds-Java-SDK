
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacementCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PlacementCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="PlacementId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="PlacementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementCriterion", propOrder = {
    "placementId",
    "placementName"
})
public class PlacementCriterion
    extends Criterion
{
    public PlacementCriterion() {
      this.type = "PlacementCriterion";
    }

    @XmlElement(name = "PlacementId")
    protected Long placementId;
    @XmlElement(name = "PlacementName", nillable = true)
    protected String placementName;

    /**
     * Gets the value of the placementId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlacementId() {
        return placementId;
    }

    /**
     * Sets the value of the placementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlacementId(Long value) {
        this.placementId = value;
    }

    /**
     * Gets the value of the placementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementName() {
        return placementName;
    }

    /**
     * Sets the value of the placementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementName(String value) {
        this.placementName = value;
    }

}
