
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAccountPropertyName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAccountPropertyName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountPropertyName" type="{https://bingads.microsoft.com/CampaignManagement/v13}AccountPropertyName" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAccountPropertyName", propOrder = {
    "accountPropertyNames"
})
public class ArrayOfAccountPropertyName {

    @XmlElement(name = "AccountPropertyName")
    @XmlSchemaType(name = "string")
    protected List<AccountPropertyName> accountPropertyNames;

    /**
     * Gets the value of the accountPropertyNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountPropertyNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountPropertyNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountPropertyName }
     * 
     * 
     */
    public List<AccountPropertyName> getAccountPropertyNames() {
        if (accountPropertyNames == null) {
            accountPropertyNames = new ArrayList<AccountPropertyName>();
        }
        return this.accountPropertyNames;
    }

}
