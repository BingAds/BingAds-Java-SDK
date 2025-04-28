
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfHealthCheckData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHealthCheckData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HealthCheckData" type="{https://bingads.microsoft.com/CampaignManagement/v13}HealthCheckData" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHealthCheckData", propOrder = {
    "healthCheckDatas"
})
public class ArrayOfHealthCheckData {

    @XmlElement(name = "HealthCheckData", nillable = true)
    protected List<HealthCheckData> healthCheckDatas;
    public ArrayOfHealthCheckData()
    {
      this.healthCheckDatas = new ArrayList<HealthCheckData>();
    }
    @JsonCreator
    public ArrayOfHealthCheckData(List<HealthCheckData> healthcheckdatas)
    {
      this.healthCheckDatas = healthcheckdatas;
    }

    /**
     * Gets the value of the healthCheckDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the healthCheckDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthCheckDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthCheckData }
     * 
     * 
     * @return
     *     The value of the healthCheckDatas property.
     */
    public List<HealthCheckData> getHealthCheckDatas() {
        if (healthCheckDatas == null) {
            healthCheckDatas = new ArrayList<>();
        }
        return this.healthCheckDatas;
    }

}
