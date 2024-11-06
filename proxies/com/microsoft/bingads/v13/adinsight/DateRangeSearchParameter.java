
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateRangeSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DateRangeSearchParameter">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter">
 *       <sequence>
 *         <element name="EndDate" type="{https://bingads.microsoft.com/AdInsight/v13}DayMonthAndYear" minOccurs="0"/>
 *         <element name="StartDate" type="{https://bingads.microsoft.com/AdInsight/v13}DayMonthAndYear" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateRangeSearchParameter", propOrder = {
    "endDate",
    "startDate"
})
public class DateRangeSearchParameter
    extends SearchParameter
{
    public DateRangeSearchParameter() {
      this.type = "DateRangeSearchParameter";
    }

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
