
package com.microsoft.bingads.v10.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EditorialStatus" type="{https://bingads.microsoft.com/CampaignManagement/v10}AdEditorialStatus" minOccurs="0"/>
 *         &lt;element name="AdType" type="{https://bingads.microsoft.com/CampaignManagement/v10}AdType" minOccurs="0"/>
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
    "adGroupId",
    "editorialStatus",
    "adType"
})
@XmlRootElement(name = "GetAdsByEditorialStatusRequest")
public class GetAdsByEditorialStatusRequest {

    @XmlElement(name = "AdGroupId")
    protected Long adGroupId;
    @XmlElement(name = "EditorialStatus")
    @XmlSchemaType(name = "string")
    protected AdEditorialStatus editorialStatus;
    @XmlElement(name = "AdType", nillable = true)
    @XmlSchemaType(name = "string")
    protected AdType adType;

    /**
     * Gets the value of the adGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the value of the adGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdGroupId(Long value) {
        this.adGroupId = value;
    }

    /**
     * Gets the value of the editorialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AdEditorialStatus }
     *     
     */
    public AdEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }

    /**
     * Sets the value of the editorialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdEditorialStatus }
     *     
     */
    public void setEditorialStatus(AdEditorialStatus value) {
        this.editorialStatus = value;
    }

    /**
     * Gets the value of the adType property.
     * 
     * @return
     *     possible object is
     *     {@link AdType }
     *     
     */
    public AdType getAdType() {
        return adType;
    }

    /**
     * Sets the value of the adType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdType }
     *     
     */
    public void setAdType(AdType value) {
        this.adType = value;
    }

}
