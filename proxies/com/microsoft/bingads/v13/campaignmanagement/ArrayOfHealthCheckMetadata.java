
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfHealthCheckMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHealthCheckMetadata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HealthCheckMetadata" type="{https://bingads.microsoft.com/CampaignManagement/v13}HealthCheckMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHealthCheckMetadata", propOrder = {
    "healthCheckMetadatas"
})
public class ArrayOfHealthCheckMetadata {

    @XmlElement(name = "HealthCheckMetadata", nillable = true)
    protected List<HealthCheckMetadata> healthCheckMetadatas;
    public ArrayOfHealthCheckMetadata()
    {
      this.healthCheckMetadatas = new ArrayList<HealthCheckMetadata>();
    }
    @JsonCreator
    public ArrayOfHealthCheckMetadata(List<HealthCheckMetadata> healthcheckmetadatas)
    {
      this.healthCheckMetadatas = healthcheckmetadatas;
    }

    /**
     * Gets the value of the healthCheckMetadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the healthCheckMetadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthCheckMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthCheckMetadata }
     * 
     * 
     * @return
     *     The value of the healthCheckMetadatas property.
     */
    public List<HealthCheckMetadata> getHealthCheckMetadatas() {
        if (healthCheckMetadatas == null) {
            healthCheckMetadatas = new ArrayList<>();
        }
        return this.healthCheckMetadatas;
    }

}
