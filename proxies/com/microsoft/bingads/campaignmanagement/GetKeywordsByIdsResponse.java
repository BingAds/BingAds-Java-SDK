
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Keywords" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfKeyword" minOccurs="0"/>
 *         &lt;element name="PartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfBatchError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keywords",
    "partialErrors"
})
@XmlRootElement(name = "GetKeywordsByIdsResponse")
public class GetKeywordsByIdsResponse {

    @XmlElement(name = "Keywords", nillable = true)
    protected ArrayOfKeyword keywords;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyword }
     *     
     */
    public ArrayOfKeyword getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyword }
     *     
     */
    public void setKeywords(ArrayOfKeyword value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the partialErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public ArrayOfBatchError getPartialErrors() {
        return partialErrors;
    }

    /**
     * Sets the value of the partialErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public void setPartialErrors(ArrayOfBatchError value) {
        this.partialErrors = value;
    }

}
