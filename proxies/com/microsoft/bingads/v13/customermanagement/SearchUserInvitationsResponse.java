
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
 *         <element name="UserInvitations" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfUserInvitation" minOccurs="0"/>
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
    "userInvitations"
})
@XmlRootElement(name = "SearchUserInvitationsResponse")
public class SearchUserInvitationsResponse {

    @XmlElement(name = "UserInvitations", nillable = true)
    protected ArrayOfUserInvitation userInvitations;

    /**
     * Gets the value of the userInvitations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserInvitation }
     *     
     */
    public ArrayOfUserInvitation getUserInvitations() {
        return userInvitations;
    }

    /**
     * Sets the value of the userInvitations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserInvitation }
     *     
     */
    public void setUserInvitations(ArrayOfUserInvitation value) {
        this.userInvitations = value;
    }

}
