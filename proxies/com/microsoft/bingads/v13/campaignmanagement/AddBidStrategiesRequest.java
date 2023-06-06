
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BidStrategies" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBidStrategy" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bidStrategies"
})
@XmlRootElement(name = "AddBidStrategiesRequest")
public class AddBidStrategiesRequest {

    @XmlElement(name = "BidStrategies", nillable = true)
    protected ArrayOfBidStrategy bidStrategies;

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

}
