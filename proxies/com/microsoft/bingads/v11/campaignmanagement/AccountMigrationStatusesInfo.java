
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountMigrationStatusesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountMigrationStatusesInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MigrationStatusInfo" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfMigrationStatusInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountMigrationStatusesInfo", propOrder = {
    "accountId",
    "migrationStatusInfo"
})
public class AccountMigrationStatusesInfo {

    @XmlElement(name = "AccountId")
    protected long accountId;
    @XmlElement(name = "MigrationStatusInfo", nillable = true)
    protected ArrayOfMigrationStatusInfo migrationStatusInfo;

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
     * Gets the value of the migrationStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMigrationStatusInfo }
     *     
     */
    public ArrayOfMigrationStatusInfo getMigrationStatusInfo() {
        return migrationStatusInfo;
    }

    /**
     * Sets the value of the migrationStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMigrationStatusInfo }
     *     
     */
    public void setMigrationStatusInfo(ArrayOfMigrationStatusInfo value) {
        this.migrationStatusInfo = value;
    }

}
