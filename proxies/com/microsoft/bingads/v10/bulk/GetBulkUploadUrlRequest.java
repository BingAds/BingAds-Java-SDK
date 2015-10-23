
package com.microsoft.bingads.v10.bulk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="ResponseMode" type="{https://bingads.microsoft.com/CampaignManagement/v10}ResponseMode" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "responseMode",
    "accountId"
})
@XmlRootElement(name = "GetBulkUploadUrlRequest")
public class GetBulkUploadUrlRequest {

    @XmlElement(name = "ResponseMode")
    @XmlSchemaType(name = "string")
    protected ResponseMode responseMode;
    @XmlElement(name = "AccountId")
    protected Long accountId;

    /**
     * Gets the value of the responseMode property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMode }
     *     
     */
    public ResponseMode getResponseMode() {
        return responseMode;
    }

    /**
     * Sets the value of the responseMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMode }
     *     
     */
    public void setResponseMode(ResponseMode value) {
        this.responseMode = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

}
