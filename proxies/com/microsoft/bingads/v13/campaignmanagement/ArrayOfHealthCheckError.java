
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfHealthCheckError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHealthCheckError">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HealthCheckError" type="{https://bingads.microsoft.com/CampaignManagement/v13}HealthCheckError" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHealthCheckError", propOrder = {
    "healthCheckErrors"
})
public class ArrayOfHealthCheckError {

    @XmlElement(name = "HealthCheckError", nillable = true)
    protected List<HealthCheckError> healthCheckErrors;
    public ArrayOfHealthCheckError()
    {
      this.healthCheckErrors = new ArrayList<HealthCheckError>();
    }
    @JsonCreator
    public ArrayOfHealthCheckError(List<HealthCheckError> healthcheckerrors)
    {
      this.healthCheckErrors = healthcheckerrors;
    }

    /**
     * Gets the value of the healthCheckErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the healthCheckErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthCheckErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthCheckError }
     * 
     * 
     * @return
     *     The value of the healthCheckErrors property.
     */
    public List<HealthCheckError> getHealthCheckErrors() {
        if (healthCheckErrors == null) {
            healthCheckErrors = new ArrayList<>();
        }
        return this.healthCheckErrors;
    }

}
