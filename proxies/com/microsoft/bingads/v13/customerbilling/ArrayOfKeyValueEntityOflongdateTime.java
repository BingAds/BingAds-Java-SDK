
package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfKeyValueEntityOflongdateTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeyValueEntityOflongdateTime">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyValueEntityOflongdateTime" type="{https://bingads.microsoft.com/Customer/v13/Entities}KeyValueEntityOflongdateTime" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueEntityOflongdateTime", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "keyValueEntityOflongdateTimes"
})
public class ArrayOfKeyValueEntityOflongdateTime {

    @XmlElement(name = "KeyValueEntityOflongdateTime", nillable = true)
    protected List<KeyValueEntityOflongdateTime> keyValueEntityOflongdateTimes;
    public ArrayOfKeyValueEntityOflongdateTime()
    {
      this.keyValueEntityOflongdateTimes = new ArrayList<KeyValueEntityOflongdateTime>();
    }
    @JsonCreator
    public ArrayOfKeyValueEntityOflongdateTime(List<KeyValueEntityOflongdateTime> keyvalueentityoflongdatetimes)
    {
      this.keyValueEntityOflongdateTimes = keyvalueentityoflongdatetimes;
    }

    /**
     * Gets the value of the keyValueEntityOflongdateTimes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyValueEntityOflongdateTimes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueEntityOflongdateTimes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueEntityOflongdateTime }
     * 
     * 
     * @return
     *     The value of the keyValueEntityOflongdateTimes property.
     */
    public List<KeyValueEntityOflongdateTime> getKeyValueEntityOflongdateTimes() {
        if (keyValueEntityOflongdateTimes == null) {
            keyValueEntityOflongdateTimes = new ArrayList<>();
        }
        return this.keyValueEntityOflongdateTimes;
    }

}
