
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
 *         <element name="UsersInfo" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfUserInfo" minOccurs="0"/>
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
    "usersInfo"
})
@XmlRootElement(name = "GetUsersInfoResponse")
public class GetUsersInfoResponse {

    @XmlElement(name = "UsersInfo", nillable = true)
    protected ArrayOfUserInfo usersInfo;

    /**
     * Gets the value of the usersInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserInfo }
     *     
     */
    public ArrayOfUserInfo getUsersInfo() {
        return usersInfo;
    }

    /**
     * Sets the value of the usersInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserInfo }
     *     
     */
    public void setUsersInfo(ArrayOfUserInfo value) {
        this.usersInfo = value;
    }

}
