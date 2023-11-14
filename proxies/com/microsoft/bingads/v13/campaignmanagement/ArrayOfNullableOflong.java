
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfNullableOflong complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfNullableOflong">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="long" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNullableOflong", namespace = "http://schemas.datacontract.org/2004/07/System", propOrder = {
    "longs"
})
public class ArrayOfNullableOflong {

    @XmlElement(name = "long", nillable = true)
    protected List<Long> longs;
    public ArrayOfNullableOflong()
    {
      this.longs = new ArrayList<Long>();
    }
    @JsonCreator
    public ArrayOfNullableOflong(List<Long> nullableoflongs)
    {
      this.longs = nullableoflongs;
    }

    /**
     * Gets the value of the longs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the longs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     * @return
     *     The value of the longs property.
     */
    public List<Long> getLongs() {
        if (longs == null) {
            longs = new ArrayList<>();
        }
        return this.longs;
    }

}
