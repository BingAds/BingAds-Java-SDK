
package com.microsoft.bingads.v13.customermanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAdvertiserAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdvertiserAccount">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdvertiserAccount" type="{https://bingads.microsoft.com/Customer/v13/Entities}AdvertiserAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdvertiserAccount", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "advertiserAccounts"
})
public class ArrayOfAdvertiserAccount {

    @XmlElement(name = "AdvertiserAccount", nillable = true)
    protected List<AdvertiserAccount> advertiserAccounts;
    public ArrayOfAdvertiserAccount()
    {
      this.advertiserAccounts = new ArrayList<AdvertiserAccount>();
    }
    @JsonCreator
    public ArrayOfAdvertiserAccount(List<AdvertiserAccount> advertiseraccounts)
    {
      this.advertiserAccounts = advertiseraccounts;
    }

    /**
     * Gets the value of the advertiserAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the advertiserAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvertiserAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdvertiserAccount }
     * 
     * 
     * @return
     *     The value of the advertiserAccounts property.
     */
    public List<AdvertiserAccount> getAdvertiserAccounts() {
        if (advertiserAccounts == null) {
            advertiserAccounts = new ArrayList<>();
        }
        return this.advertiserAccounts;
    }

}
