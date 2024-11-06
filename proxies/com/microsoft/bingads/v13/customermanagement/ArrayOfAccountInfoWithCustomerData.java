
package com.microsoft.bingads.v13.customermanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAccountInfoWithCustomerData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAccountInfoWithCustomerData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountInfoWithCustomerData" type="{https://bingads.microsoft.com/Customer/v13/Entities}AccountInfoWithCustomerData" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAccountInfoWithCustomerData", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "accountInfoWithCustomerDatas"
})
public class ArrayOfAccountInfoWithCustomerData {

    @XmlElement(name = "AccountInfoWithCustomerData", nillable = true)
    protected List<AccountInfoWithCustomerData> accountInfoWithCustomerDatas;
    public ArrayOfAccountInfoWithCustomerData()
    {
      this.accountInfoWithCustomerDatas = new ArrayList<AccountInfoWithCustomerData>();
    }
    @JsonCreator
    public ArrayOfAccountInfoWithCustomerData(List<AccountInfoWithCustomerData> accountinfowithcustomerdatas)
    {
      this.accountInfoWithCustomerDatas = accountinfowithcustomerdatas;
    }

    /**
     * Gets the value of the accountInfoWithCustomerDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the accountInfoWithCustomerDatas property.
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
     * @return
     *     The value of the accountInfoWithCustomerDatas property.
     */
    public List<AccountInfoWithCustomerData> getAccountInfoWithCustomerDatas() {
        if (accountInfoWithCustomerDatas == null) {
            accountInfoWithCustomerDatas = new ArrayList<>();
        }
        return this.accountInfoWithCustomerDatas;
    }

}
