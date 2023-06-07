
package com.microsoft.bingads.v13.customermanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClientLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfClientLink">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClientLink" type="{https://bingads.microsoft.com/Customer/v13/Entities}ClientLink" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClientLink", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
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
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clientLinks property.
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
     * @return
     *     The value of the clientLinks property.
     */
    public List<ClientLink> getClientLinks() {
        if (clientLinks == null) {
            clientLinks = new ArrayList<>();
        }
        return this.clientLinks;
    }

}
