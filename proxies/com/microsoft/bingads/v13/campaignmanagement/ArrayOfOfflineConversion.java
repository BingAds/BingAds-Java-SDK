
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfOfflineConversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfOfflineConversion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OfflineConversion" type="{https://bingads.microsoft.com/CampaignManagement/v13}OfflineConversion" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOfflineConversion", propOrder = {
    "offlineConversions"
})
public class ArrayOfOfflineConversion {

    @XmlElement(name = "OfflineConversion", nillable = true)
    protected List<OfflineConversion> offlineConversions;
    public ArrayOfOfflineConversion()
    {
      this.offlineConversions = new ArrayList<OfflineConversion>();
    }
    @JsonCreator
    public ArrayOfOfflineConversion(List<OfflineConversion> offlineconversions)
    {
      this.offlineConversions = offlineconversions;
    }

    /**
     * Gets the value of the offlineConversions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the offlineConversions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfflineConversions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfflineConversion }
     * 
     * 
     * @return
     *     The value of the offlineConversions property.
     */
    public List<OfflineConversion> getOfflineConversions() {
        if (offlineConversions == null) {
            offlineConversions = new ArrayList<>();
        }
        return this.offlineConversions;
    }

}
