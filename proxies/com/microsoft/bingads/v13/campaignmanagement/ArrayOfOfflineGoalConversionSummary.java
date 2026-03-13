
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfOfflineGoalConversionSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfOfflineGoalConversionSummary">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OfflineGoalConversionSummary" type="{https://bingads.microsoft.com/CampaignManagement/v13}OfflineGoalConversionSummary" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOfflineGoalConversionSummary", propOrder = {
    "offlineGoalConversionSummaries"
})
public class ArrayOfOfflineGoalConversionSummary {

    @XmlElement(name = "OfflineGoalConversionSummary", nillable = true)
    protected List<OfflineGoalConversionSummary> offlineGoalConversionSummaries;
    public ArrayOfOfflineGoalConversionSummary()
    {
      this.offlineGoalConversionSummaries = new ArrayList<OfflineGoalConversionSummary>();
    }
    @JsonCreator
    public ArrayOfOfflineGoalConversionSummary(List<OfflineGoalConversionSummary> offlinegoalconversionsummarys)
    {
      this.offlineGoalConversionSummaries = offlinegoalconversionsummarys;
    }

    /**
     * Gets the value of the offlineGoalConversionSummaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the offlineGoalConversionSummaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfflineGoalConversionSummaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfflineGoalConversionSummary }
     * 
     * 
     * @return
     *     The value of the offlineGoalConversionSummaries property.
     */
    public List<OfflineGoalConversionSummary> getOfflineGoalConversionSummaries() {
        if (offlineGoalConversionSummaries == null) {
            offlineGoalConversionSummaries = new ArrayList<>();
        }
        return this.offlineGoalConversionSummaries;
    }

}
