
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
 *         <element name="Locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="TypeIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
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
    "locale",
    "userId",
    "typeIds"
})
@XmlRootElement(name = "GetNotificationsRequest")
public class GetNotificationsRequest {

    @XmlElement(name = "Locale", nillable = true)
    protected String locale;
    @XmlElement(name = "UserId", nillable = true)
    protected Integer userId;
    @XmlElement(name = "TypeIds", nillable = true)
    protected ArrayOfint typeIds;

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

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
     * Gets the value of the typeIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getTypeIds() {
        return typeIds;
    }

    /**
     * Sets the value of the typeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setTypeIds(ArrayOfint value) {
        this.typeIds = value;
    }

}
