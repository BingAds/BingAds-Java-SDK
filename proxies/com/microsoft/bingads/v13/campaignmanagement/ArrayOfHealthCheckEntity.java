
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfHealthCheckEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHealthCheckEntity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HealthCheckEntity" type="{https://bingads.microsoft.com/CampaignManagement/v13}HealthCheckEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHealthCheckEntity", propOrder = {
    "healthCheckEntities"
})
public class ArrayOfHealthCheckEntity {

    @XmlElement(name = "HealthCheckEntity", nillable = true)
    protected List<HealthCheckEntity> healthCheckEntities;
    public ArrayOfHealthCheckEntity()
    {
      this.healthCheckEntities = new ArrayList<HealthCheckEntity>();
    }
    @JsonCreator
    public ArrayOfHealthCheckEntity(List<HealthCheckEntity> healthcheckentitys)
    {
      this.healthCheckEntities = healthcheckentitys;
    }

    /**
     * Gets the value of the healthCheckEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the healthCheckEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthCheckEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthCheckEntity }
     * 
     * 
     * @return
     *     The value of the healthCheckEntities property.
     */
    public List<HealthCheckEntity> getHealthCheckEntities() {
        if (healthCheckEntities == null) {
            healthCheckEntities = new ArrayList<>();
        }
        return this.healthCheckEntities;
    }

}
