
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAccountMigrationStatusesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAccountMigrationStatusesInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountMigrationStatusesInfo" type="{https://bingads.microsoft.com/CampaignManagement/v13}AccountMigrationStatusesInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAccountMigrationStatusesInfo", propOrder = {
    "accountMigrationStatusesInfos"
})
public class ArrayOfAccountMigrationStatusesInfo {

    @XmlElement(name = "AccountMigrationStatusesInfo", nillable = true)
    protected List<AccountMigrationStatusesInfo> accountMigrationStatusesInfos;
    public ArrayOfAccountMigrationStatusesInfo()
    {
      this.accountMigrationStatusesInfos = new ArrayList<AccountMigrationStatusesInfo>();
    }
    @JsonCreator
    public ArrayOfAccountMigrationStatusesInfo(List<AccountMigrationStatusesInfo> accountmigrationstatusesinfos)
    {
      this.accountMigrationStatusesInfos = accountmigrationstatusesinfos;
    }

    /**
     * Gets the value of the accountMigrationStatusesInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the accountMigrationStatusesInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountMigrationStatusesInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountMigrationStatusesInfo }
     * 
     * 
     * @return
     *     The value of the accountMigrationStatusesInfos property.
     */
    public List<AccountMigrationStatusesInfo> getAccountMigrationStatusesInfos() {
        if (accountMigrationStatusesInfos == null) {
            accountMigrationStatusesInfos = new ArrayList<>();
        }
        return this.accountMigrationStatusesInfos;
    }

}
