
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDayTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDayTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DayTime" type="{https://bingads.microsoft.com/CampaignManagement/v11}DayTime" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    /**
     * Gets the value of the dayTimes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayTimes property.
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
     */
    public List<DayTime> getDayTimes() {
        if (dayTimes == null) {
            dayTimes = new ArrayList<DayTime>();
        }
        return this.dayTimes;
    }

}
