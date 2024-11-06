
package com.microsoft.bingads.v13.customermanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfNotification">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Notification" type="{https://bingads.microsoft.com/Customer/v13/Entities}Notification" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNotification", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "notifications"
})
public class ArrayOfNotification {

    @XmlElement(name = "Notification", nillable = true)
    protected List<Notification> notifications;
    public ArrayOfNotification()
    {
      this.notifications = new ArrayList<Notification>();
    }
    @JsonCreator
    public ArrayOfNotification(List<Notification> notifications)
    {
      this.notifications = notifications;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the notifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notification }
     * 
     * 
     * @return
     *     The value of the notifications property.
     */
    public List<Notification> getNotifications() {
        if (notifications == null) {
            notifications = new ArrayList<>();
        }
        return this.notifications;
    }

}
