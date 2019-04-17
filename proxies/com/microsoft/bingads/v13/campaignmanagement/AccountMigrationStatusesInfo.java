
package com.microsoft.bingads.v13.campaignmanagement;

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
 *         &lt;element name="MigrationStatusInfos" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfMigrationStatusInfo" minOccurs="0"/>
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
