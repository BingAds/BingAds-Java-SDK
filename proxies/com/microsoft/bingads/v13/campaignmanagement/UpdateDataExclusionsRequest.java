
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
 *         <element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="DataExclusions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfDataExclusion" minOccurs="0"/>
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
    "accountId",
    "dataExclusions"
})
@XmlRootElement(name = "UpdateDataExclusionsRequest")
public class UpdateDataExclusionsRequest {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "DataExclusions", nillable = true)
    protected ArrayOfDataExclusion dataExclusions;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the dataExclusions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDataExclusion }
     *     
     */
    public ArrayOfDataExclusion getDataExclusions() {
        return dataExclusions;
    }

    /**
     * Sets the value of the dataExclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDataExclusion }
     *     
     */
    public void setDataExclusions(ArrayOfDataExclusion value) {
        this.dataExclusions = value;
    }

}
