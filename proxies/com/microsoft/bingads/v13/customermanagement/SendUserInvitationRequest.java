
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
 *         <element name="UserInvitation" type="{https://bingads.microsoft.com/Customer/v13/Entities}UserInvitation" minOccurs="0"/>
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
    "userInvitation"
})
@XmlRootElement(name = "SendUserInvitationRequest")
public class SendUserInvitationRequest {

    @XmlElement(name = "UserInvitation", nillable = true)
    protected UserInvitation userInvitation;

    /**
     * Gets the value of the userInvitation property.
     * 
     * @return
     *     possible object is
     *     {@link UserInvitation }
     *     
     */
    public UserInvitation getUserInvitation() {
        return userInvitation;
    }

    /**
     * Sets the value of the userInvitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInvitation }
     *     
     */
    public void setUserInvitation(UserInvitation value) {
        this.userInvitation = value;
    }

}
