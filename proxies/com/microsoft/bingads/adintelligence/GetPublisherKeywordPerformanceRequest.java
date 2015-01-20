
package com.microsoft.bingads.adintelligence;

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
 *         &lt;element name="Keywords" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="TimeInterval" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}TimeInterval" minOccurs="0"/>
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
    "keywords",
    "timeInterval"
})
@XmlRootElement(name = "GetPublisherKeywordPerformanceRequest", namespace = "https://bingads.microsoft.com/AdIntelligence/v9")
public class GetPublisherKeywordPerformanceRequest {

    @XmlElement(name = "Keywords", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    protected ArrayOfstring keywords;
    @XmlElement(name = "TimeInterval", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    @XmlSchemaType(name = "string")
    protected TimeInterval timeInterval;

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setKeywords(ArrayOfstring value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the timeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getTimeInterval() {
        return timeInterval;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setTimeInterval(TimeInterval value) {
        this.timeInterval = value;
    }

}
