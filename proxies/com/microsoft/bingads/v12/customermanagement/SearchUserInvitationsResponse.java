
package com.microsoft.bingads.v12.customermanagement;

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
 *         &lt;element name="UserInvitations" type="{https://bingads.microsoft.com/Customer/v12/Entities}ArrayOfUserInvitation" minOccurs="0"/>
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
