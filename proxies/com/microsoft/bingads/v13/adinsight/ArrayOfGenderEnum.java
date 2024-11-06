
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfGenderEnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfGenderEnum">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GenderEnum" type="{https://bingads.microsoft.com/AdInsight/v13}GenderEnum" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGenderEnum", propOrder = {
    "genderEna"
})
public class ArrayOfGenderEnum {

    @XmlElement(name = "GenderEnum")
    @XmlSchemaType(name = "string")
    protected List<GenderEnum> genderEna;
    public ArrayOfGenderEnum()
    {
      this.genderEna = new ArrayList<GenderEnum>();
    }
    @JsonCreator
    public ArrayOfGenderEnum(List<GenderEnum> genderenums)
    {
      this.genderEna = genderenums;
    }

    /**
     * Gets the value of the genderEna property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the genderEna property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenderEna().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenderEnum }
     * 
     * 
     * @return
     *     The value of the genderEna property.
     */
    public List<GenderEnum> getGenderEna() {
        if (genderEna == null) {
            genderEna = new ArrayList<>();
        }
        return this.genderEna;
    }

}
