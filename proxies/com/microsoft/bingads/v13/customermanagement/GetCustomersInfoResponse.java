
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
 *         <element name="CustomersInfo" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfCustomerInfo" minOccurs="0"/>
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
    "customersInfo"
})
@XmlRootElement(name = "GetCustomersInfoResponse")
public class GetCustomersInfoResponse {

    @XmlElement(name = "CustomersInfo", nillable = true)
    protected ArrayOfCustomerInfo customersInfo;

    /**
     * Gets the value of the customersInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomerInfo }
     *     
     */
    public ArrayOfCustomerInfo getCustomersInfo() {
        return customersInfo;
    }

    /**
     * Sets the value of the customersInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomerInfo }
     *     
     */
    public void setCustomersInfo(ArrayOfCustomerInfo value) {
        this.customersInfo = value;
    }

}
