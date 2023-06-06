
package com.microsoft.bingads.v13.customermanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUserInvitation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfUserInvitation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UserInvitation" type="{https://bingads.microsoft.com/Customer/v13/Entities}UserInvitation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserInvitation", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "userInvitations"
})
public class ArrayOfUserInvitation {

    @XmlElement(name = "UserInvitation", nillable = true)
    protected List<UserInvitation> userInvitations;

    /**
     * Gets the value of the userInvitations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the userInvitations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserInvitations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserInvitation }
     * 
     * 
     * @return
     *     The value of the userInvitations property.
     */
    public List<UserInvitation> getUserInvitations() {
        if (userInvitations == null) {
            userInvitations = new ArrayList<>();
        }
        return this.userInvitations;
    }

}
