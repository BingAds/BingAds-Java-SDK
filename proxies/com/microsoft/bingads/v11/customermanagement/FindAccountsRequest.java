
package com.microsoft.bingads.v11.customermanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AccountFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TopN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ApplicationScope" type="{https://bingads.microsoft.com/Customer/v11/Entities}ApplicationType" minOccurs="0"/>
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
    "customerId",
    "accountFilter",
    "topN",
    "applicationScope"
})
@XmlRootElement(name = "FindAccountsRequest")
public class FindAccountsRequest {

    @XmlElement(name = "CustomerId", nillable = true)
    protected Long customerId;
    @XmlElement(name = "AccountFilter", nillable = true)
    protected String accountFilter;
    @XmlElement(name = "TopN")
    protected Integer topN;
    @XmlElement(name = "ApplicationScope", nillable = true)
    @XmlSchemaType(name = "string")
    protected ApplicationType applicationScope;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the accountFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountFilter() {
        return accountFilter;
    }

    /**
     * Sets the value of the accountFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountFilter(String value) {
        this.accountFilter = value;
    }

    /**
     * Gets the value of the topN property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTopN() {
        return topN;
    }

    /**
     * Sets the value of the topN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTopN(Integer value) {
        this.topN = value;
    }

    /**
     * Gets the value of the applicationScope property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationType }
     *     
     */
    public ApplicationType getApplicationScope() {
        return applicationScope;
    }

    /**
     * Sets the value of the applicationScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationType }
     *     
     */
    public void setApplicationScope(ApplicationType value) {
        this.applicationScope = value;
    }

}
