
package com.microsoft.bingads.v11.customermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUserInvitation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUserInvitation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserInvitation" type="{https://bingads.microsoft.com/Customer/v11/Entities}UserInvitation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserInvitation", namespace = "https://bingads.microsoft.com/Customer/v11/Entities", propOrder = {
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
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userInvitations property.
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
     */
    public List<UserInvitation> getUserInvitations() {
        if (userInvitations == null) {
            userInvitations = new ArrayList<UserInvitation>();
        }
        return this.userInvitations;
    }

}
