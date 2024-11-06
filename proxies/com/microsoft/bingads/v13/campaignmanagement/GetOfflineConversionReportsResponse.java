
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
 *         <element name="DailySummaries" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfDailySummary" minOccurs="0"/>
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
    "dailySummaries"
})
@XmlRootElement(name = "GetOfflineConversionReportsResponse")
public class GetOfflineConversionReportsResponse {

    @XmlElement(name = "DailySummaries", nillable = true)
    protected ArrayOfDailySummary dailySummaries;

    /**
     * Gets the value of the dailySummaries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDailySummary }
     *     
     */
    public ArrayOfDailySummary getDailySummaries() {
        return dailySummaries;
    }

    /**
     * Sets the value of the dailySummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDailySummary }
     *     
     */
    public void setDailySummaries(ArrayOfDailySummary value) {
        this.dailySummaries = value;
    }

}
