
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfConversionGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfConversionGoal">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ConversionGoal" type="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionGoal" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConversionGoal", propOrder = {
    "conversionGoals"
})
public class ArrayOfConversionGoal {

    @XmlElement(name = "ConversionGoal", nillable = true)
    protected List<ConversionGoal> conversionGoals;

    /**
     * Gets the value of the conversionGoals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the conversionGoals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionGoals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionGoal }
     * 
     * 
     * @return
     *     The value of the conversionGoals property.
     */
    public List<ConversionGoal> getConversionGoals() {
        if (conversionGoals == null) {
            conversionGoals = new ArrayList<>();
        }
        return this.conversionGoals;
    }

}
