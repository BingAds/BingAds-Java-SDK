
package com.microsoft.bingads.v13.customermanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAccountInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountInfo" type="{https://bingads.microsoft.com/Customer/v13/Entities}AccountInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAccountInfo", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "accountInfos"
})
public class ArrayOfAccountInfo {

    @XmlElement(name = "AccountInfo", nillable = true)
    protected List<AccountInfo> accountInfos;

    /**
     * Gets the value of the accountInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the accountInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountInfo }
     * 
     * 
     * @return
     *     The value of the accountInfos property.
     */
    public List<AccountInfo> getAccountInfos() {
        if (accountInfos == null) {
            accountInfos = new ArrayList<>();
        }
        return this.accountInfos;
    }

}
