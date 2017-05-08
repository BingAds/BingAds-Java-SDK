
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MigrationStatuses" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfAccountMigrationStatusesInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
