
package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfUngroupedAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfUngroupedAccount">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UngroupedAccount" type="{https://bingads.microsoft.com/Customer/v13/Entities}UngroupedAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUngroupedAccount", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "ungroupedAccounts"
})
public class ArrayOfUngroupedAccount {

    @XmlElement(name = "UngroupedAccount", nillable = true)
    protected List<UngroupedAccount> ungroupedAccounts;
    public ArrayOfUngroupedAccount()
    {
      this.ungroupedAccounts = new ArrayList<UngroupedAccount>();
    }
    @JsonCreator
    public ArrayOfUngroupedAccount(List<UngroupedAccount> ungroupedaccounts)
    {
      this.ungroupedAccounts = ungroupedaccounts;
    }

    /**
     * Gets the value of the ungroupedAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ungroupedAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUngroupedAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UngroupedAccount }
     * 
     * 
     * @return
     *     The value of the ungroupedAccounts property.
     */
    public List<UngroupedAccount> getUngroupedAccounts() {
        if (ungroupedAccounts == null) {
            ungroupedAccounts = new ArrayList<>();
        }
        return this.ungroupedAccounts;
    }

}
