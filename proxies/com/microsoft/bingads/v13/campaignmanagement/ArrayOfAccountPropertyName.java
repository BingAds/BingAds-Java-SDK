
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfAccountPropertyName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAccountPropertyName">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountPropertyName" type="{https://bingads.microsoft.com/CampaignManagement/v13}AccountPropertyName" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public ArrayOfAccountPropertyName()
    {
      this.accountPropertyNames = new ArrayList<AccountPropertyName>();
    }
    @JsonCreator
    public ArrayOfAccountPropertyName(List<AccountPropertyName> accountpropertynames)
    {
      this.accountPropertyNames = accountpropertynames;
    }

    /**
     * Gets the value of the accountPropertyNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the accountPropertyNames property.
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
     * @return
     *     The value of the accountPropertyNames property.
     */
    public List<AccountPropertyName> getAccountPropertyNames() {
        if (accountPropertyNames == null) {
            accountPropertyNames = new ArrayList<>();
        }
        return this.accountPropertyNames;
    }

}
