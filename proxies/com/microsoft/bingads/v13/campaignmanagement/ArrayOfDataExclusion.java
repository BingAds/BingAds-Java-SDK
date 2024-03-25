
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfDataExclusion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDataExclusion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DataExclusion" type="{https://bingads.microsoft.com/CampaignManagement/v13}DataExclusion" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDataExclusion", propOrder = {
    "dataExclusions"
})
public class ArrayOfDataExclusion {

    @XmlElement(name = "DataExclusion", nillable = true)
    protected List<DataExclusion> dataExclusions;
    public ArrayOfDataExclusion()
    {
      this.dataExclusions = new ArrayList<DataExclusion>();
    }
    @JsonCreator
    public ArrayOfDataExclusion(List<DataExclusion> dataexclusions)
    {
      this.dataExclusions = dataexclusions;
    }

    /**
     * Gets the value of the dataExclusions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dataExclusions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataExclusions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataExclusion }
     * 
     * 
     * @return
     *     The value of the dataExclusions property.
     */
    public List<DataExclusion> getDataExclusions() {
        if (dataExclusions == null) {
            dataExclusions = new ArrayList<>();
        }
        return this.dataExclusions;
    }

}
