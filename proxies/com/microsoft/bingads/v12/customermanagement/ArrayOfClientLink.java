
package com.microsoft.bingads.v12.customermanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClientLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClientLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientLink" type="{https://bingads.microsoft.com/Customer/v12/Entities}ClientLink" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClientLink", namespace = "https://bingads.microsoft.com/Customer/v12/Entities", propOrder = {
    "clientLinks"
})
public class ArrayOfClientLink {

    @XmlElement(name = "ClientLink", nillable = true)
    protected List<ClientLink> clientLinks;

    /**
     * Gets the value of the clientLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientLink }
     * 
     * 
     */
    public List<ClientLink> getClientLinks() {
        if (clientLinks == null) {
            clientLinks = new ArrayList<ClientLink>();
        }
        return this.clientLinks;
    }

}
