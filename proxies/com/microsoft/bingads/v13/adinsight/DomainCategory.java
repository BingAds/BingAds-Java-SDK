
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Coverage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainCategory", propOrder = {
    "bid",
    "categoryName",
    "coverage"
})
public class DomainCategory {

    @XmlElement(name = "Bid")
    protected Double bid;
    @XmlElement(name = "CategoryName", nillable = true)
    protected String categoryName;
    @XmlElement(name = "Coverage")
    protected Double coverage;

    /**
     * Gets the value of the bid property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBid() {
        return bid;
    }

    /**
     * Sets the value of the bid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBid(Double value) {
        this.bid = value;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoverage() {
        return coverage;
    }

    /**
     * Sets the value of the coverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoverage(Double value) {
        this.coverage = value;
    }

}
