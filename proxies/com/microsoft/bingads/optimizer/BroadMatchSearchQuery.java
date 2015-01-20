
package com.microsoft.bingads.optimizer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BroadMatchSearchQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BroadMatchSearchQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchQueryKPIs" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}ArrayOfBroadMatchSearchQueryKPI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BroadMatchSearchQuery", propOrder = {
    "accountId",
    "accountName",
    "keyword",
    "searchQueryKPIs"
})
public class BroadMatchSearchQuery {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "AccountName", nillable = true)
    protected String accountName;
    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "SearchQueryKPIs", nillable = true)
    protected ArrayOfBroadMatchSearchQueryKPI searchQueryKPIs;

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
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the searchQueryKPIs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBroadMatchSearchQueryKPI }
     *     
     */
    public ArrayOfBroadMatchSearchQueryKPI getSearchQueryKPIs() {
        return searchQueryKPIs;
    }

    /**
     * Sets the value of the searchQueryKPIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBroadMatchSearchQueryKPI }
     *     
     */
    public void setSearchQueryKPIs(ArrayOfBroadMatchSearchQueryKPI value) {
        this.searchQueryKPIs = value;
    }

}
