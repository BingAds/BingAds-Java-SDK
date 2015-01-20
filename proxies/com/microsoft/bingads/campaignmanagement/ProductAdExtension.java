
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductAdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAdExtension">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v9}AdExtension">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductSelection" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfProductConditionCollection" minOccurs="0"/>
 *         &lt;element name="StoreId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAdExtension", propOrder = {
    "name",
    "productSelection",
    "storeId",
    "storeName"
})
public class ProductAdExtension
    extends AdExtension
{

    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "ProductSelection", nillable = true)
    protected ArrayOfProductConditionCollection productSelection;
    @XmlElement(name = "StoreId")
    protected Long storeId;
    @XmlElement(name = "StoreName", nillable = true)
    protected String storeName;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the productSelection property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductConditionCollection }
     *     
     */
    public ArrayOfProductConditionCollection getProductSelection() {
        return productSelection;
    }

    /**
     * Sets the value of the productSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductConditionCollection }
     *     
     */
    public void setProductSelection(ArrayOfProductConditionCollection value) {
        this.productSelection = value;
    }

    /**
     * Gets the value of the storeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStoreId() {
        return storeId;
    }

    /**
     * Sets the value of the storeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStoreId(Long value) {
        this.storeId = value;
    }

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

}
