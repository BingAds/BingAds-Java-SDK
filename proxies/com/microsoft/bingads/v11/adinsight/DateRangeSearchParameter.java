
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateRangeSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateRangeSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity.SearchParameters}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="EndDate" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}DayMonthAndYear" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}DayMonthAndYear" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateRangeSearchParameter", namespace = "http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity.SearchParameters", propOrder = {
    "endDate",
    "startDate"
})
public class DateRangeSearchParameter
    extends SearchParameter
{

    @XmlElement(name = "EndDate", nillable = true)
    protected DayMonthAndYear endDate;
    @XmlElement(name = "StartDate", nillable = true)
    protected DayMonthAndYear startDate;

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link DayMonthAndYear }
     *     
     */
    public DayMonthAndYear getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayMonthAndYear }
     *     
     */
    public void setEndDate(DayMonthAndYear value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DayMonthAndYear }
     *     
     */
    public DayMonthAndYear getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayMonthAndYear }
     *     
     */
    public void setStartDate(DayMonthAndYear value) {
        this.startDate = value;
    }

}
