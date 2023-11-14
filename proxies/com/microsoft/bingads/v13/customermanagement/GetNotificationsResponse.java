
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
 *         <element name="Notifications" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfNotification" minOccurs="0"/>
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
    "notifications"
})
@XmlRootElement(name = "GetNotificationsResponse")
public class GetNotificationsResponse {

    @XmlElement(name = "Notifications", nillable = true)
    protected ArrayOfNotification notifications;

    /**
     * Gets the value of the notifications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNotification }
     *     
     */
    public ArrayOfNotification getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNotification }
     *     
     */
    public void setNotifications(ArrayOfNotification value) {
        this.notifications = value;
    }

}
