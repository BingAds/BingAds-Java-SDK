
package com.microsoft.bingads.v13.campaignmanagement;
import java.util.Collections;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CompanyList">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}LinkedInSegment">
 *       <sequence>
 *         <element name="CompanyNames" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfCompanyName" minOccurs="0"/>
 *         <element name="Matched" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Total" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyList", propOrder = {
    "companyNames",
    "matched",
    "total"
})
public class CompanyList
    extends LinkedInSegment
{
    public CompanyList() {
      this.type = Collections.singletonList(ProfileType.fromValue("CompanyName"));
    }

    @XmlElement(name = "CompanyNames", nillable = true)
    protected ArrayOfCompanyName companyNames;
    @XmlElement(name = "Matched", nillable = true)
    protected Integer matched;
    @XmlElement(name = "Total", nillable = true)
    protected Integer total;

    /**
     * Gets the value of the companyNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompanyName }
     *     
     */
    public ArrayOfCompanyName getCompanyNames() {
        return companyNames;
    }

    /**
     * Sets the value of the companyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompanyName }
     *     
     */
    public void setCompanyNames(ArrayOfCompanyName value) {
        this.companyNames = value;
    }

    /**
     * Gets the value of the matched property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMatched() {
        return matched;
    }

    /**
     * Sets the value of the matched property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMatched(Integer value) {
        this.matched = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotal(Integer value) {
        this.total = value;
    }

}
