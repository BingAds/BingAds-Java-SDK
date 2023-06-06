
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdExtensionEditorialReason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdExtensionEditorialReason">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdExtensionEditorialReason" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtensionEditorialReason" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdExtensionEditorialReason", propOrder = {
    "adExtensionEditorialReasons"
})
public class ArrayOfAdExtensionEditorialReason {

    @XmlElement(name = "AdExtensionEditorialReason", nillable = true)
    protected List<AdExtensionEditorialReason> adExtensionEditorialReasons;

    /**
     * Gets the value of the adExtensionEditorialReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adExtensionEditorialReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdExtensionEditorialReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdExtensionEditorialReason }
     * 
     * 
     * @return
     *     The value of the adExtensionEditorialReasons property.
     */
    public List<AdExtensionEditorialReason> getAdExtensionEditorialReasons() {
        if (adExtensionEditorialReasons == null) {
            adExtensionEditorialReasons = new ArrayList<>();
        }
        return this.adExtensionEditorialReasons;
    }

}
