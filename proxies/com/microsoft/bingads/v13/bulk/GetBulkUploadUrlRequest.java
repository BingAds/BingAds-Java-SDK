
package com.microsoft.bingads.v13.bulk;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="ResponseMode" type="{https://bingads.microsoft.com/CampaignManagement/v13}ResponseMode" minOccurs="0"/>
 *         <element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
