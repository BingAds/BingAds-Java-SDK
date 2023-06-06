
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountMigrationStatusesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountMigrationStatusesInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="MigrationStatusInfos" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfMigrationStatusInfo" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountMigrationStatusesInfo", propOrder = {
    "accountId",
    "migrationStatusInfos"
})
public class AccountMigrationStatusesInfo {

    @XmlElement(name = "AccountId")
    protected long accountId;
    @XmlElement(name = "MigrationStatusInfos", nillable = true)
    protected ArrayOfMigrationStatusInfo migrationStatusInfos;

    /**
     * Gets the value of the accountId property.
     * 
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the migrationStatusInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMigrationStatusInfo }
     *     
     */
    public ArrayOfMigrationStatusInfo getMigrationStatusInfos() {
        return migrationStatusInfos;
    }

    /**
     * Sets the value of the migrationStatusInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMigrationStatusInfo }
     *     
     */
    public void setMigrationStatusInfos(ArrayOfMigrationStatusInfo value) {
        this.migrationStatusInfos = value;
    }

}
