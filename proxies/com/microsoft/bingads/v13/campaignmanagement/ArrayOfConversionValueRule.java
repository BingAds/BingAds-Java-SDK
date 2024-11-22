
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfConversionValueRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfConversionValueRule">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ConversionValueRule" type="{https://bingads.microsoft.com/CampaignManagement/v13}ConversionValueRule" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConversionValueRule", propOrder = {
    "conversionValueRules"
})
public class ArrayOfConversionValueRule {

    @XmlElement(name = "ConversionValueRule", nillable = true)
    protected List<ConversionValueRule> conversionValueRules;
    public ArrayOfConversionValueRule()
    {
      this.conversionValueRules = new ArrayList<ConversionValueRule>();
    }
    @JsonCreator
    public ArrayOfConversionValueRule(List<ConversionValueRule> conversionvaluerules)
    {
      this.conversionValueRules = conversionvaluerules;
    }

    /**
     * Gets the value of the conversionValueRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the conversionValueRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionValueRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionValueRule }
     * 
     * 
     * @return
     *     The value of the conversionValueRules property.
     */
    public List<ConversionValueRule> getConversionValueRules() {
        if (conversionValueRules == null) {
            conversionValueRules = new ArrayList<>();
        }
        return this.conversionValueRules;
    }

}
