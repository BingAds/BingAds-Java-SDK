
package com.microsoft.bingads.v12.customermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdvertiserAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdvertiserAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdvertiserAccount" type="{https://bingads.microsoft.com/Customer/v12/Entities}AdvertiserAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdvertiserAccount", namespace = "https://bingads.microsoft.com/Customer/v12/Entities", propOrder = {
    "advertiserAccounts"
})
public class ArrayOfAdvertiserAccount {

    @XmlElement(name = "AdvertiserAccount", nillable = true)
    protected List<AdvertiserAccount> advertiserAccounts;

    /**
     * Gets the value of the advertiserAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advertiserAccounts property.
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
     */
    public List<AdvertiserAccount> getAdvertiserAccounts() {
        if (advertiserAccounts == null) {
            advertiserAccounts = new ArrayList<AdvertiserAccount>();
        }
        return this.advertiserAccounts;
    }

}
