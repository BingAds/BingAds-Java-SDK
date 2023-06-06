
package com.microsoft.bingads.v13.campaignmanagement;

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
 *         <element name="FileImportUploadUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "fileImportUploadUrl"
})
@XmlRootElement(name = "GetFileImportUploadUrlResponse")
public class GetFileImportUploadUrlResponse {

    @XmlElement(name = "FileImportUploadUrl", nillable = true)
    protected String fileImportUploadUrl;

    /**
     * Gets the value of the fileImportUploadUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileImportUploadUrl() {
        return fileImportUploadUrl;
    }

    /**
     * Sets the value of the fileImportUploadUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileImportUploadUrl(String value) {
        this.fileImportUploadUrl = value;
    }

}
