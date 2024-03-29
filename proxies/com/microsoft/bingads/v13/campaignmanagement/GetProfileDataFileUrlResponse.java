
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         <element name="FileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FileUrlExpiryTimeUtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="LastModifiedTimeUtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "fileUrl",
    "fileUrlExpiryTimeUtc",
    "lastModifiedTimeUtc"
})
@XmlRootElement(name = "GetProfileDataFileUrlResponse")
public class GetProfileDataFileUrlResponse {

    @XmlElement(name = "FileUrl", nillable = true)
    protected String fileUrl;
    @XmlElement(name = "FileUrlExpiryTimeUtc", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar fileUrlExpiryTimeUtc;
    @XmlElement(name = "LastModifiedTimeUtc", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastModifiedTimeUtc;

    /**
     * Gets the value of the fileUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * Sets the value of the fileUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileUrl(String value) {
        this.fileUrl = value;
    }

    /**
     * Gets the value of the fileUrlExpiryTimeUtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFileUrlExpiryTimeUtc() {
        return fileUrlExpiryTimeUtc;
    }

    /**
     * Sets the value of the fileUrlExpiryTimeUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileUrlExpiryTimeUtc(Calendar value) {
        this.fileUrlExpiryTimeUtc = value;
    }

    /**
     * Gets the value of the lastModifiedTimeUtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastModifiedTimeUtc() {
        return lastModifiedTimeUtc;
    }

    /**
     * Sets the value of the lastModifiedTimeUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedTimeUtc(Calendar value) {
        this.lastModifiedTimeUtc = value;
    }

}
