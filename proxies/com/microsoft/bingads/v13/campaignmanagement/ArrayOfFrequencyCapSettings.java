
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfFrequencyCapSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfFrequencyCapSettings">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrequencyCapSettings" type="{https://bingads.microsoft.com/CampaignManagement/v13}FrequencyCapSettings" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFrequencyCapSettings", propOrder = {
    "frequencyCapSettings"
})
public class ArrayOfFrequencyCapSettings {

    @XmlElement(name = "FrequencyCapSettings", nillable = true)
    protected List<FrequencyCapSettings> frequencyCapSettings;
    public ArrayOfFrequencyCapSettings()
    {
      this.frequencyCapSettings = new ArrayList<FrequencyCapSettings>();
    }
    @JsonCreator
    public ArrayOfFrequencyCapSettings(List<FrequencyCapSettings> frequencycapsettingss)
    {
      this.frequencyCapSettings = frequencycapsettingss;
    }

    /**
     * Gets the value of the frequencyCapSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the frequencyCapSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequencyCapSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequencyCapSettings }
     * 
     * 
     * @return
     *     The value of the frequencyCapSettings property.
     */
    public List<FrequencyCapSettings> getFrequencyCapSettings() {
        if (frequencyCapSettings == null) {
            frequencyCapSettings = new ArrayList<>();
        }
        return this.frequencyCapSettings;
    }

}
