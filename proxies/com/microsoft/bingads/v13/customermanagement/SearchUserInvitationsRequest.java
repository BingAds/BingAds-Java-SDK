
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Predicates" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfPredicate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "predicates"
})
@XmlRootElement(name = "SearchUserInvitationsRequest")
public class SearchUserInvitationsRequest {

    @XmlElement(name = "Predicates", nillable = true)
    protected ArrayOfPredicate predicates;

    /**
     * Gets the value of the predicates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPredicate }
     *     
     */
    public ArrayOfPredicate getPredicates() {
        return predicates;
    }

    /**
     * Sets the value of the predicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPredicate }
     *     
     */
    public void setPredicates(ArrayOfPredicate value) {
        this.predicates = value;
    }

}
