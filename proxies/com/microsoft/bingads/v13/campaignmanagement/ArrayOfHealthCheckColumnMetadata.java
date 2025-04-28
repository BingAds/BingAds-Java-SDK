
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfHealthCheckColumnMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHealthCheckColumnMetadata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HealthCheckColumnMetadata" type="{https://bingads.microsoft.com/CampaignManagement/v13}HealthCheckColumnMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHealthCheckColumnMetadata", propOrder = {
    "healthCheckColumnMetadatas"
})
public class ArrayOfHealthCheckColumnMetadata {

    @XmlElement(name = "HealthCheckColumnMetadata", nillable = true)
    protected List<HealthCheckColumnMetadata> healthCheckColumnMetadatas;
    public ArrayOfHealthCheckColumnMetadata()
    {
      this.healthCheckColumnMetadatas = new ArrayList<HealthCheckColumnMetadata>();
    }
    @JsonCreator
    public ArrayOfHealthCheckColumnMetadata(List<HealthCheckColumnMetadata> healthcheckcolumnmetadatas)
    {
      this.healthCheckColumnMetadatas = healthcheckcolumnmetadatas;
    }

    /**
     * Gets the value of the healthCheckColumnMetadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the healthCheckColumnMetadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthCheckColumnMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthCheckColumnMetadata }
     * 
     * 
     * @return
     *     The value of the healthCheckColumnMetadatas property.
     */
    public List<HealthCheckColumnMetadata> getHealthCheckColumnMetadatas() {
        if (healthCheckColumnMetadatas == null) {
            healthCheckColumnMetadatas = new ArrayList<>();
        }
        return this.healthCheckColumnMetadatas;
    }

}
