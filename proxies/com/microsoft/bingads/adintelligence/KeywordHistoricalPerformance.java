
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordHistoricalPerformance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordHistoricalPerformance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Device" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeywordKPIs" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}ArrayOfKeywordKPI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordHistoricalPerformance", propOrder = {
    "keyword",
    "device",
    "keywordKPIs"
})
public class KeywordHistoricalPerformance {

    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "Device", nillable = true)
    protected String device;
    @XmlElement(name = "KeywordKPIs", nillable = true)
    protected ArrayOfKeywordKPI keywordKPIs;

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

    /**
     * Gets the value of the keywordKPIs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordKPI }
     *     
     */
    public ArrayOfKeywordKPI getKeywordKPIs() {
        return keywordKPIs;
    }

    /**
     * Sets the value of the keywordKPIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordKPI }
     *     
     */
    public void setKeywordKPIs(ArrayOfKeywordKPI value) {
        this.keywordKPIs = value;
    }

}
