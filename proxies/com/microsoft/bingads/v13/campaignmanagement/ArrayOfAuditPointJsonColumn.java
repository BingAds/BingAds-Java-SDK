
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAuditPointJsonColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAuditPointJsonColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuditPointJsonColumn" type="{https://bingads.microsoft.com/CampaignManagement/v13}AuditPointJsonColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAuditPointJsonColumn", propOrder = {
    "auditPointJsonColumns"
})
public class ArrayOfAuditPointJsonColumn {

    @XmlElement(name = "AuditPointJsonColumn", nillable = true)
    protected List<AuditPointJsonColumn> auditPointJsonColumns;
    public ArrayOfAuditPointJsonColumn()
    {
      this.auditPointJsonColumns = new ArrayList<AuditPointJsonColumn>();
    }
    @JsonCreator
    public ArrayOfAuditPointJsonColumn(List<AuditPointJsonColumn> auditpointjsoncolumns)
    {
      this.auditPointJsonColumns = auditpointjsoncolumns;
    }

    /**
     * Gets the value of the auditPointJsonColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the auditPointJsonColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditPointJsonColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuditPointJsonColumn }
     * 
     * 
     * @return
     *     The value of the auditPointJsonColumns property.
     */
    public List<AuditPointJsonColumn> getAuditPointJsonColumns() {
        if (auditPointJsonColumns == null) {
            auditPointJsonColumns = new ArrayList<>();
        }
        return this.auditPointJsonColumns;
    }

}
