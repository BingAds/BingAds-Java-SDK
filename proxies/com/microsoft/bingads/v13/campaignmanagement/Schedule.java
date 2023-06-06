
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Schedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Schedule">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DayTimeRanges" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfDayTime" minOccurs="0"/>
 *         <element name="EndDate" type="{https://bingads.microsoft.com/CampaignManagement/v13}Date" minOccurs="0"/>
 *         <element name="StartDate" type="{https://bingads.microsoft.com/CampaignManagement/v13}Date" minOccurs="0"/>
 *         <element name="UseSearcherTimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Schedule", propOrder = {
    "dayTimeRanges",
    "endDate",
    "startDate",
    "useSearcherTimeZone"
})
public class Schedule {

    @XmlElement(name = "DayTimeRanges", nillable = true)
    protected ArrayOfDayTime dayTimeRanges;
    @XmlElement(name = "EndDate", nillable = true)
    protected Date endDate;
    @XmlElement(name = "StartDate", nillable = true)
    protected Date startDate;
    @XmlElement(name = "UseSearcherTimeZone", nillable = true)
    protected Boolean useSearcherTimeZone;

    /**
     * Gets the value of the dayTimeRanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDayTime }
     *     
     */
    public ArrayOfDayTime getDayTimeRanges() {
        return dayTimeRanges;
    }

    /**
     * Sets the value of the dayTimeRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDayTime }
     *     
     */
    public void setDayTimeRanges(ArrayOfDayTime value) {
        this.dayTimeRanges = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the useSearcherTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseSearcherTimeZone() {
        return useSearcherTimeZone;
    }

    /**
     * Sets the value of the useSearcherTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSearcherTimeZone(Boolean value) {
        this.useSearcherTimeZone = value;
    }

}
