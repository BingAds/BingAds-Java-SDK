
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineConversionGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OfflineConversionGoal">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoal">
 *       <sequence>
 *         <element name="IsExternallyAttributed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineConversionGoal", propOrder = {
    "isExternallyAttributed"
})
public class OfflineConversionGoal
    extends ConversionGoal
{

    @XmlElement(name = "IsExternallyAttributed", nillable = true)
    protected Boolean isExternallyAttributed;

    /**
     * Gets the value of the isExternallyAttributed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsExternallyAttributed() {
        return isExternallyAttributed;
    }

    /**
     * Sets the value of the isExternallyAttributed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExternallyAttributed(Boolean value) {
        this.isExternallyAttributed = value;
    }

}
