
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupBidLandscapeInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupBidLandscapeInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdGroupBidLandscapeType" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}AdGroupBidLandscapeType" minOccurs="0"/>
 *         &lt;element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupBidLandscapeInput", propOrder = {
    "adGroupBidLandscapeType",
    "adGroupId"
})
public class AdGroupBidLandscapeInput {

    @XmlElement(name = "AdGroupBidLandscapeType")
    @XmlSchemaType(name = "string")
    protected AdGroupBidLandscapeType adGroupBidLandscapeType;
    @XmlElement(name = "AdGroupId")
    protected Long adGroupId;

    /**
     * Gets the value of the adGroupBidLandscapeType property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupBidLandscapeType }
     *     
     */
    public AdGroupBidLandscapeType getAdGroupBidLandscapeType() {
        return adGroupBidLandscapeType;
    }

    /**
     * Sets the value of the adGroupBidLandscapeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupBidLandscapeType }
     *     
     */
    public void setAdGroupBidLandscapeType(AdGroupBidLandscapeType value) {
        this.adGroupBidLandscapeType = value;
    }

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

}
