
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
 *         <element name="CompanyListId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "companyListId"
})
@XmlRootElement(name = "GetCompanyListDetailsRequest")
public class GetCompanyListDetailsRequest {

    @XmlElement(name = "CompanyListId")
    protected Long companyListId;

    /**
     * Gets the value of the companyListId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompanyListId() {
        return companyListId;
    }

    /**
     * Sets the value of the companyListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompanyListId(Long value) {
        this.companyListId = value;
    }

}
