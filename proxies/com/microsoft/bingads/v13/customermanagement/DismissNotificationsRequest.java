
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
 *         <element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="NotificationTypePairs" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfKeyValueEntityOflongint" minOccurs="0"/>
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
    "userId",
    "notificationTypePairs"
})
@XmlRootElement(name = "DismissNotificationsRequest")
public class DismissNotificationsRequest {

    @XmlElement(name = "UserId", nillable = true)
    protected Integer userId;
    @XmlElement(name = "NotificationTypePairs", nillable = true)
    protected ArrayOfKeyValueEntityOflongint notificationTypePairs;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }

    /**
     * Gets the value of the notificationTypePairs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValueEntityOflongint }
     *     
     */
    public ArrayOfKeyValueEntityOflongint getNotificationTypePairs() {
        return notificationTypePairs;
    }

    /**
     * Sets the value of the notificationTypePairs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValueEntityOflongint }
     *     
     */
    public void setNotificationTypePairs(ArrayOfKeyValueEntityOflongint value) {
        this.notificationTypePairs = value;
    }

}
