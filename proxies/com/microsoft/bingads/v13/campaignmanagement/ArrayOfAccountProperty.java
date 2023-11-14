
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAccountProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAccountProperty">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountProperty" type="{https://bingads.microsoft.com/CampaignManagement/v13}AccountProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAccountProperty", propOrder = {
    "accountProperties"
})
public class ArrayOfAccountProperty {

    @XmlElement(name = "AccountProperty", nillable = true)
    protected List<AccountProperty> accountProperties;
    public ArrayOfAccountProperty()
    {
      this.accountProperties = new ArrayList<AccountProperty>();
    }
    @JsonCreator
    public ArrayOfAccountProperty(List<AccountProperty> accountpropertys)
    {
      this.accountProperties = accountpropertys;
    }

    /**
     * Gets the value of the accountProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the accountProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountProperty }
     * 
     * 
     * @return
     *     The value of the accountProperties property.
     */
    public List<AccountProperty> getAccountProperties() {
        if (accountProperties == null) {
            accountProperties = new ArrayList<>();
        }
        return this.accountProperties;
    }

}
