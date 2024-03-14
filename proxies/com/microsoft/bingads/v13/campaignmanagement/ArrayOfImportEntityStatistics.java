
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfImportEntityStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfImportEntityStatistics">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ImportEntityStatistics" type="{https://bingads.microsoft.com/CampaignManagement/v13}ImportEntityStatistics" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfImportEntityStatistics", propOrder = {
    "importEntityStatistics"
})
public class ArrayOfImportEntityStatistics {

    @XmlElement(name = "ImportEntityStatistics", nillable = true)
    protected List<ImportEntityStatistics> importEntityStatistics;
    public ArrayOfImportEntityStatistics()
    {
      this.importEntityStatistics = new ArrayList<ImportEntityStatistics>();
    }
    @JsonCreator
    public ArrayOfImportEntityStatistics(List<ImportEntityStatistics> importentitystatisticss)
    {
      this.importEntityStatistics = importentitystatisticss;
    }

    /**
     * Gets the value of the importEntityStatistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the importEntityStatistics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportEntityStatistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportEntityStatistics }
     * 
     * 
     * @return
     *     The value of the importEntityStatistics property.
     */
    public List<ImportEntityStatistics> getImportEntityStatistics() {
        if (importEntityStatistics == null) {
            importEntityStatistics = new ArrayList<>();
        }
        return this.importEntityStatistics;
    }

}
