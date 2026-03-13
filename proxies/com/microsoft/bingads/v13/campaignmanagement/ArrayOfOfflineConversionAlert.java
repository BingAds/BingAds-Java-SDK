
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfOfflineConversionAlert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfOfflineConversionAlert">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OfflineConversionAlert" type="{https://bingads.microsoft.com/CampaignManagement/v13}OfflineConversionAlert" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOfflineConversionAlert", propOrder = {
    "offlineConversionAlerts"
})
public class ArrayOfOfflineConversionAlert {

    @XmlElement(name = "OfflineConversionAlert", nillable = true)
    protected List<OfflineConversionAlert> offlineConversionAlerts;
    public ArrayOfOfflineConversionAlert()
    {
      this.offlineConversionAlerts = new ArrayList<OfflineConversionAlert>();
    }
    @JsonCreator
    public ArrayOfOfflineConversionAlert(List<OfflineConversionAlert> offlineconversionalerts)
    {
      this.offlineConversionAlerts = offlineconversionalerts;
    }

    /**
     * Gets the value of the offlineConversionAlerts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the offlineConversionAlerts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfflineConversionAlerts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfflineConversionAlert }
     * 
     * 
     * @return
     *     The value of the offlineConversionAlerts property.
     */
    public List<OfflineConversionAlert> getOfflineConversionAlerts() {
        if (offlineConversionAlerts == null) {
            offlineConversionAlerts = new ArrayList<>();
        }
        return this.offlineConversionAlerts;
    }

}
