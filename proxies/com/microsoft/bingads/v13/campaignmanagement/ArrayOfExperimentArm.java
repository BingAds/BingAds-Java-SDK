
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfExperimentArm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfExperimentArm">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ExperimentArm" type="{https://bingads.microsoft.com/CampaignManagement/v13}ExperimentArm" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExperimentArm", propOrder = {
    "experimentArms"
})
public class ArrayOfExperimentArm {

    @XmlElement(name = "ExperimentArm", nillable = true)
    protected List<ExperimentArm> experimentArms;
    public ArrayOfExperimentArm()
    {
      this.experimentArms = new ArrayList<ExperimentArm>();
    }
    @JsonCreator
    public ArrayOfExperimentArm(List<ExperimentArm> experimentarms)
    {
      this.experimentArms = experimentarms;
    }

    /**
     * Gets the value of the experimentArms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the experimentArms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExperimentArms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExperimentArm }
     * 
     * 
     * @return
     *     The value of the experimentArms property.
     */
    public List<ExperimentArm> getExperimentArms() {
        if (experimentArms == null) {
            experimentArms = new ArrayList<>();
        }
        return this.experimentArms;
    }

}
