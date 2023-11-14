
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdExtensionIdentity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdExtensionIdentity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdExtensionIdentity" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtensionIdentity" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdExtensionIdentity", propOrder = {
    "adExtensionIdentities"
})
public class ArrayOfAdExtensionIdentity {

    @XmlElement(name = "AdExtensionIdentity", nillable = true)
    protected List<AdExtensionIdentity> adExtensionIdentities;
    public ArrayOfAdExtensionIdentity()
    {
      this.adExtensionIdentities = new ArrayList<AdExtensionIdentity>();
    }
    @JsonCreator
    public ArrayOfAdExtensionIdentity(List<AdExtensionIdentity> adextensionidentitys)
    {
      this.adExtensionIdentities = adextensionidentitys;
    }

    /**
     * Gets the value of the adExtensionIdentities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adExtensionIdentities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdExtensionIdentities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdExtensionIdentity }
     * 
     * 
     * @return
     *     The value of the adExtensionIdentities property.
     */
    public List<AdExtensionIdentity> getAdExtensionIdentities() {
        if (adExtensionIdentities == null) {
            adExtensionIdentities = new ArrayList<>();
        }
        return this.adExtensionIdentities;
    }

}
