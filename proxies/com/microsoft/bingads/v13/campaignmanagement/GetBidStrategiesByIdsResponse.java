
package com.microsoft.bingads.v13.campaignmanagement;

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
 *         &lt;element name="BidStrategies" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBidStrategy" minOccurs="0"/>
 *         &lt;element name="PartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBatchError" minOccurs="0"/>
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
    "bidStrategies",
    "partialErrors"
})
@XmlRootElement(name = "GetBidStrategiesByIdsResponse")
public class GetBidStrategiesByIdsResponse {

    @XmlElement(name = "BidStrategies", nillable = true)
    protected ArrayOfBidStrategy bidStrategies;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

    /**
     * Gets the value of the bidStrategies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBidStrategy }
     *     
     */
    public ArrayOfBidStrategy getBidStrategies() {
        return bidStrategies;
    }

    /**
     * Sets the value of the bidStrategies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBidStrategy }
     *     
     */
    public void setBidStrategies(ArrayOfBidStrategy value) {
        this.bidStrategies = value;
    }

    /**
     * Gets the value of the partialErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public ArrayOfBatchError getPartialErrors() {
        return partialErrors;
    }

    /**
     * Sets the value of the partialErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public void setPartialErrors(ArrayOfBatchError value) {
        this.partialErrors = value;
    }

}
