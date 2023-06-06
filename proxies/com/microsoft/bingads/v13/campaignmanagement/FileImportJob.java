
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileImportJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileImportJob">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}ImportJob">
 *       &lt;sequence>
 *         &lt;element name="FileSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FileUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
