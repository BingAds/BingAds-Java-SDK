
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfDecimalRoundedByType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDecimalRoundedByType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DecimalRoundedByType" type="{https://bingads.microsoft.com/AdInsight/v13}DecimalRoundedByType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDecimalRoundedByType", propOrder = {
    "decimalRoundedByTypes"
})
public class ArrayOfDecimalRoundedByType {

    @XmlElement(name = "DecimalRoundedByType", nillable = true)
    protected List<DecimalRoundedByType> decimalRoundedByTypes;
    public ArrayOfDecimalRoundedByType()
    {
      this.decimalRoundedByTypes = new ArrayList<DecimalRoundedByType>();
    }
    @JsonCreator
    public ArrayOfDecimalRoundedByType(List<DecimalRoundedByType> decimalroundedbytypes)
    {
      this.decimalRoundedByTypes = decimalroundedbytypes;
    }

    /**
     * Gets the value of the decimalRoundedByTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the decimalRoundedByTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecimalRoundedByTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DecimalRoundedByType }
     * 
     * 
     * @return
     *     The value of the decimalRoundedByTypes property.
     */
    public List<DecimalRoundedByType> getDecimalRoundedByTypes() {
        if (decimalRoundedByTypes == null) {
            decimalRoundedByTypes = new ArrayList<>();
        }
        return this.decimalRoundedByTypes;
    }

}
