
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileImportJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FileImportJob">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}ImportJob">
 *       <sequence>
 *         <element name="FileSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FileUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileImportJob", propOrder = {
    "fileSource",
    "fileUrl"
})
public class FileImportJob
    extends ImportJob
{

    @XmlElement(name = "FileSource", required = true, nillable = true)
    protected String fileSource;
    @XmlElement(name = "FileUrl", required = true, nillable = true)
    protected String fileUrl;

    /**
     * Gets the value of the fileSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSource() {
        return fileSource;
    }

    /**
     * Sets the value of the fileSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSource(String value) {
        this.fileSource = value;
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

}
