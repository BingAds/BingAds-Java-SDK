
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
 *         <element name="CompanyListDetails" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfCompanyName" minOccurs="0"/>
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
    "companyListDetails"
})
@XmlRootElement(name = "GetCompanyListDetailsResponse")
public class GetCompanyListDetailsResponse {

    @XmlElement(name = "CompanyListDetails", nillable = true)
    protected ArrayOfCompanyName companyListDetails;

    /**
     * Gets the value of the companyListDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompanyName }
     *     
     */
    public ArrayOfCompanyName getCompanyListDetails() {
        return companyListDetails;
    }

    /**
     * Sets the value of the companyListDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompanyName }
     *     
     */
    public void setCompanyListDetails(ArrayOfCompanyName value) {
        this.companyListDetails = value;
    }

}
