
package com.microsoft.bingads.v12.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOfflineConversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOfflineConversion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfflineConversion" type="{https://bingads.microsoft.com/CampaignManagement/v12}OfflineConversion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    /**
     * Gets the value of the offlineConversions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offlineConversions property.
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
     */
    public List<OfflineConversion> getOfflineConversions() {
        if (offlineConversions == null) {
            offlineConversions = new ArrayList<OfflineConversion>();
        }
        return this.offlineConversions;
    }

}
