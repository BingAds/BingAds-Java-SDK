
package com.microsoft.bingads.customermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAccountInfoWithCustomerData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAccountInfoWithCustomerData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountInfoWithCustomerData" type="{https://bingads.microsoft.com/Customer/v9/Entities}AccountInfoWithCustomerData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAccountInfoWithCustomerData", namespace = "https://bingads.microsoft.com/Customer/v9/Entities", propOrder = {
    "accountInfoWithCustomerDatas"
})
public class ArrayOfAccountInfoWithCustomerData {

    @XmlElement(name = "AccountInfoWithCustomerData", nillable = true)
    protected List<AccountInfoWithCustomerData> accountInfoWithCustomerDatas;

    /**
     * Gets the value of the accountInfoWithCustomerDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountInfoWithCustomerDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountInfoWithCustomerDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountInfoWithCustomerData }
     * 
     * 
     */
    public List<AccountInfoWithCustomerData> getAccountInfoWithCustomerDatas() {
        if (accountInfoWithCustomerDatas == null) {
            accountInfoWithCustomerDatas = new ArrayList<AccountInfoWithCustomerData>();
        }
        return this.accountInfoWithCustomerDatas;
    }

}
