
package com.microsoft.bingads.v13.customermanagement;

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
 *         <element name="CustomerNameFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TopN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "customerNameFilter",
    "topN"
})
@XmlRootElement(name = "GetCustomersInfoRequest")
public class GetCustomersInfoRequest {

    @XmlElement(name = "CustomerNameFilter", nillable = true)
    protected String customerNameFilter;
    @XmlElement(name = "TopN")
    protected Integer topN;

    /**
     * Gets the value of the customerNameFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNameFilter() {
        return customerNameFilter;
    }

    /**
     * Sets the value of the customerNameFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNameFilter(String value) {
        this.customerNameFilter = value;
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

}
