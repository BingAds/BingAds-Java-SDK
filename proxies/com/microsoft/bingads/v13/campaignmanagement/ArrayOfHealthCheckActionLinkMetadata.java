
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfHealthCheckActionLinkMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHealthCheckActionLinkMetadata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HealthCheckActionLinkMetadata" type="{https://bingads.microsoft.com/CampaignManagement/v13}HealthCheckActionLinkMetadata" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHealthCheckActionLinkMetadata", propOrder = {
    "healthCheckActionLinkMetadatas"
})
public class ArrayOfHealthCheckActionLinkMetadata {

    @XmlElement(name = "HealthCheckActionLinkMetadata", nillable = true)
    protected List<HealthCheckActionLinkMetadata> healthCheckActionLinkMetadatas;
    public ArrayOfHealthCheckActionLinkMetadata()
    {
      this.healthCheckActionLinkMetadatas = new ArrayList<HealthCheckActionLinkMetadata>();
    }
    @JsonCreator
    public ArrayOfHealthCheckActionLinkMetadata(List<HealthCheckActionLinkMetadata> healthcheckactionlinkmetadatas)
    {
      this.healthCheckActionLinkMetadatas = healthcheckactionlinkmetadatas;
    }

    /**
     * Gets the value of the healthCheckActionLinkMetadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the healthCheckActionLinkMetadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthCheckActionLinkMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthCheckActionLinkMetadata }
     * 
     * 
     * @return
     *     The value of the healthCheckActionLinkMetadatas property.
     */
    public List<HealthCheckActionLinkMetadata> getHealthCheckActionLinkMetadatas() {
        if (healthCheckActionLinkMetadatas == null) {
            healthCheckActionLinkMetadatas = new ArrayList<>();
        }
        return this.healthCheckActionLinkMetadatas;
    }

}
