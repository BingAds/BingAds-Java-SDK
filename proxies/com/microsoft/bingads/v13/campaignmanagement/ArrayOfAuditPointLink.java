
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAuditPointLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAuditPointLink">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuditPointLink" type="{https://bingads.microsoft.com/CampaignManagement/v13}AuditPointLink" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAuditPointLink", propOrder = {
    "auditPointLinks"
})
public class ArrayOfAuditPointLink {

    @XmlElement(name = "AuditPointLink", nillable = true)
    protected List<AuditPointLink> auditPointLinks;
    public ArrayOfAuditPointLink()
    {
      this.auditPointLinks = new ArrayList<AuditPointLink>();
    }
    @JsonCreator
    public ArrayOfAuditPointLink(List<AuditPointLink> auditpointlinks)
    {
      this.auditPointLinks = auditpointlinks;
    }

    /**
     * Gets the value of the auditPointLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the auditPointLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditPointLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditPointLink }
     * 
     * 
     * @return
     *     The value of the auditPointLinks property.
     */
    public List<AuditPointLink> getAuditPointLinks() {
        if (auditPointLinks == null) {
            auditPointLinks = new ArrayList<>();
        }
        return this.auditPointLinks;
    }

}
