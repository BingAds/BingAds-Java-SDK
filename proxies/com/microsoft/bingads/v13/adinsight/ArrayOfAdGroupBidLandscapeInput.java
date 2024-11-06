
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdGroupBidLandscapeInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdGroupBidLandscapeInput">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdGroupBidLandscapeInput" type="{https://bingads.microsoft.com/AdInsight/v13}AdGroupBidLandscapeInput" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdGroupBidLandscapeInput", propOrder = {
    "adGroupBidLandscapeInputs"
})
public class ArrayOfAdGroupBidLandscapeInput {

    @XmlElement(name = "AdGroupBidLandscapeInput", nillable = true)
    protected List<AdGroupBidLandscapeInput> adGroupBidLandscapeInputs;
    public ArrayOfAdGroupBidLandscapeInput()
    {
      this.adGroupBidLandscapeInputs = new ArrayList<AdGroupBidLandscapeInput>();
    }
    @JsonCreator
    public ArrayOfAdGroupBidLandscapeInput(List<AdGroupBidLandscapeInput> adgroupbidlandscapeinputs)
    {
      this.adGroupBidLandscapeInputs = adgroupbidlandscapeinputs;
    }

    /**
     * Gets the value of the adGroupBidLandscapeInputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adGroupBidLandscapeInputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdGroupBidLandscapeInputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupBidLandscapeInput }
     * 
     * 
     * @return
     *     The value of the adGroupBidLandscapeInputs property.
     */
    public List<AdGroupBidLandscapeInput> getAdGroupBidLandscapeInputs() {
        if (adGroupBidLandscapeInputs == null) {
            adGroupBidLandscapeInputs = new ArrayList<>();
        }
        return this.adGroupBidLandscapeInputs;
    }

}
