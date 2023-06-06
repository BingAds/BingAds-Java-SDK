
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExtensionEditorialReasonCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdExtensionEditorialReasonCollection">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdExtensionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Reasons" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdExtensionEditorialReason" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdExtensionEditorialReasonCollection", propOrder = {
    "adExtensionId",
    "reasons"
})
public class AdExtensionEditorialReasonCollection {

    @XmlElement(name = "AdExtensionId")
    protected Long adExtensionId;
    @XmlElement(name = "Reasons", nillable = true)
    protected ArrayOfAdExtensionEditorialReason reasons;

    /**
     * Gets the value of the adExtensionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdExtensionId() {
        return adExtensionId;
    }

    /**
     * Sets the value of the adExtensionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdExtensionId(Long value) {
        this.adExtensionId = value;
    }

    /**
     * Gets the value of the reasons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdExtensionEditorialReason }
     *     
     */
    public ArrayOfAdExtensionEditorialReason getReasons() {
        return reasons;
    }

    /**
     * Sets the value of the reasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdExtensionEditorialReason }
     *     
     */
    public void setReasons(ArrayOfAdExtensionEditorialReason value) {
        this.reasons = value;
    }

}
