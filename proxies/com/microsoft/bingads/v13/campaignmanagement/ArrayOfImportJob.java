
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfImportJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfImportJob">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ImportJob" type="{https://bingads.microsoft.com/CampaignManagement/v13}ImportJob" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfImportJob", propOrder = {
    "importJobs"
})
public class ArrayOfImportJob {

    @XmlElement(name = "ImportJob", nillable = true)
    protected List<ImportJob> importJobs;

    /**
     * Gets the value of the importJobs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the importJobs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportJobs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportJob }
     * 
     * 
     * @return
     *     The value of the importJobs property.
     */
    public List<ImportJob> getImportJobs() {
        if (importJobs == null) {
            importJobs = new ArrayList<>();
        }
        return this.importJobs;
    }

}
