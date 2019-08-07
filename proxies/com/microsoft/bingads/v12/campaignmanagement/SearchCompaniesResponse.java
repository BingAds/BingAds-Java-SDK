
package com.microsoft.bingads.v12.campaignmanagement;

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
 *         &lt;element name="Companies" type="{https://bingads.microsoft.com/CampaignManagement/v12}ArrayOfCompany" minOccurs="0"/>
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
    "companies"
})
@XmlRootElement(name = "SearchCompaniesResponse")
public class SearchCompaniesResponse {

    @XmlElement(name = "Companies", nillable = true)
    protected ArrayOfCompany companies;

    /**
     * Gets the value of the companies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompany }
     *     
     */
    public ArrayOfCompany getCompanies() {
        return companies;
    }

    /**
     * Sets the value of the companies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompany }
     *     
     */
    public void setCompanies(ArrayOfCompany value) {
        this.companies = value;
    }

}
