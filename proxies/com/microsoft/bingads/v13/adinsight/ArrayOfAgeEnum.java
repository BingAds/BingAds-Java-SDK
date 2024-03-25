
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAgeEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAgeEnum">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgeEnum" type="{https://bingads.microsoft.com/AdInsight/v13}AgeEnum" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAgeEnum", propOrder = {
    "ageEna"
})
public class ArrayOfAgeEnum {

    @XmlElement(name = "AgeEnum")
    @XmlSchemaType(name = "string")
    protected List<AgeEnum> ageEna;

    /**
     * Gets the value of the ageEna property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ageEna property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgeEna().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgeEnum }
     * 
     * 
     * @return
     *     The value of the ageEna property.
     */
    public List<AgeEnum> getAgeEna() {
        if (ageEna == null) {
            ageEna = new ArrayList<>();
        }
        return this.ageEna;
    }

}
