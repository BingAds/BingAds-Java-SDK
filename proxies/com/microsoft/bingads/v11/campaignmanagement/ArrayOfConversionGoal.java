
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfConversionGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConversionGoal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConversionGoal" type="{https://bingads.microsoft.com/CampaignManagement/v11}ConversionGoal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversionGoals property.
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
     */
    public List<ConversionGoal> getConversionGoals() {
        if (conversionGoals == null) {
            conversionGoals = new ArrayList<ConversionGoal>();
        }
        return this.conversionGoals;
    }

}
