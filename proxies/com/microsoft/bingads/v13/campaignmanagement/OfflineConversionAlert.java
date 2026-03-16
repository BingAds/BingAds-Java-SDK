
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineConversionAlert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OfflineConversionAlert">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UnattributedReason" type="{https://bingads.microsoft.com/CampaignManagement/v13}OfflineConversionUnattributedReason" minOccurs="0"/>
 *         <element name="Count" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineConversionAlert", propOrder = {
    "unattributedReason",
    "count"
})
public class OfflineConversionAlert {

    @XmlElement(name = "UnattributedReason")
    @XmlSchemaType(name = "string")
    protected OfflineConversionUnattributedReason unattributedReason;
    @XmlElement(name = "Count")
    protected Long count;

    /**
     * Gets the value of the unattributedReason property.
     * 
     * @return
     *     possible object is
     *     {@link OfflineConversionUnattributedReason }
     *     
     */
    public OfflineConversionUnattributedReason getUnattributedReason() {
        return unattributedReason;
    }

    /**
     * Sets the value of the unattributedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflineConversionUnattributedReason }
     *     
     */
    public void setUnattributedReason(OfflineConversionUnattributedReason value) {
        this.unattributedReason = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

}
