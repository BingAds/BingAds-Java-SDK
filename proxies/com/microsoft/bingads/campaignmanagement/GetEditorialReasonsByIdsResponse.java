
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
 *         &lt;element name="EditorialReasons" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfEditorialReasonCollection" minOccurs="0"/>
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
    "editorialReasons"
})
@XmlRootElement(name = "GetEditorialReasonsByIdsResponse")
public class GetEditorialReasonsByIdsResponse {

    @XmlElement(name = "EditorialReasons", nillable = true)
    protected ArrayOfEditorialReasonCollection editorialReasons;

    /**
     * Gets the value of the editorialReasons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEditorialReasonCollection }
     *     
     */
    public ArrayOfEditorialReasonCollection getEditorialReasons() {
        return editorialReasons;
    }

    /**
     * Sets the value of the editorialReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEditorialReasonCollection }
     *     
     */
    public void setEditorialReasons(ArrayOfEditorialReasonCollection value) {
        this.editorialReasons = value;
    }

}
