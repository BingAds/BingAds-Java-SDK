
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DailySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DailySummary">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FailureCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="FileUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FileUrlExpiryTimeUtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="SuccessCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="UploadDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailySummary", propOrder = {
    "failureCount",
    "fileUrl",
    "fileUrlExpiryTimeUtc",
    "successCount",
    "uploadDate"
})
public class DailySummary {

    @XmlElement(name = "FailureCount")
    protected Integer failureCount;
    @XmlElement(name = "FileUrl", nillable = true)
    protected String fileUrl;
    @XmlElement(name = "FileUrlExpiryTimeUtc", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar fileUrlExpiryTimeUtc;
    @XmlElement(name = "SuccessCount")
    protected Integer successCount;
    @XmlElement(name = "UploadDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar uploadDate;

    /**
     * Gets the value of the failureCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailureCount() {
        return failureCount;
    }

    /**
     * Sets the value of the failureCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailureCount(Integer value) {
        this.failureCount = value;
    }

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
     * Gets the value of the successCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    /**
     * Sets the value of the successCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuccessCount(Integer value) {
        this.successCount = value;
    }

    /**
     * Gets the value of the uploadDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getUploadDate() {
        return uploadDate;
    }

    /**
     * Sets the value of the uploadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadDate(Calendar value) {
        this.uploadDate = value;
    }

}
