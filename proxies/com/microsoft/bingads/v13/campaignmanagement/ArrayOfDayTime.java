
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfDayTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDayTime">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DayTime" type="{https://bingads.microsoft.com/CampaignManagement/v13}DayTime" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDayTime", propOrder = {
    "dayTimes"
})
public class ArrayOfDayTime {

    @XmlElement(name = "DayTime", nillable = true)
    protected List<DayTime> dayTimes;
    public ArrayOfDayTime()
    {
      this.dayTimes = new ArrayList<DayTime>();
    }
    @JsonCreator
    public ArrayOfDayTime(List<DayTime> daytimes)
    {
      this.dayTimes = daytimes;
    }

    /**
     * Gets the value of the dayTimes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dayTimes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayTimes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayTime }
     * 
     * 
     * @return
     *     The value of the dayTimes property.
     */
    public List<DayTime> getDayTimes() {
        if (dayTimes == null) {
            dayTimes = new ArrayList<>();
        }
        return this.dayTimes;
    }

}
