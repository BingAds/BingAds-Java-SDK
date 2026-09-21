
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedInCompanyData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LinkedInCompanyData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CompanyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CompanyLogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CompanySize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CompanySizeCategory" type="{https://bingads.microsoft.com/CampaignManagement/v13}CompanySizeCategory" minOccurs="0"/>
 *         <element name="CompanyUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedInCompanyData", propOrder = {
    "companyId",
    "companyLogo",
    "companyName",
    "companySize",
    "companySizeCategory",
    "companyUrl",
    "industry"
})
public class LinkedInCompanyData {

    @XmlElement(name = "CompanyId")
    protected Long companyId;
    @XmlElement(name = "CompanyLogo", nillable = true)
    protected String companyLogo;
    @XmlElement(name = "CompanyName", nillable = true)
    protected String companyName;
    @XmlElement(name = "CompanySize", nillable = true)
    protected String companySize;
    @XmlElement(name = "CompanySizeCategory")
    @XmlSchemaType(name = "string")
    protected CompanySizeCategory companySizeCategory;
    @XmlElement(name = "CompanyUrl", nillable = true)
    protected String companyUrl;
    @XmlElement(name = "Industry", nillable = true)
    protected String industry;

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompanyId(Long value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the companyLogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyLogo() {
        return companyLogo;
    }

    /**
     * Sets the value of the companyLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyLogo(String value) {
        this.companyLogo = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companySize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanySize() {
        return companySize;
    }

    /**
     * Sets the value of the companySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanySize(String value) {
        this.companySize = value;
    }

    /**
     * Gets the value of the companySizeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CompanySizeCategory }
     *     
     */
    public CompanySizeCategory getCompanySizeCategory() {
        return companySizeCategory;
    }

    /**
     * Sets the value of the companySizeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanySizeCategory }
     *     
     */
    public void setCompanySizeCategory(CompanySizeCategory value) {
        this.companySizeCategory = value;
    }

    /**
     * Gets the value of the companyUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyUrl() {
        return companyUrl;
    }

    /**
     * Sets the value of the companyUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyUrl(String value) {
        this.companyUrl = value;
    }

    /**
     * Gets the value of the industry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustry(String value) {
        this.industry = value;
    }

}
