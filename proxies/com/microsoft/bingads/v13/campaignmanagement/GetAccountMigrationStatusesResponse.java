
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MigrationStatuses" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAccountMigrationStatusesInfo" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "migrationStatuses"
})
@XmlRootElement(name = "GetAccountMigrationStatusesResponse")
public class GetAccountMigrationStatusesResponse {

    @XmlElement(name = "MigrationStatuses", nillable = true)
    protected ArrayOfAccountMigrationStatusesInfo migrationStatuses;

    /**
     * Gets the value of the migrationStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccountMigrationStatusesInfo }
     *     
     */
    public ArrayOfAccountMigrationStatusesInfo getMigrationStatuses() {
        return migrationStatuses;
    }

    /**
     * Sets the value of the migrationStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountMigrationStatusesInfo }
     *     
     */
    public void setMigrationStatuses(ArrayOfAccountMigrationStatusesInfo value) {
        this.migrationStatuses = value;
    }

}
