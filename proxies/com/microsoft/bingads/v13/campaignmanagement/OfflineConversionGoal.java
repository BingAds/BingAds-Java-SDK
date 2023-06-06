
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineConversionGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineConversionGoal">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoal">
 *       &lt;sequence>
 *         &lt;element name="IsExternallyAttributed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
