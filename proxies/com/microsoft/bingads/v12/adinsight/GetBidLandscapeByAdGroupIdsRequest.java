
package com.microsoft.bingads.v12.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="AdGroupBidLandscapeInputs" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V12.Entity}ArrayOfAdGroupBidLandscapeInput" minOccurs="0"/>
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
    "adGroupBidLandscapeInputs"
})
@XmlRootElement(name = "GetBidLandscapeByAdGroupIdsRequest", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12")
public class GetBidLandscapeByAdGroupIdsRequest {

    @XmlElement(name = "AdGroupBidLandscapeInputs", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected ArrayOfAdGroupBidLandscapeInput adGroupBidLandscapeInputs;

    /**
     * Gets the value of the adGroupBidLandscapeInputs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdGroupBidLandscapeInput }
     *     
     */
    public ArrayOfAdGroupBidLandscapeInput getAdGroupBidLandscapeInputs() {
        return adGroupBidLandscapeInputs;
    }

    /**
     * Sets the value of the adGroupBidLandscapeInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdGroupBidLandscapeInput }
     *     
     */
    public void setAdGroupBidLandscapeInputs(ArrayOfAdGroupBidLandscapeInput value) {
        this.adGroupBidLandscapeInputs = value;
    }

}
