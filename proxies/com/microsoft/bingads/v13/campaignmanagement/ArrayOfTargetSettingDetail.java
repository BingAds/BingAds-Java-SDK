
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfTargetSettingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfTargetSettingDetail">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TargetSettingDetail" type="{https://bingads.microsoft.com/CampaignManagement/v13}TargetSettingDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTargetSettingDetail", propOrder = {
    "targetSettingDetails"
})
public class ArrayOfTargetSettingDetail {

    @XmlElement(name = "TargetSettingDetail", nillable = true)
    protected List<TargetSettingDetail> targetSettingDetails;
    public ArrayOfTargetSettingDetail()
    {
      this.targetSettingDetails = new ArrayList<TargetSettingDetail>();
    }
    @JsonCreator
    public ArrayOfTargetSettingDetail(List<TargetSettingDetail> targetsettingdetails)
    {
      this.targetSettingDetails = targetsettingdetails;
    }

    /**
     * Gets the value of the targetSettingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the targetSettingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetSettingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetSettingDetail }
     * 
     * 
     * @return
     *     The value of the targetSettingDetails property.
     */
    public List<TargetSettingDetail> getTargetSettingDetails() {
        if (targetSettingDetails == null) {
            targetSettingDetails = new ArrayList<>();
        }
        return this.targetSettingDetails;
    }

}
