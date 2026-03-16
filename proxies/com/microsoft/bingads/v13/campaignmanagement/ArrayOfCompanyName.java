
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfCompanyName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCompanyName">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CompanyName" type="{https://bingads.microsoft.com/CampaignManagement/v13}CompanyName" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCompanyName", propOrder = {
    "companyNames"
})
public class ArrayOfCompanyName {

    @XmlElement(name = "CompanyName", nillable = true)
    protected List<CompanyName> companyNames;
    public ArrayOfCompanyName()
    {
      this.companyNames = new ArrayList<CompanyName>();
    }
    @JsonCreator
    public ArrayOfCompanyName(List<CompanyName> companynames)
    {
      this.companyNames = companynames;
    }

    /**
     * Gets the value of the companyNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the companyNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyName }
     * 
     * 
     * @return
     *     The value of the companyNames property.
     */
    public List<CompanyName> getCompanyNames() {
        if (companyNames == null) {
            companyNames = new ArrayList<>();
        }
        return this.companyNames;
    }

}
