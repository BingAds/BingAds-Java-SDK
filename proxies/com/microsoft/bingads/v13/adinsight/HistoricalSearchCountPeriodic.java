
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoricalSearchCountPeriodic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HistoricalSearchCountPeriodic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SearchCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="DayMonthAndYear" type="{https://bingads.microsoft.com/AdInsight/v13}DayMonthAndYear" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricalSearchCountPeriodic", propOrder = {
    "searchCount",
    "dayMonthAndYear"
})
public class HistoricalSearchCountPeriodic {

    @XmlElement(name = "SearchCount")
    protected Long searchCount;
    @XmlElement(name = "DayMonthAndYear", nillable = true)
    protected DayMonthAndYear dayMonthAndYear;

    /**
     * Gets the value of the searchCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSearchCount() {
        return searchCount;
    }

    /**
     * Sets the value of the searchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSearchCount(Long value) {
        this.searchCount = value;
    }

    /**
     * Gets the value of the dayMonthAndYear property.
     * 
     * @return
     *     possible object is
     *     {@link DayMonthAndYear }
     *     
     */
    public DayMonthAndYear getDayMonthAndYear() {
        return dayMonthAndYear;
    }

    /**
     * Sets the value of the dayMonthAndYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayMonthAndYear }
     *     
     */
    public void setDayMonthAndYear(DayMonthAndYear value) {
        this.dayMonthAndYear = value;
    }

}
