
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerifiedTrackingSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifiedTrackingSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Setting">
 *       &lt;sequence>
 *         &lt;element name="Details" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifiedTrackingSetting", propOrder = {
    "details"
})
public class VerifiedTrackingSetting
    extends Setting
{

    @XmlElement(name = "Details", nillable = true)
    protected ArrayOfArrayOfKeyValuePairOfstringstring details;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfKeyValuePairOfstringstring }
     *     
     */
    public ArrayOfArrayOfKeyValuePairOfstringstring getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfKeyValuePairOfstringstring }
     *     
     */
    public void setDetails(ArrayOfArrayOfKeyValuePairOfstringstring value) {
        this.details = value;
    }

}
