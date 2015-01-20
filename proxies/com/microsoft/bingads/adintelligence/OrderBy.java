
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderBy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderBy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SortOrder" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}SortOrder" minOccurs="0"/>
 *         &lt;element name="SortingField" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}Field" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderBy", propOrder = {
    "sortOrder",
    "sortingField"
})
public class OrderBy {

    @XmlElement(name = "SortOrder")
    @XmlSchemaType(name = "string")
    protected SortOrder sortOrder;
    @XmlElement(name = "SortingField")
    @XmlSchemaType(name = "string")
    protected Field sortingField;

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrder }
     *     
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrder }
     *     
     */
    public void setSortOrder(SortOrder value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the sortingField property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getSortingField() {
        return sortingField;
    }

    /**
     * Sets the value of the sortingField property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setSortingField(Field value) {
        this.sortingField = value;
    }

}
