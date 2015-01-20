
package com.microsoft.bingads.adintelligence;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AuctionInsightAvailableChildren complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuctionInsightAvailableChildren">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Details" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}ArrayOfAuctionInsightAvailableChildrenDetail" minOccurs="0"/>
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
@XmlType(name = "AuctionInsightAvailableChildren", propOrder = {
    "details",
    "dataVersion"
})
public class AuctionInsightAvailableChildren {

    @XmlElement(name = "Details", nillable = true)
    protected ArrayOfAuctionInsightAvailableChildrenDetail details;
    @XmlElement(name = "DataVersion", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dataVersion;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuctionInsightAvailableChildrenDetail }
     *     
     */
    public ArrayOfAuctionInsightAvailableChildrenDetail getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuctionInsightAvailableChildrenDetail }
     *     
     */
    public void setDetails(ArrayOfAuctionInsightAvailableChildrenDetail value) {
        this.details = value;
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
