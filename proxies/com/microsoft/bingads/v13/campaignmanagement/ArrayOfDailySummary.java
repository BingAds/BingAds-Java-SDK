
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfDailySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDailySummary">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DailySummary" type="{https://bingads.microsoft.com/CampaignManagement/v13}DailySummary" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDailySummary", propOrder = {
    "dailySummaries"
})
public class ArrayOfDailySummary {

    @XmlElement(name = "DailySummary", nillable = true)
    protected List<DailySummary> dailySummaries;
    public ArrayOfDailySummary()
    {
      this.dailySummaries = new ArrayList<DailySummary>();
    }
    @JsonCreator
    public ArrayOfDailySummary(List<DailySummary> dailysummarys)
    {
      this.dailySummaries = dailysummarys;
    }

    /**
     * Gets the value of the dailySummaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dailySummaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDailySummaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DailySummary }
     * 
     * 
     * @return
     *     The value of the dailySummaries property.
     */
    public List<DailySummary> getDailySummaries() {
        if (dailySummaries == null) {
            dailySummaries = new ArrayList<>();
        }
        return this.dailySummaries;
    }

}
