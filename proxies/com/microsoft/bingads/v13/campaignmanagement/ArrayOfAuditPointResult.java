
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAuditPointResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAuditPointResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuditPointResult" type="{https://bingads.microsoft.com/CampaignManagement/v13}AuditPointResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAuditPointResult", propOrder = {
    "auditPointResults"
})
public class ArrayOfAuditPointResult {

    @XmlElement(name = "AuditPointResult", nillable = true)
    protected List<AuditPointResult> auditPointResults;
    public ArrayOfAuditPointResult()
    {
      this.auditPointResults = new ArrayList<AuditPointResult>();
    }
    @JsonCreator
    public ArrayOfAuditPointResult(List<AuditPointResult> auditpointresults)
    {
      this.auditPointResults = auditpointresults;
    }

    /**
     * Gets the value of the auditPointResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the auditPointResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditPointResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditPointResult }
     * 
     * 
     * @return
     *     The value of the auditPointResults property.
     */
    public List<AuditPointResult> getAuditPointResults() {
        if (auditPointResults == null) {
            auditPointResults = new ArrayList<>();
        }
        return this.auditPointResults;
    }

}
