
package com.microsoft.bingads.adintelligence;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AuctionInsightPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuctionInsightPage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalNumEntries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Entries" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}ArrayOfAuctionInsight" minOccurs="0"/>
 *         &lt;element name="DataVersion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionInsightPage", propOrder = {
    "totalNumEntries",
    "entries",
    "dataVersion"
})
public class AuctionInsightPage {

    @XmlElement(name = "TotalNumEntries")
    protected Integer totalNumEntries;
    @XmlElement(name = "Entries", nillable = true)
    protected ArrayOfAuctionInsight entries;
    @XmlElement(name = "DataVersion", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dataVersion;

    /**
     * Gets the value of the totalNumEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumEntries() {
        return totalNumEntries;
    }

    /**
     * Sets the value of the totalNumEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumEntries(Integer value) {
        this.totalNumEntries = value;
    }

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuctionInsight }
     *     
     */
    public ArrayOfAuctionInsight getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuctionInsight }
     *     
     */
    public void setEntries(ArrayOfAuctionInsight value) {
        this.entries = value;
    }

    /**
     * Gets the value of the dataVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDataVersion() {
        return dataVersion;
    }

    /**
     * Sets the value of the dataVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataVersion(Calendar value) {
        this.dataVersion = value;
    }

}
